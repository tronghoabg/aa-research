package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.q0;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1905t implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1905t f28862a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28863b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.t$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return V.f28749a;
        }
    }

    static {
        C1905t c1905t = new C1905t();
        f28862a = c1905t;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.Bid", c1905t, 6);
        c1244d0.j("adm", false);
        c1244d0.j(InAppPurchaseMetaData.KEY_PRICE, false);
        c1244d0.j("burl", true);
        c1244d0.j("ext", false);
        c1244d0.j("crid", true);
        c1244d0.j("bundle", true);
        f28863b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        return new KSerializer[]{q0Var, Wf.B.f15526a, AbstractC2641B.u(q0Var), C1907v.f28870a, AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28863b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        String strL = null;
        String str = null;
        C1908w c1908w = null;
        String str2 = null;
        String str3 = null;
        float fR = 0.0f;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    strL = aVarB.l(c1244d0, 0);
                    i5 |= 1;
                    break;
                case 1:
                    fR = aVarB.r(c1244d0, 1);
                    i5 |= 2;
                    break;
                case 2:
                    str = (String) aVarB.B(c1244d0, 2, q0.f15625a, str);
                    i5 |= 4;
                    break;
                case 3:
                    c1908w = (C1908w) aVarB.D(c1244d0, 3, C1907v.f28870a, c1908w);
                    i5 |= 8;
                    break;
                case 4:
                    str2 = (String) aVarB.B(c1244d0, 4, q0.f15625a, str2);
                    i5 |= 16;
                    break;
                case 5:
                    str3 = (String) aVarB.B(c1244d0, 5, q0.f15625a, str3);
                    i5 |= 32;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new C1906u(i5, strL, fR, str, c1908w, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28863b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1906u value = (C1906u) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28863b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.y(c1244d0, 0, value.f28864a);
        bVarB.s(c1244d0, 1, value.f28865b);
        boolean zA = bVarB.A(c1244d0, 2);
        String str = value.f28866c;
        if (zA || str != null) {
            bVarB.i(c1244d0, 2, q0.f15625a, str);
        }
        bVarB.f(c1244d0, 3, C1907v.f28870a, value.f28867d);
        boolean zA2 = bVarB.A(c1244d0, 4);
        String str2 = value.f28868e;
        if (zA2 || str2 != null) {
            bVarB.i(c1244d0, 4, q0.f15625a, str2);
        }
        boolean zA3 = bVarB.A(c1244d0, 5);
        String str3 = value.f28869f;
        if (zA3 || str3 != null) {
            bVarB.i(c1244d0, 5, q0.f15625a, str3);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
