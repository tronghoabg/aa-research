package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.q0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class V implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final V f28749a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28750b;

    static {
        V v2 = new V();
        f28749a = v2;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.GradientColor", v2, 1);
        c1244d0.j("color", false);
        f28750b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q0.f15625a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28750b;
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
        return new W(i5, strL);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28750b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        W value = (W) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28750b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.y(c1244d0, 0, value.f28751a);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
