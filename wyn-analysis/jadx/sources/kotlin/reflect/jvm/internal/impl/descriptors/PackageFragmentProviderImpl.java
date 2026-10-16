package kotlin.reflect.jvm.internal.impl.descriptors;

import Af.n;
import ef.InterfaceC2519c;
import ff.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    @NotNull
    private final Collection<PackageFragmentDescriptor> packageFragments;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        @NotNull
        public final FqName invoke(@NotNull PackageFragmentDescriptor it) {
            AbstractC3340k.e(it, "it");
            return it.getFqName();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$getSubPackagesOf$2, reason: invalid class name */
    public static final class AnonymousClass2 extends AbstractC3343n implements l {
        final /* synthetic */ FqName $fqName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FqName fqName) {
            super(1);
            this.$fqName = fqName;
        }

        @Override // tf.l
        @NotNull
        public final Boolean invoke(@NotNull FqName it) {
            AbstractC3340k.e(it, "it");
            return Boolean.valueOf(!it.isRoot() && AbstractC3340k.a(it.parent(), this.$fqName));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(@NotNull Collection<? extends PackageFragmentDescriptor> packageFragments) {
        AbstractC3340k.e(packageFragments, "packageFragments");
        this.packageFragments = packageFragments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        AbstractC3340k.e(fqName, "fqName");
        AbstractC3340k.e(packageFragments, "packageFragments");
        for (Object obj : this.packageFragments) {
            if (AbstractC3340k.a(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @InterfaceC2519c
    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.packageFragments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC3340k.a(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull l nameFilter) {
        AbstractC3340k.e(fqName, "fqName");
        AbstractC3340k.e(nameFilter, "nameFilter");
        return n.e0(n.V(n.c0(o.j0(this.packageFragments), AnonymousClass1.INSTANCE), new AnonymousClass2(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        AbstractC3340k.e(fqName, "fqName");
        Collection<PackageFragmentDescriptor> collection = this.packageFragments;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC3340k.a(((PackageFragmentDescriptor) it.next()).getFqName(), fqName)) {
                return false;
            }
        }
        return true;
    }
}
