package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class BooleanValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final boolean value;

    public /* synthetic */ BooleanValue(int i2, boolean z, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, BooleanValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = z;
    }

    public static /* synthetic */ BooleanValue copy$default(BooleanValue booleanValue, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = booleanValue.value;
        }
        return booleanValue.copy(z);
    }

    public final boolean component1() {
        return this.value;
    }

    public final BooleanValue copy(boolean z) {
        return new BooleanValue(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BooleanValue) && this.value == ((BooleanValue) obj).value;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return BooleanValue$$ExternalSyntheticBackport0.m(this.value);
    }

    public String toString() {
        return "BooleanValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<BooleanValue> serializer() {
            return BooleanValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public BooleanValue(boolean z) {
        this.value = z;
    }
}
