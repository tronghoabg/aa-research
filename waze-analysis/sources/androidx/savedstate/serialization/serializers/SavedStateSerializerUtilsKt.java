package androidx.savedstate.serialization.serializers;

import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import kotlinx.b.b.e;
import kotlinx.b.b.f;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateSerializerUtilsKt {
    public static final String decoderErrorMessage(String str, e eVar) {
        x.f(str, "serialName");
        x.f(eVar, "decoder");
        Class<?> cls = eVar.getClass();
        int i2 = ar.f48106a;
        return "Cannot deserialize " + str + " with '" + new m(cls).c() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final String encoderErrorMessage(String str, f fVar) {
        x.f(str, "serialName");
        x.f(fVar, "encoder");
        Class<?> cls = fVar.getClass();
        int i2 = ar.f48106a;
        return "Cannot serialize " + str + " with '" + new m(cls).c() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }
}
