package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.q0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class I implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final I f28718a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28719b;

    static {
        I i5 = new I();
        f28718a = i5;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.DECAppNameSerializable", i5, 2);
        c1244d0.j("text", true);
        c1244d0.j("font_size", true);
        f28719b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(q0.f15625a), AbstractC2641B.u(Wf.J.f15549a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28719b;
        Vf.a aVarB = decoder.b(c1244d0);
        String str = null;
        boolean z2 = true;
        int i5 = 0;
        Integer num = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                str = (String) aVarB.B(c1244d0, 0, q0.f15625a, str);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                num = (Integer) aVarB.B(c1244d0, 1, Wf.J.f15549a, num);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new J(str, i5, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28719b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        J value = (J) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28719b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        String str = value.f28720a;
        if (zA || str != null) {
            bVarB.i(c1244d0, 0, q0.f15625a, str);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        Integer num = value.f28721b;
        if (zA2 || num != null) {
            bVarB.i(c1244d0, 1, Wf.J.f15549a, num);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
