package androidx.savedstate.serialization.serializers;

import h.f;
import h.g;
import h.g.a.a;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.o.c;
import java.util.Arrays;
import kotlinx.b.b;
import kotlinx.b.c.by;
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class StringArrayValue implements SerializableValue {
    private final String[] value;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.StringArrayValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return StringArrayValue._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ StringArrayValue(int i2, String[] strArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, StringArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        int i2 = ar.f48106a;
        return new by(new m(String.class), cf.f51036a);
    }

    public static /* synthetic */ StringArrayValue copy$default(StringArrayValue stringArrayValue, String[] strArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            strArr = stringArrayValue.value;
        }
        return stringArrayValue.copy(strArr);
    }

    public final String[] component1() {
        return this.value;
    }

    public final StringArrayValue copy(String[] strArr) {
        x.f(strArr, "value");
        return new StringArrayValue(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringArrayValue) && x.n(this.value, ((StringArrayValue) obj).value);
    }

    public final String[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "StringArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<StringArrayValue> serializer() {
            return StringArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public StringArrayValue(String[] strArr) {
        x.f(strArr, "value");
        this.value = strArr;
    }
}
