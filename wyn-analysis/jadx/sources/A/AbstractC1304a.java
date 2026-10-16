package a;

import A.C0230x;
import Ef.S;
import Hf.InterfaceC0602l;
import Hf.k0;
import I.c;
import J8.AbstractC0629d;
import J8.C0635j;
import J8.C0637l;
import J8.C0638m;
import J8.C0639n;
import K.C0678c;
import K8.C0697i;
import L0.i;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import N.V;
import Pc.C0795k;
import Pc.C0803t;
import S3.e;
import U8.v0;
import X.v;
import Y0.d;
import Y3.n;
import Y3.q;
import Y3.r;
import Y3.u;
import Y4.b;
import a.AbstractC1304a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import cb.AbstractC1593a;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;
import d0.AbstractC2382a;
import d0.C2384c;
import d0.f;
import e0.C2452d;
import e9.C2476b;
import ef.C2515C;
import f9.C2618a;
import gf.C2755b;
import h0.AbstractC2765c;
import h4.C2776c;
import h4.h;
import i0.C2826d;
import i4.C2847d;
import i4.C2849f;
import i4.InterfaceC2850g;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kb.InterfaceC3287c;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3644a;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import r0.C3902g;
import r0.InterfaceC3903h;
import r0.x;
import r7.AbstractC3935e;
import s8.C4027c;
import s8.g;
import s8.k;
import s8.m;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import tf.l;
import tf.p;
import u0.InterfaceC4193p0;
import u0.M;
import u0.Z;
import x1.C4452e;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1304a implements InterfaceC3287c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17091a;

    public /* synthetic */ AbstractC1304a(int i5) {
        this.f17091a = i5;
    }

    public static C0803t A() {
        return new C0803t("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static C0803t B() {
        return new C0803t("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static C0803t G(Exception exc) {
        if (exc == null) {
            return new C0803t("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap map = new HashMap();
        if (exc instanceof C0637l) {
            C0637l c0637l = (C0637l) exc;
            HashMap map2 = new HashMap();
            C0697i c0697i = c0637l.f5808b;
            ArrayList arrayListV = c0697i.V();
            String string = UUID.randomUUID().toString();
            C0795k.f9419b.put(string, c0697i.f6647b);
            String string2 = UUID.randomUUID().toString();
            C0795k.f9420c.put(string2, c0697i);
            ArrayList arrayList = new ArrayList();
            Iterator it = H.d0(arrayListV).iterator();
            while (it.hasNext()) {
                arrayList.add(((Pc.H) it.next()).b());
            }
            g gVar = FirebaseAuth.getInstance(g.f(c0697i.f6648c)).f27283a;
            gVar.a();
            map2.put("appName", gVar.f45329b);
            map2.put("multiFactorHints", arrayList);
            map2.put("multiFactorSessionId", string);
            map2.put("multiFactorResolverId", string2);
            return new C0803t(c0637l.f5807a, c0637l.getLocalizedMessage(), map2);
        }
        if ((exc instanceof k) || (exc.getCause() != null && (exc.getCause() instanceof k))) {
            return new C0803t("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof C4027c) || (exc.getCause() != null && (exc.getCause() instanceof C4027c))) {
            return new C0803t("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof m) || (exc.getCause() != null && (exc.getCause() instanceof m))) {
            return new C0803t("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new C0803t("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return new C0803t("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
        }
        String str = exc instanceof C0635j ? ((C0635j) exc).f5807a : "UNKNOWN";
        if (exc instanceof C0639n) {
            message = ((C0639n) exc).f5811b;
        }
        if (exc instanceof C0638m) {
            C0638m c0638m = (C0638m) exc;
            String str2 = c0638m.f5810c;
            if (str2 != null) {
                map.put("email", str2);
            }
            AbstractC0629d abstractC0629d = c0638m.f5809b;
            if (abstractC0629d != null) {
                map.put("authCredential", H.h0(abstractC0629d));
            }
        }
        return new C0803t(str, message, map);
    }

    public static e H(b bVar) {
        bVar.B(1);
        int iS = bVar.s();
        long j8 = bVar.f16680b + iS;
        int i5 = iS / 18;
        long[] jArrCopyOf = new long[i5];
        long[] jArrCopyOf2 = new long[i5];
        int i10 = 0;
        while (true) {
            if (i10 >= i5) {
                break;
            }
            long jK = bVar.k();
            if (jK == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
                break;
            }
            jArrCopyOf[i10] = jK;
            jArrCopyOf2[i10] = bVar.k();
            bVar.B(2);
            i10++;
        }
        bVar.B((int) (j8 - bVar.f16680b));
        return new e(jArrCopyOf, false, jArrCopyOf2, 7);
    }

    public static void I(Window window, boolean z2) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            d.i(window, z2);
        } else {
            if (i5 >= 30) {
                d.h(window, z2);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void J(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.V()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(AbstractC1732v.n(status));
        }
    }

    public static final long K(long j8, float f10) {
        return Fe.g.a(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC2382a.b(j8) - f10), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, AbstractC2382a.c(j8) - f10));
    }

    public static final long L(long j8, long j10) {
        float fD = f.d(j8);
        long j11 = x.f44316a;
        if (j10 == j11) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * fD;
        float fB = f.b(j8);
        if (j10 != j11) {
            return H.I(fIntBitsToFloat, Float.intBitsToFloat((int) (j10 & 4294967295L)) * fB);
        }
        throw new IllegalStateException("ScaleFactor is unspecified");
    }

    public static int M(Context context, int i5) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i5});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static boolean O(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        return status.V() ? taskCompletionSource.trySetResult(obj) : taskCompletionSource.trySetException(AbstractC1732v.n(status));
    }

    public static final void P(int i5, String str, String str2) {
        StringBuilder sbK = AbstractC1593a.k(i5, "Expected ", str2, " at index ", ", but was '");
        sbK.append(str.charAt(i5));
        sbK.append('\'');
        throw new IllegalArgumentException(sbK.toString());
    }

    public static ArrayList Q(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void R(Parcel parcel, int i5, Boolean bool) {
        if (bool == null) {
            return;
        }
        k0(parcel, i5, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void S(Parcel parcel, int i5, Bundle bundle, boolean z2) {
        if (bundle == null) {
            if (z2) {
                k0(parcel, i5, 0);
            }
        } else {
            int iL0 = l0(i5, parcel);
            parcel.writeBundle(bundle);
            m0(iL0, parcel);
        }
    }

    public static void T(Parcel parcel, int i5, byte[] bArr, boolean z2) {
        if (bArr == null) {
            if (z2) {
                k0(parcel, i5, 0);
            }
        } else {
            int iL0 = l0(i5, parcel);
            parcel.writeByteArray(bArr);
            m0(iL0, parcel);
        }
    }

    public static void U(Parcel parcel, int i5, Double d3) {
        if (d3 == null) {
            return;
        }
        k0(parcel, i5, 8);
        parcel.writeDouble(d3.doubleValue());
    }

    public static void V(Parcel parcel, int i5, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iL0 = l0(i5, parcel);
        parcel.writeStrongBinder(iBinder);
        m0(iL0, parcel);
    }

    public static void W(Parcel parcel, int i5, int[] iArr, boolean z2) {
        if (iArr == null) {
            if (z2) {
                k0(parcel, i5, 0);
            }
        } else {
            int iL0 = l0(i5, parcel);
            parcel.writeIntArray(iArr);
            m0(iL0, parcel);
        }
    }

    public static void X(Parcel parcel, int i5, Integer num) {
        if (num == null) {
            return;
        }
        k0(parcel, i5, 4);
        parcel.writeInt(num.intValue());
    }

    public static void Y(Parcel parcel, int i5, Long l10) {
        if (l10 == null) {
            return;
        }
        k0(parcel, i5, 8);
        parcel.writeLong(l10.longValue());
    }

    public static void Z(Parcel parcel, int i5, Parcelable parcelable, int i10, boolean z2) {
        if (parcelable == null) {
            if (z2) {
                k0(parcel, i5, 0);
            }
        } else {
            int iL0 = l0(i5, parcel);
            parcelable.writeToParcel(parcel, i10);
            m0(iL0, parcel);
        }
    }

    public static void a0(Parcel parcel, int i5, String str, boolean z2) {
        if (str == null) {
            if (z2) {
                k0(parcel, i5, 0);
            }
        } else {
            int iL0 = l0(i5, parcel);
            parcel.writeString(str);
            m0(iL0, parcel);
        }
    }

    public static void b0(Parcel parcel, int i5, String[] strArr, boolean z2) {
        if (strArr == null) {
            if (z2) {
                k0(parcel, i5, 0);
            }
        } else {
            int iL0 = l0(i5, parcel);
            parcel.writeStringArray(strArr);
            m0(iL0, parcel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(tf.l r18, Z.k r19, M0.m r20, N.C0740o r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC1304a.c(tf.l, Z.k, M0.m, N.o, int, int):void");
    }

    public static void c0(Parcel parcel, int i5, List list) {
        if (list == null) {
            return;
        }
        int iL0 = l0(i5, parcel);
        parcel.writeStringList(list);
        m0(iL0, parcel);
    }

    public static final void d(h hVar, X3.k kVar, Z.k kVar2, InterfaceC3903h interfaceC3903h, C0740o c0740o, int i5, int i10) {
        h hVarA;
        InterfaceC2850g c2847d;
        Y3.a aVar = Y3.a.k;
        c0740o.N(-2030202961);
        int i11 = u.f16675b;
        c0740o.M(402368983);
        C2776c c2776c = hVar.f36110t;
        P p10 = C0732k.f7800a;
        if (c2776c.f36067a == null) {
            if (interfaceC3903h.equals(C3902g.f44299d)) {
                C2849f c2849f = C2849f.f36785c;
                c2847d = new C2847d();
            } else {
                c0740o.M(-492369756);
                Object objF = c0740o.F();
                if (objF == p10) {
                    objF = new q();
                    c0740o.U(objF);
                }
                c0740o.p(false);
                c2847d = (InterfaceC2850g) objF;
            }
            h4.g gVarA = h.a(hVar);
            gVarA.f36086l = c2847d;
            gVarA.f36087m = null;
            gVarA.f36088n = null;
            gVarA.f36091q = 0;
            hVarA = gVarA.a();
        } else {
            hVarA = hVar;
        }
        c0740o.p(false);
        int i12 = i5 >> 9;
        int i13 = 57344 & i12;
        c0740o.M(-2020614074);
        Object obj = hVarA.f36093b;
        if (obj instanceof h4.g) {
            throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
        }
        if (obj instanceof C2452d) {
            android.support.v4.media.session.b.t0("ImageBitmap");
            throw null;
        }
        if (obj instanceof C2826d) {
            android.support.v4.media.session.b.t0("ImageVector");
            throw null;
        }
        if (obj instanceof AbstractC2765c) {
            android.support.v4.media.session.b.t0("Painter");
            throw null;
        }
        if (hVarA.f36094c != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
        c0740o.M(-492369756);
        Object objF2 = c0740o.F();
        if (objF2 == p10) {
            objF2 = new n(hVarA, kVar);
            c0740o.U(objF2);
        }
        c0740o.p(false);
        n nVar = (n) objF2;
        nVar.f16657m = aVar;
        nVar.f16658n = interfaceC3903h;
        nVar.f16659o = 1;
        nVar.f16660p = ((Boolean) c0740o.j(Z.f46178a)).booleanValue();
        nVar.f16663s.setValue(kVar);
        nVar.f16662r.setValue(hVarA);
        nVar.c();
        c0740o.p(false);
        InterfaceC2850g interfaceC2850g = hVarA.f36108r;
        e(interfaceC2850g instanceof q ? kVar2.g((Z.k) interfaceC2850g) : kVar2, nVar, interfaceC3903h, c0740o, ((i5 << 3) & 896) | (i12 & 7168) | i13 | (458752 & i12) | (3670016 & i12));
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new K.x(hVar, kVar, kVar2, interfaceC3903h, i5, i10, 1);
    }

    public static void d0(Parcel parcel, int i5, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int iL0 = l0(i5, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m0(iL0, parcel);
    }

    public static final void e(Z.k kVar, n nVar, InterfaceC3903h interfaceC3903h, C0740o c0740o, int i5) {
        c0740o.N(10290533);
        Z.k kVarG = ic.d.l(kVar).g(new r(nVar, interfaceC3903h));
        Y3.b bVar = Y3.b.f16632a;
        c0740o.M(544976794);
        L0.b bVar2 = (L0.b) c0740o.j(M.f46143e);
        i iVar = (i) c0740o.j(M.k);
        InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(M.f46152o);
        Z.k kVarF = AbstractC3935e.F(c0740o, kVarG);
        InterfaceC4055c.g9.getClass();
        C4056d c4056d = C4054b.f45453b;
        c0740o.M(1405779621);
        c0740o.O();
        if (c0740o.f7843O) {
            c0740o.k(new c(c4056d, 1));
        } else {
            c0740o.X();
        }
        c0740o.f7867x = false;
        C0718d.M(c0740o, bVar, C4054b.f45456e);
        C0718d.M(c0740o, bVar2, C4054b.f45455d);
        C0718d.M(c0740o, iVar, C4054b.f45457f);
        C0718d.M(c0740o, interfaceC4193p0, C4054b.f45458g);
        C0718d.M(c0740o, kVarF, C4054b.f45454c);
        c0740o.o();
        c0740o.p(true);
        c0740o.p(false);
        c0740o.p(false);
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0678c(i5, 2, kVar, nVar, interfaceC3903h);
    }

    public static void e0(Parcel parcel, int i5, List list, boolean z2) {
        if (list == null) {
            if (z2) {
                k0(parcel, i5, 0);
                return;
            }
            return;
        }
        int iL0 = l0(i5, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m0(iL0, parcel);
    }

    public static final d0.d f(long j8, long j10) {
        return new d0.d(C2384c.b(j8), C2384c.c(j8), f.d(j10) + C2384c.b(j8), f.b(j10) + C2384c.c(j8));
    }

    public static Rect f0(List list, Matrix matrix) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        RectF rectF = new RectF(iMin, iMin2, iMax, iMax2);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public static final long g(float f10, float f11) {
        long jFloatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i5 = x.f44317b;
        return jFloatToIntBits;
    }

    public static zbpb g0(zbaaj zbaajVar) {
        return zbaajVar.zbi() ? zbaajVar.zbc().zbd() : zbaajVar.zbH() ? zbaajVar.zbf().zbc() : zbaajVar.zbe();
    }

    public static final void h(Z.k modifier, final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar, final l onButtonRendered, final V.d dVar, C0740o c0740o, final int i5, final int i10) {
        int i11;
        AbstractC3340k.e(onButtonRendered, "onButtonRendered");
        c0740o.N(-1040306081);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i11 = (c0740o.e(modifier) ? 4 : 2) | i5;
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= c0740o.e(cVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i11 |= c0740o.e(onButtonRendered) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i11 |= c0740o.e(dVar) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i11 & 1171) == 1170 && c0740o.x()) {
            c0740o.I();
        } else {
            if (i12 != 0) {
                modifier = Z.i.f16922a;
            }
            c0740o.M(-334659178);
            Object objF = c0740o.F();
            Object obj = C0732k.f7800a;
            if (objF == obj) {
                objF = C0718d.G(new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(cVar, new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), P.f7730f);
                c0740o.U(objF);
            }
            V v2 = (V) objF;
            c0740o.p(false);
            com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d savedStateButton = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) v2.getValue();
            c0740o.M(-334654626);
            boolean zE = c0740o.e(v2) | c0740o.e(onButtonRendered);
            Object objF2 = c0740o.F();
            if (zE || objF2 == obj) {
                objF2 = new Ff.d(6, onButtonRendered, v2);
                c0740o.U(objF2);
            }
            l updateButtonState = (l) objF2;
            c0740o.p(false);
            AbstractC3340k.e(modifier, "modifier");
            AbstractC3340k.e(savedStateButton, "savedStateButton");
            AbstractC3340k.e(updateButtonState, "updateButtonState");
            dVar.invoke(v0.X(modifier, new Ff.d(5, savedStateButton, updateButtonState)), c0740o, Integer.valueOf((i11 >> 6) & 112));
        }
        final Z.k kVar = modifier;
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.P
                @Override // tf.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int i13 = i5 | 1;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c cVar2 = cVar;
                    V.d dVar2 = dVar;
                    AbstractC1304a.h(kVar, cVar2, onButtonRendered, dVar2, (C0740o) obj2, i13, i10);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static List h0(zbpb zbpbVar) {
        double dSin = Math.sin(Math.toRadians(zbpbVar.zba()));
        double dCos = Math.cos(Math.toRadians(zbpbVar.zba()));
        Point point = new Point((int) (zbpbVar.zbd() + (zbpbVar.zbf() * dCos)), (int) ((zbpbVar.zbf() * dSin) + zbpbVar.zbe()));
        double d3 = point.x;
        double dZbc = zbpbVar.zbc() * dSin;
        double dZbc2 = (zbpbVar.zbc() * dCos) + pointArr[1].y;
        Point point2 = pointArr[0];
        int i5 = point2.x;
        Point point3 = pointArr[2];
        int i10 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(zbpbVar.zbd(), zbpbVar.zbe()), point, new Point((int) (d3 - dZbc), (int) dZbc2), new Point((i10 - point4.x) + i5, (point3.y - point4.y) + point2.y)};
        return Arrays.asList(pointArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r8v0, types: [Ad.e, zd.c, zd.e] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Ef.E, zd.c] */
    /* JADX WARN: Type inference failed for: r8v4, types: [zd.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(Ad.e r8, Fd.d r9, lf.AbstractC3464c r10) {
        /*
            r0 = 2
            boolean r1 = r10 instanceof zd.a
            if (r1 == 0) goto L14
            r1 = r10
            zd.a r1 = (zd.a) r1
            int r2 = r1.f48478d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f48478d = r2
            goto L19
        L14:
            zd.a r1 = new zd.a
            r1.<init>(r10)
        L19:
            java.lang.Object r10 = r1.f48477c
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f48478d
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 == r4) goto L32
            if (r3 != r0) goto L2a
            Fe.e.U(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            Fd.d r9 = r1.f48476b
            zd.c r8 = r1.f48475a
            Fe.e.U(r10)
            goto L7e
        L3a:
            Fe.e.U(r10)
            Ef.I0 r10 = r9.f4055e
            r1.f48475a = r8
            r1.f48476b = r9
            r1.f48478d = r4
            Ef.D r3 = zd.h.f48488a
            Ef.o0 r3 = new Ef.o0
            r3.<init>(r10)
            jf.h r10 = r8.getCoroutineContext()
            jf.h r10 = r10.plus(r3)
            Ef.D r5 = zd.h.f48488a
            jf.h r10 = r10.plus(r5)
            jf.h r5 = r1.getContext()
            Ef.l0 r6 = Ef.C0499l0.f3748a
            jf.f r5 = r5.get(r6)
            Ef.m0 r5 = (Ef.InterfaceC0501m0) r5
            if (r5 != 0) goto L69
            goto L7b
        L69:
            Gf.r r6 = new Gf.r
            r7 = 3
            r6.<init>(r3, r7)
            Ef.U r4 = r5.invokeOnCompletion(r4, r4, r6)
            Gf.r r5 = new Gf.r
            r5.<init>(r4, r0)
            r3.invokeOnCompletion(r5)
        L7b:
            if (r10 != r2) goto L7e
            goto L9f
        L7e:
            jf.h r10 = (jf.InterfaceC3108h) r10
            zd.i r3 = new zd.i
            r3.<init>(r10)
            jf.h r10 = r10.plus(r3)
            zd.b r3 = new zd.b
            r4 = 0
            r3.<init>(r8, r9, r4)
            Ef.L r8 = Ef.H.h(r8, r10, r3, r0)
            r1.f48475a = r4
            r1.f48476b = r4
            r1.f48478d = r0
            java.lang.Object r8 = r8.p(r1)
            if (r8 != r2) goto La0
        L9f:
            return r2
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC1304a.i(Ad.e, Fd.d, lf.c):java.lang.Object");
    }

    public static Status i0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] strArrSplit = str.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? j0((String) listAsList.get(0), (String) listAsList.get(1)) : j0((String) listAsList.get(0), null);
    }

    public static final InterfaceC0602l j(InterfaceC0602l interfaceC0602l) {
        InterfaceC0602l interfaceC0602lM = k0.m(k0.g(interfaceC0602l, -1));
        Lf.e eVar = S.f3698a;
        return k0.s(interfaceC0602lM, Jf.n.f6132a);
    }

    public static Status j0(String str, String str2) {
        int i5;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i5 = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i5 = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i5 = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i5 = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i5 = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i5 = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i5 = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i5 = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i5 = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i5 = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i5 = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i5 = 17038;
                break;
            case "INVALID_OOB_CODE":
                i5 = 17030;
                break;
            case "MISSING_EMAIL":
                i5 = 17034;
                break;
            case "INVALID_CODE":
                i5 = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i5 = 17214;
                break;
            case "TOKEN_EXPIRED":
                i5 = 17021;
                break;
            case "INVALID_TENANT_ID":
                i5 = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i5 = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i5 = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i5 = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i5 = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i5 = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i5 = 17094;
                break;
            case "INVALID_CERT_HASH":
                i5 = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i5 = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i5 = 17084;
                break;
            case "MISSING_PASSWORD":
                i5 = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i5 = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i5 = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i5 = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i5 = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i5 = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i5 = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i5 = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i5 = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i5 = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i5 = 17056;
                break;
            case "WEAK_PASSWORD":
                i5 = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i5 = 17089;
                break;
            case "INVALID_SENDER":
                i5 = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i5 = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i5 = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i5 = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i5 = 17095;
                break;
            case "EMAIL_EXISTS":
                i5 = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i5 = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i5 = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i5 = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i5 = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i5 = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i5 = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i5 = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i5 = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i5 = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i5 = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i5 = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i5 = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i5 = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i5 = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i5 = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i5 = 17000;
                break;
            case "INVALID_PASSWORD":
                i5 = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i5 = 17202;
                break;
            case "SESSION_EXPIRED":
                i5 = 17051;
                break;
            case "MISSING_CODE":
                i5 = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i5 = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i5 = 17201;
                break;
            case "USER_DISABLED":
                i5 = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i5 = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i5 = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i5 = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i5 = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i5 = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i5 = 17073;
                break;
            default:
                i5 = 17499;
                break;
        }
        return i5 == 17499 ? str2 != null ? new Status(i5, N0.a.g(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, str2), null, null) : new Status(i5, str, null, null) : new Status(i5, str2, null, null);
    }

    public static final C4452e k(String name) {
        AbstractC3340k.e(name, "name");
        return new C4452e(name);
    }

    public static void k0(Parcel parcel, int i5, int i10) {
        parcel.writeInt(i5 | (i10 << 16));
    }

    public static int l0(int i5, Parcel parcel) {
        parcel.writeInt(i5 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m0(int i5, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i5 - 4);
        parcel.writeInt(iDataPosition - i5);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:26:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0067 -> B:25:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(io.ktor.utils.io.InterfaceC2886t r17, java.io.OutputStream r18, long r19, lf.AbstractC3464c r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC1304a.n(io.ktor.utils.io.t, java.io.OutputStream, long, lf.c):java.lang.Object");
    }

    public static final void o(InterfaceC3644a interfaceC3644a) throws IOException {
        C2755b c2755bT = AbstractC3935e.t();
        Cursor cursorK = interfaceC3644a.K("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorK.moveToNext()) {
            try {
                c2755bT.add(cursorK.getString(0));
            } finally {
            }
        }
        cursorK.close();
        ListIterator listIterator = AbstractC3935e.l(c2755bT).listIterator(0);
        while (true) {
            v vVar = (v) listIterator;
            if (!vVar.hasNext()) {
                return;
            }
            String triggerName = (String) vVar.next();
            AbstractC3340k.d(triggerName, "triggerName");
            if (Bf.r.k0(triggerName, "room_fts_content_sync_", false)) {
                interfaceC3644a.f("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    public static final void p(long j8, byte[] bArr, int i5, int i10, int i11) {
        int i12 = 7 - i10;
        int i13 = 8 - i11;
        if (i13 > i12) {
            return;
        }
        while (true) {
            int i14 = Bf.c.f1679a[(int) ((j8 >> (i12 << 3)) & 255)];
            int i15 = i5 + 1;
            bArr[i5] = (byte) (i14 >> 8);
            i5 += 2;
            bArr[i15] = (byte) i14;
            if (i12 == i13) {
                return;
            } else {
                i12--;
            }
        }
    }

    public static HashMap r(C2476b c2476b) {
        String str;
        if (c2476b == null) {
            return null;
        }
        HashMap map = new HashMap();
        C2618a c2618a = c2476b.f34439b;
        Uri uri = (c2618a == null || (str = c2618a.f35243b) == null) ? null : Uri.parse(str);
        map.put("link", uri != null ? uri.toString() : null);
        HashMap map2 = new HashMap();
        com.google.android.gms.ads.nativead.l lVar = c2476b.f34438a;
        for (String str2 : (lVar == null ? new Bundle() : new Bundle((Bundle) lVar.f26356b)).keySet()) {
            map2.put(str2, (lVar == null ? new Bundle() : new Bundle((Bundle) lVar.f26356b)).get(str2).toString());
        }
        map.put("utmParameters", map2);
        HashMap map3 = new HashMap();
        map3.put("clickTimestamp", Long.valueOf(c2618a == null ? 0L : c2618a.f35245d));
        map3.put("minimumVersion", Integer.valueOf(c2618a == null ? 0 : c2618a.f35244c));
        map.put("android", map3);
        return map;
    }

    public abstract void D(int i5);

    public abstract void E(View view, int i5, int i10);

    public abstract void F(View view, float f10, float f11);

    public abstract boolean N(int i5, View view);

    @Override // kb.InterfaceC3287c
    public void a(HashMap map, String str) {
        u().a(map, str);
    }

    @Override // kb.InterfaceC3287c
    public void b(Serializable serializable) {
        u().b(serializable);
    }

    public abstract int l(int i5, View view);

    public abstract int m(int i5, View view);

    public abstract Object q(String str);

    public abstract String s();

    public boolean t() {
        return Boolean.TRUE.equals(q("noResult"));
    }

    public String toString() {
        switch (this.f17091a) {
            case 19:
                return s() + StringUtils.SPACE + ((String) q("sql")) + StringUtils.SPACE + ((List) q("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract InterfaceC3287c u();

    public abstract void v(Context context, String str, nb.d dVar, C0230x c0230x, h9.c cVar);

    public abstract void w(Context context, nb.d dVar, C0230x c0230x, h9.c cVar);

    public int x(View view) {
        return 0;
    }

    public int y() {
        return 0;
    }

    public abstract boolean z();

    public void C(int i5, View view) {
    }
}
