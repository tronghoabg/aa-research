package androidx.savedstate.serialization.serializers;

import h.g.b.o;
import h.g.b.x;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class CharSequenceValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public /* synthetic */ CharSequenceValue(int i2, String str, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, CharSequenceValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = str;
    }

    public static /* synthetic */ CharSequenceValue copy$default(CharSequenceValue charSequenceValue, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = charSequenceValue.value;
        }
        return charSequenceValue.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final CharSequenceValue copy(String str) {
        x.f(str, "value");
        return new CharSequenceValue(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CharSequenceValue) && x.n(this.value, ((CharSequenceValue) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "CharSequenceValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<CharSequenceValue> serializer() {
            return CharSequenceValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public CharSequenceValue(String str) {
        x.f(str, "value");
        this.value = str;
    }
}
