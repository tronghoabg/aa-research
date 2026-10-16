package Wf;

import ef.C2515C;
import ef.EnumC2526j;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class Y implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15573a = Fe.c.y(EnumC2526j.f34668b, new Af.q(this, 3));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        Vf.a aVarB = decoder.b(descriptor);
        int iM = aVarB.m(getDescriptor());
        if (iM != -1) {
            throw new Sf.f(AbstractC3256n.g(iM, "Unexpected index "));
        }
        aVarB.c(descriptor);
        return C2515C.f34653a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ef.i, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f15573a.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        AbstractC3340k.e(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }
}
