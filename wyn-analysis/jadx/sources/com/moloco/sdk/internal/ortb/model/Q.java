package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.x0;
import ef.C2537u;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class Q implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f28743a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28744b;

    static {
        Q q4 = new Q();
        f28743a = q4;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.DECSkipClose", q4, 1);
        c1244d0.j("delay_seconds", true);
        f28744b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(x0.f15655a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28744b;
        Vf.a aVarB = decoder.b(c1244d0);
        C2537u c2537u = null;
        boolean z2 = true;
        int i5 = 0;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else {
                if (iM != 0) {
                    throw new Sf.i(iM);
                }
                c2537u = (C2537u) aVarB.B(c1244d0, 0, x0.f15655a, c2537u);
                i5 = 1;
            }
        }
        aVarB.c(c1244d0);
        return new S(i5, c2537u);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28744b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        S value = (S) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28744b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        C2537u c2537u = value.f28745a;
        if (zA || c2537u != null) {
            bVarB.i(c1244d0, 0, x0.f15655a, c2537u);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
