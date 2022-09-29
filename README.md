# IMPORTANT LICENSE NOTICE

By using this project in any form, you hereby give your "express assent" for the terms of the license of this project (see [Licensing](#licensing)), and acknowledge that I (the author of this project) have fulfilled my obligation under the license to "make a reasonable effort under the circumstances to obtain the express assent of recipients to the terms of this License".

# UnMojank

This mod aims to fix "mojanks" present in Minecraft, some being several years old.

# What's a "mojank"?

A "mojank" is a tech debt (or _jank_) for which Mojang has yet to implement a fix. These aren't necessarily bugs, but things that should have been addressed along with another change that Mojang has either ignored or that Mojang has explicitly stated they won't address.

Listed below are mojanks, and some things that this mod does not consider a mojank, but considered one by many players. Before reporting a mojank, please ensure it is not already on this list! We may already plan to address it, or have determined that it is not a mojank.

#### Mojank status legend

- 🟢  Fix implemented.
- 🟠  Fix was previously implemented, but is now broken.
- 🟡  Fix in progress.
- 🔴  Planned, but not in progress.
- 🔵  Suitable fix already implemented in another mod; this mod does not aim to re-invent the wheel.
- ⚪  Mojank was fixed by Mojang, and is now available in Minecraft. Kept for documentation purposes.
- ⚫  Not a mojank.
- 🟤  Is a mojank, but won't fix.

## 🟡 Nether Height
### Debt Aquired: 12w07a (1.2.1)
### Description

The height of the Overworld does not match the nether (initially 256, now 384 in the Overworld vs 128 in the Nether).

### History & Description

Way back in 12w07a (a snapshot for 1.2.1) (2012, week 7... this is old) the max height of Minecraft worlds was changed from 128 to 256. This was easy for the Overworld, as world generation wasn't even adjusted to use this new height limit until 13w36a (1.7.2). There was no roof. The nether, however, has a roof. This would make compatibility with old worlds _extremely_ difficult. So, they just left the nether roof at Y 128.

It's been so long, that since then the world height changed _again_ in 1.18, moving the bottom Y to -64 and top Y to 320, making the world 384 blocks tall. The nether is still 128 blocks tall. This is a great piece of tech debt.

This tech debt is over 10 years old. It is arguably one of the oldest.

### Solution

Adjust vanilla datapack to set dimension height to that of the Overworld (Y -64 - Y 320), and adjust world gen to fill this area.

To be similar to the Overworld, and to allow supporting old worlds, the sea level will remain where it is now at Y 32. Terrain under sea level will simply go deeper.

For old world support, there are a few options:

#### Chunk Smoothing

If this method is chosen, old chunks will be left as is, and chunk smoothing will be relied on to gradually extend the nether ceiling up and the floor down. Whether or not chunk smoothing will achieve usable results is currently un-tested.

#### Retro-gen

Similar to how the Overworld gets its bedrock replaced with deepslate and the bottoms of old chunks are filled in with new caves in 1.18, retro-gen will be added to the nether that replaces the bedrock floor and ceiling with netherrack, and generates new terrain above & below it.

# <a name="licensing" />Licensing

This project is licensed under [OSL-3.0](LICENSE).
