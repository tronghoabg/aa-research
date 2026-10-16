package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ef.C2522f;
import ef.InterfaceC2519c;
import ff.v;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;
import tf.l;

/* loaded from: classes5.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LazyJavaResolverContext f39759c;

    @NotNull
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> packageFragments;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$getPackageFragment$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ JavaPackage $jPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JavaPackage javaPackage) {
            super(0);
            this.$jPackage = javaPackage;
        }

        @Override // tf.a
        @NotNull
        public final LazyJavaPackageFragment invoke() {
            return new LazyJavaPackageFragment(LazyJavaPackageFragmentProvider.this.f39759c, this.$jPackage);
        }
    }

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents components) {
        AbstractC3340k.e(components, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(components, TypeParameterResolver.EMPTY.INSTANCE, new C2522f());
        this.f39759c = lazyJavaResolverContext;
        this.packageFragments = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    private final LazyJavaPackageFragment getPackageFragment(FqName fqName) {
        JavaPackage javaPackageFindPackage$default = JavaClassFinder$$Util.findPackage$default(this.f39759c.getComponents().getFinder(), fqName, false, 2, null);
        if (javaPackageFindPackage$default == null) {
            return null;
        }
        return this.packageFragments.computeIfAbsent(fqName, new AnonymousClass1(javaPackageFindPackage$default));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        AbstractC3340k.e(fqName, "fqName");
        AbstractC3340k.e(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, getPackageFragment(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @InterfaceC2519c
    @NotNull
    public List<LazyJavaPackageFragment> getPackageFragments(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        return AbstractC3935e.E(getPackageFragment(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        return JavaClassFinder$$Util.findPackage$default(this.f39759c.getComponents().getFinder(), fqName, false, 2, null) == null;
    }

    @NotNull
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f39759c.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public List<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull l nameFilter) {
        AbstractC3340k.e(fqName, "fqName");
        AbstractC3340k.e(nameFilter, "nameFilter");
        LazyJavaPackageFragment packageFragment = getPackageFragment(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = packageFragment != null ? packageFragment.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? v.f35432a : subPackageFqNames$descriptors_jvm;
    }
}
