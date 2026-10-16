package Wf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Wf.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1247f implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1247f f15596a = new C1247f();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15597b = new h0("kotlin.Boolean", Uf.e.f12806p);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.t());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15597b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.r(((Boolean) obj).booleanValue());
    }
}
