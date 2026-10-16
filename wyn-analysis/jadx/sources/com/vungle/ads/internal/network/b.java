package com.vungle.ads.internal.network;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.E;
import Wf.J;
import Wf.q0;
import ff.AbstractC2641B;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class b implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final b f33388a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33389b;

    static {
        b bVar = new b();
        f33388a = bVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.network.FailedTpat", bVar, 6);
        c1244d0.j("method", true);
        c1244d0.j("headers", true);
        c1244d0.j("body", true);
        c1244d0.j("retryAttempt", true);
        c1244d0.j("retryCount", false);
        c1244d0.j("tpatKey", true);
        f33389b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(new E(q0Var, q0Var, 1));
        KSerializer kSerializerU2 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU3 = AbstractC2641B.u(q0Var);
        J j8 = J.f15549a;
        return new KSerializer[]{e.f33406a, kSerializerU, kSerializerU2, j8, j8, kSerializerU3};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33389b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        Object objB2 = null;
        Object objB3 = null;
        Object objD = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    objD = aVarB.D(c1244d0, 0, e.f33406a, objD);
                    i5 |= 1;
                    break;
                case 1:
                    q0 q0Var = q0.f15625a;
                    objB3 = aVarB.B(c1244d0, 1, new E(q0Var, q0Var, 1), objB3);
                    i5 |= 2;
                    break;
                case 2:
                    objB2 = aVarB.B(c1244d0, 2, q0.f15625a, objB2);
                    i5 |= 4;
                    break;
                case 3:
                    i10 = aVarB.i(c1244d0, 3);
                    i5 |= 8;
                    break;
                case 4:
                    i11 = aVarB.i(c1244d0, 4);
                    i5 |= 16;
                    break;
                case 5:
                    objB = aVarB.B(c1244d0, 5, q0.f15625a, objB);
                    i5 |= 32;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new d(i5, (g) objD, (Map) objB3, (String) objB2, i10, i11, (String) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33389b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d value = (d) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33389b;
        Vf.b bVarB = encoder.b(c1244d0);
        d.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
