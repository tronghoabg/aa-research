package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import ef.C2527k;
import ff.p;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

/* loaded from: classes5.dex */
public final class CapturedTypeConstructorKt {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC3343n implements a {
        final /* synthetic */ TypeProjection $this_createCapturedIfNeeded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TypeProjection typeProjection) {
            super(0);
            this.$this_createCapturedIfNeeded = typeProjection;
        }

        @Override // tf.a
        @NotNull
        public final KotlinType invoke() {
            KotlinType type = this.$this_createCapturedIfNeeded.getType();
            AbstractC3340k.d(type, "getType(...)");
            return type;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypeProjection createCapturedIfNeeded(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor == null || typeProjection.getProjectionKind() == Variance.INVARIANT) {
            return typeProjection;
        }
        if (typeParameterDescriptor.getVariance() != typeProjection.getProjectionKind()) {
            return new TypeProjectionImpl(createCapturedType(typeProjection));
        }
        if (!typeProjection.isStarProjection()) {
            return new TypeProjectionImpl(typeProjection.getType());
        }
        StorageManager NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
        AbstractC3340k.d(NO_LOCKS, "NO_LOCKS");
        return new TypeProjectionImpl(new LazyWrappedType(NO_LOCKS, new AnonymousClass1(typeProjection)));
    }

    @NotNull
    public static final KotlinType createCapturedType(@NotNull TypeProjection typeProjection) {
        AbstractC3340k.e(typeProjection, "typeProjection");
        return new CapturedType(typeProjection, null, false, null, 14, null);
    }

    public static final boolean isCaptured(@NotNull KotlinType kotlinType) {
        AbstractC3340k.e(kotlinType, "<this>");
        return kotlinType.getConstructor() instanceof CapturedTypeConstructor;
    }

    @NotNull
    public static final TypeSubstitution wrapWithCapturingSubstitution(@NotNull TypeSubstitution typeSubstitution, final boolean z2) {
        AbstractC3340k.e(typeSubstitution, "<this>");
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution.2
                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                public boolean approximateContravariantCapturedTypes() {
                    return z2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                @Nullable
                /* renamed from: get */
                public TypeProjection mo424get(@NotNull KotlinType key) {
                    AbstractC3340k.e(key, "key");
                    TypeProjection typeProjectionMo424get = super.mo424get(key);
                    if (typeProjectionMo424get == null) {
                        return null;
                    }
                    ClassifierDescriptor classifierDescriptorMo419getDeclarationDescriptor = key.getConstructor().mo419getDeclarationDescriptor();
                    return CapturedTypeConstructorKt.createCapturedIfNeeded(typeProjectionMo424get, classifierDescriptorMo419getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) classifierDescriptorMo419getDeclarationDescriptor : null);
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] parameters = indexedParametersSubstitution.getParameters();
        TypeProjection[] arguments = indexedParametersSubstitution.getArguments();
        TypeParameterDescriptor[] other = indexedParametersSubstitution.getParameters();
        AbstractC3340k.e(arguments, "<this>");
        AbstractC3340k.e(other, "other");
        int iMin = Math.min(arguments.length, other.length);
        ArrayList<C2527k> arrayList = new ArrayList(iMin);
        for (int i5 = 0; i5 < iMin; i5++) {
            arrayList.add(new C2527k(arguments[i5], other[i5]));
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        for (C2527k c2527k : arrayList) {
            arrayList2.add(createCapturedIfNeeded((TypeProjection) c2527k.f34671a, (TypeParameterDescriptor) c2527k.f34672b));
        }
        return new IndexedParametersSubstitution(parameters, (TypeProjection[]) arrayList2.toArray(new TypeProjection[0]), z2);
    }

    public static /* synthetic */ TypeSubstitution wrapWithCapturingSubstitution$default(TypeSubstitution typeSubstitution, boolean z2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z2 = true;
        }
        return wrapWithCapturingSubstitution(typeSubstitution, z2);
    }
}
