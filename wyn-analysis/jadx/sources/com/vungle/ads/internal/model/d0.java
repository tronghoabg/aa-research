package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1244d0;
import Wf.C1247f;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class d0 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f33153a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33154b;

    static {
        d0 d0Var = new d0();
        f33153a = d0Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.AdPayload.WebViewSettings", d0Var, 2);
        c1244d0.j("allow_file_access_from_file_urls", true);
        c1244d0.j("allow_universal_access_from_file_urls", true);
        f33154b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        C1247f c1247f = C1247f.f15596a;
        return new KSerializer[]{AbstractC2641B.u(c1247f), AbstractC2641B.u(c1247f)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33154b;
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
                objB2 = aVarB.B(c1244d0, 0, C1247f.f15596a, objB2);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                objB = aVarB.B(c1244d0, 1, C1247f.f15596a, objB);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new f0(i5, (Boolean) objB2, (Boolean) objB);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33154b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0 value = (f0) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33154b;
        Vf.b bVarB = encoder.b(c1244d0);
        f0.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
