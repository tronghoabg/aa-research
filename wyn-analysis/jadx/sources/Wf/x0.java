package Wf;

import ef.C2537u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class x0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final x0 f15655a = new x0();

    /* renamed from: b, reason: collision with root package name */
    public static final F f15656b = AbstractC1240b0.a("kotlin.UInt", J.f15549a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new C2537u(decoder.o(f15656b).h());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15656b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.m(f15656b).C(((C2537u) obj).f34686a);
    }
}
