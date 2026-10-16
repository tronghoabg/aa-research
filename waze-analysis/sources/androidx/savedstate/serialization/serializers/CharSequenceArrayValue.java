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
final class CharSequenceArrayValue implements SerializableValue {
    private final String[] value;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.CharSequenceArrayValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return CharSequenceArrayValue._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ CharSequenceArrayValue(int i2, String[] strArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, CharSequenceArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        int i2 = ar.f48106a;
        return new by(new m(String.class), cf.f51036a);
    }

    public static /* synthetic */ CharSequenceArrayValue copy$default(CharSequenceArrayValue charSequenceArrayValue, String[] strArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            strArr = charSequenceArrayValue.value;
        }
        return charSequenceArrayValue.copy(strArr);
    }

    public final String[] component1() {
        return this.value;
    }

    public final CharSequenceArrayValue copy(String[] strArr) {
        x.f(strArr, "value");
        return new CharSequenceArrayValue(strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CharSequenceArrayValue) && x.n(this.value, ((CharSequenceArrayValue) obj).value);
    }

    public final String[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "CharSequenceArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<CharSequenceArrayValue> serializer() {
            return CharSequenceArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public CharSequenceArrayValue(String[] strArr) {
        x.f(strArr, "value");
        this.value = strArr;
    }
}
