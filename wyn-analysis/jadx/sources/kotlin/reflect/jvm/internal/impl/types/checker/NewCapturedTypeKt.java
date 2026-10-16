package kotlin.reflect.jvm.internal.impl.types.checker;

import ef.C2527k;
import ff.o;
import ff.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class NewCapturedTypeKt {
    private static final List<TypeProjection> captureArguments(UnwrappedType unwrappedType, CaptureStatus captureStatus) {
        if (unwrappedType.getArguments().size() == unwrappedType.getConstructor().getParameters().size()) {
            List<TypeProjection> arguments = unwrappedType.getArguments();
            List<TypeProjection> list = arguments;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                        List<TypeParameterDescriptor> parameters = unwrappedType.getConstructor().getParameters();
                        AbstractC3340k.d(parameters, "getParameters(...)");
                        ArrayList arrayListZ0 = o.Z0(list, parameters);
                        ArrayList arrayList = new ArrayList(p.a0(arrayListZ0, 10));
                        Iterator it2 = arrayListZ0.iterator();
                        while (it2.hasNext()) {
                            C2527k c2527k = (C2527k) it2.next();
                            TypeProjection typeProjectionAsTypeProjection = (TypeProjection) c2527k.f34671a;
                            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) c2527k.f34672b;
                            if (typeProjectionAsTypeProjection.getProjectionKind() != Variance.INVARIANT) {
                                UnwrappedType unwrappedTypeUnwrap = (typeProjectionAsTypeProjection.isStarProjection() || typeProjectionAsTypeProjection.getProjectionKind() != Variance.IN_VARIANCE) ? null : typeProjectionAsTypeProjection.getType().unwrap();
                                AbstractC3340k.b(typeParameterDescriptor);
                                typeProjectionAsTypeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(captureStatus, unwrappedTypeUnwrap, typeProjectionAsTypeProjection, typeParameterDescriptor));
                            }
                            arrayList.add(typeProjectionAsTypeProjection);
                        }
                        TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create(unwrappedType.getConstructor(), arrayList).buildSubstitutor();
                        int size = arguments.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            TypeProjection typeProjection = arguments.get(i5);
                            TypeProjection typeProjection2 = (TypeProjection) arrayList.get(i5);
                            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                                List<KotlinType> upperBounds = unwrappedType.getConstructor().getParameters().get(i5).getUpperBounds();
                                AbstractC3340k.d(upperBounds, "getUpperBounds(...)");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<T> it3 = upperBounds.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) it3.next(), Variance.INVARIANT).unwrap()));
                                }
                                if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == Variance.OUT_VARIANCE) {
                                    arrayList2.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection.getType().unwrap()));
                                }
                                KotlinType type = typeProjection2.getType();
                                AbstractC3340k.c(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                ((NewCapturedType) type).getConstructor().initializeSupertypes(arrayList2);
                            }
                        }
                        return arrayList;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static final SimpleType captureFromArguments(@NotNull SimpleType type, @NotNull CaptureStatus status) {
        AbstractC3340k.e(type, "type");
        AbstractC3340k.e(status, "status");
        List<TypeProjection> listCaptureArguments = captureArguments(type, status);
        if (listCaptureArguments != null) {
            return replaceArguments(type, listCaptureArguments);
        }
        return null;
    }

    private static final SimpleType replaceArguments(UnwrappedType unwrappedType, List<? extends TypeProjection> list) {
        return KotlinTypeFactory.simpleType$default(unwrappedType.getAttributes(), unwrappedType.getConstructor(), list, unwrappedType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }
}
