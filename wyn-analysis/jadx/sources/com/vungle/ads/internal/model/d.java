package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes5.dex */
public final class d implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final d f33151a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33152b;

    static {
        d dVar = new d();
        f33151a = dVar;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", dVar, 2);
        c1244d0.j(OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, true);
        c1244d0.j("h", true);
        f33152b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        J j8 = J.f15549a;
        return new KSerializer[]{AbstractC2641B.u(j8), AbstractC2641B.u(j8)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33152b;
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
                objB2 = aVarB.B(c1244d0, 0, J.f15549a, objB2);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 1, J.f15549a, objB);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new f(i5, (Integer) objB2, (Integer) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33152b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f value = (f) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33152b;
        Vf.b bVarB = encoder.b(c1244d0);
        f.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
