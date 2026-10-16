package Wf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class p0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f15623a = new p0();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15624b = new h0("kotlin.Short", Uf.e.f12813w);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.p());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15624b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.q(((Number) obj).shortValue());
    }
}
