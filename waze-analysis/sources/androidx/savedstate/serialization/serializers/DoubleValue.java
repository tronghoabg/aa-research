package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class DoubleValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final double value;

    public /* synthetic */ DoubleValue(int i2, double d2, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, DoubleValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = d2;
    }

    public static /* synthetic */ DoubleValue copy$default(DoubleValue doubleValue, double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d2 = doubleValue.value;
        }
        return doubleValue.copy(d2);
    }

    public final double component1() {
        return this.value;
    }

    public final DoubleValue copy(double d2) {
        return new DoubleValue(d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) obj).value) == 0;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return DoubleValue$$ExternalSyntheticBackport0.m(this.value);
    }

    public String toString() {
        return "DoubleValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<DoubleValue> serializer() {
            return DoubleValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public DoubleValue(double d2) {
        this.value = d2;
    }
}
