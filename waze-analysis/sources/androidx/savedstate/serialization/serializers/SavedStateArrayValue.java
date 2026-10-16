package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
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
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
final class SavedStateArrayValue implements SerializableValue {
    private final Bundle[] value;
    public static final Companion Companion = new Companion(null);
    private static final f<b<Object>>[] $childSerializers = {g.b(h.f48131b, new a() { // from class: androidx.savedstate.serialization.serializers.SavedStateArrayValue$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return SavedStateArrayValue._childSerializers$_anonymous_();
        }
    })};

    public /* synthetic */ SavedStateArrayValue(int i2, Bundle[] bundleArr, ca caVar) {
        if ((i2 & 1) != 1) {
            c.m(i2, 1, SavedStateArrayValue$$serializer.INSTANCE.getDescriptor());
        }
        this.value = bundleArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ b _childSerializers$_anonymous_() {
        int i2 = ar.f48106a;
        return new by(new m(Bundle.class), SavedStateSerializer.INSTANCE);
    }

    public static /* synthetic */ SavedStateArrayValue copy$default(SavedStateArrayValue savedStateArrayValue, Bundle[] bundleArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bundleArr = savedStateArrayValue.value;
        }
        return savedStateArrayValue.copy(bundleArr);
    }

    public final Bundle[] component1() {
        return this.value;
    }

    public final SavedStateArrayValue copy(Bundle[] bundleArr) {
        x.f(bundleArr, "value");
        return new SavedStateArrayValue(bundleArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedStateArrayValue) && x.n(this.value, ((SavedStateArrayValue) obj).value);
    }

    public final Bundle[] getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public String toString() {
        return "SavedStateArrayValue(value=" + Arrays.toString(this.value) + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<SavedStateArrayValue> serializer() {
            return SavedStateArrayValue$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public SavedStateArrayValue(Bundle[] bundleArr) {
        x.f(bundleArr, "value");
        this.value = bundleArr;
    }
}
