package cn.academy.misc.achievements.pages;

import cn.academy.ability.ModuleAbility;
import cn.academy.ability.api.CategoryManager;
import cn.academy.misc.achievements.aches.ACAchievement;
import cn.academy.misc.achievements.aches.AchEvLevelChange;
import cn.academy.misc.achievements.aches.AchEvSkillLearn;
import cn.academy.vanilla.meltdowner.CatMeltDowner;

/**
 * @author EAirPeter
 */
public final class PageCtMeltDowner extends PageCategory<CatMeltDowner> {

	private final ACAchievement aLv1;
	private final ACAchievement aSkill;
	private final ACAchievement aLv2;
	private final ACAchievement aLv3;
	private final ACAchievement aLv4;
	private final ACAchievement aLv5;

	public PageCtMeltDowner() {
		super((CatMeltDowner) CategoryManager.INSTANCE.getCategory("melt_downer"));
		add(new ACAchievement[] {
			aLv1 = new AchEvLevelChange(1, category, "lv1", 0, 0, ModuleAbility.developerNormal, null),
			aSkill = new AchEvSkillLearn(category, "skill", 2, 0, ModuleAbility.developerNormal, aLv1),
			aLv2 = new AchEvLevelChange(2, category, "lv2", 2, 2, ModuleAbility.developerNormal, aSkill),
			aLv3 = new AchEvLevelChange(3, category, "lv3", 0, 2, ModuleAbility.developerNormal, aLv2),
			aLv4 = new AchEvLevelChange(4, category, "lv4", -2, 2, ModuleAbility.developerNormal, aLv3),
			aLv5 = new AchEvLevelChange(5, category, "lv5", -2, 0, ModuleAbility.developerNormal, aLv4),
		});
	}
	
}