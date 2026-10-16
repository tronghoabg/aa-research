package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class f2 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final f2 f33164a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33165b;

    static {
        f2 f2Var = new f2();
        f33164a = f2Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.ConfigPayload.Endpoints", f2Var, 5);
        c1244d0.j("ads", true);
        c1244d0.j("ri", true);
        c1244d0.j("error_logs", true);
        c1244d0.j("metrics", true);
        c1244d0.j("csb", true);
        f33165b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33165b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                objB5 = aVarB.B(c1244d0, 0, Wf.q0.f15625a, objB5);
                i5 |= 1;
            } else if (iM == 1) {
                objB4 = aVarB.B(c1244d0, 1, Wf.q0.f15625a, objB4);
                i5 |= 2;
            } else if (iM == 2) {
                objB3 = aVarB.B(c1244d0, 2, Wf.q0.f15625a, objB3);
                i5 |= 4;
            } else if (iM == 3) {
                objB2 = aVarB.B(c1244d0, 3, Wf.q0.f15625a, objB2);
                i5 |= 8;
            } else {
                if (iM != 4) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 4, Wf.q0.f15625a, objB);
                i5 |= 16;
            }
        }
        aVarB.c(c1244d0);
        return new h2(i5, (String) objB5, (String) objB4, (String) objB3, (String) objB2, (String) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33165b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h2 value = (h2) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33165b;
        Vf.b bVarB = encoder.b(c1244d0);
        h2.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
