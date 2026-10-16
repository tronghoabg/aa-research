package com.moloco.sdk.internal.ilrd;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.O;
import Wf.q0;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final p f28609a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28610b;

    static {
        p pVar = new p();
        f28609a = pVar;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", pVar, 4);
        c1244d0.j(JsonStorageKeyNames.SESSION_ID_KEY, false);
        c1244d0.j("impressionCounts", false);
        c1244d0.j("isExpired", false);
        c1244d0.j("sessionStartTs", false);
        f28610b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{q0.f15625a, n.f28601a, C1247f.f15596a, O.f15556a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28610b;
        Vf.a aVarB = decoder.b(c1244d0);
        int i5 = 0;
        boolean zY = false;
        String strL = null;
        o oVar = null;
        long jF = 0;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                strL = aVarB.l(c1244d0, 0);
                i5 |= 1;
            } else if (iM == 1) {
                oVar = (o) aVarB.D(c1244d0, 1, n.f28601a, oVar);
                i5 |= 2;
            } else if (iM == 2) {
                zY = aVarB.y(c1244d0, 2);
                i5 |= 4;
            } else {
                if (iM != 3) {
                    throw new Sf.i(iM);
                }
                jF = aVarB.f(c1244d0, 3);
                i5 |= 8;
            }
        }
        aVarB.c(c1244d0);
        return new q(i5, strL, oVar, zY, jF);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28610b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q value = (q) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28610b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.y(c1244d0, 0, value.f28632a);
        bVarB.f(c1244d0, 1, n.f28601a, value.f28633b);
        bVarB.x(c1244d0, 2, value.f28634c);
        bVarB.E(c1244d0, 3, value.f28635d);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
