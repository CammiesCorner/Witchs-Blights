package dev.cammiescorner.witchsblights;

import com.teamresourceful.resourcefulconfig.api.annotations.*;
import com.teamresourceful.resourcefulconfig.api.types.options.EntryType;
import dev.cammiescorner.witchsblights.common.Utils;

@ConfigInfo(
		title = "Witch's Blights",
		links = {
				@ConfigInfo.Link(
						value = "https://modrinth.com/mod/witchs-blights",
						icon = "modrinth",
						text = "Modrinth"
				),
				@ConfigInfo.Link(
						value = "https://www.curseforge.com/minecraft/mc-mods/witchs-blights",
						icon = "curseforge",
						text = "Curseforge"
				),
				@ConfigInfo.Link(
						value = "https://github.com/CammiePone/Witchs-Blights",
						icon = "github",
						text = "Github"
				),
				@ConfigInfo.Link(
						value = "https://cammiescorner.dev/discord",
						icon = "gamepad-2",
						text = "Discord"
				)
		}
)
@Config(
		value = WitchsBlights.MOD_ID,
		categories = {
				ModConfig.Client.class,
				ModConfig.Curses.class,
				ModConfig.AllBeasts.class,
				ModConfig.VampireBeast.class,
				ModConfig.Werewolf.class
		}
)
public class ModConfig {
	@Category(value = "Client")
	public static class Client {
		@ConfigEntry(
				type = EntryType.BOOLEAN,
				id = "twoEyeBlinking",
				translation = "witchsblights.config.twoEyeBlinking.name"
		)
		public static boolean twoEyeBlinking = false;
	}

	@Category(value = "Curses")
	public static class Curses {
		@ConfigEntry(
				type = EntryType.INTEGER,
				id = "stageOneCurseDuration",
				translation = "witchsblights.config.stageOneCurseDuration.name"
		)
		public static int stageOneCurseDuration = 7;

		@ConfigEntry(
				type = EntryType.ENUM,
				id = "stageOneCurseUnit",
				translation = "witchsblights.config.stageOneCurseUnit.name"
		)
		public static Utils.DurationUnits stageOneCurseUnit = Utils.DurationUnits.DAYS;

		@ConfigEntry(
				type = EntryType.INTEGER,
				id = "stageTwoCurseDuration",
				translation = "witchsblights.config.stageTwoCurseDuration.name"
		)
		public static int stageTwoCurseDuration = 7;

		@ConfigEntry(
				type = EntryType.ENUM,
				id = "stageTwoCurseUnit",
				translation = "witchsblights.config.stageTwoCurseUnit.name"
		)
		public static Utils.DurationUnits stageTwoCurseUnit = Utils.DurationUnits.WEEKS;

		@ConfigEntry(
				type = EntryType.INTEGER,
				id = "stageThreeCurseDuration",
				translation = "witchsblights.config.stageThreeCurseDuration.name"
		)
		public static int stageThreeCurseDuration = 7;

		@ConfigEntry(
				type = EntryType.ENUM,
				id = "stageThreeCurseUnit",
				translation = "witchsblights.config.stageThreeCurseUnit.name"
		)
		public static Utils.DurationUnits stageThreeCurseUnit = Utils.DurationUnits.MONTHS;
	}

	@Category(value = "All Beasts")
	public static class AllBeasts {
		@ConfigEntry(
				type = EntryType.INTEGER,
				id = "untransformIfNoTargetTicks",
				translation = "witchsblights.config.untransformIfNoTargetTicks.name"
		)
		public static int untransformIfNoTargetTicks = 100;

		@ConfigEntry(
				type = EntryType.INTEGER,
				id = "untransformIfHasntAttackedTicks",
				translation = "witchsblights.config.untransformIfHasntAttackedTicks.name"
		)
		public static int untransformIfHasntAttackedTicks = 600;

		@ConfigEntry(
				type = EntryType.FLOAT,
				id = "urgingLookStrength",
				translation = "witchsblights.config.urgingLookStrength.name"
		)
		@ConfigOption.Range(min = 0f, max = 100f)
		public static float urgingLookStrength = 1f;

		@ConfigEntry(
				type = EntryType.LONG,
				id = "maximumTransformedTime",
				translation = "witchsblights.config.maximumTransformedTime.name"
		)
		public static long maximumTransformedTime = 2;

		@ConfigEntry(
				type = EntryType.ENUM,
				id = "transformedTimeUnits",
				translation = "witchsblights.config.transformedTimeUnits.name"
		)
		public static Utils.DurationUnits transformedTimeUnits = Utils.DurationUnits.MINUTES;
	}

	@Category(value = "Vampire Beast")
	public static class VampireBeast {
		@ConfigEntry(
				type = EntryType.INTEGER,
				id = "baseVampireUrgingTicks",
				translation = "witchsblights.config.baseVampireUrgingTicks.name"
		)
		public static int baseVampireUrgingTicks = 400;

		@ConfigEntry(
				type = EntryType.DOUBLE,
				id = "baseVampireStageUrgingModifier",
				translation = "witchsblights.config.baseVampireStageUrgingModifier.name"
		)
		public static double baseVampireStageUrgingModifier = 0.25;

		@ConfigEntry(
				type = EntryType.DOUBLE,
				id = "baseVampireBabyUrgingModifier",
				translation = "witchsblights.config.baseVampireBabyUrgingModifier.name"
		)
		public static double baseVampireBabyUrgingModifier = 0.5;

		@ConfigEntry(
				type = EntryType.DOUBLE,
				id = "vampireUrgingRange",
				translation = "witchsblights.config.vampireUrgingRange.name"
		)
		public static double vampireUrgingRange = 8;

		@ConfigEntry(
				type = EntryType.FLOAT,
				id = "vampireSpreadCurseChance",
				translation = "witchsblights.config.vampireSpreadCurseChance.name"
		)
		@ConfigOption.Range(min = 0f, max = 1f)
		public static float vampireSpreadCurseChance = 0.25f;
	}

	@Category(value = "Werewolf")
	public static class Werewolf {
		@ConfigEntry(
				type = EntryType.INTEGER,
				id = "baseWerewolfUrgingTicks",
				translation = "witchsblights.config.baseWerewolfUrgingTicks.name"
		)
		public static int baseWerewolfUrgingTicks = 300;

		@ConfigEntry(
				type = EntryType.DOUBLE,
				id = "baseWerewolfStageUrgingModifier",
				translation = "witchsblights.config.baseWerewolfStageUrgingModifier.name"
		)
		public static double baseWerewolfStageUrgingModifier = 0.33;

		@ConfigEntry(
				type = EntryType.DOUBLE,
				id = "baseWerewolfBabyUrgingModifier",
				translation = "witchsblights.config.baseWerewolfBabyUrgingModifier.name"
		)
		public static double baseWerewolfBabyUrgingModifier = 0.33;

		@ConfigEntry(
				type = EntryType.DOUBLE,
				id = "werewolfUrgingRange",
				translation = "witchsblights.config.werewolfUrgingRange.name"
		)
		public static double werewolfUrgingRange = 8;

		@ConfigEntry(
				type = EntryType.FLOAT,
				id = "werewolfSpreadCurseChance",
				translation = "witchsblights.config.werewolfSpreadCurseChance.name"
		)
		public static float werewolfSpreadCurseChance = 0.05f;
	}
}
