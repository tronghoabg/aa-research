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
final class CharArrayValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final char[] value;

    public /* synthetic */ CharArrayValue(int i2, char[] cArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, CharArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = cArr;
    }

    public static /* synthetic */ CharArrayValue copy$default(CharArrayValue charArrayValue, char[] cArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cArr = charArrayValue.value;
        }
        return charArrayValue.copy(cArr);
    }

    public final char[] component1() {
        return this.value;
    }

    public final CharArrayValue copy(char[] cArr) {
        x.f(cArr, "value");
        return new CharArrayValue(cArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CharArrayValue) && x.n(this.value, ((CharArrayValue) obj).value);
    }

    public final char[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "CharArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<CharArrayValue> serializer() {
            return CharArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public CharArrayValue(char[] cArr) {
        x.f(cArr, "value");
        this.value = cArr;
    }
}
