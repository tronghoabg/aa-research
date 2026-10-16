package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f28780a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28781b;

    static {
        c0 c0Var = new c0();
        f28780a = c0Var;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.MolocoSDKConfigs", c0Var, 2);
        c1244d0.j("server_rendering_enabled", true);
        c1244d0.j("experimental", true);
        f28781b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(C1247f.f15596a), AbstractC2641B.u(T.f28746a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28781b;
        Vf.a aVarB = decoder.b(c1244d0);
        Boolean bool = null;
        boolean z2 = true;
        int i5 = 0;
        U u10 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                bool = (Boolean) aVarB.B(c1244d0, 0, C1247f.f15596a, bool);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                u10 = (U) aVarB.B(c1244d0, 1, T.f28746a, u10);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new d0(i5, bool, u10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28781b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d0 value = (d0) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28781b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        Boolean bool = value.f28792a;
        if (zA || bool != null) {
            bVarB.i(c1244d0, 0, C1247f.f15596a, bool);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        U u10 = value.f28793b;
        if (zA2 || u10 != null) {
            bVarB.i(c1244d0, 1, T.f28746a, u10);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
