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
public final /* synthetic */ class O implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final O f28736a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28737b;

    static {
        O o7 = new O();
        f28736a = o7;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.DECRatingSerializable", o7, 5);
        c1244d0.j("rating_value", true);
        c1244d0.j("foreground_color", true);
        c1244d0.j("background_color", true);
        c1244d0.j("rating_size", true);
        c1244d0.j("font_size", true);
        f28737b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerU = AbstractC2641B.u(Wf.B.f15526a);
        q0 q0Var = q0.f15625a;
        KSerializer kSerializerU2 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU3 = AbstractC2641B.u(q0Var);
        Wf.J j8 = Wf.J.f15549a;
        return new KSerializer[]{kSerializerU, kSerializerU2, kSerializerU3, AbstractC2641B.u(j8), AbstractC2641B.u(j8)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28737b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        Float f10 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                f10 = (Float) aVarB.B(c1244d0, 0, Wf.B.f15526a, f10);
                i5 |= 1;
            } else if (iM == 1) {
                str = (String) aVarB.B(c1244d0, 1, q0.f15625a, str);
                i5 |= 2;
            } else if (iM == 2) {
                str2 = (String) aVarB.B(c1244d0, 2, q0.f15625a, str2);
                i5 |= 4;
            } else if (iM == 3) {
                num = (Integer) aVarB.B(c1244d0, 3, Wf.J.f15549a, num);
                i5 |= 8;
            } else {
                if (iM != 4) {
                    throw new Sf.i(iM);
                }
                num2 = (Integer) aVarB.B(c1244d0, 4, Wf.J.f15549a, num2);
                i5 |= 16;
            }
        }
        aVarB.c(c1244d0);
        return new P(i5, f10, str, str2, num, num2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28737b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        P value = (P) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28737b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        Float f10 = value.f28738a;
        if (zA || f10 != null) {
            bVarB.i(c1244d0, 0, Wf.B.f15526a, f10);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        String str = value.f28739b;
        if (zA2 || str != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        String str2 = value.f28740c;
        if (zA3 || str2 != null) {
            bVarB.i(c1244d0, 2, q0.f15625a, str2);
        }
        boolean zA4 = bVarB.A(c1244d0, 3);
        Integer num = value.f28741d;
        if (zA4 || num != null) {
            bVarB.i(c1244d0, 3, Wf.J.f15549a, num);
        }
        boolean zA5 = bVarB.A(c1244d0, 4);
        Integer num2 = value.f28742e;
        if (zA5 || num2 != null) {
            bVarB.i(c1244d0, 4, Wf.J.f15549a, num2);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
