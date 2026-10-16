package E5;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import Va.Ab;
import Va.AbstractC0897a;
import Va.C1065mb;
import Va.C1078nb;
import Va.C1151t7;
import Va.C1214y7;
import Va.E7;
import Va.H9;
import Va.Ra;
import Va.V9;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import m9.C3514m;
import md.AbstractC3537e;
import od.C3699k0;
import od.C3711o0;
import od.RunnableC3666A;
import od.RunnableC3705m0;
import od.T0;
import wa.C4398a;

/* renamed from: E5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0441b implements T0 {

    /* renamed from: e, reason: collision with root package name */
    public static int f3285e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f3286f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static int f3287g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f3288h = 1;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3289a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3290b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3291c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3292d;

    public /* synthetic */ C0441b(int i5) {
        this.f3289a = i5;
    }

    public static String u(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 47778)) ^ ((c11 >>> 5) + 47206)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 37820) ^ ((c12 + i11) ^ ((c12 << 4) + 31985))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String v(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 45569)) ^ ((c11 >>> 5) + 5669)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 24364) ^ ((c12 + i11) ^ ((c12 << 4) + 60514))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public void a(s9.j jVar) {
        ((HashSet) ((E4.n) this.f3291c).f2939c).add(jVar);
    }

    public void b(s9.j jVar, t9.p pVar) {
        ((ArrayList) ((E4.n) this.f3291c).f2940d).add(new t9.g(jVar, pVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0441b c(s9.j jVar) {
        s9.j jVar2 = (s9.j) this.f3292d;
        s9.j jVar3 = jVar2 == null ? null : (s9.j) jVar2.b(jVar);
        C0441b c0441b = new C0441b((E4.n) this.f3291c, jVar3, 0 == true ? 1 : 0, 13);
        if (jVar3 != null) {
            for (int i5 = 0; i5 < jVar3.f45369a.size(); i5++) {
                c0441b.q(jVar3.g(i5));
            }
        }
        return c0441b;
    }

    public boolean d(U4.b bVar) {
        boolean z2 = true;
        if (bVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f3291c).remove(bVar);
        if (!((ArrayList) this.f3292d).remove(bVar) && !zRemove) {
            z2 = false;
        }
        if (z2) {
            ((U4.d) bVar).c();
        }
        return z2;
    }

    public Task e() {
        Task taskF;
        r();
        this.f3290b = true;
        if (((ArrayList) this.f3292d).isEmpty()) {
            return Tasks.forResult(null);
        }
        Dd.c cVar = ((FirebaseFirestore) this.f3291c).k;
        synchronized (cVar) {
            cVar.C();
            taskF = ((p9.n) cVar.f2643c).f((ArrayList) this.f3292d);
        }
        return taskF;
    }

    public IllegalArgumentException f(String str) {
        String str2;
        s9.j jVar = (s9.j) this.f3292d;
        if (jVar == null || jVar.h()) {
            str2 = "";
        } else {
            str2 = " (found in field " + jVar.c() + ")";
        }
        return new IllegalArgumentException(AbstractC0279p0.l("Invalid data. ", str, str2));
    }

    public void g(double d3, double d5) {
        boolean z2 = this.f3290b;
        double[] dArr = (double[]) this.f3291c;
        double d10 = 1.0d;
        if (!z2) {
            d10 = 1.0d / (((dArr[7] * d5) + (dArr[3] * d3)) + dArr[15]);
        }
        double d11 = ((dArr[4] * d5) + (dArr[0] * d3) + dArr[12]) * d10;
        double d12 = ((dArr[5] * d5) + (dArr[1] * d3) + dArr[13]) * d10;
        double[] dArr2 = (double[]) this.f3292d;
        if (d11 < dArr2[0]) {
            dArr2[0] = d11;
        } else if (d11 > dArr2[1]) {
            dArr2[1] = d11;
        }
        if (d12 < dArr2[2]) {
            dArr2[2] = d12;
        } else if (d12 > dArr2[3]) {
            dArr2[3] = d12;
        }
    }

    public boolean h() {
        String str;
        E4.n nVar = (E4.n) this.f3291c;
        int iF = AbstractC0213f.f(nVar.f2938b);
        if (iF == 0 || iF == 1 || iF == 2) {
            return true;
        }
        if (iF == 3 || iF == 4) {
            return false;
        }
        int i5 = nVar.f2938b;
        if (i5 == 1) {
            str = "Set";
        } else if (i5 == 2) {
            str = "MergeSet";
        } else if (i5 == 3) {
            str = "Update";
        } else if (i5 == 4) {
            str = "Argument";
        } else {
            if (i5 != 5) {
                throw null;
            }
            str = "ArrayArgument";
        }
        A6.c.s("Unexpected case for UserDataSource: %s", str);
        throw null;
    }

    public boolean i(long j8) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((Y2.B) this.f3292d).f16383b;
        int size = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i5);
            if (((p0.m) obj).f43154a == j8) {
                break;
            }
            i5++;
        }
        p0.m mVar = (p0.m) obj;
        if (mVar != null) {
            return mVar.f43160g;
        }
        return false;
    }

    public void j() {
        boolean z2;
        Iterator it = Y4.m.d((Set) this.f3291c).iterator();
        while (it.hasNext()) {
            U4.d dVar = (U4.d) ((U4.b) it.next());
            if (!dVar.e()) {
                synchronized (dVar.f12287c) {
                    z2 = dVar.f12309z == 6;
                }
                if (!z2) {
                    dVar.c();
                    if (this.f3290b) {
                        ((ArrayList) this.f3292d).add(dVar);
                    } else {
                        dVar.a();
                    }
                }
            }
        }
    }

    public void k(C3514m c3514m, Map map, m9.a0 a0Var) {
        FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f3291c;
        firebaseFirestore.k(c3514m);
        Fe.c.l(map, "Provided data must not be null.");
        Fe.c.l(a0Var, "Provided options must not be null.");
        r();
        boolean z2 = a0Var.f40466a;
        m9.f0 f0Var = firebaseFirestore.f27329h;
        ((ArrayList) this.f3292d).add((z2 ? f0Var.e(map, a0Var.f40467b) : f0Var.g(map)).y(c3514m.f40495a, t9.m.f45963c));
    }

    public void l() {
        switch (this.f3289a) {
            case 0:
                if (this.f3290b) {
                    ((Context) this.f3291c).unregisterReceiver((RunnableC0439a) this.f3292d);
                    this.f3290b = false;
                    break;
                }
                break;
            default:
                if (this.f3290b) {
                    ((Context) this.f3291c).unregisterReceiver((RunnableC0439a) this.f3292d);
                    this.f3290b = false;
                    break;
                }
                break;
        }
    }

    public void m(ScheduledFuture scheduledFuture) {
        synchronized (this.f3291c) {
            if (!this.f3290b) {
                this.f3292d = scheduledFuture;
            }
        }
    }

    public void n(boolean z2) {
        C3699k0 c3699k0 = (C3699k0) this.f3291c;
        C3711o0 c3711o0 = (C3711o0) this.f3292d;
        c3711o0.getClass();
        c3711o0.k.execute(new androidx.lifecycle.a0(c3711o0, c3699k0, z2));
    }

    public void o(md.k0 k0Var) {
        C3711o0 c3711o0 = (C3711o0) this.f3292d;
        c3711o0.f42034i.h(2, "{0} SHUTDOWN with {1}", ((C3699k0) this.f3291c).f(), C3711o0.j(k0Var));
        this.f3290b = true;
        c3711o0.k.execute(new RunnableC3666A(15, this, k0Var));
    }

    public void p() {
        int i5 = 1;
        Fe.e.w("transportShutdown() must be called before transportTerminated().", this.f3290b);
        C3711o0 c3711o0 = (C3711o0) this.f3292d;
        AbstractC3537e abstractC3537e = c3711o0.f42034i;
        C3699k0 c3699k0 = (C3699k0) this.f3291c;
        abstractC3537e.h(2, "{0} Terminated", c3699k0.f());
        androidx.lifecycle.a0 a0Var = new androidx.lifecycle.a0(c3711o0, c3699k0, false);
        md.n0 n0Var = c3711o0.k;
        n0Var.execute(a0Var);
        Iterator it = c3711o0.f42035j.iterator();
        if (!it.hasNext()) {
            n0Var.execute(new RunnableC3705m0(this, i5));
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            c3699k0.b();
            throw null;
        }
    }

    public void q(String str) {
        if (str.isEmpty()) {
            throw f("Document fields must not be empty");
        }
        if (h() && str.startsWith("__") && str.endsWith("__")) {
            throw f("Document fields cannot begin and end with \"__\"");
        }
    }

    public void r() {
        if (this.f3290b) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }

    public void s(Object obj, Method method, Object[] objArr) {
        int i5 = f3285e + 35;
        f3286f = i5 % 128;
        int i10 = i5 % 2;
        C1214y7 c1214y7 = (C1214y7) this.f3292d;
        String str = (String) this.f3291c;
        try {
            if (i10 == 0) {
                throw null;
            }
            if (method != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(u("\uf2c7㚠", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
                sb2.append(method.getName());
                String string = sb2.toString();
                ArrayList arrayListN1 = E7.N1(objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(H9) obj});
                ArrayList arrayList = new ArrayList();
                if (!(!this.f3290b)) {
                    arrayList.add(arrayListN1);
                    arrayListN1 = arrayList;
                }
                Ra raB = c1214y7.b();
                C1214y7.s((C1214y7) raB.f13665a, string, true, false, arrayListN1);
                C1214y7.C(new C1151t7(raB, string, false, arrayListN1), false);
                C1214y7.C(new C1151t7(raB, string, true, arrayListN1), true);
            }
            int i11 = f3286f + 53;
            f3285e = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 19 / 0;
            }
        } catch (Exception e7) {
            String strF = c1214y7.f();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(u("䗢탺즶쩍ᒔ÷흝䛞\u0c5c䱟⁴믑芵輮题㲵", 15 - ExpandableListView.getPackedPositionType(0L)).intern());
            sb3.append(method.getName());
            sb3.append(u("䦳운\ue651磁\u0ee4¹ꡭΒࢤ熐题㲵", 10 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            sb3.append(str);
            sb3.append(u("닇㟜ᠵ댬ꭈ笢䜧奛匳꽔", 9 - TextUtils.getTrimmedLength("")).intern());
            AbstractC0897a.f(strF, sb3.toString(), e7);
        }
    }

    public void t(C1065mb c1065mb) {
        f3288h = (f3287g + 103) % 128;
        WebView webViewW = w();
        if (webViewW != null) {
            try {
                V9 v92 = new V9(Ab.F(webViewW), c1065mb);
                this.f3292d = new WeakReference(v92);
                f3287g = (f3288h + 119) % 128;
                webViewW.setWebViewClient(v92);
                this.f3290b = true;
                return;
            } catch (Exception e7) {
                Ab.a0(v(Color.alpha(0) + 16, "ᛳ땖풋\uf258ष砾ꊹ䒗農舼䵋ꛉ\ueaf1\uf487洟禴").intern(), v(27 - TextUtils.indexOf("", "", 0), "⒔\ue70a륛䀭㗗\ue153挢ऺ銳ჸ롯\uf810䤦敢ᛳ땖풋\uf258ष砾鯺퓊슄搼䵋ꛉ\ueddd⦸").intern(), e7, false);
            }
        }
        this.f3290b = false;
        int i5 = f3288h + 75;
        f3287g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public String toString() {
        switch (this.f3289a) {
            case 2:
                return super.toString() + "{numRequests=" + ((Set) this.f3291c).size() + ", isPaused=" + this.f3290b + "}";
            default:
                return super.toString();
        }
    }

    public WebView w() {
        f3287g = (f3288h + 93) % 128;
        WebView webView = (WebView) ((WeakReference) this.f3291c).get();
        int i5 = f3288h + 37;
        f3287g = i5 % 128;
        if (i5 % 2 == 0) {
            return webView;
        }
        throw null;
    }

    public void x(C1078nb c1078nb) {
        WebView webViewW = w();
        if (webViewW != null) {
            f3288h = (f3287g + 101) % 128;
            try {
                if (Ab.c0(webViewW) != null) {
                    f3287g = (f3288h + 107) % 128;
                }
            } catch (Exception e7) {
                Ab.a0(v(ExpandableListView.getPackedPositionChild(0L) + 17, "ᛳ땖풋\uf258ष砾ꊹ䒗農舼䵋ꛉ\ueaf1\uf487洟禴").intern(), v((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 29, "⒔\ue70a륛䀭㗗\ue153挢ऺ銳ჸ롯\uf810䤦敢ᛳ땖䷣\uf1dc쩹陣㿛భ❘儲슄搼䵋ꛉ\ueddd⦸").intern(), e7, false);
            }
        }
    }

    public /* synthetic */ C0441b(Object obj, Comparable comparable, boolean z2, int i5) {
        this.f3289a = i5;
        this.f3291c = obj;
        this.f3292d = comparable;
        this.f3290b = z2;
    }

    public C0441b() {
        this.f3289a = 2;
        this.f3291c = Collections.newSetFromMap(new WeakHashMap());
        this.f3292d = new ArrayList();
    }

    public C0441b(LinkedHashMap linkedHashMap, Y2.B b5) {
        this.f3289a = 12;
        this.f3291c = linkedHashMap;
        this.f3292d = b5;
    }

    public C0441b(Context context, Handler handler, U1.r rVar) {
        this.f3289a = 3;
        this.f3291c = context.getApplicationContext();
        this.f3292d = new RunnableC0439a(this, handler, rVar, 1);
    }

    public C0441b(Context context, Handler handler, F f10) {
        this.f3289a = 0;
        this.f3291c = context.getApplicationContext();
        this.f3292d = new RunnableC0439a(this, handler, f10, 0);
    }

    public C0441b(FirebaseFirestore firebaseFirestore) {
        this.f3289a = 9;
        this.f3292d = new ArrayList();
        this.f3290b = false;
        this.f3291c = firebaseFirestore;
    }

    public C0441b(S1.g gVar) {
        this.f3289a = 7;
        this.f3291c = gVar;
        this.f3292d = new C4398a(24);
    }

    public C0441b(boolean z2, double[] dArr, double[] dArr2) {
        this.f3289a = 8;
        this.f3290b = z2;
        this.f3291c = dArr;
        this.f3292d = dArr2;
    }

    public C0441b(C3711o0 c3711o0, C3699k0 c3699k0) {
        this.f3289a = 10;
        this.f3292d = c3711o0;
        this.f3290b = false;
        this.f3291c = c3699k0;
    }

    public C0441b(Object obj) {
        this.f3289a = 11;
        this.f3291c = obj;
    }
}
