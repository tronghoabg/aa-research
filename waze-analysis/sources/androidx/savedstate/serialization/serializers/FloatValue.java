package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class FloatValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final float value;

    public /* synthetic */ FloatValue(int i2, float f2, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, FloatValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = f2;
    }

    public static /* synthetic */ FloatValue copy$default(FloatValue floatValue, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = floatValue.value;
        }
        return floatValue.copy(f2);
    }

    public final float component1() {
        return this.value;
    }

    public final FloatValue copy(float f2) {
        return new FloatValue(f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FloatValue) && Float.compare(this.value, ((FloatValue) obj).value) == 0;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public String toString() {
        return "FloatValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<FloatValue> serializer() {
            return FloatValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public FloatValue(float f2) {
        this.value = f2;
    }
}
