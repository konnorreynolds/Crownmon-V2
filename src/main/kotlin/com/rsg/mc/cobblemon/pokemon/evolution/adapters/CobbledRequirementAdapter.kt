package com.rsg.mc.cobblemon.pokemon.evolution.adapters

import com.cobblemon.mod.common.pokemon.evolution.adapters.CobblemonRequirementAdapter
import com.rsg.mc.cobblemon.pokemon.evolution.requirements.DivineRequirement
import com.rsg.mc.cobblemon.pokemon.evolution.requirements.ShinyRequirement

object CobbledRequirementAdapter {

    init {
        CobblemonRequirementAdapter.registerType(ShinyRequirement.ADAPTER_VARIANT, ShinyRequirement::class)
        CobblemonRequirementAdapter.registerType(DivineRequirement.ADAPTER_VARIANT, DivineRequirement::class)
    }

}