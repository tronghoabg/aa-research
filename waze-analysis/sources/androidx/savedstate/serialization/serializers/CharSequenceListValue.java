package androidx.savedstate.serialization.serializers;

import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.h;
import h.o.c;
import java.util.List;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.c.cf;
import kotlinx.b.c.e;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class CharSequenceListValue implements SerializableValue {
    private final List<String> value;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.CharSequenceListValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return CharSequenceListValue._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ CharSequenceListValue(int i2, List list, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, CharSequenceListValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(cf.f51036a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CharSequenceListValue copy$default(CharSequenceListValue charSequenceListValue, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = charSequenceListValue.value;
        }
        return charSequenceListValue.copy(list);
    }

    public final List<String> component1() {
        return this.value;
    }

    public final CharSequenceListValue copy(List<String> list) {
        x.f(list, "value");
        return new CharSequenceListValue(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CharSequenceListValue) && x.n(this.value, ((CharSequenceListValue) obj).value);
    }

    public final List<String> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "CharSequenceListValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<CharSequenceListValue> serializer() {
            return CharSequenceListValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public CharSequenceListValue(List<String> list) {
        x.f(list, "value");
        this.value = list;
    }
}
