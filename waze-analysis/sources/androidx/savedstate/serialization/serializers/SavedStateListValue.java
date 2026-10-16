package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
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
import kotlinx.b.c.e;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class SavedStateListValue implements SerializableValue {
    private final List<Bundle> value;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.SavedStateListValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return SavedStateListValue._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ SavedStateListValue(int i2, List list, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, SavedStateListValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        return new e(SavedStateSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavedStateListValue copy$default(SavedStateListValue savedStateListValue, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = savedStateListValue.value;
        }
        return savedStateListValue.copy(list);
    }

    public final List<Bundle> component1() {
        return this.value;
    }

    public final SavedStateListValue copy(List<Bundle> list) {
        x.f(list, "value");
        return new SavedStateListValue(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedStateListValue) && x.n(this.value, ((SavedStateListValue) obj).value);
    }

    public final List<Bundle> getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "SavedStateListValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<SavedStateListValue> serializer() {
            return SavedStateListValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SavedStateListValue(List<Bundle> list) {
        x.f(list, "value");
        this.value = list;
    }
}
