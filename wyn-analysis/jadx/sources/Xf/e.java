package Xf;

import Wf.C1239b;
import Wf.C1241c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class e implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final e f16258a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final d f16259b = d.f16255b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Fe.c.i(decoder);
        return new kotlinx.serialization.json.a((List) new C1241c(k.f16281a, 0).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f16259b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.a value = (kotlinx.serialization.json.a) obj;
        AbstractC3340k.e(value, "value");
        Fe.c.j(encoder);
        k kVar = k.f16281a;
        SerialDescriptor elementDesc = kVar.getDescriptor();
        AbstractC3340k.e(elementDesc, "elementDesc");
        C1239b c1239b = new C1239b(elementDesc, 1);
        int size = value.size();
        Vf.b bVarK = encoder.k(c1239b, size);
        Iterator<kotlinx.serialization.json.b> it = value.iterator();
        for (int i5 = 0; i5 < size; i5++) {
            bVarK.f(c1239b, i5, kVar, it.next());
        }
        bVarK.c(c1239b);
    }
}
