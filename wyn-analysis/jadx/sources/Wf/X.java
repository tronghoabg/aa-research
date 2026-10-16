package Wf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class X implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f15571a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f15572b;

    public X(KSerializer serializer) {
        AbstractC3340k.e(serializer, "serializer");
        this.f15571a = serializer;
        this.f15572b = new k0(serializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.A()) {
            return decoder.z(this.f15571a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && X.class == obj.getClass() && AbstractC3340k.a(this.f15571a, ((X) obj).f15571a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f15572b;
    }

    public final int hashCode() {
        return this.f15571a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.n(this.f15571a, obj);
        } else {
            encoder.p();
        }
    }
}
