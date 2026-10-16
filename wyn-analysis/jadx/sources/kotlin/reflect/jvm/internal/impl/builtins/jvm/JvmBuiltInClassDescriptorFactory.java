package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ff.o;
import ff.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tg.b;

/* loaded from: classes5.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;

    @NotNull
    private static final ClassId CLONEABLE_CLASS_ID;

    @NotNull
    private static final Name CLONEABLE_NAME;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final FqName KOTLIN_FQ_NAME;

    @NotNull
    private final NotNullLazyValue cloneable$delegate;

    @NotNull
    private final l computeContainingDeclaration;

    @NotNull
    private final ModuleDescriptor moduleDescriptor;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInClassDescriptorFactory$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // tf.l
        @NotNull
        public final BuiltInsPackageFragment invoke(@NotNull ModuleDescriptor module) {
            AbstractC3340k.e(module, "module");
            List<PackageFragmentDescriptor> fragments = module.getPackage(JvmBuiltInClassDescriptorFactory.KOTLIN_FQ_NAME).getFragments();
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof BuiltInsPackageFragment) {
                    arrayList.add(obj);
                }
            }
            return (BuiltInsPackageFragment) o.q0(arrayList);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }

        private Companion() {
        }
    }

    static {
        I i5 = H.f39741a;
        $$delegatedProperties = new KProperty[]{i5.property1(new y(i5.getOrCreateKotlinClass(JvmBuiltInClassDescriptorFactory.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        Companion = new Companion(null);
        KOTLIN_FQ_NAME = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.cloneable;
        Name nameShortName = fqNameUnsafe.shortName();
        AbstractC3340k.d(nameShortName, "shortName(...)");
        CLONEABLE_NAME = nameShortName;
        ClassId classId = ClassId.topLevel(fqNameUnsafe.toSafe());
        AbstractC3340k.d(classId, "topLevel(...)");
        CLONEABLE_CLASS_ID = classId;
    }

    public JvmBuiltInClassDescriptorFactory(@NotNull StorageManager storageManager, @NotNull ModuleDescriptor moduleDescriptor, @NotNull l computeContainingDeclaration) {
        AbstractC3340k.e(storageManager, "storageManager");
        AbstractC3340k.e(moduleDescriptor, "moduleDescriptor");
        AbstractC3340k.e(computeContainingDeclaration, "computeContainingDeclaration");
        this.moduleDescriptor = moduleDescriptor;
        this.computeContainingDeclaration = computeContainingDeclaration;
        this.cloneable$delegate = storageManager.createLazyValue(new JvmBuiltInClassDescriptorFactory$cloneable$2(this, storageManager));
    }

    private final ClassDescriptorImpl getCloneable() {
        return (ClassDescriptorImpl) StorageKt.getValue(this.cloneable$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @Nullable
    public ClassDescriptor createClass(@NotNull ClassId classId) {
        AbstractC3340k.e(classId, "classId");
        if (classId.equals(CLONEABLE_CLASS_ID)) {
            return getCloneable();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    @NotNull
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName packageFqName) {
        AbstractC3340k.e(packageFqName, "packageFqName");
        return packageFqName.equals(KOTLIN_FQ_NAME) ? b.P(getCloneable()) : x.f35434a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(@NotNull FqName packageFqName, @NotNull Name name) {
        AbstractC3340k.e(packageFqName, "packageFqName");
        AbstractC3340k.e(name, "name");
        return name.equals(CLONEABLE_NAME) && packageFqName.equals(KOTLIN_FQ_NAME);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, l lVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i5 & 4) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }
}
