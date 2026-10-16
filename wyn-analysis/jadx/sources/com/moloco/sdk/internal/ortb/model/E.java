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
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class E implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final E f28702a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28703b;

    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1895i.f28832a;
        }
    }

    static {
        E e7 = new E();
        f28702a = e7;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.DEC", e7, 9);
        c1244d0.j("imp_link", true);
        c1244d0.j("click_through", true);
        c1244d0.j("click_tracking", true);
        c1244d0.j("skip_event", true);
        c1244d0.j("close", true);
        c1244d0.j("cta", true);
        c1244d0.j("app_icon", true);
        c1244d0.j("rating", true);
        c1244d0.j("app_name", true);
        f28703b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        return new KSerializer[]{AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(Q.f28743a), AbstractC2641B.u(M.f28727a), AbstractC2641B.u(G.f28713a), AbstractC2641B.u(O.f28736a), AbstractC2641B.u(I.f28718a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28703b;
        Vf.a aVarB = decoder.b(c1244d0);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        S s10 = null;
        N n10 = null;
        H h10 = null;
        P p10 = null;
        J j8 = null;
        int i5 = 0;
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
                    str2 = (String) aVarB.B(c1244d0, 1, q0.f15625a, str2);
                    i5 |= 2;
                    break;
                case 2:
                    str3 = (String) aVarB.B(c1244d0, 2, q0.f15625a, str3);
                    i5 |= 4;
                    break;
                case 3:
                    str4 = (String) aVarB.B(c1244d0, 3, q0.f15625a, str4);
                    i5 |= 8;
                    break;
                case 4:
                    s10 = (S) aVarB.B(c1244d0, 4, Q.f28743a, s10);
                    i5 |= 16;
                    break;
                case 5:
                    n10 = (N) aVarB.B(c1244d0, 5, M.f28727a, n10);
                    i5 |= 32;
                    break;
                case 6:
                    h10 = (H) aVarB.B(c1244d0, 6, G.f28713a, h10);
                    i5 |= 64;
                    break;
                case 7:
                    p10 = (P) aVarB.B(c1244d0, 7, O.f28736a, p10);
                    i5 |= 128;
                    break;
                case 8:
                    j8 = (J) aVarB.B(c1244d0, 8, I.f28718a, j8);
                    i5 |= 256;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new F(i5, str, str2, str3, str4, s10, n10, h10, p10, j8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28703b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        F value = (F) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28703b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        String str = value.f28704a;
        if (zA || str != null) {
            bVarB.i(c1244d0, 0, q0.f15625a, str);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        String str2 = value.f28705b;
        if (zA2 || str2 != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str2);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        String str3 = value.f28706c;
        if (zA3 || str3 != null) {
            bVarB.i(c1244d0, 2, q0.f15625a, str3);
        }
        boolean zA4 = bVarB.A(c1244d0, 3);
        String str4 = value.f28707d;
        if (zA4 || str4 != null) {
            bVarB.i(c1244d0, 3, q0.f15625a, str4);
        }
        boolean zA5 = bVarB.A(c1244d0, 4);
        S s10 = value.f28708e;
        if (zA5 || s10 != null) {
            bVarB.i(c1244d0, 4, Q.f28743a, s10);
        }
        boolean zA6 = bVarB.A(c1244d0, 5);
        N n10 = value.f28709f;
        if (zA6 || n10 != null) {
            bVarB.i(c1244d0, 5, M.f28727a, n10);
        }
        boolean zA7 = bVarB.A(c1244d0, 6);
        H h10 = value.f28710g;
        if (zA7 || h10 != null) {
            bVarB.i(c1244d0, 6, G.f28713a, h10);
        }
        boolean zA8 = bVarB.A(c1244d0, 7);
        P p10 = value.f28711h;
        if (zA8 || p10 != null) {
            bVarB.i(c1244d0, 7, O.f28736a, p10);
        }
        boolean zA9 = bVarB.A(c1244d0, 8);
        J j8 = value.f28712i;
        if (zA9 || j8 != null) {
            bVarB.i(c1244d0, 8, I.f28718a, j8);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
