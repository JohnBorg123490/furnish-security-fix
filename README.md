# Welcome to Furnish

Furnish adds lovely and useful Furniture to Minecraft, each one having it's *little something*.
Furnish takes away the ton of crafting required by other furniture mods by adding a Stonecutter-like table: the *Furniture Workbench*.

* [Furnish on Curse](https://www.curseforge.com/minecraft/mc-mods/furnish)
* [Furnish on Modrinth](https://modrinth.com/mod/furnish-furnitures)

## Screenshots

![Kitchen Example](https://media.forgecdn.net/attachments/408/875/kitchen_1280x.png)
![Dark Meeting Room](https://media.forgecdn.net/attachments/408/874/meeting_1280x.png)

## Compatibility

Mod/modpack makers can easily add a recipe for their block in the workbench, with the new recipe type `furnish:furniture_making`.
Here's an example with [Market Crates](https://www.curseforge.com/minecraft/mc-mods/market-crates) crates.

```json
{
	"type": "furnish:furniture_making",
	"ingredient": { "item": "minecraft:acacia_planks" },
	"result": "marketcrates:acacia_crate",
	"count": 1
}
```