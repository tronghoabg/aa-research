package Xf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes5.dex */
public final class s implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final s f16289a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final Uf.g f16290b = Fe.g.t("kotlinx.serialization.json.JsonNull", Uf.i.f12830q, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Fe.c.i(decoder);
        if (decoder.A()) {
            throw new Yf.o("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f16290b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonNull value = (JsonNull) obj;
        AbstractC3340k.e(value, "value");
        Fe.c.j(encoder);
        encoder.p();
    }
}
