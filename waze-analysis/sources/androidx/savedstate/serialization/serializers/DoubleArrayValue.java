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
final class DoubleArrayValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final double[] value;

    public /* synthetic */ DoubleArrayValue(int i2, double[] dArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, DoubleArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = dArr;
    }

    public static /* synthetic */ DoubleArrayValue copy$default(DoubleArrayValue doubleArrayValue, double[] dArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dArr = doubleArrayValue.value;
        }
        return doubleArrayValue.copy(dArr);
    }

    public final double[] component1() {
        return this.value;
    }

    public final DoubleArrayValue copy(double[] dArr) {
        x.f(dArr, "value");
        return new DoubleArrayValue(dArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DoubleArrayValue) && x.n(this.value, ((DoubleArrayValue) obj).value);
    }

    public final double[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "DoubleArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<DoubleArrayValue> serializer() {
            return DoubleArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public DoubleArrayValue(double[] dArr) {
        x.f(dArr, "value");
        this.value = dArr;
    }
}
