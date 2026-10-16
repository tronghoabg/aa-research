package com.moloco.sdk.internal.ortb.model;

import Wf.AbstractC1240b0;
import Wf.C1244d0;
import Wf.q0;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.ortb.model.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1889c implements Wf.C {

    /* renamed from: a, reason: collision with root package name */
    public static final C1889c f28778a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1244d0 f28779b;

    /* renamed from: com.moloco.sdk.internal.ortb.model.c$b */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return C1902p.f28853a;
        }
    }

    static {
        C1889c c1889c = new C1889c();
        f28778a = c1889c;
        C1244d0 c1244d0 = new C1244d0("com.moloco.sdk.internal.ortb.model.SdkEvents", c1889c, 10);
        c1244d0.j("on_ad_load_start", true);
        c1244d0.j("on_ad_load_failed", true);
        c1244d0.j("on_ad_load_success", true);
        c1244d0.j("on_ad_show_failed", true);
        c1244d0.j("on_ad_show_success", true);
        c1244d0.j("on_ad_clicked", true);
        c1244d0.j("on_ad_hidden", true);
        c1244d0.j("on_user_rewarded", true);
        c1244d0.j("on_rewarded_video_started", true);
        c1244d0.j("on_rewarded_video_completed", true);
        f28779b = c1244d0;
    }

    @Override // Wf.C
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f15625a;
        return new KSerializer[]{AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var), AbstractC2641B.u(q0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        C1244d0 c1244d0 = f28779b;
        Vf.a aVarB = decoder.b(c1244d0);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z2 = true;
        int i5 = 0;
        while (z2) {
            int iM = aVarB.m(c1244d0);
            switch (iM) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    str2 = (String) aVarB.B(c1244d0, 0, q0.f15625a, str2);
                    i5 |= 1;
                    break;
                case 1:
                    str3 = (String) aVarB.B(c1244d0, 1, q0.f15625a, str3);
                    i5 |= 2;
                    break;
                case 2:
                    str4 = (String) aVarB.B(c1244d0, 2, q0.f15625a, str4);
                    i5 |= 4;
                    break;
                case 3:
                    str5 = (String) aVarB.B(c1244d0, 3, q0.f15625a, str5);
                    i5 |= 8;
                    break;
                case 4:
                    str6 = (String) aVarB.B(c1244d0, 4, q0.f15625a, str6);
                    i5 |= 16;
                    break;
                case 5:
                    str7 = (String) aVarB.B(c1244d0, 5, q0.f15625a, str7);
                    i5 |= 32;
                    break;
                case 6:
                    str8 = (String) aVarB.B(c1244d0, 6, q0.f15625a, str8);
                    i5 |= 64;
                    break;
                case 7:
                    str9 = (String) aVarB.B(c1244d0, 7, q0.f15625a, str9);
                    i5 |= 128;
                    break;
                case 8:
                    str10 = (String) aVarB.B(c1244d0, 8, q0.f15625a, str10);
                    i5 |= 256;
                    break;
                case 9:
                    str = (String) aVarB.B(c1244d0, 9, q0.f15625a, str);
                    i5 |= 512;
                    break;
                default:
                    throw new Sf.i(iM);
            }
        }
        aVarB.c(c1244d0);
        return new C1890d(i5, str2, str3, str4, str5, str6, str7, str8, str9, str10, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f28779b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1890d value = (C1890d) obj;
        AbstractC3340k.e(value, "value");
        C1244d0 c1244d0 = f28779b;
        Vf.b bVarB = encoder.b(c1244d0);
        boolean zA = bVarB.A(c1244d0, 0);
        String str = value.f28782a;
        if (zA || str != null) {
            bVarB.i(c1244d0, 0, q0.f15625a, str);
        }
        boolean zA2 = bVarB.A(c1244d0, 1);
        String str2 = value.f28783b;
        if (zA2 || str2 != null) {
            bVarB.i(c1244d0, 1, q0.f15625a, str2);
        }
        boolean zA3 = bVarB.A(c1244d0, 2);
        String str3 = value.f28784c;
        if (zA3 || str3 != null) {
            bVarB.i(c1244d0, 2, q0.f15625a, str3);
        }
        boolean zA4 = bVarB.A(c1244d0, 3);
        String str4 = value.f28785d;
        if (zA4 || str4 != null) {
            bVarB.i(c1244d0, 3, q0.f15625a, str4);
        }
        boolean zA5 = bVarB.A(c1244d0, 4);
        String str5 = value.f28786e;
        if (zA5 || str5 != null) {
            bVarB.i(c1244d0, 4, q0.f15625a, str5);
        }
        boolean zA6 = bVarB.A(c1244d0, 5);
        String str6 = value.f28787f;
        if (zA6 || str6 != null) {
            bVarB.i(c1244d0, 5, q0.f15625a, str6);
        }
        boolean zA7 = bVarB.A(c1244d0, 6);
        String str7 = value.f28788g;
        if (zA7 || str7 != null) {
            bVarB.i(c1244d0, 6, q0.f15625a, str7);
        }
        boolean zA8 = bVarB.A(c1244d0, 7);
        String str8 = value.f28789h;
        if (zA8 || str8 != null) {
            bVarB.i(c1244d0, 7, q0.f15625a, str8);
        }
        boolean zA9 = bVarB.A(c1244d0, 8);
        String str9 = value.f28790i;
        if (zA9 || str9 != null) {
            bVarB.i(c1244d0, 8, q0.f15625a, str9);
        }
        boolean zA10 = bVarB.A(c1244d0, 9);
        String str10 = value.f28791j;
        if (zA10 || str10 != null) {
            bVarB.i(c1244d0, 9, q0.f15625a, str10);
        }
        bVarB.c(c1244d0);
    }

    @Override // Wf.C
    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return AbstractC1240b0.f15577b;
    }
}
