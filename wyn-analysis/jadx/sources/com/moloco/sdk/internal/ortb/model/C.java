package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.q0;
import Wf.x0;
import android.graphics.Color;
import com.moloco.sdk.internal.ortb.model.EnumC1897k;
import e0.C2465q;
import ef.C2537u;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class C implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f28691a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28692b;

    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1891e.f28794a;
        }
    }

    static {
        C c10 = new C();
        f28691a = c10;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.CountDownTimer", c10, 8);
        c1244d0.j("custom_timer_desc", true);
        c1244d0.j("is_default_timer", true);
        c1244d0.j("control_size", true);
        c1244d0.j("padding", true);
        c1244d0.j("horizontal_alignment", true);
        c1244d0.j("vertical_alignment", true);
        c1244d0.j("foreground_color", true);
        c1244d0.j("background_color", true);
        f28692b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = D.f28693i;
        KSerializer kSerializerU = AbstractC2641B.u(q0.f15625a);
        KSerializer kSerializerU2 = AbstractC2641B.u(Wf.J.f15549a);
        KSerializer kSerializer = kSerializerArr[4];
        KSerializer kSerializer2 = kSerializerArr[5];
        B b5 = B.f28689a;
        return new KSerializer[]{kSerializerU, C1247f.f15596a, x0.f15655a, kSerializerU2, kSerializer, kSerializer2, b5, b5};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28692b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = D.f28693i;
        String str = null;
        C2537u c2537u = null;
        Integer num = null;
        X x5 = null;
        EnumC1897k enumC1897k = null;
        C2465q c2465q = null;
        C2465q c2465q2 = null;
        int i5 = 0;
        boolean zY = false;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    str = (String) aVarB.B(c1244d0, 0, q0.f15625a, str);
                    i5 |= 1;
                    break;
                case 1:
                    zY = aVarB.y(c1244d0, 1);
                    i5 |= 2;
                    break;
                case 2:
                    c2537u = (C2537u) aVarB.D(c1244d0, 2, x0.f15655a, c2537u);
                    i5 |= 4;
                    break;
                case 3:
                    num = (Integer) aVarB.B(c1244d0, 3, Wf.J.f15549a, num);
                    i5 |= 8;
                    break;
                case 4:
                    x5 = (X) aVarB.D(c1244d0, 4, kSerializerArr[4], x5);
                    i5 |= 16;
                    break;
                case 5:
                    enumC1897k = (EnumC1897k) aVarB.D(c1244d0, 5, kSerializerArr[5], enumC1897k);
                    i5 |= 32;
                    break;
                case 6:
                    c2465q = (C2465q) aVarB.D(c1244d0, 6, B.f28689a, c2465q);
                    i5 |= 64;
                    break;
                case 7:
                    c2465q2 = (C2465q) aVarB.D(c1244d0, 7, B.f28689a, c2465q2);
                    i5 |= 128;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new D(i5, str, zY, c2537u, num, x5, enumC1897k, c2465q, c2465q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28692b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        D value = (D) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28692b;
        Vf.b bVarB = encoder.b(c1244d0);
        EnumC1897k.b bVar = D.Companion;
        boolean zA = bVarB.A(c1244d0, 0);
        String str = value.f28694a;
        if (zA || str != null) {
            bVarB.i(c1244d0, 0, q0.f15625a, str);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        boolean z2 = value.f28695b;
        if (zA2 || !z2) {
            bVarB.x(c1244d0, 1, z2);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        int i5 = value.f28696c;
        if (zA3 || i5 != 30) {
            bVarB.f(c1244d0, 2, x0.f15655a, new C2537u(i5));
        }
        boolean zA4 = bVarB.A(c1244d0, 3);
        Integer num = value.f28697d;
        if (zA4 || num != null) {
            bVarB.i(c1244d0, 3, Wf.J.f15549a, num);
        }
        boolean zA5 = bVarB.A(c1244d0, 4);
        KSerializer[] kSerializerArr = D.f28693i;
        X x5 = value.f28698e;
        if (zA5 || x5 != X.f28757f) {
            bVarB.f(c1244d0, 4, kSerializerArr[4], x5);
        }
        boolean zA6 = bVarB.A(c1244d0, 5);
        EnumC1897k enumC1897k = value.f28699f;
        if (zA6 || enumC1897k != EnumC1897k.f28839b) {
            bVarB.f(c1244d0, 5, kSerializerArr[5], enumC1897k);
        }
        boolean zA7 = bVarB.A(c1244d0, 6);
        long j8 = value.f28700g;
        if (zA7 || !C2465q.b(j8, e0.z.b(Color.parseColor("#FF4285f4")))) {
            bVarB.f(c1244d0, 6, B.f28689a, new C2465q(j8));
        }
        boolean zA8 = bVarB.A(c1244d0, 7);
        long j10 = value.f28701h;
        if (zA8 || !C2465q.b(j10, e0.z.b(Color.parseColor("#FFFFFFFF")))) {
            bVarB.f(c1244d0, 7, B.f28689a, new C2465q(j10));
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
