package kotlin.reflect.jvm.internal.impl.descriptors;

import ef.InterfaceC2519c;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public interface PackageFragmentProvider {
    @InterfaceC2519c
    @NotNull
    List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName);

    @NotNull
    Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull l lVar);
}
