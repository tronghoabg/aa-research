package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class CharValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final char value;

    public /* synthetic */ CharValue(int i2, char c2, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, CharValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = c2;
    }

    public static /* synthetic */ CharValue copy$default(CharValue charValue, char c2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c2 = charValue.value;
        }
        return charValue.copy(c2);
    }

    public final char component1() {
        return this.value;
    }

    public final CharValue copy(char c2) {
        return new CharValue(c2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CharValue) && this.value == ((CharValue) obj).value;
    }

    public final char getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "CharValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<CharValue> serializer() {
            return CharValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public CharValue(char c2) {
        this.value = c2;
    }
}
