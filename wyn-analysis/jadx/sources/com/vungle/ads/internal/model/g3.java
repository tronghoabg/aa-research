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
public final class g3 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final g3 f33175a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33176b;

    static {
        g3 g3Var = new g3();
        f33175a = g3Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.Placement", g3Var, 3);
        c1244d0.j("placement_ref_id", false);
        c1244d0.j("is_hb", true);
        c1244d0.j("type", true);
        f33176b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{q0Var, C1247f.f15596a, AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33176b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        boolean zY = false;
        String strL = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                strL = aVarB.l(c1244d0, 0);
                i5 |= 1;
            } else if (iM == 1) {
                zY = aVarB.y(c1244d0, 1);
                i5 |= 2;
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 2, Wf.q0.f15625a, objB);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new i3(i5, strL, zY, (String) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33176b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i3 value = (i3) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33176b;
        Vf.b bVarB = encoder.b(c1244d0);
        i3.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
