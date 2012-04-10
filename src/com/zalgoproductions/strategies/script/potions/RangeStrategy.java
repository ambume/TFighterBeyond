package com.zalgoproductions.strategies.script.potions;

import com.zalgoproductions.util.Potions;
import org.powerbot.game.api.methods.tab.Skills;

public class RangeStrategy extends PotionStrategy{
	public RangeStrategy() {
		super(Potions.RANGE_POTIONS);
	}

	@Override
	protected boolean needsPotion() {
		return Skills.getLevel(Skills.RANGE) <= Skills.getRealLevel(Skills.RANGE);
	}
}
