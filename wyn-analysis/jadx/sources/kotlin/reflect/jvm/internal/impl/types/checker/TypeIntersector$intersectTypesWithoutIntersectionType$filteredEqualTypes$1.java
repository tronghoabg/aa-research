package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC3337h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import tf.p;

/* loaded from: classes5.dex */
public /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends AbstractC3337h implements p {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(Object obj) {
        super(2, obj);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final KDeclarationContainer getOwner() {
        return H.f39741a.getOrCreateKotlinClass(TypeIntersector.class);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // tf.p
    @NotNull
    public final Boolean invoke(@NotNull KotlinType p02, @NotNull KotlinType p12) {
        AbstractC3340k.e(p02, "p0");
        AbstractC3340k.e(p12, "p1");
        return Boolean.valueOf(((TypeIntersector) this.receiver).isStrictSupertype(p02, p12));
    }
}
