package com.vungle.ads.internal.signals;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import Wf.O;
import Wf.q0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class k implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final k f33667a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33668b;

    static {
        k kVar = new k();
        f33667a = kVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.signals.SignaledAd", kVar, 5);
        c1244d0.j("500", true);
        c1244d0.j("109", false);
        c1244d0.j("107", true);
        c1244d0.j("110", true);
        c1244d0.j("108", true);
        f33668b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU2 = AbstractC2641B.u(q0Var);
        O o7 = O.f15556a;
        return new KSerializer[]{kSerializerU, o7, kSerializerU2, o7, J.f15549a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33668b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        int i5 = 0;
        int i10 = 0;
        long jF = 0;
        long jF2 = 0;
        boolean z2 = true;
        Object objB2 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                objB2 = aVarB.B(c1244d0, 0, q0.f15625a, objB2);
                i5 |= 1;
            } else if (iM == 1) {
                jF = aVarB.f(c1244d0, 1);
                i5 |= 2;
            } else if (iM == 2) {
                objB = aVarB.B(c1244d0, 2, q0.f15625a, objB);
                i5 |= 4;
            } else if (iM == 3) {
                jF2 = aVarB.f(c1244d0, 3);
                i5 |= 8;
            } else {
                if (iM != 4) {
                    throw new Sf.i(iM);
                }
                i10 = aVarB.i(c1244d0, 4);
                i5 |= 16;
            }
        }
        aVarB.c(c1244d0);
        return new m(i5, (String) objB2, jF, (String) objB, jF2, i10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33668b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m value = (m) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33668b;
        Vf.b bVarB = encoder.b(c1244d0);
        m.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
