package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.q0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1900n implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1900n f28847a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28848b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.n$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return I.f28718a;
        }
    }

    static {
        C1900n c1900n = new C1900n();
        f28847a = c1900n;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.AutoInline", c1900n, 4);
        c1244d0.j("on_skip", false);
        c1244d0.j("event_link", false);
        c1244d0.j("click_through", true);
        c1244d0.j("force_fullscreen", true);
        f28848b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        C1247f c1247f = C1247f.f15596a;
        q0 q0Var = q0.f15625a;
        return new KSerializer[]{c1247f, q0Var, AbstractC2641B.u(q0Var), AbstractC2641B.u(c1247f)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28848b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        boolean zY = false;
        String strL = null;
        String str = null;
        Boolean bool = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                zY = aVarB.y(c1244d0, 0);
                i5 |= 1;
            } else if (iM == 1) {
                strL = aVarB.l(c1244d0, 1);
                i5 |= 2;
            } else if (iM == 2) {
                str = (String) aVarB.B(c1244d0, 2, q0.f15625a, str);
                i5 |= 4;
            } else {
                if (iM != 3) {
                    throw new Sf.i(iM);
                }
                bool = (Boolean) aVarB.B(c1244d0, 3, C1247f.f15596a, bool);
                i5 |= 8;
            }
        }
        aVarB.c(c1244d0);
        return new C1901o(i5, zY, strL, str, bool);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28848b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1901o value = (C1901o) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28848b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.x(c1244d0, 0, value.f28849a);
        bVarB.y(c1244d0, 1, value.f28850b);
        boolean zA = bVarB.A(c1244d0, 2);
        String str = value.f28851c;
        if (zA || str != null) {
            bVarB.i(c1244d0, 2, q0.f15625a, str);
        }
        boolean zA2 = bVarB.A(c1244d0, 3);
        Boolean bool = value.f28852d;
        if (zA2 || !AbstractC3340k.a(bool, Boolean.FALSE)) {
            bVarB.i(c1244d0, 3, C1247f.f15596a, bool);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
