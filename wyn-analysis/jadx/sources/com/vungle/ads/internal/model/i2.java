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
public final class i2 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final i2 f33225a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33226b;

    static {
        i2 i2Var = new i2();
        f33225a = i2Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", i2Var, 6);
        c1244d0.j("is_country_data_protected", true);
        c1244d0.j("consent_title", true);
        c1244d0.j("consent_message", true);
        c1244d0.j("consent_message_version", true);
        c1244d0.j("button_accept", true);
        c1244d0.j("button_deny", true);
        f33226b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerU = AbstractC2641B.u(C1247f.f15596a);
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{kSerializerU, AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33226b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        Object objB6 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    objB6 = aVarB.B(c1244d0, 0, C1247f.f15596a, objB6);
                    i5 |= 1;
                    break;
                case 1:
                    objB5 = aVarB.B(c1244d0, 1, Wf.q0.f15625a, objB5);
                    i5 |= 2;
                    break;
                case 2:
                    objB4 = aVarB.B(c1244d0, 2, Wf.q0.f15625a, objB4);
                    i5 |= 4;
                    break;
                case 3:
                    objB3 = aVarB.B(c1244d0, 3, Wf.q0.f15625a, objB3);
                    i5 |= 8;
                    break;
                case 4:
                    objB2 = aVarB.B(c1244d0, 4, Wf.q0.f15625a, objB2);
                    i5 |= 16;
                    break;
                case 5:
                    objB = aVarB.B(c1244d0, 5, Wf.q0.f15625a, objB);
                    i5 |= 32;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new k2(i5, (Boolean) objB6, (String) objB5, (String) objB4, (String) objB3, (String) objB2, (String) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33226b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k2 value = (k2) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33226b;
        Vf.b bVarB = encoder.b(c1244d0);
        k2.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
