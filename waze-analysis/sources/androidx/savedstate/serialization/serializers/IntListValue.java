package androidx.savedstate.serialization.serializers;

import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.o.c;
import java.util.List;
import kotlinx.b.b;
import kotlinx.b.c.as;
import kotlinx.b.c.ca;
import kotlinx.b.c.e;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class IntListValue implements SerializableValue {
    private final List<Integer> value;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.IntListValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return IntListValue._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ IntListValue(int i2, List list, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, IntListValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(as.f50970a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntListValue copy$default(IntListValue intListValue, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = intListValue.value;
        }
        return intListValue.copy(list);
    }

    public final List<Integer> component1() {
        return this.value;
    }

    public final IntListValue copy(List<Integer> list) {
        x.f(list, "value");
        return new IntListValue(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntListValue) && x.n(this.value, ((IntListValue) obj).value);
    }

    public final List<Integer> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "IntListValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<IntListValue> serializer() {
            return IntListValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public IntListValue(List<Integer> list) {
        x.f(list, "value");
        this.value = list;
    }
}
