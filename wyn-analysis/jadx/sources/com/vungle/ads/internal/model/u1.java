package com.vungle.ads.internal.model;

import Wf.AbstractC1240b0;
import Wf.C;
import Wf.C1241c;
import Wf.C1244d0;
import Wf.C1247f;
import Wf.J;
import Wf.O;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import ff.AbstractC2641B;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes5.dex */
public final class u1 implements C {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f33327a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1244d0 f33328b;

    static {
        u1 u1Var = new u1();
        f33327a = u1Var;
        C1244d0 c1244d0 = new C1244d0("com.vungle.ads.internal.model.ConfigPayload", u1Var, 18);
        c1244d0.j("reuse_assets", true);
        c1244d0.j("config", true);
        c1244d0.j("endpoints", true);
        c1244d0.j("log_metrics", true);
        c1244d0.j("placements", true);
        c1244d0.j("user", true);
        c1244d0.j("config_extension", true);
        c1244d0.j("disable_ad_id", true);
        c1244d0.j("ri_enabled", true);
        c1244d0.j("session_timeout", true);
        c1244d0.j("wait_for_connectivity_for_tpat", true);
        c1244d0.j("sdk_session_timeout", true);
        c1244d0.j("signals_disabled", true);
        c1244d0.j("fpd_enabled", true);
        c1244d0.j("rta_debugging", true);
        c1244d0.j("config_last_validated_ts", true);
        c1244d0.j("auto_redirect", true);
        c1244d0.j("enable_ot", true);
        f33328b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerU = AbstractC2641B.u(y1.f33362a);
        KSerializer kSerializerU2 = AbstractC2641B.u(c2.f33146a);
        KSerializer kSerializerU3 = AbstractC2641B.u(f2.f33164a);
        KSerializer kSerializerU4 = AbstractC2641B.u(p2.f33290a);
        KSerializer kSerializerU5 = AbstractC2641B.u(new C1241c(g3.f33175a, 0));
        KSerializer kSerializerU6 = AbstractC2641B.u(s2.f33314a);
        KSerializer kSerializerU7 = AbstractC2641B.u(Wf.q0.f15625a);
        C1247f c1247f = C1247f.f15596a;
        KSerializer kSerializerU8 = AbstractC2641B.u(c1247f);
        KSerializer kSerializerU9 = AbstractC2641B.u(c1247f);
        J j8 = J.f15549a;
        return new KSerializer[]{kSerializerU, kSerializerU2, kSerializerU3, kSerializerU4, kSerializerU5, kSerializerU6, kSerializerU7, kSerializerU8, kSerializerU9, AbstractC2641B.u(j8), AbstractC2641B.u(c1247f), AbstractC2641B.u(j8), AbstractC2641B.u(c1247f), AbstractC2641B.u(c1247f), AbstractC2641B.u(c1247f), AbstractC2641B.u(O.f15556a), AbstractC2641B.u(v1.f33333a), AbstractC2641B.u(c1247f)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object obj;
        Object objB;
        int i5;
        AbstractC3340k.e(decoder, "decoder");
        C1244d0 c1244d0 = f33328b;
        Vf.a aVarB = decoder.b(c1244d0);
        Object objB2 = null;
        Object objB3 = null;
        Object obj2 = null;
        Object objB4 = null;
        Object objB5 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object objB6 = null;
        Object objB7 = null;
        Object obj5 = null;
        Object objB8 = null;
        Object objB9 = null;
        Object objB10 = null;
        Object objB11 = null;
        Object objB12 = null;
        Object obj6 = null;
        Object objB13 = null;
        Object objB14 = null;
        boolean z2 = true;
        int i10 = 0;
        while (z2) {
            Object obj7 = objB3;
            int iM = aVarB.m(c1244d0);
            Object objB15 = obj2;
            switch (iM) {
                case -1:
                    z2 = false;
                    objB3 = obj7;
                    objB2 = objB2;
                    obj2 = objB15;
                case 0:
                    obj = objB2;
                    objB = obj6;
                    objB14 = aVarB.B(c1244d0, 0, y1.f33362a, objB14);
                    objB3 = obj7;
                    objB15 = objB15;
                    i5 = 1;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 1:
                    obj = objB2;
                    objB = obj6;
                    objB13 = aVarB.B(c1244d0, 1, c2.f33146a, objB13);
                    objB3 = obj7;
                    objB15 = objB15;
                    i5 = 2;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 2:
                    obj = objB2;
                    objB = aVarB.B(c1244d0, 2, f2.f33164a, obj6);
                    objB3 = obj7;
                    objB15 = objB15;
                    i5 = 4;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 3:
                    obj = objB2;
                    objB12 = aVarB.B(c1244d0, 3, p2.f33290a, objB12);
                    objB = obj6;
                    objB3 = obj7;
                    objB15 = objB15;
                    i5 = 8;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 4:
                    obj = objB2;
                    objB3 = aVarB.B(c1244d0, 4, new C1241c(g3.f33175a, 0), obj7);
                    objB = obj6;
                    objB15 = objB15;
                    i5 = 16;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 5:
                    obj = objB2;
                    i5 = 32;
                    objB15 = aVarB.B(c1244d0, 5, s2.f33314a, objB15);
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 6:
                    i5 = 64;
                    objB11 = aVarB.B(c1244d0, 6, Wf.q0.f15625a, objB11);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 7:
                    i5 = 128;
                    objB10 = aVarB.B(c1244d0, 7, C1247f.f15596a, objB10);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 8:
                    i5 = 256;
                    objB9 = aVarB.B(c1244d0, 8, C1247f.f15596a, objB9);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 9:
                    i5 = 512;
                    objB8 = aVarB.B(c1244d0, 9, J.f15549a, objB8);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 10:
                    Object objB16 = aVarB.B(c1244d0, 10, C1247f.f15596a, obj5);
                    i5 = Segment.SHARE_MINIMUM;
                    obj5 = objB16;
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 11:
                    i5 = 2048;
                    objB7 = aVarB.B(c1244d0, 11, J.f15549a, objB7);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 12:
                    i5 = 4096;
                    objB6 = aVarB.B(c1244d0, 12, C1247f.f15596a, objB6);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 13:
                    Object objB17 = aVarB.B(c1244d0, 13, C1247f.f15596a, obj4);
                    i5 = Segment.SIZE;
                    obj4 = objB17;
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 14:
                    Object objB18 = aVarB.B(c1244d0, 14, C1247f.f15596a, obj3);
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                    obj3 = objB18;
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 15:
                    i5 = 32768;
                    objB5 = aVarB.B(c1244d0, 15, O.f15556a, objB5);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 16:
                    i5 = 65536;
                    objB4 = aVarB.B(c1244d0, 16, v1.f33333a, objB4);
                    obj = objB2;
                    objB = obj6;
                    objB3 = obj7;
                    i10 |= i5;
                    obj6 = objB;
                    obj2 = objB15;
                    objB2 = obj;
                case 17:
                    objB2 = aVarB.B(c1244d0, 17, C1247f.f15596a, objB2);
                    i10 |= 131072;
                    objB3 = obj7;
                    obj2 = objB15;
                default:
                    throw new Sf.i(iM);
            }
        }
        Object obj8 = obj2;
        aVarB.c(c1244d0);
        return new v2(i10, (a2) objB14, (e2) objB13, (h2) obj6, (r2) objB12, (List) objB3, (u2) obj8, (String) objB11, (Boolean) objB10, (Boolean) objB9, (Integer) objB8, (Boolean) obj5, (Integer) objB7, (Boolean) objB6, (Boolean) obj4, (Boolean) obj3, (Long) objB5, (x1) objB4, (Boolean) objB2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f33328b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v2 value = (v2) obj;
        AbstractC3340k.e(encoder, "encoder");
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f33328b;
        Vf.b bVarB = encoder.b(c1244d0);
        v2.a(value, bVarB, c1244d0);
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
