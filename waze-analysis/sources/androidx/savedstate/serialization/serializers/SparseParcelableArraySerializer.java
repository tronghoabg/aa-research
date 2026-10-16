package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.k.n;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SparseParcelableArraySerializer implements b<SparseArray<Parcelable>> {
    public static final SparseParcelableArraySerializer INSTANCE = new SparseParcelableArraySerializer();
    private static final q descriptor = n.y("android.util.SparseArray<android.os.Parcelable>", new q[0], new z(5));

    private SparseParcelableArraySerializer() {
    }

    @Override // kotlinx.b.a
    public SparseArray<Parcelable> deserialize(e eVar) {
        x.f(eVar, "decoder");
        if (!(eVar instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(SavedStateSerializerUtilsKt.decoderErrorMessage(INSTANCE.getDescriptor().d(), eVar));
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) eVar;
        Bundle savedState$savedstate = savedStateDecoder.getSavedState$savedstate();
        SavedStateReader.m13269constructorimpl(savedState$savedstate);
        String key$savedstate = savedStateDecoder.getKey$savedstate();
        int i2 = ar.f48106a;
        return SavedStateReader.m13337getSparseParcelableArrayimpl(savedState$savedstate, key$savedstate, new m(Parcelable.class));
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, SparseArray<Parcelable> sparseArray) {
        x.f(fVar, "encoder");
        x.f(sparseArray, "value");
        if (!(fVar instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(SavedStateSerializerUtilsKt.encoderErrorMessage(INSTANCE.getDescriptor().d(), fVar));
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) fVar;
        Bundle savedState$savedstate = savedStateEncoder.getSavedState$savedstate();
        SavedStateWriter.m13355constructorimpl(savedState$savedstate);
        SavedStateWriter.m13387putSparseParcelableArrayimpl(savedState$savedstate, savedStateEncoder.getKey$savedstate(), sparseArray);
    }
}
