package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class j0 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final j0 f33232a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33233b;

    static {
        j0 j0Var = new j0();
        f33232a = j0Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AppNode", j0Var, 3);
        c1244d0.j("bundle", false);
        c1244d0.j("ver", false);
        c1244d0.j("id", false);
        f33233b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{q0Var, q0Var, q0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33233b;
        Vf.a aVarB = decoder.b(c1244d0);
        String strL = null;
        boolean z2 = true;
        int i5 = 0;
        String strL2 = null;
        String strL3 = null;
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
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                strL3 = aVarB.l(c1244d0, 2);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new l0(i5, strL, strL2, strL3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33233b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0 value = (l0) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33233b;
        Vf.b bVarB = encoder.b(c1244d0);
        l0.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
