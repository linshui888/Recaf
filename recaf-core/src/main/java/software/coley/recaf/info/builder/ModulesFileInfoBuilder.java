package software.coley.recaf.info.builder;

import jakarta.annotation.Nonnull;
import software.coley.recaf.info.BasicModulesFileInfo;
import software.coley.recaf.info.ModulesFileInfo;

/**
 * Builder for {@link ModulesFileInfo}.
 *
 * @author Matt Coley
 */
public class ModulesFileInfoBuilder extends FileInfoBuilder<ModulesFileInfoBuilder> {
	public ModulesFileInfoBuilder() {
		// empty
	}

	public ModulesFileInfoBuilder(ModulesFileInfo modulesFileInfo) {
		super(modulesFileInfo);
	}

	public ModulesFileInfoBuilder(FileInfoBuilder<?> other) {
		super(other);
	}

	@Nonnull
	@Override
	public BasicModulesFileInfo build() {
		return new BasicModulesFileInfo(this);
	}
}
