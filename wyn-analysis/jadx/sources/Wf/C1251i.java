package Wf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Wf.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1251i implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1251i f15605a = new C1251i();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15606b = new h0("kotlin.Byte", Uf.e.f12807q);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.E());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15606b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.g(((Number) obj).byteValue());
    }
}
