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
final class BooleanArrayValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final boolean[] value;

    public /* synthetic */ BooleanArrayValue(int i2, boolean[] zArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, BooleanArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = zArr;
    }

    public static /* synthetic */ BooleanArrayValue copy$default(BooleanArrayValue booleanArrayValue, boolean[] zArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            zArr = booleanArrayValue.value;
        }
        return booleanArrayValue.copy(zArr);
    }

    public final boolean[] component1() {
        return this.value;
    }

    public final BooleanArrayValue copy(boolean[] zArr) {
        x.f(zArr, "value");
        return new BooleanArrayValue(zArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BooleanArrayValue) && x.n(this.value, ((BooleanArrayValue) obj).value);
    }

    public final boolean[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "BooleanArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<BooleanArrayValue> serializer() {
            return BooleanArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public BooleanArrayValue(boolean[] zArr) {
        x.f(zArr, "value");
        this.value = zArr;
    }
}
