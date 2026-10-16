package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1241c;
import Wf.C1244d0;
import Wf.O;
import ff.AbstractC2641B;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class n1 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f33264a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33265b;

    static {
        n1 n1Var = new n1();
        f33264a = n1Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", n1Var, 7);
        c1244d0.j("placements", true);
        c1244d0.j("ad_size", true);
        c1244d0.j("ad_start_time", true);
        c1244d0.j("app_id", true);
        c1244d0.j("placement_reference_id", true);
        c1244d0.j("user", true);
        c1244d0.j("csb", true);
        f33265b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{AbstractC2641B.u(new C1241c(q0Var, 0)), AbstractC2641B.u(r0.f33300a), AbstractC2641B.u(O.f15556a), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(a1.f33087a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33265b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        Object objB6 = null;
        Object objB7 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    objB7 = aVarB.B(c1244d0, 0, new C1241c(Wf.q0.f15625a, 0), objB7);
                    i5 |= 1;
                    break;
                case 1:
                    objB6 = aVarB.B(c1244d0, 1, r0.f33300a, objB6);
                    i5 |= 2;
                    break;
                case 2:
                    objB5 = aVarB.B(c1244d0, 2, O.f15556a, objB5);
                    i5 |= 4;
                    break;
                case 3:
                    objB4 = aVarB.B(c1244d0, 3, Wf.q0.f15625a, objB4);
                    i5 |= 8;
                    break;
                case 4:
                    objB3 = aVarB.B(c1244d0, 4, Wf.q0.f15625a, objB3);
                    i5 |= 16;
                    break;
                case 5:
                    objB2 = aVarB.B(c1244d0, 5, Wf.q0.f15625a, objB2);
                    i5 |= 32;
                    break;
                case 6:
                    objB = aVarB.B(c1244d0, 6, a1.f33087a, objB);
                    i5 |= 64;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new p1(i5, (List) objB7, (t0) objB6, (Long) objB5, (String) objB4, (String) objB3, (String) objB2, (c1) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33265b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p1 value = (p1) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33265b;
        Vf.b bVarB = encoder.b(c1244d0);
        p1.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
