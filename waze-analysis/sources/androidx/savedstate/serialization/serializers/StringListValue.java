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
final class StringListValue implements SerializableValue {
    private final List<String> value;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.StringListValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return StringListValue._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ StringListValue(int i2, List list, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, StringListValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(cf.f51036a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StringListValue copy$default(StringListValue stringListValue, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = stringListValue.value;
        }
        return stringListValue.copy(list);
    }

    public final List<String> component1() {
        return this.value;
    }

    public final StringListValue copy(List<String> list) {
        x.f(list, "value");
        return new StringListValue(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StringListValue) && x.n(this.value, ((StringListValue) obj).value);
    }

    public final List<String> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "StringListValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<StringListValue> serializer() {
            return StringListValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public StringListValue(List<String> list) {
        x.f(list, "value");
        this.value = list;
    }
}
