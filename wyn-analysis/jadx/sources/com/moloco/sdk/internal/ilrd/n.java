package com.moloco.sdk.internal.ilrd;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.J;
import Wf.O;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final n f28601a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28602b;

    static {
        n nVar = new n();
        f28601a = nVar;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", nVar, 6);
        c1244d0.j("lastEventReceivedTs", false);
        c1244d0.j("banner", false);
        c1244d0.j("mrec", false);
        c1244d0.j("native", false);
        c1244d0.j("interstitial", false);
        c1244d0.j("rewarded", false);
        f28602b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        J j8 = J.f15549a;
        return new KSerializer[]{O.f15556a, j8, j8, j8, j8, j8};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28602b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        long jF = 0;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    jF = aVarB.f(c1244d0, 0);
                    i5 |= 1;
                    break;
                case 1:
                    i10 = aVarB.i(c1244d0, 1);
                    i5 |= 2;
                    break;
                case 2:
                    i11 = aVarB.i(c1244d0, 2);
                    i5 |= 4;
                    break;
                case 3:
                    i12 = aVarB.i(c1244d0, 3);
                    i5 |= 8;
                    break;
                case 4:
                    i13 = aVarB.i(c1244d0, 4);
                    i5 |= 16;
                    break;
                case 5:
                    i14 = aVarB.i(c1244d0, 5);
                    i5 |= 32;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new o(i5, i10, i11, i12, i13, jF, i14);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28602b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o value = (o) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28602b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.E(c1244d0, 0, value.f28603a);
        bVarB.t(1, value.f28604b, c1244d0);
        bVarB.t(2, value.f28605c, c1244d0);
        bVarB.t(3, value.f28606d, c1244d0);
        bVarB.t(4, value.f28607e, c1244d0);
        bVarB.t(5, value.f28608f, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
