package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.J;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes5.dex */
public final class r0 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f33300a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33301b;

    static {
        r0 r0Var = new r0();
        f33300a = r0Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", r0Var, 2);
        c1244d0.j(OfficeOpenXMLExtended.WORD_PROCESSING_PREFIX, false);
        c1244d0.j("h", false);
        f33301b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        J j8 = J.f15549a;
        return new KSerializer[]{j8, j8};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33301b;
        Vf.a aVarB = decoder.b(c1244d0);
        boolean z2 = true;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                i10 = aVarB.i(c1244d0, 0);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                i11 = aVarB.i(c1244d0, 1);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new t0(i5, i10, i11);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33301b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t0 value = (t0) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33301b;
        Vf.b bVarB = encoder.b(c1244d0);
        t0.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
