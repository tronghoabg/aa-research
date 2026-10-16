package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.E;
import ff.AbstractC2641B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class t implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final t f33316a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33317b;

    static {
        t tVar = new t();
        f33316a = tVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.TemplateSettings", tVar, 2);
        c1244d0.j("normal_replacements", true);
        c1244d0.j("cacheable_replacements", true);
        f33317b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{AbstractC2641B.u(new E(q0Var, q0Var, 1)), AbstractC2641B.u(new E(q0Var, m.f33254a, 1))};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33317b;
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
                Wf.q0 q0Var = Wf.q0.f15625a;
                objB2 = aVarB.B(c1244d0, 0, new E(q0Var, q0Var, 1), objB2);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 1, new E(Wf.q0.f15625a, m.f33254a, 1), objB);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new v(i5, (Map) objB2, (Map) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33317b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v value = (v) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33317b;
        Vf.b bVarB = encoder.b(c1244d0);
        v.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
