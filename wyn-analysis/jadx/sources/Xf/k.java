package Xf;

import E5.Q;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class k implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final k f16281a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final Uf.g f16282b = Fe.g.s("kotlinx.serialization.json.JsonElement", Uf.c.f12805q, new SerialDescriptor[0], new Ad.g(26));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Fe.c.i(decoder).g();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f16282b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.b value = (kotlinx.serialization.json.b) obj;
        AbstractC3340k.e(value, "value");
        Fe.c.j(encoder);
        if (value instanceof kotlinx.serialization.json.d) {
            encoder.n(v.f16296a, value);
        } else if (value instanceof kotlinx.serialization.json.c) {
            encoder.n(u.f16294a, value);
        } else {
            if (!(value instanceof kotlinx.serialization.json.a)) {
                throw new Q((byte) 0, 9);
            }
            encoder.n(e.f16258a, value);
        }
    }
}
