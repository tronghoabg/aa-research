package com.moloco.sdk.internal.publisher;

import B.C0318i;
import B.C0320k;
import B.C0321l;
import B.C0326q;
import E.AbstractC0426p;
import E5.C0441b;
import G6.C0549m;
import H7.C0575n;
import J8.AbstractC0629d;
import J8.C0627b;
import J8.C0628c;
import J8.C0630e;
import J8.C0631f;
import J8.C0641p;
import K.C0678c;
import K8.C0690b;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import Pc.C0788d;
import Va.M6;
import Va.Za;
import Wf.AbstractC1240b0;
import Wf.C1241c;
import Wf.C1248f0;
import a.AbstractC1304a;
import android.content.Context;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.K0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2042c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2105b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2106c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2107d;
import com.unity3d.ads.metadata.MediationMetaData;
import d0.C2384c;
import ef.C2515C;
import ef.C2527k;
import ef.C2533q;
import ff.AbstractC2641B;
import gf.C2755b;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m3.C3485c;
import m3.C3486d;
import o3.InterfaceC3644a;
import org.json.JSONArray;
import org.json.JSONObject;
import r0.InterfaceC3903h;
import r0.InterfaceC3909n;
import r7.AbstractC3935e;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import u0.InterfaceC4193p0;
import x.C4412e;
import x0.C4435e;
import y3.AbstractC4545c;
import y3.AbstractC4557o;
import y3.C4544b;
import y3.InterfaceC4546d;
import za.C4658a;

/* loaded from: classes4.dex */
public abstract class H implements Encoder, Vf.b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f28916a = true;

    public static final void G(h4.h hVar, Z.k kVar, InterfaceC3903h interfaceC3903h, C0740o c0740o, int i5) {
        c0740o.N(-941517612);
        int i10 = i5 & (-1879055361);
        X3.k kVarP = (X3.k) c0740o.j(Y3.t.f16673a);
        if (kVarP == null) {
            Context context = (Context) c0740o.j(AndroidCompositionLocals_androidKt.f18012b);
            X3.k kVar2 = X3.a.f16079b;
            if (kVar2 == null) {
                synchronized (X3.a.f16078a) {
                    kVar2 = X3.a.f16079b;
                    if (kVar2 != null) {
                        kVarP = kVar2;
                    } else {
                        context.getApplicationContext();
                        kVarP = A6.h.p(context);
                        X3.a.f16079b = kVarP;
                    }
                }
            } else {
                kVarP = kVar2;
            }
        }
        int i11 = i10 << 3;
        AbstractC1304a.d(hVar, kVarP, kVar, interfaceC3903h, c0740o, (i5 & 112) | 520 | (i11 & 7168) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192), 0);
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0678c(i5, 3, hVar, kVar, interfaceC3903h);
    }

    public static final void H(D.i interactionSource, N.V pressedInteraction, C0740o c0740o, int i5) {
        AbstractC3340k.e(interactionSource, "interactionSource");
        AbstractC3340k.e(pressedInteraction, "pressedInteraction");
        c0740o.N(1761107222);
        if ((((c0740o.e(interactionSource) ? 4 : 2) | i5) & 91) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(511388516);
            boolean zE = c0740o.e(pressedInteraction) | c0740o.e(interactionSource);
            Object objF = c0740o.F();
            if (zE || objF == C0732k.f7800a) {
                objF = new C0320k(pressedInteraction, interactionSource, 0);
                c0740o.U(objF);
            }
            c0740o.p(false);
            C0718d.c(interactionSource, (tf.l) objF, c0740o);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0318i(interactionSource, pressedInteraction, i5, 1);
    }

    public static final long I(float f10, float f11) {
        long jFloatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i5 = d0.f.f33951d;
        return jFloatToIntBits;
    }

    public static final V J(Context context, com.moloco.sdk.internal.services.u uVar, com.moloco.sdk.internal.services.events.c cVar, String adUnitId, boolean z2, G0 g02, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, W1.r rVar, C1880b c1880b, com.moloco.sdk.internal.m mVar, com.moloco.sdk.internal.services.B b5, com.moloco.sdk.acm.recorder.c cVar2, K0 k02, AdFormatType adFormatType) {
        AbstractC3340k.e(adUnitId, "adUnitId");
        AbstractC3340k.e(adFormatType, "adFormatType");
        E e7 = E.f28913a;
        F f10 = F.f28914a;
        return new V(context, uVar, cVar, adUnitId, z2, g02, vVar, rVar, c1880b, mVar, b5, cVar2, k02, adFormatType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0177, code lost:
    
        if (gc.b.r(r8, new A7.CallableC0305y0(8, r0, r4), r1) == r2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:19:0x006a, B:20:0x0095, B:22:0x009d, B:26:0x00b0, B:30:0x00c2, B:34:0x00dc, B:39:0x00eb, B:41:0x00f6, B:44:0x0106, B:43:0x00fb, B:38:0x00e6, B:33:0x00d2, B:29:0x00bc, B:25:0x00aa), top: B:64:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0177 -> B:61:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object K(com.moloco.sdk.acm.db.e r26, jf.InterfaceC3103c r27) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.H.K(com.moloco.sdk.acm.db.e, jf.c):java.lang.Object");
    }

    public static final void L(WebView webView, String data) {
        AbstractC3340k.e(webView, "<this>");
        AbstractC3340k.e(data, "data");
        webView.loadDataWithBaseURL("https://appassets.androidplatform.net", data, "text/html", "utf-8", null);
    }

    public static final void M(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar, tf.a aVar, Z.k kVar, C0740o c0740o, int i5) {
        c0740o.N(-1013674470);
        if ((((c0740o.e(iVar) ? 4 : 2) | i5 | (c0740o.e(aVar) ? 32 : 16)) & 147) == 146 && c0740o.x()) {
            c0740o.I();
        } else {
            C2515C c2515c = C2515C.f34653a;
            c0740o.M(-1879742322);
            boolean zE = c0740o.e(iVar);
            Object objF = c0740o.F();
            N.P p10 = C0732k.f7800a;
            if (zE || objF == p10) {
                objF = new C2105b(iVar, null);
                c0740o.U(objF);
            }
            c0740o.p(false);
            C0718d.d(c0740o, c2515c, (tf.p) objF);
            c0740o.M(-1879738001);
            boolean zE2 = c0740o.e(iVar);
            Object objF2 = c0740o.F();
            if (zE2 || objF2 == p10) {
                objF2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f(iVar, 1);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            C0718d.c(c2515c, (tf.l) objF2, c0740o);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) C0718d.u(iVar.f31698p, c0740o, 0).getValue();
            if (sVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) {
                c0740o.M(1857903466);
                c0740o.M(-1879727652);
                boolean zE3 = c0740o.e(iVar);
                Object objF3 = c0740o.F();
                if (zE3 || objF3 == p10) {
                    objF3 = new C2106c(iVar, null);
                    c0740o.U(objF3);
                }
                c0740o.p(false);
                AbstractC2641B.e((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.q) sVar, p0.w.a(kVar, c2515c, (tf.p) objF3), c0740o, 0);
                c0740o.p(false);
            } else if (sVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) {
                c0740o.M(1858286099);
                c0740o.M(-1879715540);
                boolean zE4 = c0740o.e(iVar) | c0740o.e(aVar);
                Object objF4 = c0740o.F();
                if (zE4 || objF4 == p10) {
                    objF4 = new C2107d(iVar, aVar, null);
                    c0740o.U(objF4);
                }
                c0740o.p(false);
                N((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r) sVar, p0.w.a(kVar, c2515c, (tf.p) objF4), c0740o, 0);
                c0740o.p(false);
            } else {
                if (sVar != null) {
                    c0740o.M(-1879731707);
                    c0740o.p(false);
                    throw new E5.Q((byte) 0, 9);
                }
                c0740o.M(1858714333);
                c0740o.p(false);
            }
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new com.applovin.mediation.adapters.e(iVar, aVar, kVar, i5);
        }
    }

    public static final void N(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.r rVar, Z.k kVar, C0740o c0740o, int i5) {
        c0740o.N(2103037730);
        int i10 = (c0740o.e(rVar) ? 4 : 2) | i5 | (c0740o.e(kVar) ? 32 : 16);
        if ((i10 & 19) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            Z.d dVar = Z.a.f16904e;
            c0740o.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(dVar, false, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(u0.M.f46143e);
            L0.i iVar = (L0.i) c0740o.j(u0.M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(u0.M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVar);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-2137368960);
            tg.b.d(rVar, null, c0740o, i10 & 14, 2);
            wg.b.e(c0740o, false, false, true, false);
            c0740o.p(false);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new C2042c(rVar, kVar, i5);
        }
    }

    public static Object O(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final Z.k P(Z.k clickable, D.i interactionSource, B.Q q4, boolean z2, String str, C4435e c4435e, tf.a onClick) {
        AbstractC3340k.e(clickable, "$this$clickable");
        AbstractC3340k.e(interactionSource, "interactionSource");
        AbstractC3340k.e(onClick, "onClick");
        return AbstractC3935e.n(clickable, new C0326q(onClick, z2, interactionSource, q4, str, c4435e));
    }

    public static /* synthetic */ Z.k Q(Z.k kVar, D.i iVar, M.e eVar, boolean z2, String str, C4435e c4435e, tf.a aVar, int i5) {
        if ((i5 & 4) != 0) {
            z2 = true;
        }
        boolean z10 = z2;
        if ((i5 & 8) != 0) {
            str = null;
        }
        return P(kVar, iVar, eVar, z10, str, c4435e, aVar);
    }

    public static Z.k R(Z.k clickable, C4435e c4435e, tf.a onClick, int i5) {
        String str = (i5 & 2) != 0 ? null : "CTA";
        if ((i5 & 4) != 0) {
            c4435e = null;
        }
        AbstractC3340k.e(clickable, "$this$clickable");
        AbstractC3340k.e(onClick, "onClick");
        return AbstractC3935e.n(clickable, new C0321l(str, c4435e, onClick));
    }

    public static com.google.android.gms.ads.nativead.l U(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("streams");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("chapters");
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; jSONArrayOptJSONArray != null && i5 < jSONArrayOptJSONArray.length(); i5++) {
            if (jSONArrayOptJSONArray.optJSONObject(i5) != null) {
                arrayList.add(new a2.k());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; jSONArrayOptJSONArray2 != null && i10 < jSONArrayOptJSONArray2.length(); i10++) {
            if (jSONArrayOptJSONArray2.optJSONObject(i10) != null) {
                arrayList2.add(new androidx.fragment.app.X(11));
            }
        }
        return new com.google.android.gms.ads.nativead.l(jSONObject, arrayList, arrayList2);
    }

    public static C0627b V(Pc.C c10) {
        C0549m c0549m = new C0549m(1);
        c0549m.f4618a = c10.f9302a;
        String str = c10.f9303b;
        if (str != null) {
            c0549m.f4624g = str;
        }
        c0549m.f4622e = c10.f9304c.booleanValue();
        String str2 = c10.f9306e;
        if (str2 != null) {
            boolean zBooleanValue = c10.f9307f.booleanValue();
            String str3 = c10.f9308g;
            c0549m.f4620c = str2;
            c0549m.f4621d = zBooleanValue;
            c0549m.f4623f = str3;
        }
        String str4 = c10.f9305d;
        if (str4 != null) {
            c0549m.f4619b = str4;
        }
        if (c0549m.f4618a != null) {
            return new C0627b(c0549m);
        }
        throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
    }

    public static AbstractC0629d W(Map map) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (map.get("token") != null) {
            Integer num = (Integer) map.get("token");
            num.getClass();
            AbstractC0629d abstractC0629d = (AbstractC0629d) C0788d.f9393i.get(num);
            if (abstractC0629d != null) {
                return abstractC0629d;
            }
            throw AbstractC1304a.A();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str6 = (String) obj;
        str = (String) map.get("secret");
        str2 = (String) map.get("idToken");
        str3 = (String) map.get("accessToken");
        str4 = (String) map.get("rawNonce");
        switch (str6) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return new J8.D(str3, str);
            case "playgames.google.com":
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return new J8.A((String) obj2);
            case "google.com":
                return new J8.r(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return new C0631f(str3);
            case "oauth":
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                String str7 = (String) obj3;
                AbstractC1732v.f(str7);
                String str8 = str3 != null ? str3 : null;
                if (str4 == null) {
                    Objects.requireNonNull(str2);
                    str5 = null;
                } else {
                    Objects.requireNonNull(str2);
                    str5 = str4;
                }
                AbstractC1732v.g(str7, "Must specify a non-empty providerId");
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str8)) {
                    throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
                }
                return new J8.I(str7, str2, str8, null, null, null, str5);
            case "phone":
                Object obj4 = map.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map.get("smsCode");
                Objects.requireNonNull(obj5);
                return J8.u.Y((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                String str9 = (String) obj6;
                Objects.requireNonNull(str);
                AbstractC1732v.f(str9);
                AbstractC1732v.f(str);
                return new C0630e(false, str9, str, null, null);
            case "github.com":
                Objects.requireNonNull(str3);
                return new J8.q(str3);
            case "emailLink":
                Object obj7 = map.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return X((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    public static C0630e X(String str, String str2) {
        C0628c c0628c;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str2)) {
            zzap zzapVar = C0628c.f5794d;
            AbstractC1732v.f(str2);
            try {
                c0628c = new C0628c(str2);
            } catch (IllegalArgumentException unused) {
                c0628c = null;
            }
            if (c0628c != null) {
                zzap zzapVar2 = C0628c.f5794d;
                String str3 = c0628c.f5796b;
                if ((zzapVar2.containsKey(str3) ? ((Integer) zzapVar2.get(str3)).intValue() : 3) == 4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            return new C0630e(false, str, null, str2, null);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }

    public static N0.m Y(N0.k kVar) {
        N0.j jVar = new N0.j();
        jVar.f8018c = new N0.n();
        N0.m mVar = new N0.m(jVar);
        jVar.f8017b = mVar;
        jVar.f8016a = kVar.getClass();
        try {
            Object objAttachCompleter = kVar.attachCompleter(jVar);
            if (objAttachCompleter != null) {
                jVar.f8016a = objAttachCompleter;
                return mVar;
            }
        } catch (Exception e7) {
            mVar.f8022b.j(e7);
        }
        return mVar;
    }

    public static boolean a0(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean b0(String str) {
        C4544b c4544b = AbstractC4557o.f48006a;
        Set<InterfaceC4546d> setUnmodifiableSet = DesugarCollections.unmodifiableSet(AbstractC4545c.f47990c);
        HashSet hashSet = new HashSet();
        for (InterfaceC4546d interfaceC4546d : setUnmodifiableSet) {
            if (((AbstractC4545c) interfaceC4546d).f47991a.equals(str)) {
                hashSet.add(interfaceC4546d);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC4545c abstractC4545c = (AbstractC4545c) ((InterfaceC4546d) it.next());
            if (abstractC4545c.a() || abstractC4545c.b()) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList c0(Pc.N n10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(n10.f9349a.b());
        arrayList.add(n10.f9350b);
        return arrayList;
    }

    public static ArrayList d0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            J8.t tVar = (J8.t) it.next();
            if (tVar instanceof J8.z) {
                String str = ((J8.z) tVar).f5836d;
                J8.z zVar = (J8.z) tVar;
                String str2 = zVar.f5834b;
                Double dValueOf = Double.valueOf(zVar.f5835c);
                Pc.H h10 = new Pc.H();
                h10.f9330a = str2;
                h10.f9331b = dValueOf;
                h10.f9332c = "phone";
                String str3 = zVar.f5833a;
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
                h10.f9333d = str3;
                h10.f9334e = str;
                arrayList2.add(h10);
            } else {
                String strO = tVar.o();
                Double dValueOf2 = Double.valueOf(tVar.V());
                String uid = tVar.getUid();
                String strW = tVar.W();
                Pc.H h11 = new Pc.H();
                h11.f9330a = strO;
                h11.f9331b = dValueOf2;
                h11.f9332c = strW;
                if (uid == null) {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
                h11.f9333d = uid;
                h11.f9334e = null;
                arrayList2.add(h11);
            }
        }
        return arrayList2;
    }

    public static final Z.k e0(Z.k kVar, E.F paddingValues) {
        AbstractC3340k.e(kVar, "<this>");
        AbstractC3340k.e(paddingValues, "paddingValues");
        return kVar.g(new E.G(paddingValues));
    }

    public static final Z.k f0(Z.k padding, float f10) {
        AbstractC3340k.e(padding, "$this$padding");
        return padding.g(new E.E(f10, f10, f10, f10));
    }

    public static final KSerializer g0(KClass kClass, ArrayList arrayList, tf.a aVar) {
        KSerializer c1241c;
        KSerializer j0Var;
        AbstractC3340k.e(kClass, "<this>");
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        if (kClass.equals(i5.getOrCreateKotlinClass(Collection.class)) || kClass.equals(i5.getOrCreateKotlinClass(List.class)) || kClass.equals(i5.getOrCreateKotlinClass(List.class)) || kClass.equals(i5.getOrCreateKotlinClass(ArrayList.class))) {
            c1241c = new C1241c((KSerializer) arrayList.get(0), 0);
        } else if (kClass.equals(i5.getOrCreateKotlinClass(HashSet.class))) {
            c1241c = new C1241c((KSerializer) arrayList.get(0), 1);
        } else if (kClass.equals(i5.getOrCreateKotlinClass(Set.class)) || kClass.equals(i5.getOrCreateKotlinClass(Set.class)) || kClass.equals(i5.getOrCreateKotlinClass(LinkedHashSet.class))) {
            c1241c = new C1241c((KSerializer) arrayList.get(0), 2);
        } else if (kClass.equals(i5.getOrCreateKotlinClass(HashMap.class))) {
            c1241c = new Wf.E((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (kClass.equals(i5.getOrCreateKotlinClass(Map.class)) || kClass.equals(i5.getOrCreateKotlinClass(Map.class)) || kClass.equals(i5.getOrCreateKotlinClass(LinkedHashMap.class))) {
            c1241c = new Wf.E((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (kClass.equals(i5.getOrCreateKotlinClass(Map.Entry.class))) {
                KSerializer keySerializer = (KSerializer) arrayList.get(0);
                KSerializer valueSerializer = (KSerializer) arrayList.get(1);
                AbstractC3340k.e(keySerializer, "keySerializer");
                AbstractC3340k.e(valueSerializer, "valueSerializer");
                j0Var = new Wf.S(keySerializer, valueSerializer, 0);
            } else if (kClass.equals(i5.getOrCreateKotlinClass(C2527k.class))) {
                KSerializer keySerializer2 = (KSerializer) arrayList.get(0);
                KSerializer valueSerializer2 = (KSerializer) arrayList.get(1);
                AbstractC3340k.e(keySerializer2, "keySerializer");
                AbstractC3340k.e(valueSerializer2, "valueSerializer");
                j0Var = new Wf.S(keySerializer2, valueSerializer2, 1);
            } else if (kClass.equals(i5.getOrCreateKotlinClass(C2533q.class))) {
                KSerializer aSerializer = (KSerializer) arrayList.get(0);
                KSerializer bSerializer = (KSerializer) arrayList.get(1);
                KSerializer cSerializer = (KSerializer) arrayList.get(2);
                AbstractC3340k.e(aSerializer, "aSerializer");
                AbstractC3340k.e(bSerializer, "bSerializer");
                AbstractC3340k.e(cSerializer, "cSerializer");
                c1241c = new Wf.r0(aSerializer, bSerializer, cSerializer);
            } else if (Fe.b.y(kClass).isArray()) {
                Object objInvoke = aVar.invoke();
                AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer elementSerializer = (KSerializer) arrayList.get(0);
                AbstractC3340k.e(elementSerializer, "elementSerializer");
                j0Var = new Wf.j0((KClass) objInvoke, elementSerializer);
            } else {
                c1241c = null;
            }
            c1241c = j0Var;
        }
        if (c1241c != null) {
            return c1241c;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        return AbstractC1240b0.d(kClass, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static Pc.E h0(AbstractC0629d abstractC0629d) {
        if (abstractC0629d == null) {
            return null;
        }
        int iHashCode = abstractC0629d.hashCode();
        C0788d.f9393i.put(Integer.valueOf(iHashCode), abstractC0629d);
        String strV = abstractC0629d.V();
        String strW = abstractC0629d.W();
        Long lValueOf = Long.valueOf(iHashCode);
        String str = abstractC0629d instanceof J8.I ? ((J8.I) abstractC0629d).f5754c : null;
        Pc.E e7 = new Pc.E();
        if (strV == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        e7.f9314a = strV;
        if (strW == null) {
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        e7.f9315b = strW;
        e7.f9316c = lValueOf;
        e7.f9317d = str;
        return e7;
    }

    public static Pc.M i0(K8.T t10) {
        K8.Q q4 = t10.f6612b;
        Pc.D d3 = null;
        if (q4 != null) {
            Boolean boolValueOf = Boolean.valueOf(q4.f6608d);
            String str = q4.f6605a;
            boolean zEquals = "github.com".equals(str);
            C4412e c4412e = q4.f6607c;
            String str2 = zEquals ? (String) c4412e.get(AppLovinEventTypes.USER_LOGGED_IN) : "twitter.com".equals(str) ? (String) c4412e.get("screen_name") : null;
            Pc.D d5 = new Pc.D();
            d5.f9309a = boolValueOf;
            d5.f9310b = str;
            d5.f9311c = str2;
            d5.f9312d = null;
            d5.f9313e = c4412e;
            d3 = d5;
        }
        Pc.E eH0 = h0(t10.f6613c);
        Pc.N nJ0 = j0(t10.f6611a);
        Pc.M m10 = new Pc.M();
        m10.f9346a = nJ0;
        m10.f9347b = d3;
        m10.f9348c = eH0;
        return m10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Pc.N j0(J8.AbstractC0640o r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.H.j0(J8.o):Pc.N");
    }

    public static Pc.G k0(C0641p c0641p) {
        String str = c0641p.f5812a;
        Map map = (Map) c0641p.f5813b.get("firebase");
        String str2 = map != null ? (String) map.get("sign_in_provider") : null;
        Integer num = (Integer) c0641p.f5813b.get("auth_time");
        Long lValueOf = Long.valueOf((num == null ? 0L : num.longValue()) * 1000);
        Integer num2 = (Integer) c0641p.f5813b.get("exp");
        Long lValueOf2 = Long.valueOf((num2 == null ? 0L : num2.longValue()) * 1000);
        Integer num3 = (Integer) c0641p.f5813b.get("iat");
        Long lValueOf3 = Long.valueOf((num3 != null ? num3.longValue() : 0L) * 1000);
        Map map2 = c0641p.f5813b;
        Map map3 = (Map) map2.get("firebase");
        String str3 = map3 != null ? (String) map3.get("sign_in_second_factor") : null;
        Pc.G g9 = new Pc.G();
        g9.f9323a = str;
        g9.f9324b = lValueOf2;
        g9.f9325c = lValueOf;
        g9.f9326d = lValueOf3;
        g9.f9327e = str2;
        g9.f9328f = map2;
        g9.f9329g = str3;
        return g9;
    }

    public static final List l0(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        C2755b c2755bT = AbstractC3935e.t();
        while (cursor.moveToNext()) {
            int i5 = cursor.getInt(columnIndex);
            int i10 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            AbstractC3340k.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            AbstractC3340k.d(string2, "cursor.getString(toColumnIndex)");
            c2755bT.add(new C3485c(i5, i10, string, string2));
        }
        return ff.o.L0(AbstractC3935e.l(c2755bT));
    }

    public static final C3486d m0(InterfaceC3644a interfaceC3644a, String str, boolean z2) throws IOException {
        Cursor cursorK = interfaceC3644a.K("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorK.getColumnIndex("seqno");
            int columnIndex2 = cursorK.getColumnIndex("cid");
            int columnIndex3 = cursorK.getColumnIndex(MediationMetaData.KEY_NAME);
            int columnIndex4 = cursorK.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorK.moveToNext()) {
                    if (cursorK.getInt(columnIndex2) >= 0) {
                        int i5 = cursorK.getInt(columnIndex);
                        String columnName = cursorK.getString(columnIndex3);
                        String str2 = cursorK.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i5);
                        AbstractC3340k.d(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i5), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                AbstractC3340k.d(collectionValues, "columnsMap.values");
                List listS0 = ff.o.S0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                AbstractC3340k.d(collectionValues2, "ordersMap.values");
                C3486d c3486d = new C3486d(str, z2, listS0, ff.o.S0(collectionValues2));
                cursorK.close();
                return c3486d;
            }
            cursorK.close();
            return null;
        } finally {
        }
    }

    public static final KSerializer n0(C4658a c4658a, KType type) {
        AbstractC3340k.e(c4658a, "<this>");
        AbstractC3340k.e(type, "type");
        KSerializer kSerializerG = gc.b.G(c4658a, type, true);
        if (kSerializerG != null) {
            return kSerializerG;
        }
        KClass kClassI = AbstractC1240b0.i(type);
        AbstractC3340k.e(kClassI, "<this>");
        AbstractC1240b0.j(kClassI);
        throw null;
    }

    public static final KSerializer o0(KClass kClass) {
        AbstractC3340k.e(kClass, "<this>");
        KSerializer kSerializerD = AbstractC1240b0.d(kClass, new KSerializer[0]);
        return kSerializerD == null ? (KSerializer) Wf.i0.f15607a.get(kClass) : kSerializerD;
    }

    public static final ArrayList p0(C4658a c4658a, List typeArguments, boolean z2) {
        AbstractC3340k.e(c4658a, "<this>");
        AbstractC3340k.e(typeArguments, "typeArguments");
        if (z2) {
            List list = typeArguments;
            ArrayList arrayList = new ArrayList(ff.p.a0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(n0(c4658a, (KType) it.next()));
            }
            return arrayList;
        }
        List<KType> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(ff.p.a0(list2, 10));
        for (KType type : list2) {
            AbstractC3340k.e(type, "type");
            KSerializer kSerializerG = gc.b.G(c4658a, type, false);
            if (kSerializerG == null) {
                return null;
            }
            arrayList2.add(kSerializerG);
        }
        return arrayList2;
    }

    public static void t0(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z2);
        } else if (f28916a) {
            try {
                viewGroup.suppressLayout(z2);
            } catch (NoSuchMethodError unused) {
                f28916a = false;
            }
        }
    }

    public static final void u0(p0.f fVar, long j8, tf.l lVar, boolean z2) {
        C0441b c0441b = fVar.f43134b;
        MotionEvent motionEvent = c0441b != null ? (MotionEvent) ((Y2.B) c0441b.f3292d).f16384c : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z2) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-C2384c.b(j8), -C2384c.c(j8));
        lVar.invoke(motionEvent);
        motionEvent.offsetLocation(C2384c.b(j8), C2384c.c(j8));
        motionEvent.setAction(action);
    }

    public static ArrayList v0(DisplayManager displayManager) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            Field field = null;
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(next));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e7) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e7);
            return new ArrayList();
        }
    }

    public static C0575n w0(ByteBuffer byteBuffer, zbnx zbnxVar) {
        int i5;
        byte[] bArrArray = byteBuffer.array();
        int iZbc = zbnxVar.zbc();
        int i10 = 1;
        if (iZbc != 1) {
            if (iZbc == 2) {
                i5 = 3;
            } else if (iZbc == 3) {
                i5 = 2;
            }
            return new C0575n(bArrArray, 1000 * zbnxVar.zbe(), new zbcr(zbnxVar.zbd(), zbnxVar.zba()), i5);
        }
        i10 = 4;
        i5 = i10;
        return new C0575n(bArrArray, 1000 * zbnxVar.zbe(), new zbcr(zbnxVar.zbd(), zbnxVar.zba()), i5);
    }

    public boolean A(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return true;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C(int i5) {
        T(Integer.valueOf(i5));
    }

    @Override // Vf.b
    public void D(SerialDescriptor descriptor, int i5, double d3) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        e(d3);
    }

    @Override // Vf.b
    public void E(SerialDescriptor descriptor, int i5, long j8) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        o(j8);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void F(String value) {
        AbstractC3340k.e(value, "value");
        T(value);
    }

    public void S(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
    }

    public void T(Object value) {
        AbstractC3340k.e(value, "value");
        StringBuilder sb2 = new StringBuilder("Non-serializable ");
        Class<?> cls = value.getClass();
        kotlin.jvm.internal.I i5 = kotlin.jvm.internal.H.f39741a;
        sb2.append(i5.getOrCreateKotlinClass(cls));
        sb2.append(" is not supported by ");
        sb2.append(i5.getOrCreateKotlinClass(getClass()));
        sb2.append(" encoder");
        throw new Sf.f(sb2.toString());
    }

    public abstract void Z();

    @Override // kotlinx.serialization.encoding.Encoder
    public Vf.b b(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        return this;
    }

    public void c(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void e(double d3) {
        T(Double.valueOf(d3));
    }

    @Override // Vf.b
    public void f(SerialDescriptor descriptor, int i5, KSerializer serializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(serializer, "serializer");
        S(descriptor, i5);
        n(serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void g(byte b5) {
        T(Byte.valueOf(b5));
    }

    @Override // Vf.b
    public void h(C1248f0 descriptor, int i5, short s10) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        q(s10);
    }

    public void i(SerialDescriptor descriptor, int i5, KSerializer serializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(serializer, "serializer");
        S(descriptor, i5);
        M6.b(this, serializer, obj);
    }

    @Override // Vf.b
    public void j(C1248f0 descriptor, int i5, byte b5) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        g(b5);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Vf.b k(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return b(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void l(SerialDescriptor enumDescriptor, int i5) {
        AbstractC3340k.e(enumDescriptor, "enumDescriptor");
        T(Integer.valueOf(i5));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public Encoder m(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void n(KSerializer serializer, Object obj) {
        AbstractC3340k.e(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void o(long j8) {
        T(Long.valueOf(j8));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void p() {
        throw new Sf.f("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void q(short s10) {
        T(Short.valueOf(s10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void r(boolean z2) {
        T(Boolean.valueOf(z2));
    }

    public abstract void r0(boolean z2);

    @Override // Vf.b
    public void s(SerialDescriptor descriptor, int i5, float f10) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        u(f10);
    }

    public abstract void s0();

    @Override // Vf.b
    public void t(int i5, int i10, SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        C(i10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void u(float f10) {
        T(Float.valueOf(f10));
    }

    @Override // Vf.b
    public Encoder v(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        return m(descriptor.g(i5));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void w(char c10) {
        T(Character.valueOf(c10));
    }

    @Override // Vf.b
    public void x(SerialDescriptor descriptor, int i5, boolean z2) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        r(z2);
    }

    public Task x0(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        boolean z2;
        C0690b c0690b = new C0690b(4);
        c0690b.f6625b = this;
        C6.l lVarN = firebaseAuth.n();
        if (lVarN != null) {
            synchronized (lVarN.f1844a) {
                try {
                    zzagm zzagmVar = (zzagm) lVarN.f1846c;
                    z2 = zzagmVar != null && zzagmVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z2) {
                return lVarN.H(str, Boolean.FALSE, recaptchaAction).continueWithTask(c0690b).continueWithTask(new W9.u(str, lVarN, recaptchaAction, c0690b));
            }
        }
        Task taskY0 = y0(null);
        Za za2 = new Za();
        za2.f13915a = recaptchaAction;
        za2.f13916b = firebaseAuth;
        za2.f13917c = str;
        za2.f13918d = c0690b;
        return taskY0.continueWithTask(za2);
    }

    @Override // Vf.b
    public void y(SerialDescriptor descriptor, int i5, String value) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(value, "value");
        S(descriptor, i5);
        F(value);
    }

    public abstract Task y0(String str);

    @Override // Vf.b
    public void z(C1248f0 descriptor, int i5, char c10) {
        AbstractC3340k.e(descriptor, "descriptor");
        S(descriptor, i5);
        w(c10);
    }

    public void q0(boolean z2) {
    }
}
