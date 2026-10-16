package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class p3 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final p3 f33292a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33293b;

    static {
        p3 p3Var = new p3();
        f33292a = p3Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.UnclosedAd", p3Var, 2);
        c1244d0.j("107", false);
        c1244d0.j(StatisticData.ERROR_CODE_IO_ERROR, true);
        f33293b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{q0Var, q0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33293b;
        Vf.a aVarB = decoder.b(c1244d0);
        String strL = null;
        boolean z2 = true;
        int i5 = 0;
        String strL2 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                strL = aVarB.l(c1244d0, 0);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                strL2 = aVarB.l(c1244d0, 1);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new r3(i5, strL, strL2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33293b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r3 value = (r3) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33293b;
        Vf.b bVarB = encoder.b(c1244d0);
        r3.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
