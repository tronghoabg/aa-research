package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1909x implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1909x f28877a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28878b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.x$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return c0.f28780a;
        }
    }

    static {
        C1909x c1909x = new C1909x();
        f28877a = c1909x;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.BidResponse", c1909x, 1);
        c1244d0.j("seatbid", false);
        f28878b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1910y.f28879b[0]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28878b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = C1910y.f28879b;
        List list = null;
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
                list = (List) aVarB.D(c1244d0, 0, kSerializerArr[0], list);
                i5 = 1;
            }
        }
        aVarB.c(c1244d0);
        return new C1910y(i5, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28878b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1910y value = (C1910y) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28878b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.f(c1244d0, 0, C1910y.f28879b[0], value.f28880a);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
