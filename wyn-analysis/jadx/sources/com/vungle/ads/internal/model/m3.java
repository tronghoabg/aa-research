package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class m3 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final m3 f33261a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33262b;

    static {
        m3 m3Var = new m3();
        f33261a = m3Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.RtbToken", m3Var, 5);
        c1244d0.j("device", false);
        c1244d0.j("user", true);
        c1244d0.j("ext", true);
        c1244d0.j("request", true);
        c1244d0.j("ordinal_view", false);
        f33262b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.f33354a, AbstractC2641B.u(q1.f33298a), AbstractC2641B.u(k1.f33237a), AbstractC2641B.u(j3.f33235a), J.f15549a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33262b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        int i10 = 0;
        Object objB2 = null;
        Object objB3 = null;
        Object objD = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                objD = aVarB.D(c1244d0, 0, w2.f33354a, objD);
                i5 |= 1;
            } else if (iM == 1) {
                objB3 = aVarB.B(c1244d0, 1, q1.f33298a, objB3);
                i5 |= 2;
            } else if (iM == 2) {
                objB2 = aVarB.B(c1244d0, 2, k1.f33237a, objB2);
                i5 |= 4;
            } else if (iM == 3) {
                objB = aVarB.B(c1244d0, 3, j3.f33235a, objB);
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
        return new o3(i5, (b3) objD, (s1) objB3, (m1) objB2, (l3) objB, i10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33262b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o3 value = (o3) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33262b;
        Vf.b bVarB = encoder.b(c1244d0);
        o3.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
