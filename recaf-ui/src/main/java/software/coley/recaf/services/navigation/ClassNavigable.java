package software.coley.recaf.services.navigation;

import jakarta.annotation.Nonnull;
import software.coley.recaf.info.ClassInfo;
import software.coley.recaf.info.member.ClassMember;
import software.coley.recaf.path.ClassPathNode;

/**
 * Outline of navigable content representing {@link ClassInfo} values.
 *
 * @author Matt Coley
 */
public interface ClassNavigable extends Navigable {
	/**
	 * @return Class path of this navigable component.
	 */
	@Nonnull
	ClassPathNode getClassPath();

	/**
	 * Requests focus of the class member contained within this navigable representation of a class.
	 *
	 * @param member
	 * 		Member to focus.
	 */
	void requestFocus(@Nonnull ClassMember member);
}
