package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class u0 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f33325a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33326b;

    static {
        u0 u0Var = new u0();
        f33325a = u0Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.CommonRequestBody.CCPA", u0Var, 1);
        c1244d0.j("status", false);
        f33326b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{Wf.q0.f15625a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33326b;
        Vf.a aVarB = decoder.b(c1244d0);
        String strL = null;
        boolean z2 = true;
        int i5 = 0;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else {
                if (iM != 0) {
                    throw new Sf.i(iM);
                }
                strL = aVarB.l(c1244d0, 0);
                i5 = 1;
            }
        }
        aVarB.c(c1244d0);
        return new w0(i5, strL);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33326b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w0 value = (w0) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33326b;
        Vf.b bVarB = encoder.b(c1244d0);
        w0.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
