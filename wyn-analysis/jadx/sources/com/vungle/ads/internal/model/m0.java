package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1241c;
import Wf.C1244d0;
import Wf.J;
import ff.AbstractC2641B;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class m0 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f33256a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33257b;

    static {
        m0 m0Var = new m0();
        f33256a = m0Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.BidPayload", m0Var, 4);
        c1244d0.j("version", true);
        c1244d0.j("adunit", true);
        c1244d0.j("impression", true);
        c1244d0.j("ad", true);
        f33257b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerU = AbstractC2641B.u(J.f15549a);
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{kSerializerU, AbstractC2641B.u(q0Var), AbstractC2641B.u(new C1241c(q0Var, 0)), AbstractC2641B.u(c.f33135a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33257b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                objB4 = aVarB.B(c1244d0, 0, J.f15549a, objB4);
                i5 |= 1;
            } else if (iM == 1) {
                objB3 = aVarB.B(c1244d0, 1, Wf.q0.f15625a, objB3);
                i5 |= 2;
            } else if (iM == 2) {
                objB2 = aVarB.B(c1244d0, 2, new C1241c(Wf.q0.f15625a, 0), objB2);
                i5 |= 4;
            } else {
                if (iM != 3) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 3, c.f33135a, objB);
                i5 |= 8;
            }
        }
        aVarB.c(c1244d0);
        return new p0(i5, (Integer) objB4, (String) objB3, (List) objB2, (h0) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33257b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p0 value = (p0) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33257b;
        Vf.b bVarB = encoder.b(c1244d0);
        p0.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
