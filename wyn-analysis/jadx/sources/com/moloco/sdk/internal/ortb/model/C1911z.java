package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.q0;
import Wf.x0;
import e0.C2465q;
import ef.C2537u;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1911z implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1911z f28881a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28882b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.z$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return g0.f28810a;
        }
    }

    static {
        C1911z c1911z = new C1911z();
        f28881a = c1911z;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.CTA", c1911z, 7);
        c1244d0.j("text", false);
        c1244d0.j("image_url", true);
        c1244d0.j("padding", false);
        c1244d0.j("horizontal_alignment", false);
        c1244d0.j("vertical_alignment", false);
        c1244d0.j("foreground_color", false);
        c1244d0.j("background_color", true);
        f28882b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = A.f28681h;
        q0 q0Var = q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(q0Var);
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[4];
        B b5 = B.f28689a;
        return new KSerializer[]{q0Var, kSerializerU, x0.f15655a, kSerializer, kSerializer2, b5, AbstractC2641B.u(b5)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28882b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = A.f28681h;
        int i5 = 0;
        String strL = null;
        String str = null;
        C2537u c2537u = null;
        X x5 = null;
        EnumC1897k enumC1897k = null;
        C2465q c2465q = null;
        C2465q c2465q2 = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    strL = aVarB.l(c1244d0, 0);
                    i5 |= 1;
                    break;
                case 1:
                    str = (String) aVarB.B(c1244d0, 1, q0.f15625a, str);
                    i5 |= 2;
                    break;
                case 2:
                    c2537u = (C2537u) aVarB.D(c1244d0, 2, x0.f15655a, c2537u);
                    i5 |= 4;
                    break;
                case 3:
                    x5 = (X) aVarB.D(c1244d0, 3, kSerializerArr[3], x5);
                    i5 |= 8;
                    break;
                case 4:
                    enumC1897k = (EnumC1897k) aVarB.D(c1244d0, 4, kSerializerArr[4], enumC1897k);
                    i5 |= 16;
                    break;
                case 5:
                    c2465q = (C2465q) aVarB.D(c1244d0, 5, B.f28689a, c2465q);
                    i5 |= 32;
                    break;
                case 6:
                    c2465q2 = (C2465q) aVarB.B(c1244d0, 6, B.f28689a, c2465q2);
                    i5 |= 64;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new A(i5, strL, str, c2537u, x5, enumC1897k, c2465q, c2465q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28882b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        A value = (A) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28882b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.y(c1244d0, 0, value.f28682a);
        boolean zA = bVarB.A(c1244d0, 1);
        String str = value.f28683b;
        if (zA || str != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str);
        }
        bVarB.f(c1244d0, 2, x0.f15655a, new C2537u(value.f28684c));
        KSerializer[] kSerializerArr = A.f28681h;
        bVarB.f(c1244d0, 3, kSerializerArr[3], value.f28685d);
        bVarB.f(c1244d0, 4, kSerializerArr[4], value.f28686e);
        B b5 = B.f28689a;
        bVarB.f(c1244d0, 5, b5, new C2465q(value.f28687f));
        boolean zA2 = bVarB.A(c1244d0, 6);
        C2465q c2465q = value.f28688g;
        if (zA2 || c2465q != null) {
            bVarB.i(c1244d0, 6, b5, c2465q);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
