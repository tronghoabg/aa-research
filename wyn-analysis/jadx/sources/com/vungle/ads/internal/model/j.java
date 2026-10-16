package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1241c;
import Wf.C1244d0;
import Wf.C1262u;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ff.AbstractC2641B;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class j implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final j f33230a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33231b;

    static {
        j jVar = new j();
        f33230a = jVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.CSBResponse", jVar, 3);
        c1244d0.j(InAppPurchaseMetaData.KEY_PRICE, true);
        c1244d0.j("nurls", true);
        c1244d0.j("lurls", true);
        f33231b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerU = AbstractC2641B.u(C1262u.f15638a);
        Wf.q0 q0Var = Wf.q0.f15625a;
        return new KSerializer[]{kSerializerU, AbstractC2641B.u(new C1241c(q0Var, 0)), AbstractC2641B.u(new C1241c(q0Var, 0))};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33231b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB = null;
        boolean z2 = true;
        int i5 = 0;
        Object objB2 = null;
        Object objB3 = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                objB3 = aVarB.B(c1244d0, 0, C1262u.f15638a, objB3);
                i5 |= 1;
            } else if (iM == 1) {
                objB2 = aVarB.B(c1244d0, 1, new C1241c(Wf.q0.f15625a, 0), objB2);
                i5 |= 2;
            } else {
                if (iM != 2) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 2, new C1241c(Wf.q0.f15625a, 0), objB);
                i5 |= 4;
            }
        }
        aVarB.c(c1244d0);
        return new l(i5, (Double) objB3, (List) objB2, (List) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33231b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l value = (l) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33231b;
        Vf.b bVarB = encoder.b(c1244d0);
        l.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
