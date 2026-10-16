package Wf;

import ef.C2539w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class A0 implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final A0 f15524a = new A0();

    /* renamed from: b, reason: collision with root package name */
    public static final F f15525b = AbstractC1240b0.a("kotlin.ULong", O.f15556a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new C2539w(decoder.o(f15525b).k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15525b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.m(f15525b).o(((C2539w) obj).f34688a);
    }
}
