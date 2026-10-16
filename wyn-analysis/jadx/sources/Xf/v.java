package Xf;

import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes5.dex */
public final class v implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final v f16296a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final Uf.g f16297b = Fe.g.t("kotlinx.serialization.json.JsonPrimitive", Uf.e.f12814x, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.b bVarG = Fe.c.i(decoder).g();
        if (bVarG instanceof kotlinx.serialization.json.d) {
            return (kotlinx.serialization.json.d) bVarG;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw Yf.r.c(-1, bVarG.toString(), AbstractC3256n.i(H.f39741a, bVarG.getClass(), sb2));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f16297b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.d value = (kotlinx.serialization.json.d) obj;
        AbstractC3340k.e(value, "value");
        Fe.c.j(encoder);
        if (value instanceof JsonNull) {
            encoder.n(s.f16289a, JsonNull.INSTANCE);
        } else {
            encoder.n(q.f16287a, (p) value);
        }
    }
}
