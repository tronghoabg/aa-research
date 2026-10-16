package Wf;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class E0 implements KSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final E0 f15540b = new E0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f15541a = new Y();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.f15541a.deserialize(decoder);
        return C2515C.f34653a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f15541a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2515C value = (C2515C) obj;
        AbstractC3340k.e(value, "value");
        this.f15541a.serialize(encoder, value);
    }
}
