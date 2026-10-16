package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.x0;
import com.moloco.sdk.internal.ortb.model.D;
import e0.C2465q;
import ef.C2537u;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1893g implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1893g f28808a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28809b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.g$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1909x.f28877a;
        }
    }

    static {
        C1893g c1893g = new C1893g();
        f28808a = c1893g;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.SkipClose", c1893g, 7);
        c1244d0.j("delay_seconds", false);
        c1244d0.j("padding", false);
        c1244d0.j("control_size", false);
        c1244d0.j("horizontal_alignment", false);
        c1244d0.j("vertical_alignment", false);
        c1244d0.j("foreground_color", false);
        c1244d0.j("background_color", true);
        f28809b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1894h.f28812h;
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[4];
        B b5 = B.f28689a;
        KSerializer kSerializerU = AbstractC2641B.u(b5);
        x0 x0Var = x0.f15655a;
        return new KSerializer[]{x0Var, x0Var, x0Var, kSerializer, kSerializer2, b5, kSerializerU};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28809b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = C1894h.f28812h;
        int i5 = 0;
        C2537u c2537u = null;
        C2537u c2537u2 = null;
        C2537u c2537u3 = null;
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
                    c2537u = (C2537u) aVarB.D(c1244d0, 0, x0.f15655a, c2537u);
                    i5 |= 1;
                    break;
                case 1:
                    c2537u2 = (C2537u) aVarB.D(c1244d0, 1, x0.f15655a, c2537u2);
                    i5 |= 2;
                    break;
                case 2:
                    c2537u3 = (C2537u) aVarB.D(c1244d0, 2, x0.f15655a, c2537u3);
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
        return new C1894h(i5, c2537u, c2537u2, c2537u3, x5, enumC1897k, c2465q, c2465q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28809b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1894h value = (C1894h) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28809b;
        Vf.b bVarB = encoder.b(c1244d0);
        D.b bVar = C1894h.Companion;
        x0 x0Var = x0.f15655a;
        bVarB.f(c1244d0, 0, x0Var, new C2537u(value.f28813a));
        bVarB.f(c1244d0, 1, x0Var, new C2537u(value.f28814b));
        bVarB.f(c1244d0, 2, x0Var, new C2537u(value.f28815c));
        KSerializer[] kSerializerArr = C1894h.f28812h;
        bVarB.f(c1244d0, 3, kSerializerArr[3], value.f28816d);
        bVarB.f(c1244d0, 4, kSerializerArr[4], value.f28817e);
        B b5 = B.f28689a;
        bVarB.f(c1244d0, 5, b5, new C2465q(value.f28818f));
        boolean zA = bVarB.A(c1244d0, 6);
        C2465q c2465q = value.f28819g;
        if (zA || c2465q != null) {
            bVarB.i(c1244d0, 6, b5, c2465q);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
