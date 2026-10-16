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
final class FloatArrayValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final float[] value;

    public /* synthetic */ FloatArrayValue(int i2, float[] fArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, FloatArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = fArr;
    }

    public static /* synthetic */ FloatArrayValue copy$default(FloatArrayValue floatArrayValue, float[] fArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fArr = floatArrayValue.value;
        }
        return floatArrayValue.copy(fArr);
    }

    public final float[] component1() {
        return this.value;
    }

    public final FloatArrayValue copy(float[] fArr) {
        x.f(fArr, "value");
        return new FloatArrayValue(fArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FloatArrayValue) && x.n(this.value, ((FloatArrayValue) obj).value);
    }

    public final float[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "FloatArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<FloatArrayValue> serializer() {
            return FloatArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public FloatArrayValue(float[] fArr) {
        x.f(fArr, "value");
        this.value = fArr;
    }
}
