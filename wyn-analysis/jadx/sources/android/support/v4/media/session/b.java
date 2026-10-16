package android.support.v4.media.session;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import B.C0318i;
import E5.o0;
import J8.C;
import J8.t;
import N.C0729i0;
import N.C0740o;
import Pc.C0803t;
import Va.M6;
import Va.X7;
import Va.Y7;
import Wf.AbstractC1240b0;
import Wf.C1248f0;
import Z.k;
import a.AbstractC1304a;
import ad.L;
import android.app.Activity;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.V;
import androidx.recyclerview.widget.j0;
import ba.C1521a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaw;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.M0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2102b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.A;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import d0.AbstractC2382a;
import d0.C2384c;
import d0.e;
import d0.f;
import e6.C2473a;
import ef.C2532p;
import f7.InterfaceC2616c;
import ff.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.w0;
import k1.x0;
import k1.y0;
import k8.AbstractC3198g;
import ka.AbstractC3230e0;
import ka.AbstractC3256n;
import kd.C3308d;
import kd.C3310f;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import lf.AbstractC3464c;
import r1.C3911a;
import r7.AbstractC3935e;
import tf.l;
import tf.p;
import u1.InterfaceC4220i;
import u6.AbstractC4256a;
import u6.v;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import x1.C4454g;
import zf.d;
import zf.g;

/* loaded from: classes.dex */
public abstract class b implements Decoder, Vf.a {
    public static final void F(k modifier, l onDraw, C0740o c0740o, int i5) {
        AbstractC3340k.e(modifier, "modifier");
        AbstractC3340k.e(onDraw, "onDraw");
        c0740o.N(-932836462);
        if ((((c0740o.e(onDraw) ? 32 : 16) | i5) & 91) == 18 && c0740o.x()) {
            c0740o.I();
        } else {
            AbstractC3230e0.b(c0740o, AbstractC3230e0.m(modifier, onDraw));
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0318i(modifier, onDraw, i5, 0);
    }

    public static final q G(C2097a ad2, G0 externalLinkHandler, Context context, com.moloco.sdk.internal.services.events.c customUserEventBuilderService, boolean z2, Boolean bool, int i5, int i10, int i11, boolean z10, boolean z11, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k kVar) {
        z zVar;
        AbstractC3340k.e(ad2, "ad");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        i iVar = ad2.f31597a;
        B b5 = new B(new h(iVar, z2, bool, i5, z10, z11, context, customUserEventBuilderService, externalLinkHandler, kVar));
        A a5 = null;
        C2102b c2102b = ad2.f31598b;
        if (c2102b != null) {
            zVar = new z(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i(c2102b, i10 < 0 ? 0 : i10, context, customUserEventBuilderService, externalLinkHandler, z2, kVar));
        } else {
            zVar = null;
        }
        z0 z0Var = ad2.f31601e;
        if (z0Var != null) {
            a5 = new A(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(z0Var, iVar.f31994g, i11 < 0 ? 0 : i11, context, customUserEventBuilderService, externalLinkHandler, kVar));
        }
        ArrayList arrayListS0 = m.s0(new D[]{b5, zVar, a5});
        Object obj = iVar.f31993f.f32009n;
        List list = ad2.f31599c;
        List list2 = ad2.f31600d;
        L0 vastTracker = M0.a();
        AbstractC3340k.e(vastTracker, "vastTracker");
        Y7 y72 = new Y7();
        y72.f13870d = list;
        y72.f13867a = obj;
        y72.f13868b = list2;
        y72.f13869c = vastTracker;
        return new q(arrayListS0, y72);
    }

    public static final String H(com.moloco.sdk.acm.i iVar) {
        AbstractC3340k.e(iVar, "<this>");
        return iVar.f28442a + ':' + iVar.f28443b;
    }

    public static final void I(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC3340k.b(decorView);
            decorView.setSystemUiVisibility(4102);
            return;
        }
        AbstractC1304a.I(activity.getWindow(), false);
        Window window = activity.getWindow();
        L l10 = new L(activity.getWindow().getDecorView());
        int i5 = Build.VERSION.SDK_INT;
        H y0Var = i5 >= 35 ? new y0(window, l10, 1) : i5 >= 30 ? new w0(window, l10, 1) : i5 >= 26 ? new x0(window, l10, 0) : new w0(window, l10, 0);
        y0Var.Z();
        y0Var.s0();
    }

    public static final boolean N(p0.k kVar) {
        AbstractC3340k.e(kVar, "<this>");
        return !kVar.f43147g && kVar.f43144d;
    }

    public static final boolean O(p0.k kVar) {
        AbstractC3340k.e(kVar, "<this>");
        return (kVar.b() || !kVar.f43147g || kVar.f43144d) ? false : true;
    }

    public static final boolean P(p0.k kVar) {
        AbstractC3340k.e(kVar, "<this>");
        return kVar.f43147g && !kVar.f43144d;
    }

    public static double Q(double d3, double d5, double d10) {
        if (d5 <= d10) {
            return d3 < d5 ? d5 : d3 > d10 ? d10 : d3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d5 + '.');
    }

    public static float R(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int S(int i5, int i10, int i11) {
        if (i10 <= i11) {
            return i5 < i10 ? i10 : i5 > i11 ? i11 : i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long T(long j8, long j10, long j11) {
        if (j10 <= j11) {
            return j8 < j10 ? j10 : j8 > j11 ? j11 : j8;
        }
        throw new IllegalArgumentException(AbstractC0213f.e(M6.u(j11, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j10, '.'));
    }

    public static long U(long j8, zf.i iVar) {
        if (iVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + iVar + '.');
        }
        long j10 = iVar.f48512a;
        if (j8 < Long.valueOf(j10).longValue()) {
            return Long.valueOf(j10).longValue();
        }
        long j11 = iVar.f48513b;
        return j8 > Long.valueOf(j11).longValue() ? Long.valueOf(j11).longValue() : j8;
    }

    public static final Comparable V(Comparable comparable, d dVar) {
        return (!d.a(comparable, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || d.a(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), comparable)) ? (!d.a(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), comparable) || d.a(comparable, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) ? comparable : Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static int W(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int X(j0 j0Var, androidx.recyclerview.widget.B b5, View view, View view2, V v2, boolean z2) {
        if (v2.getChildCount() == 0 || j0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(v2.getPosition(view) - v2.getPosition(view2)) + 1;
        }
        return Math.min(b5.l(), b5.b(view2) - b5.e(view));
    }

    public static int Y(j0 j0Var, androidx.recyclerview.widget.B b5, View view, View view2, V v2, boolean z2, boolean z10) {
        if (v2.getChildCount() == 0 || j0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (j0Var.b() - Math.max(v2.getPosition(view), v2.getPosition(view2))) - 1) : Math.max(0, Math.min(v2.getPosition(view), v2.getPosition(view2)));
        if (z2) {
            return Math.round((iMax * (Math.abs(b5.b(view2) - b5.e(view)) / (Math.abs(v2.getPosition(view) - v2.getPosition(view2)) + 1))) + (b5.k() - b5.e(view)));
        }
        return iMax;
    }

    public static int Z(j0 j0Var, androidx.recyclerview.widget.B b5, View view, View view2, V v2, boolean z2) {
        if (v2.getChildCount() == 0 || j0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return j0Var.b();
        }
        return (int) (((b5.b(view2) - b5.e(view)) / (Math.abs(v2.getPosition(view) - v2.getPosition(view2)) + 1)) * j0Var.b());
    }

    public static boolean b0(String current, String str) {
        AbstractC3340k.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i5 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i5 < current.length()) {
                    char cCharAt = current.charAt(i5);
                    int i12 = i11 + 1;
                    if (i11 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i10++;
                    }
                    i5++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return AbstractC3340k.a(Bf.k.V0(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    public static InterfaceC2616c c0(byte[] bArr, Parcelable.Creator creator) {
        AbstractC1732v.i(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        InterfaceC2616c interfaceC2616c = (InterfaceC2616c) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return interfaceC2616c;
    }

    public static final Object d0(InterfaceC4220i interfaceC4220i, p pVar, AbstractC3464c abstractC3464c) {
        return interfaceC4220i.a(new C4454g(pVar, null), abstractC3464c);
    }

    public static final void e0(Sf.d dVar, Vf.a aVar, String str) {
        AbstractC3340k.e(dVar, "<this>");
        aVar.a().getClass();
        KClass baseClass = dVar.f11119a;
        AbstractC3340k.e(baseClass, "baseClass");
        K.g(1, null);
        AbstractC1240b0.l(str, baseClass);
        throw null;
    }

    public static final void f0(Sf.d dVar, Encoder encoder, Object value) {
        AbstractC3340k.e(dVar, "<this>");
        AbstractC3340k.e(value, "value");
        encoder.a().getClass();
        KClass baseClass = dVar.f11119a;
        AbstractC3340k.e(baseClass, "baseClass");
        if (baseClass.isInstance(value)) {
            K.g(1, null);
        }
        KClass subClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(value.getClass());
        AbstractC3340k.e(subClass, "subClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        AbstractC1240b0.l(simpleName, baseClass);
        throw null;
    }

    public static final C3911a g0(View view) {
        C3911a c3911a = (C3911a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c3911a != null) {
            return c3911a;
        }
        C3911a c3911a2 = new C3911a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c3911a2);
        return c3911a2;
    }

    public static int h0(int i5) {
        int i10 = 0;
        while (i5 > 0) {
            i10++;
            i5 >>>= 1;
        }
        return i10;
    }

    public static int i0(int i5) {
        if (i5 == 1) {
            return 0;
        }
        if (i5 == 2) {
            return 1;
        }
        if (i5 == 4) {
            return 2;
        }
        if (i5 == 8) {
            return 3;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 == 32) {
            return 5;
        }
        if (i5 == 64) {
            return 6;
        }
        if (i5 == 128) {
            return 7;
        }
        if (i5 == 256) {
            return 8;
        }
        if (i5 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i5, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final boolean j0(p0.k isOutOfBounds, long j8) {
        AbstractC3340k.e(isOutOfBounds, "$this$isOutOfBounds");
        long j10 = isOutOfBounds.f43143c;
        float fB = C2384c.b(j10);
        float fC = C2384c.c(j10);
        return fB < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fB > ((float) ((int) (j8 >> 32))) || fC < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fC > ((float) ((int) (j8 & 4294967295L)));
    }

    public static final boolean k0(p0.k isOutOfBounds, long j8, long j10) {
        AbstractC3340k.e(isOutOfBounds, "$this$isOutOfBounds");
        if (isOutOfBounds.f43148h != 1) {
            return j0(isOutOfBounds, j8);
        }
        long j11 = isOutOfBounds.f43143c;
        float fB = C2384c.b(j11);
        float fC = C2384c.c(j11);
        return fB < (-f.d(j10)) || fB > f.d(j10) + ((float) ((int) (j8 >> 32))) || fC < (-f.b(j10)) || fC > f.b(j10) + ((float) ((int) (j8 & 4294967295L)));
    }

    public static final boolean l0(e eVar) {
        AbstractC3340k.e(eVar, "<this>");
        long j8 = eVar.f33945e;
        if (AbstractC2382a.b(j8) != AbstractC2382a.c(j8)) {
            return false;
        }
        float fB = AbstractC2382a.b(j8);
        long j10 = eVar.f33946f;
        if (fB != AbstractC2382a.b(j10) || AbstractC2382a.b(j8) != AbstractC2382a.c(j10)) {
            return false;
        }
        float fB2 = AbstractC2382a.b(j8);
        long j11 = eVar.f33947g;
        if (fB2 != AbstractC2382a.b(j11) || AbstractC2382a.b(j8) != AbstractC2382a.c(j11)) {
            return false;
        }
        float fB3 = AbstractC2382a.b(j8);
        long j12 = eVar.f33948h;
        return fB3 == AbstractC2382a.b(j12) && AbstractC2382a.b(j8) == AbstractC2382a.c(j12);
    }

    public static W5.c m0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = (String) list.get(i5);
            int i10 = v.f46721a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC4256a.E("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(Z5.a.c(new Y4.b(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e7) {
                    AbstractC4256a.D(e7, "VorbisUtil", "Failed to parse vorbis picture");
                }
            } else {
                arrayList.add(new C2473a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new W5.c(arrayList);
    }

    public static S3.l p0(Y4.b bVar, boolean z2, boolean z10) throws o0 {
        if (z2) {
            v0(3, bVar, false);
        }
        bVar.o((int) bVar.h(), AbstractC3198g.f39301c);
        long jH = bVar.h();
        String[] strArr = new String[(int) jH];
        for (int i5 = 0; i5 < jH; i5++) {
            strArr[i5] = bVar.o((int) bVar.h(), AbstractC3198g.f39301c);
        }
        if (z10 && (bVar.q() & 1) == 0) {
            throw o0.a("framing bit expected to be set", null);
        }
        return new S3.l(strArr);
    }

    public static void q0(InterfaceC4269f binaryMessenger, final C3308d c3308d) {
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        C2532p c2532p = C3310f.f39658b;
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, (InterfaceC4277n) c2532p.getValue(), obj, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference");
        if (c3308d != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.e
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    C3308d c3308d2 = c3308d;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l10 = (Long) obj3;
                            long jLongValue = l10.longValue();
                            try {
                                c3308d2.f();
                                Object objE = c3308d2.e(jLongValue);
                                if (objE instanceof a0) {
                                    ((a0) objE).destroy();
                                }
                                c3308d2.f39649d.remove(l10);
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD2 = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        default:
                            try {
                                c3308d2.f39647b.clear();
                                c3308d2.f39648c.clear();
                                c3308d2.f39649d.clear();
                                c3308d2.f39651f.clear();
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, (InterfaceC4277n) c2532p.getValue(), obj, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.clear");
        if (c3308d == null) {
            x73.n(null);
        } else {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.e
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    C3308d c3308d2 = c3308d;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            Long l10 = (Long) obj3;
                            long jLongValue = l10.longValue();
                            try {
                                c3308d2.f();
                                Object objE = c3308d2.e(jLongValue);
                                if (objE instanceof a0) {
                                    ((a0) objE).destroy();
                                }
                                c3308d2.f39649d.remove(l10);
                                listD2 = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD2 = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            break;
                        default:
                            try {
                                c3308d2.f39647b.clear();
                                c3308d2.f39648c.clear();
                                c3308d2.f39649d.clear();
                                c3308d2.f39651f.clear();
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            break;
                    }
                }
            });
        }
    }

    public static zf.e r0(g gVar, int i5) {
        AbstractC3340k.e(gVar, "<this>");
        boolean z2 = i5 > 0;
        Integer numValueOf = Integer.valueOf(i5);
        if (z2) {
            if (gVar.f48502c <= 0) {
                i5 = -i5;
            }
            return new zf.e(gVar.f48500a, gVar.f48501b, i5);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static Bundle s0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(b.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void t0(String str) {
        throw new IllegalArgumentException(N0.a.h("Unsupported type: ", str, ". ", AbstractC0279p0.l("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static g u0(int i5, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new g(i5, i10 - 1, 1);
        }
        g gVar = g.f48507d;
        return g.f48507d;
    }

    public static boolean v0(int i5, Y4.b bVar, boolean z2) throws o0 {
        if (bVar.a() < 7) {
            if (z2) {
                return false;
            }
            throw o0.a("too short header: " + bVar.a(), null);
        }
        if (bVar.q() != i5) {
            if (z2) {
                return false;
            }
            throw o0.a("expected header type " + Integer.toHexString(i5), null);
        }
        if (bVar.q() == 118 && bVar.q() == 111 && bVar.q() == 114 && bVar.q() == 98 && bVar.q() == 105 && bVar.q() == 115) {
            return true;
        }
        if (z2) {
            return false;
        }
        throw o0.a("expected characters 'vorbis'", null);
    }

    public static ArrayList w0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0803t) {
            C0803t c0803t = (C0803t) th;
            arrayList.add(c0803t.f9445a);
            arrayList.add(c0803t.getMessage());
            arrayList.add(c0803t.f9446b);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static String x0(List list) {
        Iterator it = list.iterator();
        float fZbc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        String strZbf = "und";
        while (it.hasNext()) {
            zbaaw zbaawVar = (zbaaw) it.next();
            if (fZbc < zbaawVar.zbc()) {
                fZbc = zbaawVar.zbc();
                strZbf = zbaawVar.zbf();
            }
        }
        return strZbf;
    }

    public static t y0(zzags zzagsVar) {
        if (zzagsVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagsVar.zze())) {
            String strZzd = zzagsVar.zzd();
            String strZzc = zzagsVar.zzc();
            long jZza = zzagsVar.zza();
            String strZze = zzagsVar.zze();
            AbstractC1732v.f(strZze);
            return new J8.z(jZza, strZzd, strZzc, strZze);
        }
        if (zzagsVar.zzb() == null) {
            return null;
        }
        String strZzd2 = zzagsVar.zzd();
        String strZzc2 = zzagsVar.zzc();
        long jZza2 = zzagsVar.zza();
        zzahp zzahpVarZzb = zzagsVar.zzb();
        AbstractC1732v.j(zzahpVarZzb, "totpInfo cannot be null.");
        return new C(strZzd2, strZzc2, jZza2, zzahpVarZzb);
    }

    public static ArrayList z0(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t tVarY0 = y0((zzags) it.next());
            if (tVarY0 != null) {
                arrayList.add(tVarY0);
            }
        }
        return arrayList;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean A() {
        return true;
    }

    @Override // Vf.a
    public Object B(SerialDescriptor descriptor, int i5, KSerializer deserializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(deserializer, "deserializer");
        if (deserializer.getDescriptor().b() || A()) {
            return z(deserializer);
        }
        return null;
    }

    @Override // Vf.a
    public double C(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return s();
    }

    public Object D(SerialDescriptor descriptor, int i5, KSerializer deserializer, Object obj) {
        AbstractC3340k.e(descriptor, "descriptor");
        AbstractC3340k.e(deserializer, "deserializer");
        return z(deserializer);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte E();

    public abstract int J(int i5, L0.i iVar, r0.t tVar);

    public abstract boolean K(N0.i iVar, N0.e eVar, N0.e eVar2);

    public abstract boolean L(N0.i iVar, Object obj, Object obj2);

    public abstract boolean M(N0.i iVar, N0.h hVar, N0.h hVar2);

    public void a0() {
        throw new Sf.f(kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(getClass()) + " can't retrieve untyped values");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Vf.a b(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        return this;
    }

    public void c(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int e(SerialDescriptor enumDescriptor) {
        AbstractC3340k.e(enumDescriptor, "enumDescriptor");
        a0();
        throw null;
    }

    @Override // Vf.a
    public long f(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int h();

    @Override // Vf.a
    public int i(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return h();
    }

    @Override // Vf.a
    public short j(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return p();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long k();

    @Override // Vf.a
    public String l(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return w();
    }

    @Override // Vf.a
    public byte n(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return E();
    }

    public abstract void n0(N0.h hVar, N0.h hVar2);

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder o(SerialDescriptor descriptor) {
        AbstractC3340k.e(descriptor, "descriptor");
        return this;
    }

    public abstract void o0(N0.h hVar, Thread thread);

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short p();

    @Override // kotlinx.serialization.encoding.Decoder
    public float q() {
        a0();
        throw null;
    }

    @Override // Vf.a
    public float r(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return q();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public double s() {
        a0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean t() {
        a0();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public char u() {
        a0();
        throw null;
    }

    @Override // Vf.a
    public Decoder v(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return o(descriptor.g(i5));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String w() {
        a0();
        throw null;
    }

    @Override // Vf.a
    public char x(C1248f0 descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return u();
    }

    @Override // Vf.a
    public boolean y(SerialDescriptor descriptor, int i5) {
        AbstractC3340k.e(descriptor, "descriptor");
        return t();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object z(KSerializer deserializer) {
        AbstractC3340k.e(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }
}
