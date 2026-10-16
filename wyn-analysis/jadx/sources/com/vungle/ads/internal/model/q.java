package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class q implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final q f33294a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33295b;

    static {
        q qVar = new q();
        f33294a = qVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", qVar, 3);
        c1244d0.j("placement_reference_id", true);
        c1244d0.j("ad_markup", true);
        c1244d0.j("csb", true);
        f33295b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(Wf.q0.f15625a), AbstractC2641B.u(g.f33169a), AbstractC2641B.u(j.f33230a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33295b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        Object objB3 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                objB3 = aVarB.B(c1244d0, 0, Wf.q0.f15625a, objB3);
                i5 |= 1;
            } else if (iM == 1) {
                objB2 = aVarB.B(c1244d0, 1, g.f33169a, objB2);
                i5 |= 2;
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 2, j.f33230a, objB);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new s(i5, (String) objB3, (i) objB2, (l) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33295b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s value = (s) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33295b;
        Vf.b bVarB = encoder.b(c1244d0);
        s.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
