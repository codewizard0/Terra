import voodoo.data.Side
import voodoo.data.curse.FileType
import voodoo.dsl.builder.curse.CurseListBuilder
import voodoo.provider.CurseProvider


fun CurseListBuilder<CurseProvider>.buildTerra() {
    // Core

    addGeneral()
    addPackUtils()

    group {
        side = Side.CLIENT
    }.list {
        addClient()
    }

    group {
        side = Side.SERVER
    }.list {
        addServer()
    }

    // Others

    addDecoration()
    addEquipment()
    addLogic()
    addMagic()
    addResource()
    addStorage()
    addTech()
}

fun CurseListBuilder<CurseProvider>.addClient() {
    +Mod.appleskin
    +Mod.betterAdvancements
    +Mod.clientTweaks
    +Mod.controlling
    +Mod.craftingTweaks
    +Mod.inventoryTweaks
    +Mod.moreOverlays
    +Mod.mouseTweaks
    +Mod.neat
    +Mod.noRecipeBook
    +Mod.tipthescales
    +Mod.toastControl
    +Mod.worldTooltips
}

fun CurseListBuilder<CurseProvider>.addDecoration() {
    addChisel()
    addChiselsNBits()

    +Mod.cathedral
    +Mod.malisisdoors
}

fun CurseListBuilder<CurseProvider>.addChisel() {
    +Mod.chisel
    +Mod.unlimitedChiselWorks

}

fun CurseListBuilder<CurseProvider>.addChiselsNBits() {
    +Mod.chiselsBits
    +Mod.extraBitManipulation
    +Mod.flatColoredBlocks
}

fun CurseListBuilder<CurseProvider>.addEquipment() {
    +Mod.redstoneRepositoryRevolved
    addTinkers()
    addArmory()
}

fun CurseListBuilder<CurseProvider>.addTinkers() {
    +Mod.ceramics
    +Mod.tinkersComplement
    +Mod.tinkersConstruct
    +Mod.tinkersToolLeveling
    +Mod.plustic
    +Mod.pewter
    +Mod.zenFoundry
}

fun CurseListBuilder<CurseProvider>.addArmory() {
    +Mod.armoryExpansion
    +Mod.constructsArmory
}
fun CurseListBuilder<CurseProvider>.addGeneral() {
    addFix()
    addNei()
    addWaila()
    addNonItem()
    addItems()
    addLib()
}

fun CurseListBuilder<CurseProvider>.addLib() {
    +Mod.reborncore
}

fun CurseListBuilder<CurseProvider>.addItems() {
    +Mod.extraUtilities
    +Mod.openblocks
    +Mod.bibliocraft
    +Mod.pickleTweaks

    +Mod.actuallyAdditions
    +Mod.cyclic
    +Mod.tinyProgressions
    +Mod.portalGun

    +Mod.notEnoughWands
    +Mod.betterBuildersWands
    +Mod.exchangers
    +Mod.buildingGadgets

    +Mod.bonsaiTrees

    +Mod.reliquaryV13
    +Mod.slabMachines

    +Mod.akashicTome
    +Mod.morphOTool
    +Mod.corailTombstone
    +Mod.engineersWorkshopReborn
    +Mod.inspirations
    +Mod.quark
    +Mod.translocators18

    +Mod.moreCauldrons
    +Mod.moreFurnaces

    +Mod.chickenChunks18
    +Mod.uppers

    +Mod.aroma1997sDimensionalWorld
    +Mod.dimensionalEdibles
    +Mod.mystcraft
    +Mod.randomThings
    +Mod.theLostCities
    +Mod.dimensionaldoors

    +Mod.enderUtilities

    +Mod.furnaceOnAStick

    // TODO: Check for working newer Twilight Forest Version
    group {
        releaseTypes = setOf(FileType.RELEASE)
    }.list {
        +Mod.theTwilightForest
    }
}

fun CurseListBuilder<CurseProvider>.addNonItem() {
    +Mod.journeymap

    +Mod.mouseTweaks

    +Mod.itemphysic
    +Mod.carryOn

    +Mod.carryOn
    +Mod.oreExcavation
    +Mod.twerkSim2k16
    +Mod.ftbUtilities

    +Mod.itemphysic
    +Mod.kleeslabs
    +Mod.fastLeafDecay
    +Mod.forgivingVoid
    +Mod.unidict
    +Mod.attributefix
    +Mod.commonCapabilities
    +Mod.stackie
    +Mod.fenceOverhaul
    +Mod.fenceJumper

    +Mod.jeid
    +Mod.inGameWikiMod
    +Mod.fastfurnace
    +Mod.fastworkbench
    +Mod.realbench
}

fun CurseListBuilder<CurseProvider>.addNei() {
    +Mod.jei
    +Mod.jeiIntegration
    +Mod.notEnoughItems18
}

fun CurseListBuilder<CurseProvider>.addWaila() {
    +Mod.hwyla
    +Mod.wawlaWhatAreWeLookingAt
    +Mod.wailaHarvestability
}

fun CurseListBuilder<CurseProvider>.addFix() {
    +Mod.vanillafix
    +Mod.foamfixForMinecraft
    +Mod.betterfps
}

fun CurseListBuilder<CurseProvider>.addLogic() {
    addProjectRed()

    +Mod.wirelessRedstoneCbe

    +Mod.funkyLocomotion
    +Mod.autoverse

    +Mod.integratedTunnels
    +Mod.integratedTerminals
    +Mod.integratedCrafting
    //+Mod.integratedRest
    +Mod.inductiveLogistics
    +Mod.practicalLogistics2
    +Mod.xnet
    +Mod.ynot

    +Mod.ccTweaked
    +Mod.opencomputers
}

fun CurseListBuilder<CurseProvider>.addProjectRed() {
    +Mod.projectRedBase
    +Mod.projectRedCompat
    +Mod.projectRedFabrication
    +Mod.projectRedIntegration
    +Mod.projectRedLighting
    +Mod.projectRedMechanical
    +Mod.projectRedWorld
}

fun CurseListBuilder<CurseProvider>.addMagic() {
    +Mod.bloodMagic
    +Mod.bloodArsenal
    +Mod.animus
    +Mod.botania
    //+Mod.thaumcraft
    //+Mod.thaumicTinkerer
    +Mod.embers
    +Mod.astralSorcery
    //+Mod.lordCraft
}
fun CurseListBuilder<CurseProvider>.addPackUtils() {
    +Mod.caliper
    +Mod.mputils
    +Mod.mputilsBasicTools
    +Mod.laggoggles
    +Mod.defaultOptions

    +Mod.villagerTradeTables

    //addAdvancements()
    //addTweaker()
    //addCrafting()
    //addNpcs()
    //addQuesting()
    //addStages()
    //addWorldCustomization()
    addLoot()

    //addMakerTools()
}

fun CurseListBuilder<CurseProvider>.addMakerTools() {
    +Mod.externalTweaker
}

fun CurseListBuilder<CurseProvider>.addWorldCustomization() {
    +Mod.topography
    +Mod.biometweaker
}

fun CurseListBuilder<CurseProvider>.addAdvancements() {
    +Mod.triumph
    +Mod.prestige
    //+Mod.scavengePrestige
}

fun CurseListBuilder<CurseProvider>.addTweaker() {
    +Mod.inControl
    +Mod.crafttweaker
    +Mod.modtweaker
    +Mod.contenttweaker
    +Mod.packmode
    +Mod.initialInventory
}

fun CurseListBuilder<CurseProvider>.addCrafting() {
    +Mod.extendedCrafting
    +Mod.researchTable
    +Mod.modularMachinery
    +Mod.modularDiversity
    +Mod.moreplates
    +Mod.avaritia110
}

fun CurseListBuilder<CurseProvider>.addStages() {
    //+Mod.scavengeGamestages
    //+Mod.scavengeBaubles

    +Mod.togetherForever
    +Mod.zenstages
    +Mod.gameStages
    +Mod.itemStages
    +Mod.mobStages
    +Mod.dimensionStages
    +Mod.oreStages
    +Mod.recipeStages
    +Mod.timeStages
    +Mod.tinkerstages
    +Mod.multiblockStages
}

fun CurseListBuilder<CurseProvider>.addQuesting() {
    //+Mod.hardcoreQuestingMode

    +Mod.betterQuesting
    +Mod.betterQuestingQuestBook
    +Mod.betterQuestingStandardExpansion
}

fun CurseListBuilder<CurseProvider>.addNpcs() {
    +Mod.customNpcs
    +Mod.betterQuestingNpcIntegration
    //+Mod.millenaire
}

fun CurseListBuilder<CurseProvider>.addLoot() {
    +Mod.additionalLootTables
    +Mod.loottabletweaker
    +Mod.progressiveBoxes
    +Mod.lootbags
}

fun CurseListBuilder<CurseProvider>.addResource() {
    addBees()
    addMobs()

    +Mod.projecte
    +Mod.equivalentEnergistics

    +Mod.rockCandy

    +Mod.biomesOPlenty
    +Mod.karatGarden

    +Mod.cookingForBlockheads
    +Mod.farmingForBlockheads
    +Mod.pamsHarvestcraft
}

fun CurseListBuilder<CurseProvider>.addBees() {
    +Mod.forestry
    +Mod.magicBees
    +Mod.binniesMods
    +Mod.gendustry
    +Mod.gendustryJeiAddon
}

fun CurseListBuilder<CurseProvider>.addMobs() {
    +Mod.woot
}

fun CurseListBuilder<CurseProvider>.addServer() {

}

fun CurseListBuilder<CurseProvider>.addStorage() {
    addAE2()

    +Mod.dankNull
    +Mod.enderStorage18

    +Mod.simpleStorageNetwork
    +Mod.ironChests
    +Mod.storageDrawers
    +Mod.realFilingCabinet
    +Mod.yabba
}

fun CurseListBuilder<CurseProvider>.addAE2() {
    +Mod.appliedEnergistics2
    +Mod.wirelessCraftingTerminal
    +Mod.extracells2
    +Mod.ae2Stuff
    +Mod.spatialcompat
}

fun CurseListBuilder<CurseProvider>.addTech() {
    +Mod.railcraft

    +Mod.thermalexpansion
    +Mod.thermalDynamics
    +Mod.thermalInnovation
    +Mod.thermalCultivation
    +Mod.thermallogistics

    +Mod.enderIo
    +Mod.eiorecipesteinductionsmelter

    +Mod.rftools
    +Mod.rftoolsControl
    +Mod.rftoolsDimensions
    +Mod.rftoolsPower

    +Mod.immersiveCables
    +Mod.immersiveEngineering
    +Mod.immersivePetroleum

    +Mod.fluxNetworks
    +Mod.modularForcefieldSystem

    +Mod.advancedGenerators
    +Mod.calculator
    +Mod.compactMachines
    +Mod.draconicEvolution
    +Mod.magneticraft

    +Mod.mekanism
    +Mod.mekanismGenerators
    +Mod.mekanismTools

    +Mod.industrialForegoing
    +Mod.integrationForegoing
    +Mod.environmentalTech
    +Mod.extremeReactors
    +Mod.nuclearcraftMod

    +Mod.portality
    +Mod.factoryTech
    +Mod.compressedFactory
}