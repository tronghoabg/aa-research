package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class q1 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f33298a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33299b;

    static {
        q1 q1Var = new q1();
        f33298a = q1Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.CommonRequestBody.User", q1Var, 5);
        c1244d0.j("gdpr", true);
        c1244d0.j("ccpa", true);
        c1244d0.j("coppa", true);
        c1244d0.j("fpd", true);
        c1244d0.j("iab", true);
        f33299b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(e1.f33157a), AbstractC2641B.u(u0.f33325a), AbstractC2641B.u(x0.f33358a), AbstractC2641B.u(FirstPartyData$$serializer.INSTANCE), AbstractC2641B.u(h1.f33187a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33299b;
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
                objB5 = aVarB.B(c1244d0, 0, e1.f33157a, objB5);
                i5 |= 1;
            } else if (iM == 1) {
                objB4 = aVarB.B(c1244d0, 1, u0.f33325a, objB4);
                i5 |= 2;
            } else if (iM == 2) {
                objB3 = aVarB.B(c1244d0, 2, x0.f33358a, objB3);
                i5 |= 4;
            } else if (iM == 3) {
                objB2 = aVarB.B(c1244d0, 3, FirstPartyData$$serializer.INSTANCE, objB2);
                i5 |= 8;
            } else {
                if (iM != 4) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 4, h1.f33187a, objB);
                i5 |= 16;
            }
        }
        aVarB.c(c1244d0);
        return new s1(i5, (g1) objB5, (w0) objB4, (z0) objB3, (FirstPartyData) objB2, (j1) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33299b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s1 value = (s1) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33299b;
        Vf.b bVarB = encoder.b(c1244d0);
        s1.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
