package gc;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import E.AbstractC0426p;
import E.C0427q;
import E.I;
import E5.Q;
import Ef.H;
import Fe.g;
import Hf.e0;
import J8.A;
import J8.AbstractC0629d;
import J8.C0631f;
import J8.D;
import J8.q;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import N1.C0764m;
import N1.C0765n;
import S3.e;
import S3.s;
import V.d;
import Va.M6;
import Va.X7;
import W.c;
import W.f;
import W.i;
import Z.k;
import ac.C1346a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import ba.C1521a;
import c5.AbstractC1558a;
import com.applovin.shadow.okio.Segment;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import com.moloco.sdk.service_locator.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2113j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2114k;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.core.device.MimeTypes;
import com.wynauto.wyn.R;
import d2.m;
import d2.n;
import d2.v;
import e0.AbstractC2461m;
import e0.C2445H;
import e0.C2446I;
import e0.y;
import ef.C2515C;
import ff.AbstractC2641B;
import i0.C;
import i0.C2827e;
import i0.E;
import i0.F;
import i0.G;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import jf.InterfaceC3108h;
import k1.S;
import k3.C3170b;
import k3.C3187s;
import ka.AbstractC3256n;
import kd.C3306b;
import kd.C3313i;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KFunction;
import o3.InterfaceC3644a;
import p0.w;
import p3.C3761b;
import q.r;
import r0.InterfaceC3909n;
import r7.AbstractC3935e;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import tf.l;
import tf.p;
import tf.t;
import u0.InterfaceC4193p0;
import u0.M;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static fc.b f35862a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Context f35863b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Field f35864c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f35865d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f35866e = true;

    public static boolean A() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    public static void B(String str) {
        if (A()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e7) {
                throw new Error(AbstractC0279p0.l("FFmpegKit failed to start on ", "brand: " + Build.BRAND + ", model: " + Build.MODEL + ", device: " + Build.DEVICE + ", api level: " + Build.VERSION.SDK_INT + ", abis: " + FFmpegKitConfig.a(Build.SUPPORTED_ABIS) + ", 32bit abis: " + FFmpegKitConfig.a(Build.SUPPORTED_32_BIT_ABIS) + ", 64bit abis: " + FFmpegKitConfig.a(Build.SUPPORTED_64_BIT_ABIS), "."), e7);
            }
        }
    }

    public static s C(String str) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        AbstractC1732v.f(str);
        AbstractC1732v.i(firebaseAuth);
        if (!"facebook.com".equals(str) || zzafb.zza(firebaseAuth.f27283a)) {
            return new s(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static void D(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final Object E(Object[] objArr, e eVar, tf.a aVar, C0740o c0740o, int i5, int i10) {
        Object[] objArr2;
        Object obj;
        Object objC;
        if ((i10 & 2) != 0) {
            eVar = i.f14934a;
        }
        e eVar2 = eVar;
        int i11 = c0740o.f7844P;
        tg.b.t(36);
        String string = Integer.toString(i11, 36);
        AbstractC3340k.d(string, "toString(this, checkRadix(radix))");
        c cVar = (c) c0740o.j(f.f14931a);
        Object objF = c0740o.F();
        Object obj2 = C0732k.f7800a;
        if (objF == obj2) {
            Object objInvoke = (cVar == null || (objC = cVar.c(string)) == null) ? null : ((l) eVar2.f10942c).invoke(objC);
            if (objInvoke == null) {
                objInvoke = aVar.invoke();
            }
            objArr2 = objArr;
            Object bVar = new W.b(eVar2, cVar, string, objInvoke, objArr2);
            c0740o.U(bVar);
            objF = bVar;
        } else {
            objArr2 = objArr;
        }
        W.b bVar2 = (W.b) objF;
        Object objInvoke2 = Arrays.equals(objArr2, bVar2.f14925e) ? bVar2.f14924d : null;
        if (objInvoke2 == null) {
            objInvoke2 = aVar.invoke();
        }
        boolean zG = c0740o.g(bVar2) | (((i5 & 112) ^ 48) > 32 && c0740o.g(eVar2)) | c0740o.g(cVar) | c0740o.e(string) | c0740o.g(objInvoke2) | c0740o.g(objArr2);
        Object objF2 = c0740o.F();
        if (zG || objF2 == obj2) {
            Object obj3 = objInvoke2;
            Object[] objArr3 = objArr2;
            obj = obj3;
            Object aVar2 = new W.a(bVar2, eVar2, cVar, string, obj, objArr3);
            c0740o.U(aVar2);
            objF2 = aVar2;
        } else {
            obj = objInvoke2;
        }
        C0718d.g((tf.a) objF2, c0740o);
        return obj;
    }

    public static final I F(float f10, int i5, android.support.v4.media.session.b bVar, tf.s sVar) {
        AbstractC3256n.m(i5, AdUnitActivity.EXTRA_ORIENTATION);
        AbstractC3256n.m(1, "crossAxisSize");
        return new I(f10, i5, bVar, sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer G(za.C4658a r5, kotlin.reflect.KType r6, boolean r7) {
        /*
            kotlin.reflect.KClass r0 = Wf.AbstractC1240b0.i(r6)
            boolean r1 = r6.isMarkedNullable()
            java.util.List r6 = r6.getArguments()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ff.p.a0(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L1d:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r6.next()
            kotlin.reflect.KTypeProjection r3 = (kotlin.reflect.KTypeProjection) r3
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r3, r4)
            kotlin.reflect.KType r4 = r3.getType()
            if (r4 == 0) goto L38
            r2.add(r4)
            goto L1d
        L38:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Star projections in type arguments are not allowed, but had "
            r5.<init>(r6)
            kotlin.reflect.KType r6 = r3.getType()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L54:
            boolean r6 = r2.isEmpty()
            r3 = 0
            if (r6 == 0) goto L7a
            boolean r6 = Wf.AbstractC1240b0.h(r0)
            if (r6 == 0) goto L64
            za.C4658a.g(r5, r0)
        L64:
            Wf.m0 r6 = Sf.h.f11123a
            if (r1 != 0) goto L73
            Wf.m0 r6 = Sf.h.f11123a
            kotlinx.serialization.KSerializer r6 = r6.g(r0)
            if (r6 == 0) goto L71
            goto L9a
        L71:
            r6 = r3
            goto L9a
        L73:
            Wf.m0 r6 = Sf.h.f11124b
            kotlinx.serialization.KSerializer r6 = r6.g(r0)
            goto L9a
        L7a:
            r5.getClass()
            Wf.m0 r6 = Sf.h.f11123a
            java.lang.String r6 = "clazz"
            kotlin.jvm.internal.AbstractC3340k.e(r0, r6)
            if (r1 != 0) goto L8d
            Wf.a0 r6 = Sf.h.f11125c
            java.lang.Object r6 = r6.f(r0, r2)
            goto L93
        L8d:
            Wf.a0 r6 = Sf.h.f11126d
            java.lang.Object r6 = r6.f(r0, r2)
        L93:
            boolean r4 = r6 instanceof ef.C2529m
            if (r4 == 0) goto L98
            r6 = r3
        L98:
            kotlinx.serialization.KSerializer r6 = (kotlinx.serialization.KSerializer) r6
        L9a:
            if (r6 == 0) goto L9d
            return r6
        L9d:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto Lbb
            kotlinx.serialization.KSerializer r6 = com.moloco.sdk.internal.publisher.H.o0(r0)
            if (r6 != 0) goto Lde
            za.C4658a.g(r5, r0)
            boolean r5 = Wf.AbstractC1240b0.h(r0)
            if (r5 == 0) goto Lb9
            Sf.d r5 = new Sf.d
            r5.<init>(r0)
        Lb7:
            r6 = r5
            goto Lde
        Lb9:
            r6 = r3
            goto Lde
        Lbb:
            java.util.ArrayList r6 = com.moloco.sdk.internal.publisher.H.p0(r5, r2, r7)
            if (r6 != 0) goto Lc2
            goto Le8
        Lc2:
            Jd.E r7 = new Jd.E
            r4 = 1
            r7.<init>(r2, r4)
            kotlinx.serialization.KSerializer r7 = com.moloco.sdk.internal.publisher.H.g0(r0, r6, r7)
            if (r7 != 0) goto Ldd
            r5.f(r0, r6)
            boolean r5 = Wf.AbstractC1240b0.h(r0)
            if (r5 == 0) goto Lb9
            Sf.d r5 = new Sf.d
            r5.<init>(r0)
            goto Lb7
        Ldd:
            r6 = r7
        Lde:
            if (r6 == 0) goto Le8
            if (r1 == 0) goto Le7
            kotlinx.serialization.KSerializer r5 = ff.AbstractC2641B.u(r6)
            return r5
        Le7:
            return r6
        Le8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.G(za.a, kotlin.reflect.KType, boolean):kotlinx.serialization.KSerializer");
    }

    public static void H(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = S.f38779a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z2;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public static void I(EditText editText, int i5) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Context context = editText.getContext();
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{AbstractC4345a.D(context, R.attr.colorControlNormal, 0), AbstractC4345a.D(context, R.attr.colorControlNormal, 0), i5});
        if (editText instanceof r) {
            ((r) editText).setSupportBackgroundTintList(colorStateList);
        } else {
            editText.setBackgroundTintList(colorStateList);
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i10 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {Y0.e.getDrawable(editText.getContext(), i10), Y0.e.getDrawable(editText.getContext(), i10)};
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i5, mode);
            drawableArr[1].setColorFilter(i5, mode);
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e7) {
            Log.d("MDTintHelper", "Device issue with cursor tinting: " + e7.getMessage());
            e7.printStackTrace();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void L(InterfaceC4269f binaryMessenger, final C3313i c3313i) {
        C8.i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3313i == null || (iVar = c3313i.f39663a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel");
        if (c3313i != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.w
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3313i c3313i2 = c3313i;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c3313i2.getClass();
                                clientCertRequest.cancel();
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c3313i2.getClass();
                                clientCertRequest2.ignore();
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c3313i2.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore");
        if (c3313i != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.w
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3313i c3313i2 = c3313i;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c3313i2.getClass();
                                clientCertRequest.cancel();
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c3313i2.getClass();
                                clientCertRequest2.ignore();
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c3313i2.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed");
        if (c3313i == null) {
            x74.n(null);
        } else {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.w
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    C3313i c3313i2 = c3313i;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c3313i2.getClass();
                                clientCertRequest.cancel();
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c3313i2.getClass();
                                clientCertRequest2.ignore();
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c3313i2.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listD3 = AbstractC3935e.C(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            break;
                    }
                }
            });
        }
    }

    public static HashMap M(Location location) {
        if (location == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("latitude", Double.valueOf(location.getLatitude()));
        map.put("longitude", Double.valueOf(location.getLongitude()));
        map.put("timestamp", Long.valueOf(location.getTime()));
        int i5 = Build.VERSION.SDK_INT;
        map.put("is_mocked", Boolean.valueOf(i5 >= 31 ? location.isMock() : location.isFromMockProvider()));
        if (location.hasAltitude()) {
            map.put("altitude", Double.valueOf(location.getAltitude()));
        }
        if (i5 >= 26 && location.hasVerticalAccuracy()) {
            map.put("altitude_accuracy", Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasAccuracy()) {
            map.put("accuracy", Double.valueOf(location.getAccuracy()));
        }
        if (location.hasBearing()) {
            map.put("heading", Double.valueOf(location.getBearing()));
        }
        if (i5 >= 26 && location.hasBearingAccuracy()) {
            map.put("heading_accuracy", Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (location.hasSpeed()) {
            map.put("speed", Double.valueOf(location.getSpeed()));
        }
        if (i5 >= 26 && location.hasSpeedAccuracy()) {
            map.put("speed_accuracy", Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.getExtras() != null) {
            if (location.getExtras().containsKey("geolocator_mslAltitude")) {
                map.put("altitude", Double.valueOf(location.getExtras().getDouble("geolocator_mslAltitude")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatelliteCount")) {
                map.put("gnss_satellite_count", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatelliteCount")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatellitesUsedInFix")) {
                map.put("gnss_satellites_used_in_fix", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatellitesUsedInFix")));
            }
            if (i5 >= 34 && location.hasMslAltitude()) {
                map.put("altitude", Double.valueOf(location.getMslAltitudeMeters()));
                if (location.hasMslAltitudeAccuracy()) {
                    map.put("altitude_accuracy", Float.valueOf(location.getMslAltitudeAccuracyMeters()));
                }
            }
        }
        return map;
    }

    public static ArrayList N(Exception exc) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(exc.toString());
        arrayList.add(exc.getClass().getSimpleName());
        arrayList.add("Cause: " + exc.getCause() + ", Stacktrace: " + Log.getStackTraceString(exc));
        return arrayList;
    }

    public static void O(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static zzahr P(AbstractC0629d abstractC0629d, String str) {
        if (J8.r.class.isAssignableFrom(abstractC0629d.getClass())) {
            J8.r rVar = (J8.r) abstractC0629d;
            return new zzahr(rVar.f5815a, rVar.f5816b, "google.com", null, null, null, str, null, null);
        }
        if (C0631f.class.isAssignableFrom(abstractC0629d.getClass())) {
            return new zzahr(null, ((C0631f) abstractC0629d).f5803a, "facebook.com", null, null, null, str, null, null);
        }
        if (D.class.isAssignableFrom(abstractC0629d.getClass())) {
            D d3 = (D) abstractC0629d;
            return new zzahr(null, d3.f5738a, "twitter.com", null, d3.f5739b, null, str, null, null);
        }
        if (q.class.isAssignableFrom(abstractC0629d.getClass())) {
            return new zzahr(null, ((q) abstractC0629d).f5814a, "github.com", null, null, null, str, null, null);
        }
        if (A.class.isAssignableFrom(abstractC0629d.getClass())) {
            return new zzahr(null, null, "playgames.google.com", null, null, ((A) abstractC0629d).f5730a, str, null, null);
        }
        if (!J8.I.class.isAssignableFrom(abstractC0629d.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        J8.I i5 = (J8.I) abstractC0629d;
        zzahr zzahrVar = i5.f5755d;
        if (zzahrVar != null) {
            return zzahrVar;
        }
        return new zzahr(i5.f5753b, i5.f5754c, i5.f5752a, null, i5.f5757f, null, str, i5.f5756e, i5.f5758g);
    }

    public static final void a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, d dVar, C0740o c0740o, int i5) {
        c0740o.N(-213417674);
        c0740o.e(str);
        c0740o.b(f10);
        c0740o.b(f11);
        c0740o.b(f12);
        c0740o.b(f13);
        c0740o.b(f14);
        c0740o.b(f15);
        c0740o.b(f16);
        c0740o.K();
        if ((i5 & 1) != 0 && !c0740o.w()) {
            c0740o.I();
        }
        c0740o.q();
        C2827e c2827e = C2827e.f36619l;
        c0740o.M(-548224868);
        if (!(c0740o.f7845a instanceof C)) {
            C0718d.C();
            throw null;
        }
        c0740o.J(125, null, 1, null);
        c0740o.f7860q = true;
        if (c0740o.f7843O) {
            c0740o.k(c2827e);
        } else {
            c0740o.X();
        }
        C0718d.M(c0740o, str, E.f36481j);
        C0718d.M(c0740o, Float.valueOf(f10), E.k);
        C0718d.M(c0740o, Float.valueOf(f11), E.f36482l);
        C0718d.M(c0740o, Float.valueOf(f12), E.f36483m);
        C0718d.M(c0740o, Float.valueOf(f13), E.f36484n);
        C0718d.M(c0740o, Float.valueOf(f14), E.f36485o);
        C0718d.M(c0740o, Float.valueOf(f15), E.f36486p);
        C0718d.M(c0740o, Float.valueOf(f16), E.f36487q);
        C0718d.M(c0740o, list, E.f36488r);
        c0740o.M(-983907633);
        dVar.invoke(c0740o, 6);
        c0740o.p(false);
        c0740o.p(true);
        c0740o.p(false);
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new F(str, f10, f11, f12, f13, f14, f15, f16, list, dVar, i5);
    }

    public static final void b(List pathData, int i5, String str, AbstractC2461m abstractC2461m, float f10, AbstractC2461m abstractC2461m2, float f11, float f12, int i10, int i11, float f13, float f14, float f15, float f16, C0740o c0740o, int i12) {
        AbstractC3340k.e(pathData, "pathData");
        c0740o.N(-1478270750);
        c0740o.M(1886828752);
        if (!(c0740o.f7845a instanceof C)) {
            C0718d.C();
            throw null;
        }
        c0740o.J(125, null, 1, null);
        c0740o.f7860q = true;
        int i13 = 0;
        if (c0740o.f7843O) {
            c0740o.k(new C2827e(i13, 3));
        } else {
            c0740o.X();
        }
        C0718d.M(c0740o, str, E.f36494x);
        C0718d.M(c0740o, pathData, E.f36495y);
        C0718d.M(c0740o, new y(i5), E.f36496z);
        C0718d.M(c0740o, abstractC2461m, E.f36475A);
        C0718d.M(c0740o, Float.valueOf(f10), E.f36476B);
        C0718d.M(c0740o, abstractC2461m2, E.f36477C);
        C0718d.M(c0740o, Float.valueOf(f11), E.f36478D);
        C0718d.M(c0740o, Float.valueOf(f12), E.f36479E);
        C0718d.M(c0740o, new C2446I(i11), E.f36480F);
        C0718d.M(c0740o, new C2445H(i10), E.f36489s);
        C0718d.M(c0740o, Float.valueOf(f13), E.f36490t);
        C0718d.M(c0740o, Float.valueOf(f14), E.f36491u);
        C0718d.M(c0740o, Float.valueOf(f15), E.f36492v);
        C0718d.M(c0740o, Float.valueOf(f16), E.f36493w);
        c0740o.p(true);
        c0740o.p(false);
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new G(pathData, i5, str, abstractC2461m, f10, abstractC2461m2, f11, f12, i10, i11, f13, f14, f15, f16, i12);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        AbstractC3340k.e(dVar, "<this>");
        switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.f30115a[dVar.ordinal()]) {
            case 1:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.k;
            case 2:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30111l;
            case 3:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30112m;
            case 4:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30113n;
            case 5:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30105e;
            case 6:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.k;
            case 7:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30111l;
            case 8:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30112m;
            case 9:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30113n;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return dVar;
            default:
                throw new Q((byte) 0, 9);
        }
    }

    public static final void d(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar, final tf.a aVar, final t tVar, final k kVar, C0740o c0740o, final int i5) {
        P p10;
        boolean z2;
        c0740o.N(-595771397);
        int i10 = (c0740o.e(cVar) ? 4 : 2) | i5;
        if ((i5 & 48) == 0) {
            i10 |= c0740o.e(aVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i10 |= c0740o.e(tVar) ? 256 : 128;
        }
        if ((i10 & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
        } else {
            Z.i iVar = Z.i.f16922a;
            C2515C c2515c = C2515C.f34653a;
            c0740o.M(-602684476);
            boolean zE = c0740o.e(cVar);
            Object objF = c0740o.F();
            P p11 = C0732k.f7800a;
            if (zE || objF == p11) {
                objF = new C2113j(cVar, null);
                c0740o.U(objF);
            }
            c0740o.p(false);
            C0718d.d(c0740o, c2515c, (p) objF);
            c0740o.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(Z.a.f16900a, false, c0740o);
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(M.f46143e);
            L0.i iVar2 = (L0.i) c0740o.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            d dVarY = S3.f.y(kVar);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar2, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(-2137368960);
            C0427q c0427q = C0427q.f2765a;
            k kVarJ = g.J(iVar, false, new K.s("DECContainer", 1));
            c0740o.M(491790676);
            boolean zE2 = c0740o.e(aVar) | c0740o.e(cVar);
            Object objF2 = c0740o.F();
            if (zE2 || objF2 == p11) {
                objF2 = new C2114k(aVar, cVar, null);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            k kVarA = w.a(kVarJ, c2515c, (p) objF2);
            c0740o.M(491799591);
            Object objF3 = c0740o.F();
            if (objF3 == p11) {
                objF3 = new h(14);
                c0740o.U(objF3);
            }
            c0740o.p(false);
            B.a(kVarA, cVar.f31976h, (tf.a) objF3, cVar.f31977i, c0740o, 384);
            c0740o.M(491803165);
            if (tVar == null) {
                z2 = false;
            } else {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) C0718d.u((e0) cVar.f31978j.f10443h, c0740o, 0).getValue();
                c0740o.M(1423888860);
                boolean zE3 = c0740o.e(cVar);
                Object objF4 = c0740o.F();
                if (zE3 || objF4 == p11) {
                    p10 = p11;
                    z2 = false;
                    S8.d dVar = new S8.d(0, cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c.class, "onVastPrivacyIconDisplayed", "onVastPrivacyIconDisplayed()V", 0, 15);
                    c0740o.U(dVar);
                    objF4 = dVar;
                } else {
                    z2 = false;
                    p10 = p11;
                }
                KFunction kFunction = (KFunction) objF4;
                c0740o.p(z2);
                c0740o.M(1423890616);
                boolean zE4 = c0740o.e(cVar);
                Object objF5 = c0740o.F();
                if (zE4 || objF5 == p10) {
                    S8.d dVar2 = new S8.d(0, cVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c.class, "onVastPrivacyIconClick", "onVastPrivacyIconClick()V", 0, 16);
                    c0740o.U(dVar2);
                    objF5 = dVar2;
                }
                c0740o.p(z2);
                tVar.invoke(c0427q, sVar, kFunction, (KFunction) objF5, c0740o, 6);
            }
            wg.b.e(c0740o, z2, z2, z2, true);
            c0740o.p(z2);
            c0740o.p(z2);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i11 = i5 | 1;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar2 = cVar;
                    tf.t tVar2 = tVar;
                    Z.k kVar2 = kVar;
                    gc.b.d(cVar2, aVar, tVar2, kVar2, (C0740o) obj, i11);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        AbstractC3340k.e(dVar, "<this>");
        switch (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.f30115a[dVar.ordinal()]) {
            case 1:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30106f;
            case 2:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30107g;
            case 3:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30108h;
            case 4:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30109i;
            case 5:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30105e;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return dVar;
            case 11:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30106f;
            case 12:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30107g;
            case 13:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30108h;
            case 14:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30109i;
            default:
                throw new Q((byte) 0, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(Gd.a r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof Gd.d
            if (r0 == 0) goto L13
            r0 = r6
            Gd.d r0 = (Gd.d) r0
            int r1 = r0.f4724b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4724b = r1
            goto L18
        L13:
            Gd.d r0 = new Gd.d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4723a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f4724b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r6)
            xd.c r5 = r5.c()
            kotlin.jvm.internal.I r6 = kotlin.jvm.internal.H.f39741a
            java.lang.Class<io.ktor.utils.io.t> r2 = io.ktor.utils.io.InterfaceC2886t.class
            kotlin.reflect.KClass r6 = r6.getOrCreateKotlinClass(r2)
            kotlin.reflect.KType r2 = kotlin.jvm.internal.H.b(r2)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r2 = 0
        L44:
            Sd.a r4 = new Sd.a
            r4.<init>(r6, r2)
            r0.f4724b = r3
            java.lang.Object r6 = r5.a(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            if (r6 == 0) goto L57
            io.ktor.utils.io.t r6 = (io.ktor.utils.io.InterfaceC2886t) r6
            return r6
        L57:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.g(Gd.a, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(Gd.a r5, java.nio.charset.Charset r6, lf.AbstractC3464c r7) {
        /*
            boolean r0 = r7 instanceof Gd.e
            if (r0 == 0) goto L13
            r0 = r7
            Gd.e r0 = (Gd.e) r0
            int r1 = r0.f4727c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4727c = r1
            goto L18
        L13:
            Gd.e r0 = new Gd.e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4726b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f4727c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.nio.charset.CharsetDecoder r5 = r0.f4725a
            Fe.e.U(r7)
            goto L63
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r7)
            java.nio.charset.Charset r7 = ff.AbstractC2641B.f(r5)
            if (r7 != 0) goto L3b
            goto L3c
        L3b:
            r6 = r7
        L3c:
            java.nio.charset.CharsetDecoder r6 = r6.newDecoder()
            xd.c r5 = r5.c()
            kotlin.jvm.internal.I r7 = kotlin.jvm.internal.H.f39741a
            java.lang.Class<Pf.i> r2 = Pf.i.class
            kotlin.reflect.KClass r7 = r7.getOrCreateKotlinClass(r2)
            kotlin.reflect.KType r2 = kotlin.jvm.internal.H.b(r2)     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
            r2 = 0
        L52:
            Sd.a r4 = new Sd.a
            r4.<init>(r7, r2)
            r0.f4725a = r6
            r0.f4727c = r3
            java.lang.Object r7 = r5.a(r4, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            r5 = r6
        L63:
            if (r7 == 0) goto L6f
            Pf.i r7 = (Pf.i) r7
            kotlin.jvm.internal.AbstractC3340k.b(r5)
            java.lang.String r5 = r7.AbstractC3935e.u(r5, r7)
            return r5
        L6f:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.io.Source"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.h(Gd.a, java.nio.charset.Charset, lf.c):java.lang.Object");
    }

    public static void i(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void j(Object obj) {
        k(obj, "Argument must not be null");
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void l(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static ImageView.ScaleType m(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 5 ? i5 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] n(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            jArr[i5] = iArr[i5];
        }
        return jArr;
    }

    public static void o(B1.b bVar, B1.c cVar, int i5) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        while (i5 > 0) {
            int iMin = Math.min(i5, Segment.SIZE);
            int i10 = bVar.read(bArr, 0, iMin);
            if (i10 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i5 -= i10;
            cVar.write(bArr, 0, i10);
        }
    }

    public static void p(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i5 = inputStream.read(bArr);
            if (i5 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i5);
            }
        }
    }

    public static int q(boolean z2) {
        List supportedPerformancePoints;
        try {
            C0764m c0764m = new C0764m();
            c0764m.f8194m = N1.C.m(MimeTypes.VIDEO_H264);
            C0765n c0765n = new C0765n(c0764m);
            if (c0765n.f8232n != null) {
                l8.e0 e0VarG = v.g(d2.h.f33990b, c0765n, z2, false);
                for (int i5 = 0; i5 < e0VarG.f40103d; i5++) {
                    if (((m) e0VarG.get(i5)).f33995d != null && ((m) e0VarG.get(i5)).f33995d.getVideoCapabilities() != null && (supportedPerformancePoints = ((m) e0VarG.get(i5)).f33995d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        n.e();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = n.c();
                        for (int i10 = 0; i10 < supportedPerformancePoints.size(); i10++) {
                            if (AbstractC1558a.g(supportedPerformancePoints.get(i10)).covers(performancePointC)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (d2.s unused) {
        }
        return 0;
    }

    public static final Object r(MetricsDb_Impl metricsDb_Impl, Callable callable, com.moloco.sdk.acm.db.c cVar) {
        InterfaceC3108h interfaceC3108h;
        InterfaceC3644a interfaceC3644a = metricsDb_Impl.f39223a;
        if (interfaceC3644a != null && interfaceC3644a.isOpen() && metricsDb_Impl.g().I().O()) {
            return callable.call();
        }
        C3187s c3187s = (C3187s) cVar.getContext().get(C3187s.f39254c);
        if (c3187s != null) {
            interfaceC3108h = c3187s.f39255a;
        } else {
            Map map = metricsDb_Impl.k;
            Object objR = map.get("TransactionDispatcher");
            if (objR == null) {
                T3.m mVar = metricsDb_Impl.f39225c;
                if (mVar == null) {
                    AbstractC3340k.m("internalTransactionExecutor");
                    throw null;
                }
                objR = H.r(mVar);
                map.put("TransactionDispatcher", objR);
            }
            interfaceC3108h = (Ef.A) objR;
        }
        return H.P(interfaceC3108h, new C3170b(callable, null), cVar);
    }

    public static final String s(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static Intent t(Context context, int i5) {
        String str;
        f35862a = AbstractC2745a.a();
        fc.b bVarA = AbstractC2745a.a();
        f35862a = bVarA;
        if (bVarA != null) {
            int iF = AbstractC0213f.f(i5);
            Intent intentC = iF != 0 ? iF != 1 ? iF != 2 ? null : f35862a.c(context) : f35862a.b(context) : f35862a.a(context);
            if (intentC != null && AbstractC2641B.B(context, intentC)) {
                return intentC;
            }
            String name = b.class.getName();
            StringBuilder sb2 = new StringBuilder("INTENT NOT FOUND :");
            StringBuilder sb3 = new StringBuilder();
            if (intentC != null) {
                sb3.append("intent actions");
                sb3.append(intentC.getAction());
                sb3.append("intent conponent");
                ComponentName component = intentC.getComponent();
                if (component != null) {
                    sb3.append("ComponentName package:");
                    sb3.append(component.getPackageName());
                    sb3.append("ComponentName class:");
                    sb3.append(component.getClassName());
                } else {
                    sb3.append("ComponentName is null");
                }
            } else {
                sb3.append("intent is null");
            }
            sb2.append(sb3.toString());
            sb2.append("Actions \n");
            if (i5 == 1) {
                str = "ACTION_AUTOSTART";
            } else if (i5 == 2) {
                str = "ACTION_NOTIFICATIONS";
            } else {
                if (i5 != 3) {
                    throw null;
                }
                str = "ACTION_POWERSAVING";
            }
            sb2.append(str);
            sb2.append("SYSTEM UTILS \n");
            sb2.append(ic.d.y());
            sb2.append("DEVICE \n");
            sb2.append(f35862a.e(context));
            Log.e(name, sb2.toString());
        }
        return null;
    }

    public static final Fd.b u(Gd.a aVar) {
        AbstractC3340k.e(aVar, "<this>");
        return aVar.c().d();
    }

    public static C3761b w(C1346a refHolder, SQLiteDatabase sQLiteDatabase) {
        AbstractC3340k.e(refHolder, "refHolder");
        C3761b c3761b = (C3761b) refHolder.f17489b;
        if (c3761b != null && c3761b.f43206a.equals(sQLiteDatabase)) {
            return c3761b;
        }
        C3761b c3761b2 = new C3761b(sQLiteDatabase);
        refHolder.f17489b = c3761b2;
        return c3761b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x021e A[PHI: r23
  0x021e: PHI (r23v32 int) = 
  (r23v1 int)
  (r23v2 int)
  (r23v3 int)
  (r23v4 int)
  (r23v5 int)
  (r23v6 int)
  (r23v7 int)
  (r23v8 int)
  (r23v9 int)
  (r23v10 int)
  (r23v11 int)
  (r23v12 int)
  (r23v13 int)
  (r23v14 int)
  (r23v15 int)
  (r23v16 int)
  (r23v17 int)
  (r23v18 int)
  (r23v19 int)
  (r23v20 int)
  (r23v21 int)
  (r23v22 int)
  (r23v23 int)
  (r23v24 int)
  (r23v25 int)
  (r23v26 int)
  (r23v27 int)
  (r23v28 int)
  (r23v29 int)
  (r23v30 int)
  (r23v31 int)
  (r23v33 int)
 binds: [B:133:0x021c, B:129:0x020e, B:125:0x0201, B:121:0x01f3, B:117:0x01e5, B:113:0x01d7, B:109:0x01ca, B:105:0x01bb, B:101:0x01ac, B:97:0x019d, B:93:0x018e, B:89:0x017f, B:85:0x0170, B:81:0x0161, B:77:0x0152, B:73:0x0143, B:69:0x0134, B:65:0x0125, B:61:0x0116, B:57:0x0107, B:53:0x00f7, B:49:0x00e7, B:45:0x00d7, B:41:0x00c7, B:37:0x00b7, B:33:0x00a7, B:29:0x0097, B:25:0x0087, B:21:0x0077, B:17:0x0067, B:13:0x0057, B:9:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.b.x(java.lang.String):int");
    }

    public static int y(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static boolean z(Context context, int i5) {
        fc.b bVarA = AbstractC2745a.a();
        f35862a = bVarA;
        if (bVarA == null) {
            return false;
        }
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            return f35862a.i(context);
        }
        if (iF == 1) {
            return f35862a.j();
        }
        if (iF != 2) {
            return false;
        }
        return f35862a.k(context);
    }

    public void J(View view, float f10) {
        if (f35866e) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f35866e = false;
            }
        }
        view.setAlpha(f10);
    }

    public void K(int i5, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f35865d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f35864c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f35865d = true;
        }
        Field field = f35864c;
        if (field != null) {
            try {
                f35864c.setInt(view, i5 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public float v(View view) {
        if (f35866e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f35866e = false;
            }
        }
        return view.getAlpha();
    }
}
