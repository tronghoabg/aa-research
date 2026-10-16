package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.q0;
import e0.C2465q;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class Y implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f28759a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28760b;

    static {
        Y y10 = new Y();
        f28759a = y10;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.InlineTextButton", y10, 7);
        c1244d0.j("text", true);
        c1244d0.j("use_icon", true);
        c1244d0.j("text_position", true);
        c1244d0.j("foreground_color", true);
        c1244d0.j("background_color", true);
        c1244d0.j("font_size", true);
        c1244d0.j("icon_size", true);
        f28760b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU2 = AbstractC2641B.u(C1247f.f15596a);
        KSerializer kSerializerU3 = AbstractC2641B.u(q0Var);
        B b5 = B.f28689a;
        KSerializer kSerializerU4 = AbstractC2641B.u(b5);
        KSerializer kSerializerU5 = AbstractC2641B.u(b5);
        Wf.J j8 = Wf.J.f15549a;
        return new KSerializer[]{kSerializerU, kSerializerU2, kSerializerU3, kSerializerU4, kSerializerU5, AbstractC2641B.u(j8), AbstractC2641B.u(j8)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28760b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        C2465q c2465q = null;
        C2465q c2465q2 = null;
        Integer num = null;
        Integer num2 = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    str = (String) aVarB.B(c1244d0, 0, q0.f15625a, str);
                    i5 |= 1;
                    break;
                case 1:
                    bool = (Boolean) aVarB.B(c1244d0, 1, C1247f.f15596a, bool);
                    i5 |= 2;
                    break;
                case 2:
                    str2 = (String) aVarB.B(c1244d0, 2, q0.f15625a, str2);
                    i5 |= 4;
                    break;
                case 3:
                    c2465q = (C2465q) aVarB.B(c1244d0, 3, B.f28689a, c2465q);
                    i5 |= 8;
                    break;
                case 4:
                    c2465q2 = (C2465q) aVarB.B(c1244d0, 4, B.f28689a, c2465q2);
                    i5 |= 16;
                    break;
                case 5:
                    num = (Integer) aVarB.B(c1244d0, 5, Wf.J.f15549a, num);
                    i5 |= 32;
                    break;
                case 6:
                    num2 = (Integer) aVarB.B(c1244d0, 6, Wf.J.f15549a, num2);
                    i5 |= 64;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new Z(i5, str, bool, str2, c2465q, c2465q2, num, num2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28760b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Z value = (Z) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28760b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        String str = value.f28761a;
        if (zA || str != null) {
            bVarB.i(c1244d0, 0, q0.f15625a, str);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        Boolean bool = value.f28762b;
        if (zA2 || bool != null) {
            bVarB.i(c1244d0, 1, C1247f.f15596a, bool);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        String str2 = value.f28763c;
        if (zA3 || str2 != null) {
            bVarB.i(c1244d0, 2, q0.f15625a, str2);
        }
        boolean zA4 = bVarB.A(c1244d0, 3);
        C2465q c2465q = value.f28764d;
        if (zA4 || c2465q != null) {
            bVarB.i(c1244d0, 3, B.f28689a, c2465q);
        }
        boolean zA5 = bVarB.A(c1244d0, 4);
        C2465q c2465q2 = value.f28765e;
        if (zA5 || c2465q2 != null) {
            bVarB.i(c1244d0, 4, B.f28689a, c2465q2);
        }
        boolean zA6 = bVarB.A(c1244d0, 5);
        Integer num = value.f28766f;
        if (zA6 || num != null) {
            bVarB.i(c1244d0, 5, Wf.J.f15549a, num);
        }
        boolean zA7 = bVarB.A(c1244d0, 6);
        Integer num2 = value.f28767g;
        if (zA7 || num2 != null) {
            bVarB.i(c1244d0, 6, Wf.J.f15549a, num2);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
