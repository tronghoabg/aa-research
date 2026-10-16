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
public final /* synthetic */ class r implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final r f28858a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28859b;

    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return Q.f28743a;
        }
    }

    static {
        r rVar = new r();
        f28858a = rVar;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.BannerClickMetaData", rVar, 2);
        c1244d0.j("click_tracking", true);
        c1244d0.j("click_through", true);
        f28859b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        return new KSerializer[]{AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28859b;
        Vf.a aVarB = decoder.b(c1244d0);
        String str = null;
        boolean z2 = true;
        int i5 = 0;
        String str2 = null;
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
                str2 = (String) aVarB.B(c1244d0, 1, q0.f15625a, str2);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new C1904s(i5, str, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28859b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1904s value = (C1904s) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28859b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        String str = value.f28860a;
        if (zA || str != null) {
            bVarB.i(c1244d0, 0, q0.f15625a, str);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        String str2 = value.f28861b;
        if (zA2 || str2 != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str2);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
