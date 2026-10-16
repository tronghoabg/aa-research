package kotlin.reflect.jvm.internal.impl.types;

import E5.Q;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class TypeSubstitutionKt {
    @NotNull
    public static final SimpleType asSimpleType(@NotNull KotlinType kotlinType) {
        AbstractC3340k.e(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        SimpleType simpleType = unwrappedTypeUnwrap instanceof SimpleType ? (SimpleType) unwrappedTypeUnwrap : null;
        if (simpleType != null) {
            return simpleType;
        }
        throw new IllegalStateException(("This is should be simple type: " + kotlinType).toString());
    }

    @NotNull
    public static final KotlinType replace(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeProjection> newArguments, @NotNull Annotations newAnnotations) {
        AbstractC3340k.e(kotlinType, "<this>");
        AbstractC3340k.e(newArguments, "newArguments");
        AbstractC3340k.e(newAnnotations, "newAnnotations");
        return replace$default(kotlinType, newArguments, newAnnotations, null, 4, null);
    }

    public static /* synthetic */ KotlinType replace$default(KotlinType kotlinType, List list, Annotations annotations, List list2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i5 & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i5 & 4) != 0) {
            list2 = list;
        }
        return replace(kotlinType, list, annotations, list2);
    }

    @NotNull
    public static final KotlinType replace(@NotNull KotlinType kotlinType, @NotNull List<? extends TypeProjection> newArguments, @NotNull Annotations newAnnotations, @NotNull List<? extends TypeProjection> newArgumentsForUpperBound) {
        AbstractC3340k.e(kotlinType, "<this>");
        AbstractC3340k.e(newArguments, "newArguments");
        AbstractC3340k.e(newAnnotations, "newAnnotations");
        AbstractC3340k.e(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == kotlinType.getArguments()) && newAnnotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        TypeAttributes attributes = kotlinType.getAttributes();
        if ((newAnnotations instanceof FilteredAnnotations) && newAnnotations.isEmpty()) {
            newAnnotations = Annotations.Companion.getEMPTY();
        }
        TypeAttributes typeAttributesReplaceAnnotations = TypeAttributesKt.replaceAnnotations(attributes, newAnnotations);
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
            return KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), newArguments, typeAttributesReplaceAnnotations), replace(flexibleType.getUpperBound(), newArgumentsForUpperBound, typeAttributesReplaceAnnotations));
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return replace((SimpleType) unwrappedTypeUnwrap, newArguments, typeAttributesReplaceAnnotations);
        }
        throw new Q((byte) 0, 9);
    }

    public static /* synthetic */ SimpleType replace$default(SimpleType simpleType, List list, TypeAttributes typeAttributes, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = simpleType.getArguments();
        }
        if ((i5 & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        return replace(simpleType, (List<? extends TypeProjection>) list, typeAttributes);
    }

    @NotNull
    public static final SimpleType replace(@NotNull SimpleType simpleType, @NotNull List<? extends TypeProjection> newArguments, @NotNull TypeAttributes newAttributes) {
        AbstractC3340k.e(simpleType, "<this>");
        AbstractC3340k.e(newArguments, "newArguments");
        AbstractC3340k.e(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == simpleType.getAttributes()) {
            return simpleType;
        }
        if (newArguments.isEmpty()) {
            return simpleType.replaceAttributes(newAttributes);
        }
        if (simpleType instanceof ErrorType) {
            return ((ErrorType) simpleType).replaceArguments(newArguments);
        }
        return KotlinTypeFactory.simpleType$default(newAttributes, simpleType.getConstructor(), newArguments, simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
