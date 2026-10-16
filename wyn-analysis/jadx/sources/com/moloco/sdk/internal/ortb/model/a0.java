package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f28770a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28771b;

    static {
        a0 a0Var = new a0();
        f28770a = a0Var;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.MolocoSDKClickMetaData", a0Var, 1);
        c1244d0.j("banner", true);
        f28771b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(r.f28858a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28771b;
        Vf.a aVarB = decoder.b(c1244d0);
        C1904s c1904s = null;
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
                c1904s = (C1904s) aVarB.B(c1244d0, 0, r.f28858a, c1904s);
                i5 = 1;
            }
        }
        aVarB.c(c1244d0);
        return new b0(i5, c1904s);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28771b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b0 value = (b0) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28771b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        C1904s c1904s = value.f28777a;
        if (zA || c1904s != null) {
            bVarB.i(c1244d0, 0, r.f28858a, c1904s);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
