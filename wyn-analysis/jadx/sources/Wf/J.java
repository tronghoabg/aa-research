package Wf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class J implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final J f15549a = new J();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15550b = new h0("kotlin.Int", Uf.e.f12811u);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.h());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15550b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.C(((Number) obj).intValue());
    }
}
