package Xf;

import E5.Q;
import Wf.E;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class w implements KSerializer {

    @NotNull
    private final KSerializer tSerializer;

    public w(E e7) {
        this.tSerializer = e7;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(@NotNull Decoder decoder) {
        Decoder tVar;
        AbstractC3340k.e(decoder, "decoder");
        i iVarI = Fe.c.i(decoder);
        kotlinx.serialization.json.b bVarG = iVarI.g();
        c cVarD = iVarI.d();
        KSerializer deserializer = this.tSerializer;
        kotlinx.serialization.json.b element = transformDeserialize(bVarG);
        cVarD.getClass();
        AbstractC3340k.e(deserializer, "deserializer");
        AbstractC3340k.e(element, "element");
        if (element instanceof kotlinx.serialization.json.c) {
            tVar = new Yf.v(cVarD, (kotlinx.serialization.json.c) element, (String) null, 12);
        } else if (element instanceof kotlinx.serialization.json.a) {
            tVar = new Yf.w(cVarD, (kotlinx.serialization.json.a) element);
        } else {
            if (!(element instanceof p) && !element.equals(JsonNull.INSTANCE)) {
                throw new Q((byte) 0, 9);
            }
            tVar = new Yf.t(cVarD, (kotlinx.serialization.json.d) element, null);
        }
        return tVar.z(deserializer);
    }

    @Override // kotlinx.serialization.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, Object obj) {
        AbstractC3340k.e(encoder, "encoder");
        m mVarJ = Fe.c.j(encoder);
        c json = mVarJ.d();
        KSerializer serializer = this.tSerializer;
        AbstractC3340k.e(json, "json");
        AbstractC3340k.e(serializer, "serializer");
        G g9 = new G();
        new Yf.u(json, new Af.r(g9, 14), 1).n(serializer, obj);
        Object obj2 = g9.f39740a;
        if (obj2 != null) {
            mVarJ.B(transformSerialize((kotlinx.serialization.json.b) obj2));
        } else {
            AbstractC3340k.m("result");
            throw null;
        }
    }

    public abstract kotlinx.serialization.json.b transformDeserialize(kotlinx.serialization.json.b bVar);

    @NotNull
    public kotlinx.serialization.json.b transformSerialize(@NotNull kotlinx.serialization.json.b element) {
        AbstractC3340k.e(element, "element");
        return element;
    }
}
