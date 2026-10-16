package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.serialization.SavedStateDecoder;
import androidx.savedstate.serialization.SavedStateEncoder;
import h.g.b.x;
import h.k.n;
import java.util.List;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.e;
import kotlinx.b.b.f;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CharSequenceListSerializer implements b<List<? extends CharSequence>> {
    public static final CharSequenceListSerializer INSTANCE = new CharSequenceListSerializer();
    private static final q descriptor = n.y("kotlin.collections.List<kotlin.CharSequence>", new q[0], new z(5));

    private CharSequenceListSerializer() {
    }

    @Override // kotlinx.b.a
    public List<CharSequence> deserialize(e eVar) {
        x.f(eVar, "decoder");
        if (!(eVar instanceof SavedStateDecoder)) {
            throw new IllegalArgumentException(SavedStateSerializerUtilsKt.decoderErrorMessage(INSTANCE.getDescriptor().d(), eVar));
        }
        SavedStateDecoder savedStateDecoder = (SavedStateDecoder) eVar;
        Bundle savedState$savedstate = savedStateDecoder.getSavedState$savedstate();
        SavedStateReader.m13269constructorimpl(savedState$savedstate);
        return SavedStateReader.m13289getCharSequenceListimpl(savedState$savedstate, savedStateDecoder.getKey$savedstate());
    }

    @Override // kotlinx.b.b, kotlinx.b.l, kotlinx.b.a
    public q getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.b.l
    public void serialize(f fVar, List<? extends CharSequence> list) {
        x.f(fVar, "encoder");
        x.f(list, "value");
        if (!(fVar instanceof SavedStateEncoder)) {
            throw new IllegalArgumentException(SavedStateSerializerUtilsKt.encoderErrorMessage(INSTANCE.getDescriptor().d(), fVar));
        }
        SavedStateEncoder savedStateEncoder = (SavedStateEncoder) fVar;
        Bundle savedState$savedstate = savedStateEncoder.getSavedState$savedstate();
        SavedStateWriter.m13355constructorimpl(savedState$savedstate);
        SavedStateWriter.m13367putCharSequenceListimpl(savedState$savedstate, savedStateEncoder.getKey$savedstate(), list);
    }
}
