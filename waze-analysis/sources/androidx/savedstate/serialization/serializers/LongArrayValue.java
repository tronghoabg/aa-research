package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.g.b.x;
import h.o.c;
import java.util.Arrays;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class LongArrayValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final long[] value;

    public /* synthetic */ LongArrayValue(int i2, long[] jArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, LongArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = jArr;
    }

    public static /* synthetic */ LongArrayValue copy$default(LongArrayValue longArrayValue, long[] jArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jArr = longArrayValue.value;
        }
        return longArrayValue.copy(jArr);
    }

    public final long[] component1() {
        return this.value;
    }

    public final LongArrayValue copy(long[] jArr) {
        x.f(jArr, "value");
        return new LongArrayValue(jArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LongArrayValue) && x.n(this.value, ((LongArrayValue) obj).value);
    }

    public final long[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "LongArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<LongArrayValue> serializer() {
            return LongArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public LongArrayValue(long[] jArr) {
        x.f(jArr, "value");
        this.value = jArr;
    }
}
