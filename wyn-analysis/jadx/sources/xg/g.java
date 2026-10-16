package xg;

import A.AbstractC0213f;
import C8.i;
import E.AbstractC0426p;
import E.L;
import E5.Q;
import Jd.B;
import Jd.C;
import Jd.H;
import L0.j;
import L0.k;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import S3.l;
import Uc.p;
import Uc.u;
import Uc.v;
import Uc.w;
import Va.M6;
import Va.X7;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import ba.C1521a;
import c0.C1539d;
import c0.C1542g;
import c0.InterfaceC1540e;
import c0.r;
import com.applovin.shadow.okio.Segment;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.Timestamp;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.publisher.C1915d;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import e0.C2465q;
import e0.z;
import ef.C2515C;
import ef.C2537u;
import ef.C2539w;
import h6.C2782a;
import i4.C2849f;
import j$.util.Objects;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import ka.AbstractC3256n;
import ka.C1;
import ka.C3235g;
import ka.C3263p0;
import kd.C3306b;
import kd.C3316l;
import kotlin.jvm.internal.AbstractC3340k;
import m9.C3510i;
import m9.C3516o;
import m9.C3526z;
import m9.EnumC3515n;
import m9.W;
import m9.Y;
import m9.b0;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p7.AbstractC3772b;
import p9.C3782c;
import p9.EnumC3788i;
import r0.InterfaceC3909n;
import r7.AbstractC3935e;
import s9.h;
import s9.m;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import t0.t;
import t0.y;
import u0.C4188n;
import u0.InterfaceC4193p0;
import u0.M;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static f f47910a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f47911b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Class f47912c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f47913d;

    public static final void A(C1542g c1542g) {
        r rVar;
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            rVar = r.f19534a;
        } else if (iOrdinal == 2) {
            rVar = r.f19536c;
        } else {
            if (iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Granting focus to a deactivated node.");
            }
            if (iOrdinal != 5) {
                throw new Q((byte) 0, 9);
            }
            rVar = r.f19534a;
        }
        c1542g.e0(rVar);
    }

    public static boolean B(double d3) {
        return Math.getExponent(d3) <= 1023;
    }

    public static final long C(int i5, int i10, long j8) {
        int iG = L0.a.g(j8) + i5;
        if (iG < 0) {
            iG = 0;
        }
        int iE = L0.a.e(j8);
        if (iE != Integer.MAX_VALUE && (iE = iE + i5) < 0) {
            iE = 0;
        }
        int iF = L0.a.f(j8) + i10;
        if (iF < 0) {
            iF = 0;
        }
        int iD = L0.a.d(j8);
        return a(iG, iE, iF, (iD == Integer.MAX_VALUE || (iD = iD + i10) >= 0) ? iD : 0);
    }

    public static ArrayList D(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m9.r.b((String[]) ((List) it.next()).toArray(new String[0])));
        }
        return arrayList;
    }

    public static int E(int i5) {
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            return 1;
        }
        if (iF == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ListenSource value: ".concat(i5 != 1 ? i5 != 2 ? "null" : "CACHE" : "DEFAULT_SOURCE"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01be A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [w6.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList F(Y4.b r30) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.g.F(Y4.b):java.util.ArrayList");
    }

    public static EnumC3515n G(int i5) {
        int iF;
        EnumC3515n enumC3515n = EnumC3515n.f40497a;
        if (i5 == 0 || (iF = AbstractC0213f.f(i5)) == 0) {
            return enumC3515n;
        }
        if (iF == 1) {
            return EnumC3515n.f40498b;
        }
        if (iF == 2) {
            return EnumC3515n.f40499c;
        }
        throw new IllegalArgumentException("Unknown server timestamp behavior: ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "PREVIOUS" : "ESTIMATE" : "NONE"));
    }

    public static int H(int i5) {
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            return 1;
        }
        if (iF == 1) {
            return 2;
        }
        if (iF == 2) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown source: ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "CACHE" : "SERVER" : "SERVER_AND_CACHE"));
    }

    public static W I(FirebaseFirestore firebaseFirestore, String str, boolean z2, u uVar) {
        try {
            W wC = z2 ? firebaseFirestore.c(str) : firebaseFirestore.b(str);
            if (uVar == null) {
                return wC;
            }
            Map map = uVar.f12781i;
            if (map != null) {
                wC = wC.j(y(map));
            }
            List<List> list = uVar.f12773a;
            Objects.requireNonNull(list);
            for (List list2 : list) {
                m9.r rVar = (m9.r) list2.get(0);
                String str2 = (String) list2.get(1);
                Object obj = list2.get(2);
                if ("==".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.EQUAL, obj));
                } else if ("!=".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.NOT_EQUAL, obj));
                } else if ("<".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.LESS_THAN, obj));
                } else if ("<=".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.LESS_THAN_OR_EQUAL, obj));
                } else if (">".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.GREATER_THAN, obj));
                } else if (">=".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.GREATER_THAN_OR_EQUAL, obj));
                } else if ("array-contains".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.ARRAY_CONTAINS, obj));
                } else if ("array-contains-any".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.ARRAY_CONTAINS_ANY, (List) obj));
                } else if (ScarConstants.IN_SIGNAL_KEY.equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.IN, (List) obj));
                } else if ("not-in".equals(str2)) {
                    wC.getClass();
                    wC = wC.j(new C3526z(rVar, EnumC3788i.NOT_IN, (List) obj));
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Long l10 = uVar.f12775c;
            if (l10 != null) {
                wC = wC.d(l10.longValue());
            }
            Long l11 = uVar.f12776d;
            if (l11 != null) {
                wC = wC.e(l11.longValue());
            }
            List<List> list3 = uVar.f12774b;
            if (list3 == null) {
                return wC;
            }
            for (List list4 : list3) {
                wC = wC.f((m9.r) list4.get(0), ((Boolean) list4.get(1)).booleanValue() ? 2 : 1);
            }
            List list5 = uVar.f12777e;
            if (list5 != null) {
                Object[] array = list5.toArray();
                Objects.requireNonNull(array);
                C3782c c3782cB = wC.b(true, "startAt", array);
                p9.u uVar2 = wC.f40456a;
                wC = new W(new p9.u(uVar2.f43415f, uVar2.f43416g, uVar2.f43414e, uVar2.f43410a, uVar2.f43417h, uVar2.f43418i, c3782cB, uVar2.k), wC.f40457b);
            }
            List list6 = uVar.f12778f;
            if (list6 != null) {
                Object[] array2 = list6.toArray();
                Objects.requireNonNull(array2);
                C3782c c3782cB2 = wC.b(false, "startAfter", array2);
                p9.u uVar3 = wC.f40456a;
                wC = new W(new p9.u(uVar3.f43415f, uVar3.f43416g, uVar3.f43414e, uVar3.f43410a, uVar3.f43417h, uVar3.f43418i, c3782cB2, uVar3.k), wC.f40457b);
            }
            List list7 = uVar.f12779g;
            if (list7 != null) {
                Object[] array3 = list7.toArray();
                Objects.requireNonNull(array3);
                C3782c c3782cB3 = wC.b(true, "endAt", array3);
                p9.u uVar4 = wC.f40456a;
                wC = new W(new p9.u(uVar4.f43415f, uVar4.f43416g, uVar4.f43414e, uVar4.f43410a, uVar4.f43417h, uVar4.f43418i, uVar4.f43419j, c3782cB3), wC.f40457b);
            }
            List list8 = uVar.f12780h;
            if (list8 == null) {
                return wC;
            }
            Object[] array4 = list8.toArray();
            Objects.requireNonNull(array4);
            C3782c c3782cB4 = wC.b(false, "endBefore", array4);
            p9.u uVar5 = wC.f40456a;
            return new W(new p9.u(uVar5.f43415f, uVar5.f43416g, uVar5.f43414e, uVar5.f43410a, uVar5.f43417h, uVar5.f43418i, uVar5.f43419j, c3782cB4), wC.f40457b);
        } catch (Exception e7) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e7);
            return null;
        }
    }

    public static void L(C2782a c2782a) {
        c2782a.k = -3.4028235E38f;
        c2782a.f36159j = Integer.MIN_VALUE;
        CharSequence charSequence = c2782a.f36150a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                c2782a.f36150a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = c2782a.f36150a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final void M(C1542g c1542g) {
        t tVar;
        C4188n c4188n;
        t tVar2;
        AbstractC3340k.e(c1542g, "<this>");
        y yVar = c1542g.k;
        if (((yVar == null || (tVar2 = yVar.f45561e) == null) ? null : tVar2.f45517g) == null) {
            c1542g.f19507l = true;
            return;
        }
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (p(c1542g)) {
                    A(c1542g);
                    return;
                }
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                if (iOrdinal != 5) {
                    return;
                }
                C1542g c1542g2 = c1542g.f19498b;
                if (c1542g2 != null) {
                    N(c1542g2, c1542g);
                    return;
                }
                y yVar2 = c1542g.k;
                if (yVar2 == null || (tVar = yVar2.f45561e) == null || (c4188n = tVar.f45517g) == null) {
                    throw new IllegalStateException("Owner not initialized.");
                }
                if (c4188n.requestFocus()) {
                    A(c1542g);
                    return;
                }
                return;
            }
        }
        C1539d c1539d = c1542g.f19502f;
        if (c1539d != null) {
            c1539d.c();
        }
    }

    public static final boolean N(C1542g c1542g, C1542g c1542g2) {
        t tVar;
        C4188n c4188n;
        if (!c1542g.f19499c.f(c1542g2)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal == 0) {
            c1542g.e0(r.f19535b);
            c1542g.f19501e = c1542g2;
            A(c1542g2);
            return true;
        }
        if (iOrdinal == 1) {
            if (!p(c1542g)) {
                return false;
            }
            c1542g.f19501e = c1542g2;
            A(c1542g2);
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        if (iOrdinal == 3) {
            i(c1542g);
            boolean zN = N(c1542g, c1542g2);
            w(c1542g);
            return zN;
        }
        if (iOrdinal == 4) {
            if (c1542g.f19501e == null) {
                c1542g.f19501e = c1542g2;
                A(c1542g2);
                return true;
            }
            if (!p(c1542g)) {
                return false;
            }
            c1542g.f19501e = c1542g2;
            A(c1542g2);
            return true;
        }
        if (iOrdinal != 5) {
            throw new Q((byte) 0, 9);
        }
        C1542g c1542g3 = c1542g.f19498b;
        if (c1542g3 == null) {
            y yVar = c1542g.k;
            if (yVar == null || (tVar = yVar.f45561e) == null || (c4188n = tVar.f45517g) == null) {
                throw new IllegalStateException("Owner not initialized.");
            }
            if (c4188n.requestFocus()) {
                c1542g.e0(r.f19534a);
                return N(c1542g, c1542g2);
            }
        }
        if (c1542g3 == null || !N(c1542g3, c1542g)) {
            return false;
        }
        return N(c1542g, c1542g2);
    }

    public static float O(int i5, float f10, int i10, int i11) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i5 == 0) {
            f11 = i11;
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i10;
        }
        return f10 * f11;
    }

    public static final void P(SpannableString spannableString, long j8, int i5, int i10) {
        if (j8 != C2465q.f34380i) {
            S(spannableString, new ForegroundColorSpan(z.s(j8)), i5, i10);
        }
    }

    public static final void Q(SpannableString spannableString, long j8, L0.b density, int i5, int i10) {
        AbstractC3340k.e(density, "density");
        long jB = j.b(j8);
        if (k.a(jB, 4294967296L)) {
            S(spannableString, new AbsoluteSizeSpan(AbstractC4345a.H(density.l(j8)), false), i5, i10);
        } else if (k.a(jB, 8589934592L)) {
            S(spannableString, new RelativeSizeSpan(j.c(j8)), i5, i10);
        }
    }

    public static final void R(SpannableString spannableString, G0.c cVar, int i5, int i10) {
        Object localeSpan;
        if (cVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = I0.a.f5273a.a(cVar);
            } else {
                ArrayList arrayList = cVar.f4137a;
                G0.b bVar = arrayList.isEmpty() ? new G0.b((G0.a) G0.e.f4139a.b().get(0)) : (G0.b) arrayList.get(0);
                AbstractC3340k.e(bVar, "<this>");
                localeSpan = new LocaleSpan(bVar.f4136a.f4135a);
            }
            S(spannableString, localeSpan, i5, i10);
        }
    }

    public static final void S(Spannable spannable, Object span, int i5, int i10) {
        AbstractC3340k.e(spannable, "<this>");
        AbstractC3340k.e(span, "span");
        spannable.setSpan(span, i5, i10, 33);
    }

    public static void T(InterfaceC4269f binaryMessenger, final C3316l c3316l) {
        i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (c3316l == null || (iVar = c3316l.f39674a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled");
        if (c3316l != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically");
        if (c3316l != null) {
            final int i10 = 15;
            x73.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows");
        if (c3316l != null) {
            final int i11 = 16;
            x74.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x74.n(null);
        }
        X7 x75 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled");
        if (c3316l != null) {
            final int i12 = 1;
            x75.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i12) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x75.n(null);
        }
        X7 x76 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString");
        if (c3316l != null) {
            final int i13 = 2;
            x76.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i13) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x76.n(null);
        }
        X7 x77 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture");
        if (c3316l != null) {
            final int i14 = 3;
            x77.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i14) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x77.n(null);
        }
        X7 x78 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom");
        if (c3316l != null) {
            final int i15 = 4;
            x78.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i15) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x78.n(null);
        }
        X7 x79 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode");
        if (c3316l != null) {
            final int i16 = 5;
            x79.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i16) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x79.n(null);
        }
        X7 x710 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort");
        if (c3316l != null) {
            final int i17 = 6;
            x710.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i17) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x710.n(null);
        }
        X7 x711 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls");
        if (c3316l != null) {
            final int i18 = 7;
            x711.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i18) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x711.n(null);
        }
        X7 x712 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls");
        if (c3316l != null) {
            final int i19 = 8;
            x712.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i19) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x712.n(null);
        }
        X7 x713 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess");
        if (c3316l != null) {
            final int i20 = 9;
            x713.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i20) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x713.n(null);
        }
        X7 x714 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess");
        if (c3316l != null) {
            final int i21 = 10;
            x714.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i21) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x714.n(null);
        }
        X7 x715 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled");
        if (c3316l != null) {
            final int i22 = 11;
            x715.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i22) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x715.n(null);
        }
        X7 x716 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom");
        if (c3316l != null) {
            final int i23 = 12;
            x716.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i23) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x716.n(null);
        }
        X7 x717 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString");
        if (c3316l != null) {
            final int i24 = 13;
            x717.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i24) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        } else {
            x717.n(null);
        }
        X7 x718 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode");
        if (c3316l == null) {
            x718.n(null);
        } else {
            final int i25 = 14;
            x718.n(new InterfaceC4265b() { // from class: kd.H
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    List listD4;
                    List listD5;
                    List listD6;
                    List listD7;
                    List listD8;
                    List listD9;
                    List listD10;
                    List listD11;
                    List listD12;
                    List listD13;
                    List listD14;
                    List listD15;
                    List listD16;
                    List listD17;
                    C3316l c3316l2 = c3316l;
                    switch (i25) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
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
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
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
                        case 2:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c3316l2.getClass();
                                webSettings3.setUserAgentString(str);
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
                        case 3:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            AbstractC3340k.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            AbstractC3340k.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listD4 = AbstractC3935e.C(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C3305a) {
                                    C3305a c3305a4 = th4;
                                    listD4 = AbstractC3935e.D(c3305a4.f39637a, c3305a4.f39638b, c3305a4.f39639c);
                                } else {
                                    listD4 = AbstractC3935e.D(th4.getClass().getSimpleName(), th4.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            c1521a.c(listD4);
                            break;
                        case 4:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            AbstractC3340k.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            AbstractC3340k.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listD5 = AbstractC3935e.C(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C3305a) {
                                    C3305a c3305a5 = th5;
                                    listD5 = AbstractC3935e.D(c3305a5.f39637a, c3305a5.f39638b, c3305a5.f39639c);
                                } else {
                                    listD5 = AbstractC3935e.D(th5.getClass().getSimpleName(), th5.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            c1521a.c(listD5);
                            break;
                        case 5:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            AbstractC3340k.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            AbstractC3340k.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listD6 = AbstractC3935e.C(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C3305a) {
                                    C3305a c3305a6 = th6;
                                    listD6 = AbstractC3935e.D(c3305a6.f39637a, c3305a6.f39638b, c3305a6.f39639c);
                                } else {
                                    listD6 = AbstractC3935e.D(th6.getClass().getSimpleName(), th6.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            c1521a.c(listD6);
                            break;
                        case 6:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            AbstractC3340k.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            AbstractC3340k.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listD7 = AbstractC3935e.C(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof C3305a) {
                                    C3305a c3305a7 = th7;
                                    listD7 = AbstractC3935e.D(c3305a7.f39637a, c3305a7.f39638b, c3305a7.f39639c);
                                } else {
                                    listD7 = AbstractC3935e.D(th7.getClass().getSimpleName(), th7.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            c1521a.c(listD7);
                            break;
                        case 7:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            AbstractC3340k.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            AbstractC3340k.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listD8 = AbstractC3935e.C(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof C3305a) {
                                    C3305a c3305a8 = th8;
                                    listD8 = AbstractC3935e.D(c3305a8.f39637a, c3305a8.f39638b, c3305a8.f39639c);
                                } else {
                                    listD8 = AbstractC3935e.D(th8.getClass().getSimpleName(), th8.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            c1521a.c(listD8);
                            break;
                        case 8:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            AbstractC3340k.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            AbstractC3340k.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listD9 = AbstractC3935e.C(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof C3305a) {
                                    C3305a c3305a9 = th9;
                                    listD9 = AbstractC3935e.D(c3305a9.f39637a, c3305a9.f39638b, c3305a9.f39639c);
                                } else {
                                    listD9 = AbstractC3935e.D(th9.getClass().getSimpleName(), th9.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            c1521a.c(listD9);
                            break;
                        case 9:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            AbstractC3340k.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            AbstractC3340k.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listD10 = AbstractC3935e.C(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof C3305a) {
                                    C3305a c3305a10 = th10;
                                    listD10 = AbstractC3935e.D(c3305a10.f39637a, c3305a10.f39638b, c3305a10.f39639c);
                                } else {
                                    listD10 = AbstractC3935e.D(th10.getClass().getSimpleName(), th10.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            c1521a.c(listD10);
                            break;
                        case 10:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            AbstractC3340k.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            AbstractC3340k.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listD11 = AbstractC3935e.C(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof C3305a) {
                                    C3305a c3305a11 = th11;
                                    listD11 = AbstractC3935e.D(c3305a11.f39637a, c3305a11.f39638b, c3305a11.f39639c);
                                } else {
                                    listD11 = AbstractC3935e.D(th11.getClass().getSimpleName(), th11.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            c1521a.c(listD11);
                            break;
                        case 11:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            AbstractC3340k.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            AbstractC3340k.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listD12 = AbstractC3935e.C(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof C3305a) {
                                    C3305a c3305a12 = th12;
                                    listD12 = AbstractC3935e.D(c3305a12.f39637a, c3305a12.f39638b, c3305a12.f39639c);
                                } else {
                                    listD12 = AbstractC3935e.D(th12.getClass().getSimpleName(), th12.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            c1521a.c(listD12);
                            break;
                        case 12:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            AbstractC3340k.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            AbstractC3340k.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c3316l2.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listD13 = AbstractC3935e.C(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof C3305a) {
                                    C3305a c3305a13 = th13;
                                    listD13 = AbstractC3935e.D(c3305a13.f39637a, c3305a13.f39638b, c3305a13.f39639c);
                                } else {
                                    listD13 = AbstractC3935e.D(th13.getClass().getSimpleName(), th13.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            c1521a.c(listD13);
                            break;
                        case 13:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c3316l2.getClass();
                                listD14 = AbstractC3935e.C(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof C3305a) {
                                    C3305a c3305a14 = th14;
                                    listD14 = AbstractC3935e.D(c3305a14.f39637a, c3305a14.f39638b, c3305a14.f39639c);
                                } else {
                                    listD14 = AbstractC3935e.D(th14.getClass().getSimpleName(), th14.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            c1521a.c(listD14);
                            break;
                        case 14:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            AbstractC3340k.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            AbstractC3340k.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC3324u enumC3324u = (EnumC3324u) obj30;
                            try {
                                c3316l2.getClass();
                                int iOrdinal = enumC3324u.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listD15 = AbstractC3935e.C(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof C3305a) {
                                    C3305a c3305a15 = th15;
                                    listD15 = AbstractC3935e.D(c3305a15.f39637a, c3305a15.f39638b, c3305a15.f39639c);
                                } else {
                                    listD15 = AbstractC3935e.D(th15.getClass().getSimpleName(), th15.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            c1521a.c(listD15);
                            break;
                        case 15:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            AbstractC3340k.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            AbstractC3340k.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listD16 = AbstractC3935e.C(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof C3305a) {
                                    C3305a c3305a16 = th16;
                                    listD16 = AbstractC3935e.D(c3305a16.f39637a, c3305a16.f39638b, c3305a16.f39639c);
                                } else {
                                    listD16 = AbstractC3935e.D(th16.getClass().getSimpleName(), th16.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            c1521a.c(listD16);
                            break;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            AbstractC3340k.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            AbstractC3340k.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c3316l2.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listD17 = AbstractC3935e.C(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof C3305a) {
                                    C3305a c3305a17 = th17;
                                    listD17 = AbstractC3935e.D(c3305a17.f39637a, c3305a17.f39638b, c3305a17.f39639c);
                                } else {
                                    listD17 = AbstractC3935e.D(th17.getClass().getSimpleName(), th17.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            c1521a.c(listD17);
                            break;
                    }
                }
            });
        }
    }

    public static final void U(B b5, B url) {
        AbstractC3340k.e(b5, "<this>");
        AbstractC3340k.e(url, "url");
        b5.f6010d = url.f6010d;
        String str = url.f6007a;
        AbstractC3340k.e(str, "<set-?>");
        b5.f6007a = str;
        b5.d(url.f6009c);
        List list = url.f6014h;
        AbstractC3340k.e(list, "<set-?>");
        b5.f6014h = list;
        b5.f6011e = url.f6011e;
        b5.f6012f = url.f6012f;
        Jd.z zVar = new Jd.z(8);
        l(zVar, url.f6015i);
        b5.f6015i = zVar;
        b5.f6016j = new l(zVar);
        String str2 = url.f6013g;
        AbstractC3340k.e(str2, "<set-?>");
        b5.f6013g = str2;
        b5.f6008b = url.f6008b;
    }

    public static p V(C3510i c3510i, EnumC3515n enumC3515n) {
        int i5 = c3510i.f40483a;
        int iF = AbstractC0213f.f(i5);
        int i10 = 1;
        if (iF != 0) {
            if (iF == 1) {
                i10 = 2;
            } else {
                if (iF != 2) {
                    throw new IllegalArgumentException("Unknown change type: ".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "REMOVED" : "MODIFIED" : "ADDED"));
                }
                i10 = 3;
            }
        }
        Long lValueOf = Long.valueOf(c3510i.f40485c);
        Long lValueOf2 = Long.valueOf(c3510i.f40486d);
        Uc.r rVarW = W(c3510i.f40484b, enumC3515n);
        p pVar = new p();
        if (i10 == 0) {
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        pVar.f12757a = i10;
        pVar.f12758b = rVarW;
        pVar.f12759c = lValueOf;
        pVar.f12760d = lValueOf2;
        return pVar;
    }

    public static Uc.r W(C3516o c3516o, EnumC3515n enumC3515n) {
        w wVarY = Y(c3516o.f40505d);
        HashMap mapA = c3516o.a(enumC3515n);
        h hVar = c3516o.f40503b;
        hVar.getClass();
        String strC = hVar.f45375a.c();
        Uc.r rVar = new Uc.r();
        if (strC == null) {
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }
        rVar.f12763a = strC;
        rVar.f12764b = mapA;
        rVar.f12765c = wVarY;
        return rVar;
    }

    public static v X(Y y10, EnumC3515n enumC3515n) {
        w wVarY = Y(y10.f40463f);
        List listA = y10.a();
        ArrayList arrayList = new ArrayList(listA.size());
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(V((C3510i) it.next(), enumC3515n));
        }
        ArrayList arrayListB = y10.b();
        ArrayList arrayList2 = new ArrayList(arrayListB.size());
        Iterator it2 = arrayListB.iterator();
        while (it2.hasNext()) {
            arrayList2.add(W((C3516o) it2.next(), enumC3515n));
        }
        v vVar = new v();
        vVar.f12782a = arrayList2;
        vVar.f12783b = arrayList;
        vVar.f12784c = wVarY;
        return vVar;
    }

    public static w Y(b0 b0Var) {
        Boolean boolValueOf = Boolean.valueOf(b0Var.f40468a);
        Boolean boolValueOf2 = Boolean.valueOf(b0Var.f40469b);
        w wVar = new w();
        wVar.f12785a = boolValueOf;
        wVar.f12786b = boolValueOf2;
        return wVar;
    }

    public static final C2537u Z(String str) {
        int i5;
        tg.b.t(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (AbstractC3340k.g(cCharAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i5 = 0;
        }
        int i11 = 119304647;
        while (i5 < length) {
            int iDigit = Character.digit((int) str.charAt(i5), 10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = i10 ^ Integer.MIN_VALUE;
            if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                if (i11 != 119304647) {
                    return null;
                }
                i11 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i13 = i10 * 10;
            int i14 = iDigit + i13;
            if (Integer.compare(i14 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i5++;
            i10 = i14;
        }
        return new C2537u(i10);
    }

    public static final long a(int i5, int i10, int i11, int i12) {
        if (i10 < i5) {
            throw new IllegalArgumentException(("maxWidth(" + i10 + ") must be >= than minWidth(" + i5 + ')').toString());
        }
        if (i12 >= i11) {
            if (i5 < 0 || i11 < 0) {
                throw new IllegalArgumentException(N0.a.e("minWidth(", i5, ") and minHeight(", i11, ") must be >= 0").toString());
            }
            return AbstractC4345a.m(i5, i10, i11, i12);
        }
        throw new IllegalArgumentException(("maxHeight(" + i12 + ") must be >= than minHeight(" + i11 + ')').toString());
    }

    public static final C2539w a0(String str) {
        int i5;
        long j8;
        AbstractC3340k.e(str, "<this>");
        int i10 = 10;
        tg.b.t(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i11 = 1;
        if (AbstractC3340k.g(cCharAt, 48) >= 0) {
            i5 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i5 = 1;
        }
        long j10 = 10;
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i5 < length) {
            int iDigit = Character.digit((int) str.charAt(i5), i10);
            if (iDigit < 0) {
                return null;
            }
            int i12 = length;
            long j13 = j11 ^ Long.MIN_VALUE;
            int i13 = i5;
            if (Long.compare(j13, j12 ^ Long.MIN_VALUE) <= 0) {
                j8 = j10;
            } else {
                if (j12 != 512409557603043100L) {
                    return null;
                }
                if (j10 >= 0) {
                    long j14 = (Long.MAX_VALUE / j10) << i11;
                    j8 = j10;
                    j12 = j14 + ((((-1) - (j14 * j10)) ^ Long.MIN_VALUE) >= (j10 ^ Long.MIN_VALUE) ? i11 : 0);
                } else if (Long.MAX_VALUE < (j10 ^ Long.MIN_VALUE)) {
                    j8 = j10;
                    j12 = 0;
                } else {
                    j12 = 1;
                    j8 = j10;
                }
                if (Long.compare(j13, j12 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j15 = j11 * j8;
            long j16 = (iDigit & 4294967295L) + j15;
            if (Long.compare(j16 ^ Long.MIN_VALUE, j15 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i5 = i13 + 1;
            j11 = j16;
            length = i12;
            j10 = j8;
            i10 = 10;
            i11 = 1;
        }
        return new C2539w(j11);
    }

    public static /* synthetic */ long b(int i5, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(0, i5, 0, i10);
    }

    public static boolean b0(ug.a aVar, He.f fVar, Le.c cVar) {
        if (!(aVar instanceof Callable)) {
            return false;
        }
        try {
            Object objCall = ((Callable) aVar).call();
            if (objCall == null) {
                Ye.d.a(fVar);
                return true;
            }
            try {
                Object objApply = cVar.apply(objCall);
                Ne.b.a(objApply, "The mapper returned a null Publisher");
                ug.a aVar2 = (ug.a) objApply;
                if (!(aVar2 instanceof Callable)) {
                    aVar2.a(fVar);
                    return true;
                }
                try {
                    Object objCall2 = ((Callable) aVar2).call();
                    if (objCall2 == null) {
                        Ye.d.a(fVar);
                        return true;
                    }
                    fVar.e(new Ye.e(fVar, objCall2));
                    return true;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    Ye.d.b(th, fVar);
                    return true;
                }
            } catch (Throwable th2) {
                AbstractC3772b.U(th2);
                Ye.d.b(th2, fVar);
                return true;
            }
        } catch (Throwable th3) {
            AbstractC3772b.U(th3);
            Ye.d.b(th3, fVar);
            return true;
        }
    }

    public static final H c(String urlString) {
        AbstractC3340k.e(urlString, "urlString");
        B b5 = new B();
        C.b(b5, urlString);
        return b5.b();
    }

    public static void c0(C1 c12, AbstractC4345a abstractC4345a) {
        switch (AbstractC0213f.f(c12.v())) {
            case 0:
                abstractC4345a.T(5);
                return;
            case 1:
                abstractC4345a.T(10);
                abstractC4345a.T(c12.n() ? 1L : 0L);
                return;
            case 2:
                abstractC4345a.T(15);
                abstractC4345a.R(c12.r());
                return;
            case 3:
                double doubleValue = c12.getDoubleValue();
                if (Double.isNaN(doubleValue)) {
                    abstractC4345a.T(13);
                    return;
                }
                abstractC4345a.T(15);
                if (doubleValue == -0.0d) {
                    abstractC4345a.R(0.0d);
                    return;
                } else {
                    abstractC4345a.R(doubleValue);
                    return;
                }
            case 4:
                Timestamp timestampU = c12.u();
                abstractC4345a.T(20);
                abstractC4345a.T(timestampU.getSeconds());
                abstractC4345a.T(timestampU.getNanos());
                return;
            case 5:
                String stringValue = c12.getStringValue();
                abstractC4345a.T(25);
                abstractC4345a.U(stringValue);
                abstractC4345a.T(2L);
                return;
            case 6:
                abstractC4345a.T(30);
                abstractC4345a.Q(c12.o());
                abstractC4345a.T(2L);
                return;
            case 7:
                String strT = c12.t();
                abstractC4345a.T(37);
                m mVarL = m.l(strT);
                int size = mVarL.f45369a.size();
                for (int i5 = 5; i5 < size; i5++) {
                    String strG = mVarL.g(i5);
                    abstractC4345a.T(60);
                    abstractC4345a.U(strG);
                }
                return;
            case 8:
                Ia.c cVarQ = c12.q();
                abstractC4345a.T(45);
                abstractC4345a.R(cVarQ.e());
                abstractC4345a.R(cVarQ.f());
                return;
            case 9:
                C3235g c3235gM = c12.m();
                abstractC4345a.T(50);
                Iterator it = c3235gM.getValuesList().iterator();
                while (it.hasNext()) {
                    c0((C1) it.next(), abstractC4345a);
                }
                abstractC4345a.T(2L);
                return;
            case 10:
                C1 c13 = s9.p.f45391a;
                if (s9.p.f45394d.equals(c12.s().getFieldsMap().get("__type__"))) {
                    abstractC4345a.T(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    return;
                }
                if (s9.p.j(c12)) {
                    Map fieldsMap = c12.s().getFieldsMap();
                    abstractC4345a.T(53);
                    int valuesCount = ((C1) fieldsMap.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m().getValuesCount();
                    abstractC4345a.T(15);
                    abstractC4345a.T(valuesCount);
                    abstractC4345a.T(25);
                    abstractC4345a.U(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                    c0((C1) fieldsMap.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR), abstractC4345a);
                    return;
                }
                C3263p0 c3263p0S = c12.s();
                abstractC4345a.T(55);
                for (Map.Entry entry : c3263p0S.getFieldsMap().entrySet()) {
                    String str = (String) entry.getKey();
                    C1 c14 = (C1) entry.getValue();
                    abstractC4345a.T(25);
                    abstractC4345a.U(str);
                    c0(c14, abstractC4345a);
                }
                abstractC4345a.T(2L);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type ".concat(AbstractC3256n.t(c12.v())));
        }
    }

    public static final float d(int i5, int i10) {
        if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147483647) <= 0) {
            if (i5 == 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        double d3 = 2;
        return (((float) ((((i5 >>> 31) << 30) * d3) + (i5 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER))) - 1.0f) / (((float) ((((i10 >>> 31) << 30) * d3) + (Integer.MAX_VALUE & i10))) - 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I r27, android.content.Context r28, com.moloco.sdk.internal.services.events.c r29, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0 r30, int r31, int r32, tf.a r33, tf.l r34, boolean r35, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k r36, lf.AbstractC3464c r37) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.g.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.I, android.content.Context, com.moloco.sdk.internal.services.events.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0, int, int, tf.a, tf.l, boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k, lf.c):java.lang.Object");
    }

    public static final String f(tf.a aVar) {
        String strName;
        if (aVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l) aVar.invoke();
        String lowerCase = (lVar == null || (strName = lVar.name()) == null) ? "UNKNOWN".toLowerCase(Locale.ROOT) : strName.toLowerCase(Locale.ROOT);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final void g(com.moloco.sdk.acm.h hVar, tf.a aVar) {
        String strF = f(aVar);
        if (strF != null) {
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.f28496a;
            hVar.a("creative_type", strF);
        }
    }

    public static final void h(final D countDownTimer, final int i5, final int i10, final tf.a onTimerFinish, C0740o c0740o, final int i11) {
        int i12;
        boolean z2;
        C0740o c0740o2 = c0740o;
        AbstractC3340k.e(countDownTimer, "countDownTimer");
        AbstractC3340k.e(onTimerFinish, "onTimerFinish");
        c0740o2.N(-1599911995);
        if ((i11 & 6) == 0) {
            i12 = (c0740o2.e(countDownTimer) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0740o2.c(i5) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0740o2.c(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0740o2.e(onTimerFinish) ? 2048 : Segment.SHARE_MINIMUM;
        }
        if ((i12 & 1171) == 1170 && c0740o2.x()) {
            c0740o2.I();
        } else {
            float f10 = countDownTimer.f28696c;
            long jB = A6.c.b(f10, f10);
            Z.d dVarB = com.moloco.sdk.internal.i.b(countDownTimer.f28698e, countDownTimer.f28699f);
            Z.i iVar = Z.i.f16922a;
            Z.k kVarA = L.a(iVar);
            c0740o2.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(dVarB, false, c0740o2);
            c0740o2.M(-1323940314);
            L0.b bVar = (L0.b) c0740o2.j(M.f46143e);
            L0.i iVar2 = (L0.i) c0740o2.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o2.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVarA);
            c0740o2.O();
            if (c0740o2.f7843O) {
                c0740o2.k(c4056d);
            } else {
                c0740o2.X();
            }
            c0740o2.f7867x = false;
            C0718d.M(c0740o2, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o2, bVar, C4054b.f45455d);
            C0718d.M(c0740o2, iVar2, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o2, interfaceC4193p0, C4054b.f45458g, c0740o2), c0740o2, 2058660585);
            c0740o2.M(-2137368960);
            P p10 = C0732k.f7800a;
            boolean z10 = countDownTimer.f28695b;
            int i13 = i12;
            long j8 = countDownTimer.f28701h;
            long j10 = countDownTimer.f28700g;
            if (z10) {
                c0740o2.M(2067666933);
                c0740o2.M(-210384916);
                boolean zE = c0740o2.e("rewarded_countdown_timer");
                Object objF = c0740o2.F();
                if (zE || objF == p10) {
                    objF = new C1915d(11);
                    c0740o2.U(objF);
                }
                c0740o2.p(false);
                int i14 = i13 << 18;
                A6.h.c(j8, j10, Fe.g.J(iVar, false, (tf.l) objF), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, L0.f.b(jB), onTimerFinish, null, i5, i10, c0740o2, ((i13 << 6) & 458752) | (29360128 & i14) | (i14 & 234881024));
                c0740o2.p(false);
                z2 = false;
            } else {
                String str = countDownTimer.f28694a;
                if (str == null || str.length() <= 0) {
                    z2 = false;
                    c0740o2.M(2069220715);
                    c0740o2.p(false);
                } else {
                    c0740o2.M(2068452876);
                    c0740o2.M(-210357300);
                    boolean zE2 = c0740o2.e("rewarded_countdown_timer_custom");
                    Object objF2 = c0740o2.F();
                    if (zE2 || objF2 == p10) {
                        objF2 = new C1915d(12);
                        c0740o2.U(objF2);
                    }
                    z2 = false;
                    c0740o2.p(false);
                    int i15 = i13 << 21;
                    A6.c.e(j8, j10, Fe.g.J(iVar, false, (tf.l) objF2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, L0.f.b(jB), onTimerFinish, countDownTimer.f28694a, null, i5, i10, c0740o2, ((i13 << 6) & 458752) | (i15 & 234881024) | (i15 & 1879048192));
                    c0740o2 = c0740o2;
                    c0740o2.p(false);
                }
            }
            wg.b.e(c0740o2, z2, z2, true, z2);
            c0740o2.p(z2);
        }
        C0729i0 c0729i0R = c0740o2.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new tf.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    xg.g.h(countDownTimer, i5, i10, onTimerFinish, (C0740o) obj, i11 | 1);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final void i(C1542g c1542g) {
        AbstractC3340k.e(c1542g, "<this>");
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal == 3) {
            c1542g.e0(r.f19539f);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            c1542g.e0(r.f19535b);
        }
    }

    public static final void l(Nd.k kVar, Nd.k builder) {
        AbstractC3340k.e(kVar, "<this>");
        AbstractC3340k.e(builder, "builder");
        for (Map.Entry entry : builder.b()) {
            kVar.f((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final boolean p(C1542g c1542g) {
        C1542g c1542g2 = c1542g.f19501e;
        if (c1542g2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!q(c1542g2, false)) {
            return false;
        }
        c1542g.f19501e = null;
        return true;
    }

    public static final boolean q(C1542g c1542g, boolean z2) {
        AbstractC3340k.e(c1542g, "<this>");
        int iOrdinal = c1542g.f19500d.ordinal();
        r rVar = r.f19539f;
        if (iOrdinal == 0) {
            c1542g.e0(rVar);
            return true;
        }
        if (iOrdinal == 1) {
            if (!p(c1542g)) {
                return false;
            }
            c1542g.e0(rVar);
            return true;
        }
        if (iOrdinal == 2) {
            if (z2) {
                c1542g.e0(rVar);
            }
            return z2;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    throw new Q((byte) 0, 9);
                }
            } else {
                if (!p(c1542g)) {
                    return false;
                }
                c1542g.e0(r.f19537d);
            }
        }
        return true;
    }

    public static final double r(int i5, int i10, int i11, int i12, int i13) {
        double d3 = i11 / i5;
        double d5 = i12 / i10;
        int iF = AbstractC0213f.f(i13);
        if (iF == 0) {
            return Math.max(d3, d5);
        }
        if (iF == 1) {
            return Math.min(d3, d5);
        }
        throw new Q((byte) 0, 9);
    }

    public static final long s(long j8, long j10) {
        return Ba.c.a(android.support.v4.media.session.b.S((int) (j10 >> 32), L0.a.g(j8), L0.a.e(j8)), android.support.v4.media.session.b.S((int) (j10 & 4294967295L), L0.a.f(j8), L0.a.d(j8)));
    }

    public static final int t(int i5, long j8) {
        return android.support.v4.media.session.b.S(i5, L0.a.f(j8), L0.a.d(j8));
    }

    public static final int u(int i5, long j8) {
        return android.support.v4.media.session.b.S(i5, L0.a.g(j8), L0.a.e(j8));
    }

    public static Handler v(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Y0.c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final void w(C1542g c1542g) {
        t tVar;
        C4188n c4188n;
        InterfaceC1540e focusManager;
        AbstractC3340k.e(c1542g, "<this>");
        int iOrdinal = c1542g.f19500d.ordinal();
        r rVar = r.f19537d;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                c1542g.e0(r.f19538e);
                return;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 5) {
                    return;
                }
                c1542g.e0(rVar);
                return;
            }
        }
        y yVar = c1542g.k;
        if (yVar != null && (tVar = yVar.f45561e) != null && (c4188n = tVar.f45517g) != null && (focusManager = c4188n.getFocusManager()) != null) {
            ((b7.k) focusManager).p(true);
        }
        c1542g.e0(rVar);
    }

    public static InvocationHandler x() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, new Object[0]).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m9.AbstractC3501A y(java.util.Map r8) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.g.y(java.util.Map):m9.A");
    }

    public static long z(double d3) {
        Fe.e.p("not a normal value", B(d3));
        int exponent = Math.getExponent(d3);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d3) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public abstract void J(U3.g gVar, U3.g gVar2);

    public abstract void K(U3.g gVar, Thread thread);

    public abstract boolean j(C2849f c2849f);

    public abstract boolean k();

    public abstract boolean m(U3.h hVar, U3.c cVar, U3.c cVar2);

    public abstract boolean n(U3.h hVar, Object obj, Object obj2);

    public abstract boolean o(U3.h hVar, U3.g gVar, U3.g gVar2);
}
