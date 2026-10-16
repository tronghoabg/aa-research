package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class LongValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final long value;

    public /* synthetic */ LongValue(int i2, long j2, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, LongValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = j2;
    }

    public static /* synthetic */ LongValue copy$default(LongValue longValue, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = longValue.value;
        }
        return longValue.copy(j2);
    }

    public final long component1() {
        return this.value;
    }

    public final LongValue copy(long j2) {
        return new LongValue(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LongValue) && this.value == ((LongValue) obj).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return LongValue$$ExternalSyntheticBackport0.m(this.value);
    }

    public String toString() {
        return "LongValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<LongValue> serializer() {
            return LongValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public LongValue(long j2) {
        this.value = j2;
    }
}
