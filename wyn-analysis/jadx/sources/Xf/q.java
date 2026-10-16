package Xf;

import Wf.A0;
import Wf.h0;
import ef.C2539w;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class q implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final q f16287a = new q();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f16288b = Fe.g.d("kotlinx.serialization.json.JsonLiteral");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.b bVarG = Fe.c.i(decoder).g();
        if (bVarG instanceof p) {
            return (p) bVarG;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw Yf.r.c(-1, bVarG.toString(), AbstractC3256n.i(H.f39741a, bVarG.getClass(), sb2));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f16288b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p value = (p) obj;
        AbstractC3340k.e(value, "value");
        Fe.c.j(encoder);
        boolean z2 = value.f16284a;
        String str = value.f16286c;
        if (z2) {
            encoder.F(str);
            return;
        }
        SerialDescriptor serialDescriptor = value.f16285b;
        if (serialDescriptor != null) {
            encoder.m(serialDescriptor).F(str);
            return;
        }
        Long lM0 = Bf.r.m0(str);
        if (lM0 != null) {
            encoder.o(lM0.longValue());
            return;
        }
        C2539w c2539wA0 = xg.g.a0(str);
        if (c2539wA0 != null) {
            encoder.m(A0.f15525b).o(c2539wA0.f34688a);
            return;
        }
        Double dY = Bf.q.Y(str);
        if (dY != null) {
            encoder.e(dY.doubleValue());
            return;
        }
        Boolean boolU0 = Bf.k.U0(str);
        if (boolU0 != null) {
            encoder.r(boolU0.booleanValue());
        } else {
            encoder.F(str);
        }
    }
}
