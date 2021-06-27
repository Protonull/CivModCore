package vg.civcraft.mc.civmodcore.entities;

import com.google.common.base.Strings;
import lombok.experimental.UtilityClass;
import org.bukkit.entity.EntityType;

/**
 * Class of static APIs for Entities.
 */
@UtilityClass
public final class EntityUtils {

	/**
	 * Attempts to retrieve an entity type by its slug or id.
	 *
	 * @param value The value to search for a matching entity type by.
	 * @return Returns a matched entity type or null.
	 */
	@SuppressWarnings("deprecation")
	public static EntityType getEntityType(final String value) {
		if (Strings.isNullOrEmpty(value)) {
			return null;
		}
		try {
			return EntityType.valueOf(value.toUpperCase());
		}
		catch (Exception ignored) { }
		try {
			final EntityType type = EntityType.fromId(Short.parseShort(value));
			if (type != null) {
				return type;
			}
		}
		catch (final Exception ignored) { }
		return null;
	}

}
