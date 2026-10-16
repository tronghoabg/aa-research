package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class m implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final m f33254a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33255b;

    static {
        m mVar = new m();
        f33254a = mVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", mVar, 3);
        c1244d0.j("url", true);
        c1244d0.j("extension", true);
        c1244d0.j("download_percent", true);
        f33255b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(J.f15549a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33255b;
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
                objB2 = aVarB.B(c1244d0, 1, Wf.q0.f15625a, objB2);
                i5 |= 2;
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 2, J.f15549a, objB);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new o(i5, (String) objB3, (String) objB2, (Integer) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33255b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o value = (o) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33255b;
        Vf.b bVarB = encoder.b(c1244d0);
        o.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
