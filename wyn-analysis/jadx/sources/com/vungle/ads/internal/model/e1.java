package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.O;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class e1 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f33157a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33158b;

    static {
        e1 e1Var = new e1();
        f33157a = e1Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.CommonRequestBody.GDPR", e1Var, 4);
        c1244d0.j("consent_status", false);
        c1244d0.j("consent_source", false);
        c1244d0.j("consent_timestamp", false);
        c1244d0.j("consent_message_version", false);
        f33158b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{q0Var, q0Var, O.f15556a, q0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33158b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        long jF = 0;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                strL = aVarB.l(c1244d0, 0);
                i5 |= 1;
            } else if (iM == 1) {
                strL2 = aVarB.l(c1244d0, 1);
                i5 |= 2;
            } else if (iM == 2) {
                jF = aVarB.f(c1244d0, 2);
                i5 |= 4;
            } else {
                if (iM != 3) {
                    throw new Sf.i(iM);
                }
                strL3 = aVarB.l(c1244d0, 3);
                i5 |= 8;
            }
        }
        aVarB.c(c1244d0);
        return new g1(i5, strL, strL2, jF, strL3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33158b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g1 value = (g1) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33158b;
        Vf.b bVarB = encoder.b(c1244d0);
        g1.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
