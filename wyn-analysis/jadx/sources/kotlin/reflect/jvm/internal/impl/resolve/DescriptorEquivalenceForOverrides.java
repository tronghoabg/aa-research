package kotlin.reflect.jvm.internal.impl.resolve;

import ff.o;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes5.dex */
public final class DescriptorEquivalenceForOverrides {

    @NotNull
    public static final DescriptorEquivalenceForOverrides INSTANCE = new DescriptorEquivalenceForOverrides();

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements p {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // tf.p
        @NotNull
        public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C33581 extends AbstractC3343n implements p {
        public static final C33581 INSTANCE = new C33581();

        public C33581() {
            super(2);
        }

        @Override // tf.p
        @NotNull
        public final Boolean invoke(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2) {
            return Boolean.FALSE;
        }
    }

    private DescriptorEquivalenceForOverrides() {
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z2, boolean z10, boolean z11, KotlinTypeRefiner kotlinTypeRefiner, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i5 & 16) != 0) {
            z11 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z2, z12, z11, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean areCallableDescriptorsEquivalent$lambda$0(boolean z2, CallableDescriptor a5, CallableDescriptor b5, TypeConstructor c12, TypeConstructor c22) {
        AbstractC3340k.e(a5, "$a");
        AbstractC3340k.e(b5, "$b");
        AbstractC3340k.e(c12, "c1");
        AbstractC3340k.e(c22, "c2");
        if (c12.equals(c22)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor = c12.mo419getDeclarationDescriptor();
        ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor2 = c22.mo419getDeclarationDescriptor();
        if ((classifierDescriptorMo419getDeclarationDescriptor instanceof TypeParameterDescriptor) && (classifierDescriptorMo419getDeclarationDescriptor2 instanceof TypeParameterDescriptor)) {
            return INSTANCE.areTypeParametersEquivalent((TypeParameterDescriptor) classifierDescriptorMo419getDeclarationDescriptor, (TypeParameterDescriptor) classifierDescriptorMo419getDeclarationDescriptor2, z2, new DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1$1(a5, b5));
        }
        return false;
    }

    private final boolean areClassesEquivalent(ClassDescriptor classDescriptor, ClassDescriptor classDescriptor2) {
        return AbstractC3340k.a(classDescriptor.getTypeConstructor(), classDescriptor2.getTypeConstructor());
    }

    public static /* synthetic */ boolean areEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, boolean z2, boolean z10, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z10 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z2, z10);
    }

    public static /* synthetic */ boolean areTypeParametersEquivalent$default(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, boolean z2, p pVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            pVar = C33581.INSTANCE;
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z2, pVar);
    }

    private final boolean ownersEquivalent(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2, p pVar, boolean z2) {
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        return ((containingDeclaration instanceof CallableMemberDescriptor) || (containingDeclaration2 instanceof CallableMemberDescriptor)) ? ((Boolean) pVar.invoke(containingDeclaration, containingDeclaration2)).booleanValue() : areEquivalent$default(this, containingDeclaration, containingDeclaration2, z2, false, 8, null);
    }

    private final SourceElement singleSource(CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            AbstractC3340k.d(overriddenDescriptors, "getOverriddenDescriptors(...)");
            callableDescriptor = (CallableMemberDescriptor) o.J0(overriddenDescriptors);
            if (callableDescriptor == null) {
                return null;
            }
        }
        return callableDescriptor.getSource();
    }

    public final boolean areCallableDescriptorsEquivalent(@NotNull final CallableDescriptor a5, @NotNull final CallableDescriptor b5, final boolean z2, boolean z10, boolean z11, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC3340k.e(a5, "a");
        AbstractC3340k.e(b5, "b");
        AbstractC3340k.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (a5.equals(b5)) {
            return true;
        }
        if (!AbstractC3340k.a(a5.getName(), b5.getName())) {
            return false;
        }
        if (z10 && (a5 instanceof MemberDescriptor) && (b5 instanceof MemberDescriptor) && ((MemberDescriptor) a5).isExpect() != ((MemberDescriptor) b5).isExpect()) {
            return false;
        }
        if ((AbstractC3340k.a(a5.getContainingDeclaration(), b5.getContainingDeclaration()) && (!z2 || !AbstractC3340k.a(singleSource(a5), singleSource(b5)))) || DescriptorUtils.isLocal(a5) || DescriptorUtils.isLocal(b5) || !ownersEquivalent(a5, b5, AnonymousClass1.INSTANCE, z2)) {
            return false;
        }
        OverridingUtil overridingUtilCreate = OverridingUtil.create(kotlinTypeRefiner, new KotlinTypeChecker.TypeConstructorEquality(z2, a5, b5) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0
            private final boolean arg$0;
            private final CallableDescriptor arg$1;
            private final CallableDescriptor arg$2;

            {
                this.arg$0 = z2;
                this.arg$1 = a5;
                this.arg$2 = b5;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
                return DescriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent$lambda$0(this.arg$0, this.arg$1, this.arg$2, typeConstructor, typeConstructor2);
            }
        });
        AbstractC3340k.d(overridingUtilCreate, "create(...)");
        OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtilCreate.isOverridableBy(a5, b5, null, !z11).getResult();
        OverridingUtil.OverrideCompatibilityInfo.Result result2 = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        return result == result2 && overridingUtilCreate.isOverridableBy(b5, a5, null, z11 ^ true).getResult() == result2;
    }

    public final boolean areEquivalent(@Nullable DeclarationDescriptor declarationDescriptor, @Nullable DeclarationDescriptor declarationDescriptor2, boolean z2, boolean z10) {
        return ((declarationDescriptor instanceof ClassDescriptor) && (declarationDescriptor2 instanceof ClassDescriptor)) ? areClassesEquivalent((ClassDescriptor) declarationDescriptor, (ClassDescriptor) declarationDescriptor2) : ((declarationDescriptor instanceof TypeParameterDescriptor) && (declarationDescriptor2 instanceof TypeParameterDescriptor)) ? areTypeParametersEquivalent$default(this, (TypeParameterDescriptor) declarationDescriptor, (TypeParameterDescriptor) declarationDescriptor2, z2, null, 8, null) : ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) ? areCallableDescriptorsEquivalent$default(this, (CallableDescriptor) declarationDescriptor, (CallableDescriptor) declarationDescriptor2, z2, z10, false, KotlinTypeRefiner.Default.INSTANCE, 16, null) : ((declarationDescriptor instanceof PackageFragmentDescriptor) && (declarationDescriptor2 instanceof PackageFragmentDescriptor)) ? AbstractC3340k.a(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : AbstractC3340k.a(declarationDescriptor, declarationDescriptor2);
    }

    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a5, @NotNull TypeParameterDescriptor b5, boolean z2) {
        AbstractC3340k.e(a5, "a");
        AbstractC3340k.e(b5, "b");
        return areTypeParametersEquivalent$default(this, a5, b5, z2, null, 8, null);
    }

    public final boolean areTypeParametersEquivalent(@NotNull TypeParameterDescriptor a5, @NotNull TypeParameterDescriptor b5, boolean z2, @NotNull p equivalentCallables) {
        AbstractC3340k.e(a5, "a");
        AbstractC3340k.e(b5, "b");
        AbstractC3340k.e(equivalentCallables, "equivalentCallables");
        if (a5.equals(b5)) {
            return true;
        }
        return !AbstractC3340k.a(a5.getContainingDeclaration(), b5.getContainingDeclaration()) && ownersEquivalent(a5, b5, equivalentCallables, z2) && a5.getIndex() == b5.getIndex();
    }
}
