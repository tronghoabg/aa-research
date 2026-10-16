package kotlin.reflect.jvm.internal.impl.types;

import ff.v;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public final class KotlinTypeFactory {

    @NotNull
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();

    @NotNull
    private static final l EMPTY_REFINED_TYPE_FACTORY = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.INSTANCE;

    public static final class ExpandedTypeOrRefinedConstructor {

        @Nullable
        private final SimpleType expandedType;

        @Nullable
        private final TypeConstructor refinedConstructor;

        public ExpandedTypeOrRefinedConstructor(@Nullable SimpleType simpleType, @Nullable TypeConstructor typeConstructor) {
            this.expandedType = simpleType;
            this.refinedConstructor = typeConstructor;
        }

        @Nullable
        public final SimpleType getExpandedType() {
            return this.expandedType;
        }

        @Nullable
        public final TypeConstructor getRefinedConstructor() {
            return this.refinedConstructor;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements l {
        final /* synthetic */ List<TypeProjection> $arguments;
        final /* synthetic */ TypeAttributes $attributes;
        final /* synthetic */ TypeConstructor $constructor;
        final /* synthetic */ boolean $nullable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(TypeConstructor typeConstructor, List<? extends TypeProjection> list, TypeAttributes typeAttributes, boolean z2) {
            super(1);
            this.$constructor = typeConstructor;
            this.$arguments = list;
            this.$attributes = typeAttributes;
            this.$nullable = z2;
        }

        @Override // tf.l
        @Nullable
        public final SimpleType invoke(@NotNull KotlinTypeRefiner refiner) {
            AbstractC3340k.e(refiner, "refiner");
            ExpandedTypeOrRefinedConstructor expandedTypeOrRefinedConstructorRefineConstructor = KotlinTypeFactory.INSTANCE.refineConstructor(this.$constructor, refiner, this.$arguments);
            if (expandedTypeOrRefinedConstructorRefineConstructor == null) {
                return null;
            }
            SimpleType expandedType = expandedTypeOrRefinedConstructorRefineConstructor.getExpandedType();
            if (expandedType != null) {
                return expandedType;
            }
            TypeAttributes typeAttributes = this.$attributes;
            TypeConstructor refinedConstructor = expandedTypeOrRefinedConstructorRefineConstructor.getRefinedConstructor();
            AbstractC3340k.b(refinedConstructor);
            return KotlinTypeFactory.simpleType(typeAttributes, refinedConstructor, this.$arguments, this.$nullable, refiner);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1, reason: invalid class name and case insensitive filesystem */
    public static final class C33641 extends AbstractC3343n implements l {
        final /* synthetic */ List<TypeProjection> $arguments;
        final /* synthetic */ TypeAttributes $attributes;
        final /* synthetic */ TypeConstructor $constructor;
        final /* synthetic */ MemberScope $memberScope;
        final /* synthetic */ boolean $nullable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C33641(TypeConstructor typeConstructor, List<? extends TypeProjection> list, TypeAttributes typeAttributes, boolean z2, MemberScope memberScope) {
            super(1);
            this.$constructor = typeConstructor;
            this.$arguments = list;
            this.$attributes = typeAttributes;
            this.$nullable = z2;
            this.$memberScope = memberScope;
        }

        @Override // tf.l
        @Nullable
        public final SimpleType invoke(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            AbstractC3340k.e(kotlinTypeRefiner, "kotlinTypeRefiner");
            ExpandedTypeOrRefinedConstructor expandedTypeOrRefinedConstructorRefineConstructor = KotlinTypeFactory.INSTANCE.refineConstructor(this.$constructor, kotlinTypeRefiner, this.$arguments);
            if (expandedTypeOrRefinedConstructorRefineConstructor == null) {
                return null;
            }
            SimpleType expandedType = expandedTypeOrRefinedConstructorRefineConstructor.getExpandedType();
            if (expandedType != null) {
                return expandedType;
            }
            TypeAttributes typeAttributes = this.$attributes;
            TypeConstructor refinedConstructor = expandedTypeOrRefinedConstructorRefineConstructor.getRefinedConstructor();
            AbstractC3340k.b(refinedConstructor);
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, refinedConstructor, this.$arguments, this.$nullable, this.$memberScope);
        }
    }

    private KotlinTypeFactory() {
    }

    @NotNull
    public static final SimpleType computeExpandedType(@NotNull TypeAliasDescriptor typeAliasDescriptor, @NotNull List<? extends TypeProjection> arguments) {
        AbstractC3340k.e(typeAliasDescriptor, "<this>");
        AbstractC3340k.e(arguments, "arguments");
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, arguments), TypeAttributes.Companion.getEmpty());
    }

    private final MemberScope computeMemberScope(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor = typeConstructor.mo419getDeclarationDescriptor();
        if (classifierDescriptorMo419getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) classifierDescriptorMo419getDeclarationDescriptor).getDefaultType().getMemberScope();
        }
        if (classifierDescriptorMo419getDeclarationDescriptor instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(classifierDescriptorMo419getDeclarationDescriptor));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo419getDeclarationDescriptor, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) classifierDescriptorMo419getDeclarationDescriptor, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        }
        if (classifierDescriptorMo419getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((TypeAliasDescriptor) classifierDescriptorMo419getDeclarationDescriptor).getName().toString();
            AbstractC3340k.d(string, "toString(...)");
            return ErrorUtils.createErrorScope(errorScopeKind, true, string);
        }
        if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        }
        throw new IllegalStateException("Unsupported classifier: " + classifierDescriptorMo419getDeclarationDescriptor + " for constructor: " + typeConstructor);
    }

    @NotNull
    public static final UnwrappedType flexibleType(@NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        AbstractC3340k.e(lowerBound, "lowerBound");
        AbstractC3340k.e(upperBound, "upperBound");
        return lowerBound.equals(upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    @NotNull
    public static final SimpleType integerLiteralType(@NotNull TypeAttributes attributes, @NotNull IntegerLiteralTypeConstructor constructor, boolean z2) {
        AbstractC3340k.e(attributes, "attributes");
        AbstractC3340k.e(constructor, "constructor");
        return simpleTypeWithNonTrivialMemberScope(attributes, constructor, v.f35432a, z2, ErrorUtils.createErrorScope(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExpandedTypeOrRefinedConstructor refineConstructor(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor;
        ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor = typeConstructor.mo419getDeclarationDescriptor();
        if (classifierDescriptorMo419getDeclarationDescriptor == null || (classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(classifierDescriptorMo419getDeclarationDescriptor)) == null) {
            return null;
        }
        if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
            return new ExpandedTypeOrRefinedConstructor(computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, list), null);
        }
        TypeConstructor typeConstructorRefine = classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        AbstractC3340k.d(typeConstructorRefine, "refine(...)");
        return new ExpandedTypeOrRefinedConstructor(null, typeConstructorRefine);
    }

    @NotNull
    public static final SimpleType simpleNotNullType(@NotNull TypeAttributes attributes, @NotNull ClassDescriptor descriptor, @NotNull List<? extends TypeProjection> arguments) {
        AbstractC3340k.e(attributes, "attributes");
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(arguments, "arguments");
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        AbstractC3340k.d(typeConstructor, "getTypeConstructor(...)");
        return simpleType$default(attributes, typeConstructor, (List) arguments, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z2) {
        AbstractC3340k.e(attributes, "attributes");
        AbstractC3340k.e(constructor, "constructor");
        AbstractC3340k.e(arguments, "arguments");
        return simpleType$default(attributes, constructor, arguments, z2, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static /* synthetic */ SimpleType simpleType$default(TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z2, KotlinTypeRefiner kotlinTypeRefiner, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z2, kotlinTypeRefiner);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z2, @NotNull MemberScope memberScope) {
        AbstractC3340k.e(attributes, "attributes");
        AbstractC3340k.e(constructor, "constructor");
        AbstractC3340k.e(arguments, "arguments");
        AbstractC3340k.e(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z2, memberScope, new C33641(constructor, arguments, attributes, z2, memberScope));
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z2, @Nullable KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC3340k.e(attributes, "attributes");
        AbstractC3340k.e(constructor, "constructor");
        AbstractC3340k.e(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z2 || constructor.mo419getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(attributes, constructor, arguments, z2, INSTANCE.computeMemberScope(constructor, arguments, kotlinTypeRefiner), new AnonymousClass1(constructor, arguments, attributes, z2));
        }
        ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor = constructor.mo419getDeclarationDescriptor();
        AbstractC3340k.b(classifierDescriptorMo419getDeclarationDescriptor);
        SimpleType defaultType = classifierDescriptorMo419getDeclarationDescriptor.getDefaultType();
        AbstractC3340k.d(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, TypeAttributes typeAttributes, TypeConstructor typeConstructor, List list, boolean z2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i5 & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i5 & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i5 & 16) != 0) {
            z2 = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (List<? extends TypeProjection>) list, z2);
    }

    @NotNull
    public static final SimpleType simpleType(@NotNull SimpleType baseType, @NotNull TypeAttributes annotations, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z2) {
        AbstractC3340k.e(baseType, "baseType");
        AbstractC3340k.e(annotations, "annotations");
        AbstractC3340k.e(constructor, "constructor");
        AbstractC3340k.e(arguments, "arguments");
        return simpleType$default(annotations, constructor, arguments, z2, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @NotNull
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(@NotNull TypeAttributes attributes, @NotNull TypeConstructor constructor, @NotNull List<? extends TypeProjection> arguments, boolean z2, @NotNull MemberScope memberScope, @NotNull l refinedTypeFactory) {
        AbstractC3340k.e(attributes, "attributes");
        AbstractC3340k.e(constructor, "constructor");
        AbstractC3340k.e(arguments, "arguments");
        AbstractC3340k.e(memberScope, "memberScope");
        AbstractC3340k.e(refinedTypeFactory, "refinedTypeFactory");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z2, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? simpleTypeImpl : new SimpleTypeWithAttributes(simpleTypeImpl, attributes);
    }
}
