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

/* renamed from: com.moloco.sdk.internal.ortb.model.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1907v implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1907v f28870a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28871b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.v$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return Y.f28759a;
        }
    }

    static {
        C1907v c1907v = new C1907v();
        f28870a = c1907v;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.BidExt", c1907v, 5);
        c1244d0.j("player", true);
        c1244d0.j("mtid", true);
        c1244d0.j("moloco_sdk_configs", true);
        c1244d0.j("moloco_sdk_events", true);
        c1244d0.j("moloco_sdk_click_metadata", true);
        f28871b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(g0.f28810a), AbstractC2641B.u(q0.f15625a), AbstractC2641B.u(c0.f28780a), AbstractC2641B.u(C1889c.f28778a), AbstractC2641B.u(a0.f28770a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28871b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        h0 h0Var = null;
        String str = null;
        d0 d0Var = null;
        C1890d c1890d = null;
        b0 b0Var = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                h0Var = (h0) aVarB.B(c1244d0, 0, g0.f28810a, h0Var);
                i5 |= 1;
            } else if (iM == 1) {
                str = (String) aVarB.B(c1244d0, 1, q0.f15625a, str);
                i5 |= 2;
            } else if (iM == 2) {
                d0Var = (d0) aVarB.B(c1244d0, 2, c0.f28780a, d0Var);
                i5 |= 4;
            } else if (iM == 3) {
                c1890d = (C1890d) aVarB.B(c1244d0, 3, C1889c.f28778a, c1890d);
                i5 |= 8;
            } else {
                if (iM != 4) {
                    throw new Sf.i(iM);
                }
                b0Var = (b0) aVarB.B(c1244d0, 4, a0.f28770a, b0Var);
                i5 |= 16;
            }
        }
        aVarB.c(c1244d0);
        return new C1908w(i5, h0Var, str, d0Var, c1890d, b0Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28871b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1908w value = (C1908w) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28871b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        h0 h0Var = value.f28872a;
        if (zA || h0Var != null) {
            bVarB.i(c1244d0, 0, g0.f28810a, h0Var);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        String str = value.f28873b;
        if (zA2 || str != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        d0 d0Var = value.f28874c;
        if (zA3 || d0Var != null) {
            bVarB.i(c1244d0, 2, c0.f28780a, d0Var);
        }
        boolean zA4 = bVarB.A(c1244d0, 3);
        C1890d c1890d = value.f28875d;
        if (zA4 || c1890d != null) {
            bVarB.i(c1244d0, 3, C1889c.f28778a, c1890d);
        }
        boolean zA5 = bVarB.A(c1244d0, 4);
        b0 b0Var = value.f28876e;
        if (zA5 || b0Var != null) {
            bVarB.i(c1244d0, 4, a0.f28770a, b0Var);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
