package Wf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class q0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f15625a = new q0();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15626b = new h0("kotlin.String", Uf.e.f12814x);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return decoder.w();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15626b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String value = (String) obj;
        AbstractC3340k.e(value, "value");
        encoder.F(value);
    }
}
