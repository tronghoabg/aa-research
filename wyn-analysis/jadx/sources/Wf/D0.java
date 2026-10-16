package Wf;

import ef.C2542z;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class D0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f15534a = new D0();

    /* renamed from: b, reason: collision with root package name */
    public static final F f15535b = AbstractC1240b0.a("kotlin.UShort", p0.f15623a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new C2542z(decoder.o(f15535b).p());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15535b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.m(f15535b).q(((C2542z) obj).f34691a);
    }
}
