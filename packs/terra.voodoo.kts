@file:GenerateMods(name = "Mod", mc = "1.12.2")
@file:GenerateMods(name = "Mod", mc = "1.12.1")
@file:GenerateMods(name = "Mod", mc = "1.12")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.2")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12.1")
@file:GenerateTexturePacks(name = "TexturePack", mc = "1.12")
@file:GenerateForge(name = "Forge", mc = "1.12.2")
@file:Include("Terra.kt")

version = "0.0.0"
mcVersion = "1.12.2"
title = "Terra"
authors = listOf("eric")
forge = Forge.mc1_12_2_latest
root(voodoo.provider.CurseProvider) {
    releaseTypes = kotlin.collections.setOf(FileType.RELEASE, FileType.BETA, FileType.ALPHA)
    validMcVersions = kotlin.collections.setOf("1.12.1", "1.12")
    list {
        buildTerra()
    }
}
