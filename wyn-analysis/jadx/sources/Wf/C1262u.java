package Wf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Wf.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1262u implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1262u f15638a = new C1262u();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15639b = new h0("kotlin.Double", Uf.e.f12809s);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.s());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15639b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.e(((Number) obj).doubleValue());
    }
}
