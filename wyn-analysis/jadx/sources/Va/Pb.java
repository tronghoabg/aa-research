package Va;

import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class Pb extends Mb {

    /* renamed from: h, reason: collision with root package name */
    public ViewOnLayoutChangeListenerC0910b f13614h;

    /* renamed from: i, reason: collision with root package name */
    public C1013ib f13615i;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f13613g = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    public Ob f13616j = new Ob();

    public Pb(C1013ib c1013ib) {
        this.f13615i = c1013ib;
    }

    public abstract Lb A();

    public abstract void B(Object obj, ArrayList arrayList);

    public abstract ViewOnLayoutChangeListenerC0910b C();

    @Override // Va.Mb
    public final String q(Object obj) {
        return (this.f13616j.f13588i ? (ViewOnLayoutChangeListenerC0910b) this.f13613g.get(obj) : this.f13614h).q(obj);
    }

    public abstract View t(Object obj);

    @Override // Va.Mb, Va.Lb
    public final /* synthetic */ void v(JSONObject jSONObject, View view, Object obj) {
        r(jSONObject, (WebView) view, obj);
    }

    public final void x(String str, JSONObject jSONObject, Object obj) {
        Ob ob2 = this.f13616j;
        boolean z2 = ob2.f13583d && !TextUtils.isEmpty(ob2.f13580a);
        boolean z10 = this.f13616j.f13588i;
        WeakHashMap weakHashMap = this.f13613g;
        ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910bC = z10 ? (ViewOnLayoutChangeListenerC0910b) weakHashMap.get(obj) : this.f13614h;
        if (viewOnLayoutChangeListenerC0910bC == null) {
            viewOnLayoutChangeListenerC0910bC = C();
            if (this.f13616j.f13588i) {
                weakHashMap.put(obj, viewOnLayoutChangeListenerC0910bC);
            } else {
                this.f13614h = viewOnLayoutChangeListenerC0910bC;
            }
            viewOnLayoutChangeListenerC0910bC.l(A());
        }
        int i5 = ViewOnLayoutChangeListenerC0910b.f14001p + 57;
        ViewOnLayoutChangeListenerC0910b.f14002q = i5 % 128;
        int i10 = i5 % 2;
        WeakHashMap weakHashMap2 = viewOnLayoutChangeListenerC0910bC.f14007l;
        if (i10 == 0) {
            weakHashMap2.keySet().iterator();
            throw null;
        }
        Iterator it = weakHashMap2.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = viewOnLayoutChangeListenerC0910bC.f14009n;
            if (!zHasNext) {
                arrayList.clear();
                viewOnLayoutChangeListenerC0910bC.k = null;
                weakHashMap2.clear();
                int i11 = (ViewOnLayoutChangeListenerC0910b.f14001p + 103) % 128;
                ViewOnLayoutChangeListenerC0910b.f14002q = i11;
                Ob ob3 = this.f13616j;
                String str2 = ob3.f13580a;
                List list = ob3.f13581b;
                boolean z11 = ob3.f13586g;
                boolean z12 = ob3.f13587h;
                viewOnLayoutChangeListenerC0910bC.f14005i = z2;
                viewOnLayoutChangeListenerC0910bC.f14008m = new C1218z(str2, z12);
                viewOnLayoutChangeListenerC0910bC.f14006j = z11;
                viewOnLayoutChangeListenerC0910bC.f14003g = list;
                int i12 = (i11 + 71) % 128;
                ViewOnLayoutChangeListenerC0910b.f14001p = i12;
                viewOnLayoutChangeListenerC0910bC.f14004h = str;
                ViewOnLayoutChangeListenerC0910b.f14002q = (i12 + 123) % 128;
                if (!ob3.f13585f) {
                    super.v(jSONObject, null, obj);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                B(obj, arrayList2);
                List arrayList3 = new ArrayList();
                C1013ib c1013ib = this.f13615i;
                if (c1013ib != null) {
                    C1214y7 c1214y7 = (C1214y7) c1013ib.f14299c;
                    try {
                        C1126r8 c1126r8 = (C1126r8) c1013ib.f14297a;
                        int i13 = C1214y7.f14802l;
                        C1203x8 c1203x8 = c1214y7.f14805b;
                        C1214y7.f14803m = (i13 + 53) % 128;
                        arrayList3 = (List) c1126r8.c(c1203x8, c1214y7, Collections.singletonList(obj)).c();
                    } catch (Exception unused) {
                        String strIntern = C1013ib.f(16 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 11 - View.MeasureSpec.getSize(0), "\u0000ￜ\uffff\uffe7\u0004\u000e\u000f\u0000\t\u0000\r￭\u0000\b\n\u000f").intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C1013ib.f(Color.argb(0, 0, 0, 0) + 28, 206 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "￦\u0013\u0013\u0010\u0013\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1\u0018\u0006\u0003\ufff7\n\u0006\u0018\u0014\uffc1\u0007\u0013\u0010\u000e\uffc1").intern());
                        sb2.append((String) c1013ib.f14298b);
                        Ab.x(strIntern, sb2.toString());
                        arrayList3 = null;
                    }
                }
                HashSet hashSet = new HashSet(arrayList2);
                if (arrayList3 != null) {
                    int i14 = AbstractC1104pb.f14493c + 1;
                    AbstractC1104pb.f14492b = i14 % 128;
                    if (i14 % 2 != 0) {
                        hashSet.addAll(arrayList3);
                        throw null;
                    }
                    hashSet.addAll(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList(hashSet);
                int i15 = AbstractC1104pb.f14492b + 57;
                AbstractC1104pb.f14493c = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
                if (arrayList4.isEmpty() || this.f13616j.f13584e) {
                    View viewT = t(obj);
                    if (viewT != null) {
                        ViewOnLayoutChangeListenerC0909ab viewOnLayoutChangeListenerC0909ab = new ViewOnLayoutChangeListenerC0909ab(1);
                        viewOnLayoutChangeListenerC0909ab.f14000c = this;
                        viewOnLayoutChangeListenerC0909ab.f13999b = obj;
                        viewT.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0909ab);
                    }
                    if (arrayList4.isEmpty()) {
                        super.v(jSONObject, null, obj);
                        return;
                    }
                }
                if (!this.f13616j.f13589j) {
                    z(obj, arrayList4);
                    super.v(jSONObject, (WebView) arrayList4.get(0), obj);
                    return;
                }
                Handler handlerI = Cb.i();
                A7.W0 w02 = new A7.W0();
                w02.f735e = this;
                w02.f733c = obj;
                w02.f734d = arrayList4;
                w02.f732b = jSONObject;
                handlerI.post(w02);
                return;
            }
            WebView webView = (WebView) it.next();
            webView.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC0910bC);
            C1091ob c1091ob = (C1091ob) weakHashMap2.get(webView);
            Iterator it2 = arrayList.iterator();
            ViewOnLayoutChangeListenerC0910b.f14002q = (ViewOnLayoutChangeListenerC0910b.f14001p + 29) % 128;
            while (it2.hasNext()) {
                int i16 = ViewOnLayoutChangeListenerC0910b.f14002q + 13;
                ViewOnLayoutChangeListenerC0910b.f14001p = i16 % 128;
                if (i16 % 2 != 0) {
                    c1091ob.f14466c.remove((InterfaceC1039kb) it2.next());
                    throw null;
                }
                c1091ob.f14466c.remove((InterfaceC1039kb) it2.next());
            }
        }
    }

    public final void y(KeyEvent.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b = this.f13616j.f13588i ? (ViewOnLayoutChangeListenerC0910b) this.f13613g.get(callback) : this.f13614h;
        viewOnLayoutChangeListenerC0910b.getClass();
        ViewOnLayoutChangeListenerC0910b.f14001p = (ViewOnLayoutChangeListenerC0910b.f14002q + 59) % 128;
        C1091ob c1091ob = viewOnLayoutChangeListenerC0910b.k;
        WebView webView = null;
        if (c1091ob != null) {
            WebView webViewW = c1091ob.f14465b.w();
            int i5 = ViewOnLayoutChangeListenerC0910b.f14001p + 113;
            ViewOnLayoutChangeListenerC0910b.f14002q = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            webView = webViewW;
        }
        k(jSONObject, webView, callback);
    }

    public final void z(Object obj, ArrayList arrayList) {
        boolean z2 = this.f13616j.f13588i;
        WeakHashMap weakHashMap = this.f13613g;
        ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b = z2 ? (ViewOnLayoutChangeListenerC0910b) weakHashMap.get(obj) : this.f13614h;
        viewOnLayoutChangeListenerC0910b.getClass();
        int i5 = ViewOnLayoutChangeListenerC0910b.f14002q + 81;
        ViewOnLayoutChangeListenerC0910b.f14001p = i5 % 128;
        if (i5 % 2 != 0) {
            arrayList.iterator();
            throw null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ViewOnLayoutChangeListenerC0910b.f14002q = (ViewOnLayoutChangeListenerC0910b.f14001p + 69) % 128;
            viewOnLayoutChangeListenerC0910b.C((WebView) it.next());
        }
        Ob ob2 = this.f13616j;
        if (ob2.f13582c) {
            ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b2 = ob2.f13588i ? (ViewOnLayoutChangeListenerC0910b) weakHashMap.get(obj) : this.f13614h;
            String hexString = Integer.toHexString(((WebView) arrayList.get(0)).hashCode());
            int i10 = ViewOnLayoutChangeListenerC0910b.f14001p;
            viewOnLayoutChangeListenerC0910b2.f14004h = hexString;
            ViewOnLayoutChangeListenerC0910b.f14002q = (i10 + 123) % 128;
        }
    }
}
