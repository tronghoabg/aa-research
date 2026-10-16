package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import h.g.b.o;
import h.g.b.x;
import h.o.c;
import kotlinx.b.b;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class SavedStateValue implements SerializableValue {
    public static final Companion Companion = new Companion(null);
    private final Bundle value;

    public /* synthetic */ SavedStateValue(int i2, Bundle bundle, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, SavedStateValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = bundle;
    }

    public static /* synthetic */ SavedStateValue copy$default(SavedStateValue savedStateValue, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bundle = savedStateValue.value;
        }
        return savedStateValue.copy(bundle);
    }

    @j(a = SavedStateSerializer.class)
    public static /* synthetic */ void getValue$annotations() {
    }

    public final Bundle component1() {
        return this.value;
    }

    public final SavedStateValue copy(Bundle bundle) {
        x.f(bundle, "value");
        return new SavedStateValue(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedStateValue) && x.n(this.value, ((SavedStateValue) obj).value);
    }

    public final Bundle getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "SavedStateValue(value=" + this.value + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<SavedStateValue> serializer() {
            return SavedStateValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SavedStateValue(Bundle bundle) {
        x.f(bundle, "value");
        this.value = bundle;
    }
}
