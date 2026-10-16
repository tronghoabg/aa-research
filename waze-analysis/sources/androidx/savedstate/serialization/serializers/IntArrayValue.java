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
final class IntArrayValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final int[] value;

    public /* synthetic */ IntArrayValue(int i2, int[] iArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, IntArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = iArr;
    }

    public static /* synthetic */ IntArrayValue copy$default(IntArrayValue intArrayValue, int[] iArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iArr = intArrayValue.value;
        }
        return intArrayValue.copy(iArr);
    }

    public final int[] component1() {
        return this.value;
    }

    public final IntArrayValue copy(int[] iArr) {
        x.f(iArr, "value");
        return new IntArrayValue(iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntArrayValue) && x.n(this.value, ((IntArrayValue) obj).value);
    }

    public final int[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "IntArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<IntArrayValue> serializer() {
            return IntArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public IntArrayValue(int[] iArr) {
        x.f(iArr, "value");
        this.value = iArr;
    }
}
