package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import com.moloco.sdk.internal.ortb.model.C1901o;
import ff.AbstractC2641B;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class K implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final K f28722a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28723b;

    static {
        K k = new K();
        f28722a = k;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.DECBorderSerializable", k, 2);
        c1244d0.j("border_width", true);
        c1244d0.j("gradient", true);
        f28723b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC2641B.u(Wf.J.f15549a), AbstractC2641B.u(L.f28724c[1])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28723b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = L.f28724c;
        Integer num = null;
        boolean z2 = true;
        int i5 = 0;
        List list = null;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            if (iM == -1) {
                z2 = false;
            } else if (iM == 0) {
                num = (Integer) aVarB.B(c1244d0, 0, Wf.J.f15549a, num);
                i5 |= 1;
            } else {
                if (iM != 1) {
                    throw new Sf.i(iM);
                }
                list = (List) aVarB.B(c1244d0, 1, kSerializerArr[1], list);
                i5 |= 2;
            }
        }
        aVarB.c(c1244d0);
        return new L(i5, num, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28723b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        L value = (L) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28723b;
        Vf.b bVarB = encoder.b(c1244d0);
        C1901o.b bVar = L.Companion;
        boolean zA = bVarB.A(c1244d0, 0);
        Integer num = value.f28725a;
        if (zA || num != null) {
            bVarB.i(c1244d0, 0, Wf.J.f15549a, num);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        List list = value.f28726b;
        if (zA2 || list != null) {
            bVarB.i(c1244d0, 1, L.f28724c[1], list);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
