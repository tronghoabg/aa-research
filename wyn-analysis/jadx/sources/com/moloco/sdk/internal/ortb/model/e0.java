package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.x0;
import e0.C2465q;
import ef.C2537u;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f28796a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28797b;

    static {
        e0 e0Var = new e0();
        f28796a = e0Var;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.Mute", e0Var, 7);
        c1244d0.j("mute", false);
        c1244d0.j("padding", false);
        c1244d0.j("horizontal_alignment", false);
        c1244d0.j("vertical_alignment", false);
        c1244d0.j("foreground_color", false);
        c1244d0.j("control_size", true);
        c1244d0.j("background_color", true);
        f28797b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = f0.f28800h;
        x0 x0Var = x0.f15655a;
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer kSerializer2 = kSerializerArr[3];
        B b5 = B.f28689a;
        return new KSerializer[]{C1247f.f15596a, x0Var, kSerializer, kSerializer2, b5, AbstractC2641B.u(x0Var), AbstractC2641B.u(b5)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28797b;
        Vf.a aVarB = decoder.b(c1244d0);
        KSerializer[] kSerializerArr = f0.f28800h;
        int i5 = 0;
        boolean zY = false;
        C2537u c2537u = null;
        X x5 = null;
        EnumC1897k enumC1897k = null;
        C2465q c2465q = null;
        C2537u c2537u2 = null;
        C2465q c2465q2 = null;
        boolean z2 = true;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    zY = aVarB.y(c1244d0, 0);
                    i5 |= 1;
                    break;
                case 1:
                    c2537u = (C2537u) aVarB.D(c1244d0, 1, x0.f15655a, c2537u);
                    i5 |= 2;
                    break;
                case 2:
                    x5 = (X) aVarB.D(c1244d0, 2, kSerializerArr[2], x5);
                    i5 |= 4;
                    break;
                case 3:
                    enumC1897k = (EnumC1897k) aVarB.D(c1244d0, 3, kSerializerArr[3], enumC1897k);
                    i5 |= 8;
                    break;
                case 4:
                    c2465q = (C2465q) aVarB.D(c1244d0, 4, B.f28689a, c2465q);
                    i5 |= 16;
                    break;
                case 5:
                    c2537u2 = (C2537u) aVarB.B(c1244d0, 5, x0.f15655a, c2537u2);
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
        return new f0(i5, zY, c2537u, x5, enumC1897k, c2465q, c2537u2, c2465q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28797b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0 value = (f0) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28797b;
        Vf.b bVarB = encoder.b(c1244d0);
        bVarB.x(c1244d0, 0, value.f28801a);
        x0 x0Var = x0.f15655a;
        bVarB.f(c1244d0, 1, x0Var, new C2537u(value.f28802b));
        KSerializer[] kSerializerArr = f0.f28800h;
        bVarB.f(c1244d0, 2, kSerializerArr[2], value.f28803c);
        bVarB.f(c1244d0, 3, kSerializerArr[3], value.f28804d);
        B b5 = B.f28689a;
        bVarB.f(c1244d0, 4, b5, new C2465q(value.f28805e));
        boolean zA = bVarB.A(c1244d0, 5);
        C2537u c2537u = value.f28806f;
        if (zA || c2537u != null) {
            bVarB.i(c1244d0, 5, x0Var, c2537u);
        }
        boolean zA2 = bVarB.A(c1244d0, 6);
        C2465q c2465q = value.f28807g;
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
