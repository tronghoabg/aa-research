package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import Wf.O;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class y1 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final y1 f33362a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33363b;

    static {
        y1 y1Var = new y1();
        f33362a = y1Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.ConfigPayload.CleverCache", y1Var, 2);
        c1244d0.j("disk_size", true);
        c1244d0.j("disk_percentage", true);
        f33363b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(O.f15556a), AbstractC2641B.u(J.f15549a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33363b;
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
                objB2 = aVarB.B(c1244d0, 0, O.f15556a, objB2);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 1, J.f15549a, objB);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new a2(i5, (Long) objB2, (Integer) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33363b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a2 value = (a2) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33363b;
        Vf.b bVarB = encoder.b(c1244d0);
        a2.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
