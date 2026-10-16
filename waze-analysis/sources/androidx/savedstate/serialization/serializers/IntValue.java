package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class IntValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final int value;

    public /* synthetic */ IntValue(int i2, int i3, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, IntValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = i3;
    }

    public static /* synthetic */ IntValue copy$default(IntValue intValue, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = intValue.value;
        }
        return intValue.copy(i2);
    }

    public final int component1() {
        return this.value;
    }

    public final IntValue copy(int i2) {
        return new IntValue(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntValue) && this.value == ((IntValue) obj).value;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "IntValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<IntValue> serializer() {
            return IntValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public IntValue(int i2) {
        this.value = i2;
    }
}
