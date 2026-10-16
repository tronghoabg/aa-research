package kotlin.reflect.jvm.internal.impl.types.checker;

import ff.o;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import tf.a;

/* loaded from: classes5.dex */
public final class TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 extends AbstractC3343n implements a {
    final /* synthetic */ Set<SimpleType> $inputTypes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1(Set<? extends SimpleType> set) {
        super(0);
        this.$inputTypes = set;
    }

    @Override // tf.a
    @NotNull
    public final String invoke() {
        return "This collections cannot be empty! input types: " + o.w0(this.$inputTypes, null, null, null, null, 63);
    }
}
