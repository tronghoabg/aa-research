package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import Fe.c;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

/* loaded from: classes5.dex */
public final class ContextKt {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$childForClassOrPackage$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ ClassOrPackageFragmentDescriptor $containingDeclaration;
        final /* synthetic */ LazyJavaResolverContext $this_childForClassOrPackage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
            super(0);
            this.$this_childForClassOrPackage = lazyJavaResolverContext;
            this.$containingDeclaration = classOrPackageFragmentDescriptor;
        }

        @Override // tf.a
        @Nullable
        public final JavaTypeQualifiersByElementType invoke() {
            return ContextKt.computeNewDefaultTypeQualifiers(this.$this_childForClassOrPackage, this.$containingDeclaration.getAnnotations());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$copyWithNewDefaultTypeQualifiers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C33511 extends AbstractC3343n implements a {
        final /* synthetic */ Annotations $additionalAnnotations;
        final /* synthetic */ LazyJavaResolverContext $this_copyWithNewDefaultTypeQualifiers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33511(LazyJavaResolverContext lazyJavaResolverContext, Annotations annotations) {
            super(0);
            this.$this_copyWithNewDefaultTypeQualifiers = lazyJavaResolverContext;
            this.$additionalAnnotations = annotations;
        }

        @Override // tf.a
        @Nullable
        public final JavaTypeQualifiersByElementType invoke() {
            return ContextKt.computeNewDefaultTypeQualifiers(this.$this_copyWithNewDefaultTypeQualifiers, this.$additionalAnnotations);
        }
    }

    @NotNull
    public static final LazyJavaResolverContext child(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        AbstractC3340k.e(lazyJavaResolverContext, "<this>");
        AbstractC3340k.e(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    @NotNull
    public static final LazyJavaResolverContext childForClassOrPackage(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassOrPackageFragmentDescriptor containingDeclaration, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner, int i5) {
        AbstractC3340k.e(lazyJavaResolverContext, "<this>");
        AbstractC3340k.e(containingDeclaration, "containingDeclaration");
        return child(lazyJavaResolverContext, containingDeclaration, javaTypeParameterListOwner, i5, c.y(EnumC2526j.f34669c, new AnonymousClass1(lazyJavaResolverContext, containingDeclaration)));
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i5, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i10 & 4) != 0) {
            i5 = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i5);
    }

    @NotNull
    public static final LazyJavaResolverContext childForMethod(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaTypeParameterListOwner typeParameterOwner, int i5) {
        AbstractC3340k.e(lazyJavaResolverContext, "<this>");
        AbstractC3340k.e(containingDeclaration, "containingDeclaration");
        AbstractC3340k.e(typeParameterOwner, "typeParameterOwner");
        return child(lazyJavaResolverContext, containingDeclaration, typeParameterOwner, i5, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i5, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            i5 = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i5);
    }

    @Nullable
    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations additionalAnnotations) {
        AbstractC3340k.e(lazyJavaResolverContext, "<this>");
        AbstractC3340k.e(additionalAnnotations, "additionalAnnotations");
        return lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(lazyJavaResolverContext.getDefaultTypeQualifiers(), additionalAnnotations);
    }

    @NotNull
    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations additionalAnnotations) {
        AbstractC3340k.e(lazyJavaResolverContext, "<this>");
        AbstractC3340k.e(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), c.y(EnumC2526j.f34669c, new C33511(lazyJavaResolverContext, additionalAnnotations)));
    }

    @NotNull
    public static final LazyJavaResolverContext replaceComponents(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaResolverComponents components) {
        AbstractC3340k.e(lazyJavaResolverContext, "<this>");
        AbstractC3340k.e(components, "components");
        return new LazyJavaResolverContext(components, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i5, InterfaceC2525i interfaceC2525i) {
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i5) : lazyJavaResolverContext.getTypeParameterResolver(), interfaceC2525i);
    }
}
