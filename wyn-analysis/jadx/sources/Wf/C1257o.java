package Wf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Wf.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1257o implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C1257o f15620a = new C1257o();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f15621b = new h0("kotlin.Char", Uf.e.f12808r);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.u());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f15621b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.w(((Character) obj).charValue());
    }
}
