package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.B;
import Wf.C;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.J;
import Wf.O;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class y2 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final y2 f33364a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33365b;

    static {
        y2 y2Var = new y2();
        f33364a = y2Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.DeviceNode.VungleExt", y2Var, 23);
        c1244d0.j("is_google_play_services_available", true);
        c1244d0.j("app_set_id", true);
        c1244d0.j("app_set_id_scope", true);
        c1244d0.j("battery_level", true);
        c1244d0.j("battery_state", true);
        c1244d0.j("battery_saver_enabled", true);
        c1244d0.j("connection_type", true);
        c1244d0.j("connection_type_detail", true);
        c1244d0.j("locale", true);
        c1244d0.j("language", true);
        c1244d0.j("time_zone", true);
        c1244d0.j("volume_level", true);
        c1244d0.j("sound_enabled", true);
        c1244d0.j("is_tv", true);
        c1244d0.j("sd_card_available", true);
        c1244d0.j("is_sideload_enabled", true);
        c1244d0.j("gaid", true);
        c1244d0.j("amazon_advertising_id", true);
        c1244d0.j("sit", true);
        c1244d0.j("oit", true);
        c1244d0.j("ort", true);
        c1244d0.j("obt", true);
        c1244d0.j("gp_version", true);
        f33365b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        Wf.q0 q0Var = Wf.q0.f15625a;
        KSerializer kSerializerU = AbstractC2641B.u(q0Var);
        J j8 = J.f15549a;
        KSerializer kSerializerU2 = AbstractC2641B.u(j8);
        KSerializer kSerializerU3 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU4 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU5 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU6 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU7 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU8 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU9 = AbstractC2641B.u(q0Var);
        KSerializer kSerializerU10 = AbstractC2641B.u(q0Var);
        O o7 = O.f15556a;
        KSerializer kSerializerU11 = AbstractC2641B.u(o7);
        KSerializer kSerializerU12 = AbstractC2641B.u(o7);
        KSerializer kSerializerU13 = AbstractC2641B.u(o7);
        KSerializer kSerializerU14 = AbstractC2641B.u(o7);
        KSerializer kSerializerU15 = AbstractC2641B.u(q0Var);
        C1247f c1247f = C1247f.f15596a;
        B b5 = B.f15526a;
        return new KSerializer[]{c1247f, kSerializerU, kSerializerU2, b5, kSerializerU3, j8, kSerializerU4, kSerializerU5, kSerializerU6, kSerializerU7, kSerializerU8, b5, j8, c1247f, j8, c1247f, kSerializerU9, kSerializerU10, kSerializerU11, kSerializerU12, kSerializerU13, kSerializerU14, kSerializerU15};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object objB;
        Object obj;
        int i5;
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33365b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB2 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object objB3 = null;
        Object objB4 = null;
        Object objB5 = null;
        Object objB6 = null;
        Object objB7 = null;
        Object obj4 = null;
        Object objB8 = null;
        Object objB9 = null;
        Object objB10 = null;
        Object objB11 = null;
        Object objB12 = null;
        float fR = 0.0f;
        float fR2 = 0.0f;
        boolean z2 = true;
        int i10 = 0;
        boolean zY = false;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean zY2 = false;
        Object objB13 = null;
        while (z2) {
            Object objB14 = obj2;
            int iM = aVarB.m(c1244d0);
            Object obj5 = obj3;
            switch (iM) {
                case -1:
                    objB = obj5;
                    obj = objB2;
                    z2 = false;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 0:
                    objB = obj5;
                    obj = objB2;
                    zY = aVarB.y(c1244d0, 0);
                    objB12 = objB12;
                    i5 = 1;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 1:
                    objB = obj5;
                    obj = objB2;
                    objB12 = aVarB.B(c1244d0, 1, Wf.q0.f15625a, objB12);
                    objB14 = objB14;
                    i5 = 2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 2:
                    obj = objB2;
                    objB = obj5;
                    objB14 = aVarB.B(c1244d0, 2, J.f15549a, objB14);
                    i5 = 4;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 3:
                    obj = objB2;
                    fR = aVarB.r(c1244d0, 3);
                    objB = obj5;
                    i5 = 8;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 4:
                    obj = objB2;
                    objB = aVarB.B(c1244d0, 4, Wf.q0.f15625a, obj5);
                    i5 = 16;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 5:
                    i5 = 32;
                    i11 = aVarB.i(c1244d0, 5);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 6:
                    i5 = 64;
                    objB11 = aVarB.B(c1244d0, 6, Wf.q0.f15625a, objB11);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 7:
                    i5 = 128;
                    objB10 = aVarB.B(c1244d0, 7, Wf.q0.f15625a, objB10);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 8:
                    i5 = 256;
                    objB9 = aVarB.B(c1244d0, 8, Wf.q0.f15625a, objB9);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 9:
                    i5 = 512;
                    objB8 = aVarB.B(c1244d0, 9, Wf.q0.f15625a, objB8);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 10:
                    Object objB15 = aVarB.B(c1244d0, 10, Wf.q0.f15625a, obj4);
                    i5 = Segment.SHARE_MINIMUM;
                    obj4 = objB15;
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 11:
                    i5 = 2048;
                    fR2 = aVarB.r(c1244d0, 11);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 12:
                    i5 = 4096;
                    i12 = aVarB.i(c1244d0, 12);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 13:
                    boolean zY3 = aVarB.y(c1244d0, 13);
                    i5 = Segment.SIZE;
                    z10 = zY3;
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 14:
                    int i14 = aVarB.i(c1244d0, 14);
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                    i13 = i14;
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 15:
                    i5 = 32768;
                    zY2 = aVarB.y(c1244d0, 15);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 16:
                    i5 = 65536;
                    objB7 = aVarB.B(c1244d0, 16, Wf.q0.f15625a, objB7);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 17:
                    i5 = 131072;
                    objB6 = aVarB.B(c1244d0, 17, Wf.q0.f15625a, objB6);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 18:
                    i5 = 262144;
                    objB5 = aVarB.B(c1244d0, 18, O.f15556a, objB5);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 19:
                    i5 = 524288;
                    objB4 = aVarB.B(c1244d0, 19, O.f15556a, objB4);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 20:
                    i5 = 1048576;
                    objB3 = aVarB.B(c1244d0, 20, O.f15556a, objB3);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 21:
                    i5 = 2097152;
                    objB13 = aVarB.B(c1244d0, 21, O.f15556a, objB13);
                    objB = obj5;
                    obj = objB2;
                    i10 |= i5;
                    obj2 = objB14;
                    objB2 = obj;
                    obj3 = objB;
                case 22:
                    objB2 = aVarB.B(c1244d0, 22, Wf.q0.f15625a, objB2);
                    i10 |= 4194304;
                    obj2 = objB14;
                    obj3 = obj5;
                default:
                    throw new Sf.i(iM);
            }
        }
        Object obj6 = obj3;
        aVarB.c(c1244d0);
        return new a3(i10, zY, (String) objB12, (Integer) obj2, fR, (String) obj6, i11, (String) objB11, (String) objB10, (String) objB9, (String) objB8, (String) obj4, fR2, i12, z10, i13, zY2, (String) objB7, (String) objB6, (Long) objB5, (Long) objB4, (Long) objB3, (Long) objB13, (String) objB2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33365b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a3 value = (a3) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33365b;
        Vf.b bVarB = encoder.b(c1244d0);
        a3.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
