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
final class StringValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final String value;

    public /* synthetic */ StringValue(int i2, String str, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, StringValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = str;
    }

    public static /* synthetic */ StringValue copy$default(StringValue stringValue, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stringValue.value;
        }
        return stringValue.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final StringValue copy(String str) {
        x.f(str, "value");
        return new StringValue(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringValue) && x.n(this.value, ((StringValue) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "StringValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<StringValue> serializer() {
            return StringValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public StringValue(String str) {
        x.f(str, "value");
        this.value = str;
    }
}
