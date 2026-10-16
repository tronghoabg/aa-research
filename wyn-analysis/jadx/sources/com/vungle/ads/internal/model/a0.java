package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.C1247f;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class a0 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f33085a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33086b;

    static {
        a0 a0Var = new a0();
        f33085a = a0Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", a0Var, 2);
        c1244d0.j("is_enabled", true);
        c1244d0.j("extra_vast", true);
        f33086b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(C1247f.f15596a), AbstractC2641B.u(Wf.q0.f15625a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33086b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                objB2 = aVarB.B(c1244d0, 0, C1247f.f15596a, objB2);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 1, Wf.q0.f15625a, objB);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new c0(i5, (Boolean) objB2, (String) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33086b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c0 value = (c0) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33086b;
        Vf.b bVarB = encoder.b(c1244d0);
        c0.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
