package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.k.n;
import java.io.Serializable;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class JavaSerializableSerializer<T extends Serializable> implements b<T> {
    private final q descriptor = n.y("java.io.Serializable", new q[0], new z(5));

    @Override // kotlinx.b.a
    public final T deserialize(e eVar) {
        x.f(eVar, "decoder");
        if (!(eVar instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(SavedStateSerializerUtilsKt.decoderErrorMessage(this.descriptor.d(), eVar));
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) eVar;
        Bundle savedState$savedstate = savedStateDecoder.getSavedState$savedstate();
        SavedStateReader.m13269constructorimpl(savedState$savedstate);
        String key$savedstate = savedStateDecoder.getKey$savedstate();
        int i2 = ar.f48106a;
        return (T) SavedStateReader.m13307getJavaSerializableimpl(savedState$savedstate, key$savedstate, new m(Serializable.class));
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public final q getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.b.l
    public final void serialize(f fVar, T t) {
        x.f(fVar, "encoder");
        x.f(t, "value");
        if (!(fVar instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(SavedStateSerializerUtilsKt.encoderErrorMessage(this.descriptor.d(), fVar));
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) fVar;
        Bundle savedState$savedstate = savedStateEncoder.getSavedState$savedstate();
        SavedStateWriter.m13355constructorimpl(savedState$savedstate);
        SavedStateWriter.m13375putJavaSerializableimpl(savedState$savedstate, savedStateEncoder.getKey$savedstate(), t);
    }
}
