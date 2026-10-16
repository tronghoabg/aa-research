package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.C1262u;
import Wf.J;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class a1 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f33087a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33088b;

    static {
        a1 a1Var = new a1();
        f33087a = a1Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", a1Var, 7);
        c1244d0.j("bidfloor", false);
        c1244d0.j("phase", false);
        c1244d0.j("is_vx_winner", false);
        c1244d0.j("parent_auction_id", false);
        c1244d0.j("creative_id", false);
        c1244d0.j("ad_unit_id", false);
        c1244d0.j("ext", true);
        f33088b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{C1262u.f15638a, J.f15549a, C1247f.f15596a, q0Var, q0Var, q0Var, AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33088b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        int i5 = 0;
        boolean zY = false;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        double dC = 0.0d;
        boolean z2 = true;
        int i10 = 0;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    dC = aVarB.C(c1244d0, 0);
                    i10 |= 1;
                    break;
                case 1:
                    i5 = aVarB.i(c1244d0, 1);
                    i10 |= 2;
                    break;
                case 2:
                    zY = aVarB.y(c1244d0, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strL = aVarB.l(c1244d0, 3);
                    i10 |= 8;
                    break;
                case 4:
                    strL2 = aVarB.l(c1244d0, 4);
                    i10 |= 16;
                    break;
                case 5:
                    strL3 = aVarB.l(c1244d0, 5);
                    i10 |= 32;
                    break;
                case 6:
                    objB = aVarB.B(c1244d0, 6, Wf.q0.f15625a, objB);
                    i10 |= 64;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new c1(i10, dC, i5, zY, strL, strL2, strL3, (String) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33088b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c1 value = (c1) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33088b;
        Vf.b bVarB = encoder.b(c1244d0);
        c1.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
