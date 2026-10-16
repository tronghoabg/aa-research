package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import com.applovin.shadow.okio.Segment;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes5.dex */
public final class w2 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final w2 f33354a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33355b;

    static {
        w2 w2Var = new w2();
        f33354a = w2Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.DeviceNode", w2Var, 11);
        c1244d0.j("make", false);
        c1244d0.j("model", false);
        c1244d0.j("osv", false);
        c1244d0.j("carrier", true);
        c1244d0.j("os", false);
        c1244d0.j(OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, false);
        c1244d0.j("h", false);
        c1244d0.j("ua", true);
        c1244d0.j("ifa", true);
        c1244d0.j("lmt", true);
        c1244d0.j("ext", true);
        f33355b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(q0Var);
        J j8 = J.f15549a;
        return new KSerializer[]{q0Var, q0Var, q0Var, kSerializerU, q0Var, j8, j8, AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(j8), AbstractC2641B.u(y2.f33364a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33355b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        String strL4 = null;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    strL = aVarB.l(c1244d0, 0);
                    i5 |= 1;
                    break;
                case 1:
                    strL2 = aVarB.l(c1244d0, 1);
                    i5 |= 2;
                    break;
                case 2:
                    strL3 = aVarB.l(c1244d0, 2);
                    i5 |= 4;
                    break;
                case 3:
                    objB5 = aVarB.B(c1244d0, 3, Wf.q0.f15625a, objB5);
                    i5 |= 8;
                    break;
                case 4:
                    strL4 = aVarB.l(c1244d0, 4);
                    i5 |= 16;
                    break;
                case 5:
                    i10 = aVarB.i(c1244d0, 5);
                    i5 |= 32;
                    break;
                case 6:
                    i11 = aVarB.i(c1244d0, 6);
                    i5 |= 64;
                    break;
                case 7:
                    objB4 = aVarB.B(c1244d0, 7, Wf.q0.f15625a, objB4);
                    i5 |= 128;
                    break;
                case 8:
                    objB3 = aVarB.B(c1244d0, 8, Wf.q0.f15625a, objB3);
                    i5 |= 256;
                    break;
                case 9:
                    objB2 = aVarB.B(c1244d0, 9, J.f15549a, objB2);
                    i5 |= 512;
                    break;
                case 10:
                    objB = aVarB.B(c1244d0, 10, y2.f33364a, objB);
                    i5 |= Segment.SHARE_MINIMUM;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new b3(i5, strL, strL2, strL3, (String) objB5, strL4, i10, i11, (String) objB4, (String) objB3, (Integer) objB2, (a3) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33355b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b3 value = (b3) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33355b;
        Vf.b bVarB = encoder.b(c1244d0);
        b3.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
