package Wf;

import ef.C2535s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class u0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f15640a = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final F f15641b = AbstractC1240b0.a("kotlin.UByte", C1251i.f15605a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new C2535s(decoder.o(f15641b).E());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15641b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.m(f15641b).g(((C2535s) obj).f34684a);
    }
}
