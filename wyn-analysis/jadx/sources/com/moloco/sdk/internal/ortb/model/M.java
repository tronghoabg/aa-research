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
public final /* synthetic */ class M implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final M f28727a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28728b;

    static {
        M m10 = new M();
        f28727a = m10;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.DECCtaSerializable", m10, 7);
        c1244d0.j("vertical_spacing", true);
        c1244d0.j("text", true);
        c1244d0.j("button_width", true);
        c1244d0.j("font_size", true);
        c1244d0.j("border", true);
        c1244d0.j("foreground_color", true);
        c1244d0.j("background_color", true);
        f28728b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.J j8 = Wf.J.f15549a;
        KSerializer kSerializerU = AbstractC2641B.u(j8);
        q0 q0Var = q0.f15625a;
        return new KSerializer[]{kSerializerU, AbstractC2641B.u(q0Var), AbstractC2641B.u(j8), AbstractC2641B.u(j8), AbstractC2641B.u(K.f28722a), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28728b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        L l10 = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    num = (Integer) aVarB.B(c1244d0, 0, Wf.J.f15549a, num);
                    i5 |= 1;
                    break;
                case 1:
                    str = (String) aVarB.B(c1244d0, 1, q0.f15625a, str);
                    i5 |= 2;
                    break;
                case 2:
                    num2 = (Integer) aVarB.B(c1244d0, 2, Wf.J.f15549a, num2);
                    i5 |= 4;
                    break;
                case 3:
                    num3 = (Integer) aVarB.B(c1244d0, 3, Wf.J.f15549a, num3);
                    i5 |= 8;
                    break;
                case 4:
                    l10 = (L) aVarB.B(c1244d0, 4, K.f28722a, l10);
                    i5 |= 16;
                    break;
                case 5:
                    str2 = (String) aVarB.B(c1244d0, 5, q0.f15625a, str2);
                    i5 |= 32;
                    break;
                case 6:
                    str3 = (String) aVarB.B(c1244d0, 6, q0.f15625a, str3);
                    i5 |= 64;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new N(i5, num, str, num2, num3, l10, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28728b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        N value = (N) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28728b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        Integer num = value.f28729a;
        if (zA || num != null) {
            bVarB.i(c1244d0, 0, Wf.J.f15549a, num);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        String str = value.f28730b;
        if (zA2 || str != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        Integer num2 = value.f28731c;
        if (zA3 || num2 != null) {
            bVarB.i(c1244d0, 2, Wf.J.f15549a, num2);
        }
        boolean zA4 = bVarB.A(c1244d0, 3);
        Integer num3 = value.f28732d;
        if (zA4 || num3 != null) {
            bVarB.i(c1244d0, 3, Wf.J.f15549a, num3);
        }
        boolean zA5 = bVarB.A(c1244d0, 4);
        L l10 = value.f28733e;
        if (zA5 || l10 != null) {
            bVarB.i(c1244d0, 4, K.f28722a, l10);
        }
        boolean zA6 = bVarB.A(c1244d0, 5);
        String str2 = value.f28734f;
        if (zA6 || str2 != null) {
            bVarB.i(c1244d0, 5, q0.f15625a, str2);
        }
        boolean zA7 = bVarB.A(c1244d0, 6);
        String str3 = value.f28735g;
        if (zA7 || str3 != null) {
            bVarB.i(c1244d0, 6, q0.f15625a, str3);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
