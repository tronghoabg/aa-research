package Wf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class O implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final O f15556a = new O();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15557b = new h0("kotlin.Long", Uf.e.f12812v);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(decoder.k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15557b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.o(((Number) obj).longValue());
    }
}
