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
public final /* synthetic */ class G implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final G f28713a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28714b;

    static {
        G g9 = new G();
        f28713a = g9;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.DECAppIconSerializable", g9, 3);
        c1244d0.j("size", true);
        c1244d0.j("app_icon_url", true);
        c1244d0.j("border", true);
        f28714b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(Wf.J.f15549a), AbstractC2641B.u(q0.f15625a), AbstractC2641B.u(K.f28722a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28714b;
        Vf.a aVarB = decoder.b(c1244d0);
        Integer num = null;
        boolean z2 = true;
        int i5 = 0;
        String str = null;
        L l10 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                num = (Integer) aVarB.B(c1244d0, 0, Wf.J.f15549a, num);
                i5 |= 1;
            } else if (iM == 1) {
                str = (String) aVarB.B(c1244d0, 1, q0.f15625a, str);
                i5 |= 2;
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                l10 = (L) aVarB.B(c1244d0, 2, K.f28722a, l10);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new H(i5, num, str, l10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28714b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        H value = (H) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28714b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        Integer num = value.f28715a;
        if (zA || num != null) {
            bVarB.i(c1244d0, 0, Wf.J.f15549a, num);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        String str = value.f28716b;
        if (zA2 || str != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        L l10 = value.f28717c;
        if (zA3 || l10 != null) {
            bVarB.i(c1244d0, 2, K.f28722a, l10);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
