package Wf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class W implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final W f15569a = new W();

    /* renamed from: b, reason: collision with root package name */
    public static final V f15570b = V.f15568a;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        throw new Sf.f("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15570b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Void value = (Void) obj;
        AbstractC3340k.e(value, "value");
        throw new Sf.f("'kotlin.Nothing' cannot be serialized");
    }
}
