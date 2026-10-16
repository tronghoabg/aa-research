package Ab;

import A.AbstractC0213f;
import C6.l;
import E5.C0441b;
import E5.C0456i0;
import E5.H0;
import E5.I;
import F5.f;
import J8.AbstractC0640o;
import J8.C0641p;
import K8.C0693e;
import N1.L;
import Pc.C0797m;
import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import Rc.e;
import Sc.b;
import U1.C0850u;
import U1.G;
import Uc.q;
import Uc.x;
import W9.AbstractServiceC1236g;
import a.AbstractC1304a;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.A0;
import androidx.fragment.app.C1416e;
import androidx.fragment.app.C1424m;
import androidx.fragment.app.F;
import androidx.fragment.app.o0;
import androidx.fragment.app.t0;
import com.applovin.impl.EnumC1641i;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.e2;
import com.applovin.impl.f1;
import com.applovin.impl.f4;
import com.applovin.impl.g1;
import com.applovin.impl.l7;
import com.applovin.impl.m8;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.internal.downloader.h;
import com.vungle.ads.internal.downloader.k;
import com.vungle.ads.internal.load.c;
import com.vungle.ads.internal.load.i;
import com.vungle.ads.internal.load.j;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.o;
import f6.C2613z;
import f9.m;
import f9.n;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import m9.C3514m;
import m9.C3516o;
import m9.a0;
import m9.r;
import ne.C3618a;
import org.json.JSONException;
import org.json.JSONObject;
import re.C3979c;
import s8.g;
import vf.AbstractC4345a;
import xa.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1255c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1256d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i5) {
        this.f1253a = i5;
        this.f1254b = obj;
        this.f1255c = obj2;
        this.f1256d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Task taskE;
        JSONObject jSONObjectOptJSONObject;
        switch (this.f1253a) {
            case 0:
                h.a((k) this.f1254b, (h) this.f1255c, (c) this.f1256d);
                return;
            case 1:
                i.a((j) this.f1254b, (i3) this.f1255c, (o) this.f1256d);
                return;
            case 2:
                C0456i0 c0456i0 = (C0456i0) this.f1254b;
                c0456i0.getClass();
                e0 e0VarG = ((C3406H) this.f1255c).g();
                f fVar = c0456i0.f3418c;
                I i5 = fVar.f3897g;
                i5.getClass();
                l lVar = fVar.f3894d;
                lVar.getClass();
                lVar.f1845b = AbstractC3409K.j(e0VarG);
                if (!e0VarG.isEmpty()) {
                    lVar.f1848e = (C2613z) e0VarG.get(0);
                    C2613z c2613z = (C2613z) this.f1256d;
                    c2613z.getClass();
                    lVar.f1849f = c2613z;
                }
                if (((C2613z) lVar.f1847d) == null) {
                    lVar.f1847d = l.q(i5, (AbstractC3409K) lVar.f1845b, (C2613z) lVar.f1848e, (H0) lVar.f1844a);
                }
                lVar.E(i5.o0());
                return;
            case 3:
                Fe.h this$0 = (Fe.h) this.f1254b;
                AbstractC3340k.e(this$0, "this$0");
                String str = (String) this.f1255c;
                String str2 = (String) this.f1256d;
                X2.j jVar = this$0.f4090d;
                if (jVar != null) {
                    ((WebView) jVar.f16076c).loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
                }
                C3979c c3979c = this$0.f4089c;
                if (c3979c != null) {
                    c3979c.a(str2);
                    return;
                }
                return;
            case 4:
                Boolean bool = (Boolean) this.f1256d;
                AbstractC0640o abstractC0640oS = d.s((C0797m) this.f1254b);
                C0801q c0801q = (C0801q) this.f1255c;
                if (abstractC0640oS == null) {
                    c0801q.b(AbstractC1304a.B());
                    return;
                }
                try {
                    c0801q.a(H.k0((C0641p) Tasks.await(FirebaseAuth.getInstance(g.f(((C0693e) abstractC0640oS).f6629c)).i(abstractC0640oS, bool.booleanValue()))));
                    return;
                } catch (Exception e7) {
                    c0801q.b(AbstractC1304a.G(e7));
                    return;
                }
            case 5:
                g gVar = (g) this.f1255c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1256d;
                HashMap map = Qc.c.f9945c;
                ((Qc.c) this.f1254b).getClass();
                try {
                    gVar.a();
                    String str3 = gVar.f45329b;
                    gVar.a();
                    Qc.f fVarA = Qc.c.a(gVar.f45330c);
                    Boolean boolValueOf = Boolean.valueOf(gVar.k());
                    Map map2 = (Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(gVar));
                    Qc.g gVar2 = new Qc.g();
                    if (str3 == null) {
                        throw new IllegalStateException("Nonnull field \"name\" is null.");
                    }
                    gVar2.f9964a = str3;
                    gVar2.f9965b = fVarA;
                    gVar2.f9966c = boolValueOf;
                    if (map2 == null) {
                        throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
                    }
                    gVar2.f9967d = map2;
                    taskCompletionSource.setResult(gVar2);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 6:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f1255c;
                g gVar3 = (g) this.f1256d;
                e eVar = (e) this.f1254b;
                try {
                    Nc.d dVar = new Nc.d();
                    gVar3.a();
                    if (gVar3.f45329b.equals("[DEFAULT]")) {
                        dVar.put("isCrashlyticsCollectionEnabled", Boolean.valueOf(e.a(eVar, g.e())));
                    }
                    taskCompletionSource2.setResult(dVar);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 7:
                Map map3 = (Map) this.f1255c;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f1256d;
                ((b) this.f1254b).getClass();
                try {
                    b7.k kVarB = b.b(map3);
                    String str4 = (String) map3.get("longDynamicLink");
                    if (str4 != null) {
                        ((Bundle) kVarB.f19397c).putParcelable("dynamicLink", Uri.parse(str4));
                    }
                    Integer num = 1;
                    Integer num2 = (Integer) map3.get("shortLinkType");
                    if (num2 != null) {
                        int iIntValue = num2.intValue();
                        if (iIntValue == 0) {
                            num = 1;
                        } else if (iIntValue == 1) {
                            num = 2;
                        }
                    }
                    HashMap map4 = new HashMap();
                    n nVar = (n) Tasks.await(kVarB.n(num.intValue()));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = nVar.f35262c.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((m) it.next()).f35259a);
                    }
                    map4.put("url", nVar.f35260a.toString());
                    map4.put("warnings", arrayList);
                    map4.put("previewLink", nVar.f35261b.toString());
                    taskCompletionSource3.setResult(map4);
                    return;
                } catch (Exception e12) {
                    taskCompletionSource3.setException(e12);
                    return;
                }
            case 8:
                G g9 = (G) this.f1254b;
                g9.getClass();
                e0 e0VarG2 = ((C3406H) this.f1255c).g();
                V1.d dVar2 = g9.f11936c;
                C0850u c0850u = dVar2.f12905g;
                c0850u.getClass();
                l lVar2 = dVar2.f12902d;
                lVar2.getClass();
                lVar2.f1845b = AbstractC3409K.j(e0VarG2);
                if (!e0VarG2.isEmpty()) {
                    lVar2.f1848e = (k2.H) e0VarG2.get(0);
                    k2.H h10 = (k2.H) this.f1256d;
                    h10.getClass();
                    lVar2.f1849f = h10;
                }
                if (((k2.H) lVar2.f1847d) == null) {
                    lVar2.f1847d = l.r(c0850u, (AbstractC3409K) lVar2.f1845b, (k2.H) lVar2.f1848e, (L) lVar2.f1844a);
                }
                lVar2.F(c0850u.o0());
                return;
            case 9:
                Uc.n nVar2 = (Uc.n) this.f1254b;
                String str5 = (String) this.f1255c;
                C0800p c0800p = (C0800p) this.f1256d;
                try {
                    Tasks.await(Uc.f.c(nVar2).i(str5));
                    c0800p.a(null);
                    return;
                } catch (Exception e13) {
                    AbstractC4345a.K(c0800p, e13);
                    return;
                }
            case 10:
                Uc.n nVar3 = (Uc.n) this.f1254b;
                Uc.j jVar2 = (Uc.j) this.f1255c;
                C0801q c0801q2 = (C0801q) this.f1256d;
                try {
                    c0801q2.a((Void) Tasks.await(Uc.f.c(nVar3).d(jVar2.f12743a).b()));
                    return;
                } catch (Exception e14) {
                    AbstractC4345a.K(c0801q2, e14);
                    return;
                }
            case 11:
                Uc.n nVar4 = (Uc.n) this.f1254b;
                Uc.j jVar3 = (Uc.j) this.f1255c;
                C0801q c0801q3 = (C0801q) this.f1256d;
                try {
                    C3514m c3514mD = Uc.f.c(nVar4).d(jVar3.f12743a);
                    Map map5 = jVar3.f12744b;
                    Objects.requireNonNull(map5);
                    Map map6 = map5;
                    Boolean bool2 = jVar3.f12745c.f12761a;
                    if (bool2 == null || !bool2.booleanValue()) {
                        List list = jVar3.f12745c.f12762b;
                        taskE = list != null ? c3514mD.e(map6, a0.a(xg.g.D(list))) : c3514mD.e(map6, a0.f40464c);
                    } else {
                        taskE = c3514mD.e(map6, a0.f40465d);
                    }
                    c0801q3.a((Void) Tasks.await(taskE));
                    return;
                } catch (Exception e15) {
                    AbstractC4345a.K(c0801q3, e15);
                    return;
                }
            case 12:
                Uc.j jVar4 = (Uc.j) this.f1254b;
                Uc.n nVar5 = (Uc.n) this.f1255c;
                C0800p c0800p2 = (C0800p) this.f1256d;
                HashMap map7 = Uc.f.f12728h;
                try {
                    c0800p2.a(xg.g.W((C3516o) Tasks.await(Uc.f.c(nVar5).d(jVar4.f12743a).c(xg.g.H(jVar4.f12746d))), xg.g.G(jVar4.f12747e)));
                    return;
                } catch (Exception e16) {
                    AbstractC4345a.K(c0800p2, e16);
                    return;
                }
            case 13:
                Uc.n nVar6 = (Uc.n) this.f1254b;
                List<x> list2 = (List) this.f1255c;
                C0801q c0801q4 = (C0801q) this.f1256d;
                try {
                    FirebaseFirestore firebaseFirestoreC = Uc.f.c(nVar6);
                    firebaseFirestoreC.k.C();
                    C0441b c0441b = new C0441b(firebaseFirestoreC);
                    ArrayList arrayList2 = (ArrayList) c0441b.f3292d;
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) c0441b.f3291c;
                    for (x xVar : list2) {
                        int i10 = xVar.f12787a;
                        if (i10 == 0) {
                            throw null;
                        }
                        String str6 = xVar.f12788b;
                        Objects.requireNonNull(str6);
                        Map map8 = xVar.f12789c;
                        C3514m c3514mD2 = firebaseFirestoreC.d(str6);
                        int iF = AbstractC0213f.f(i10);
                        s9.h hVar = c3514mD2.f40495a;
                        if (iF == 1) {
                            Objects.requireNonNull(map8);
                            C3618a c3618aI = firebaseFirestore.f27329h.i(map8);
                            firebaseFirestore.k(c3514mD2);
                            c0441b.r();
                            arrayList2.add(new t9.l(hVar, (s9.l) c3618aI.f41020a, (t9.f) c3618aI.f41021b, t9.m.a(true), (List) c3618aI.f41022c));
                        } else if (iF == 2) {
                            q qVar = xVar.f12790d;
                            Objects.requireNonNull(qVar);
                            Boolean bool3 = qVar.f12761a;
                            if (bool3 == null || !bool3.booleanValue()) {
                                List list3 = qVar.f12762b;
                                if (list3 != null) {
                                    ArrayList arrayListD = xg.g.D(list3);
                                    Objects.requireNonNull(map8);
                                    c0441b.k(c3514mD2, map8, a0.a(arrayListD));
                                } else {
                                    Objects.requireNonNull(map8);
                                    c0441b.k(c3514mD2, map8, a0.f40464c);
                                }
                            } else {
                                Objects.requireNonNull(map8);
                                c0441b.k(c3514mD2, map8, a0.f40465d);
                            }
                        } else if (iF == 3) {
                            firebaseFirestore.k(c3514mD2);
                            c0441b.r();
                            arrayList2.add(new t9.e(hVar, t9.m.f45963c));
                        }
                    }
                    Tasks.await(c0441b.e());
                    c0801q4.a(null);
                    return;
                } catch (Exception e17) {
                    AbstractC4345a.K(c0801q4, e17);
                    return;
                }
            case 14:
                Uc.n nVar7 = (Uc.n) this.f1254b;
                Uc.j jVar5 = (Uc.j) this.f1255c;
                C0799o c0799o = (C0799o) this.f1256d;
                try {
                    C3514m c3514mD3 = Uc.f.c(nVar7).d(jVar5.f12743a);
                    Map map9 = jVar5.f12744b;
                    Objects.requireNonNull(map9);
                    Map map10 = map9;
                    HashMap map11 = new HashMap();
                    for (Object obj : map10.keySet()) {
                        if (obj instanceof String) {
                            map11.put(r.b((String) obj), map10.get(obj));
                        } else {
                            if (!(obj instanceof r)) {
                                throw new IllegalArgumentException("Invalid key type in update data. Supported types are String and FieldPath.");
                            }
                            map11.put((r) obj, map10.get(obj));
                        }
                    }
                    r rVar = (r) map11.keySet().iterator().next();
                    Object obj2 = map11.get(rVar);
                    ArrayList arrayList3 = new ArrayList();
                    for (r rVar2 : map11.keySet()) {
                        if (!rVar2.equals(rVar)) {
                            arrayList3.add(rVar2);
                            arrayList3.add(map11.get(rVar2));
                        }
                    }
                    c0799o.a((Void) Tasks.await(c3514mD3.f(rVar, obj2, arrayList3.toArray())));
                    return;
                } catch (Exception e18) {
                    AbstractC4345a.K(c0799o, e18);
                    return;
                }
            case 15:
                Intent intent = (Intent) this.f1255c;
                TaskCompletionSource taskCompletionSource4 = (TaskCompletionSource) this.f1256d;
                AbstractServiceC1236g abstractServiceC1236g = (AbstractServiceC1236g) this.f1254b;
                abstractServiceC1236g.getClass();
                try {
                    abstractServiceC1236g.b(intent);
                    return;
                } finally {
                    taskCompletionSource4.setResult(null);
                }
            case 16:
                Map map12 = (Map) this.f1255c;
                TaskCompletionSource taskCompletionSource5 = (TaskCompletionSource) this.f1256d;
                ((Yc.f) this.f1254b).getClass();
                try {
                    FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
                    Object obj3 = map12.get("enabled");
                    Objects.requireNonNull(obj3);
                    firebaseMessagingC.i(((Boolean) obj3).booleanValue());
                    Nc.d dVar3 = new Nc.d();
                    dVar3.put("isAutoInitEnabled", Boolean.valueOf(firebaseMessagingC.f27364e.f()));
                    taskCompletionSource5.setResult(dVar3);
                    return;
                } catch (Exception e19) {
                    taskCompletionSource5.setException(e19);
                    return;
                }
            case 17:
                Z9.i iVar = (Z9.i) this.f1254b;
                String str7 = (String) this.f1255c;
                aa.e eVar2 = (aa.e) this.f1256d;
                X2.j jVar6 = iVar.f17062a;
                w8.d dVar4 = (w8.d) ((O9.b) jVar6.f16075b).get();
                if (dVar4 == null) {
                    return;
                }
                JSONObject jSONObject = eVar2.f17426e;
                if (jSONObject.length() < 1) {
                    return;
                }
                JSONObject jSONObject2 = eVar2.f17423b;
                if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str7)) != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                    if (strOptString.isEmpty()) {
                        return;
                    }
                    synchronized (((Map) jVar6.f16076c)) {
                        try {
                            if (!strOptString.equals(((Map) jVar6.f16076c).get(str7))) {
                                ((Map) jVar6.f16076c).put(str7, strOptString);
                                Bundle bundleB = AbstractC3256n.b("arm_key", str7);
                                bundleB.putString("arm_value", jSONObject2.optString(str7));
                                bundleB.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                bundleB.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                bundleB.putString("group", jSONObjectOptJSONObject.optString("group"));
                                dVar4.b("fp", "personalization_assignment", bundleB);
                                Bundle bundle = new Bundle();
                                bundle.putString("_fpid", strOptString);
                                dVar4.b("fp", "_fpc", bundle);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 18:
                ViewGroup container = (ViewGroup) this.f1254b;
                AbstractC3340k.e(container, "$container");
                C1416e this$02 = (C1416e) this.f1256d;
                AbstractC3340k.e(this$02, "this$0");
                container.endViewTransition((View) this.f1255c);
                this$02.f18393c.f18473a.c(this$02);
                return;
            case 19:
                C1424m this$03 = (C1424m) this.f1256d;
                AbstractC3340k.e(this$03, "this$0");
                F inFragment = ((A0) this.f1254b).f18280c;
                F outFragment = ((A0) this.f1255c).f18280c;
                t0 t0Var = o0.f18517a;
                AbstractC3340k.e(inFragment, "inFragment");
                AbstractC3340k.e(outFragment, "outFragment");
                if (this$03.f18494o) {
                    outFragment.getEnterTransitionCallback();
                    return;
                } else {
                    inFragment.getEnterTransitionCallback();
                    return;
                }
            case 20:
                ((com.applovin.impl.adview.a) this.f1254b).a((String) this.f1255c, (String) this.f1256d);
                return;
            case 21:
                ((e2) this.f1254b).b((d2) this.f1255c, (List) this.f1256d);
                return;
            case 22:
                ((f1) this.f1254b).a((List) this.f1255c, (u.n) this.f1256d);
                return;
            case 23:
                ((f1) this.f1254b).b((g1) this.f1255c, (u.n) this.f1256d);
                return;
            case 24:
                ((f4) this.f1254b).a((String) this.f1255c, (Runnable) this.f1256d);
                return;
            case 25:
                ((f4) this.f1254b).a((View) this.f1255c, (List) this.f1256d);
                return;
            case 26:
                l7.a((com.applovin.impl.sdk.k) this.f1254b, (String) this.f1255c, (com.applovin.impl.sdk.ad.b) this.f1256d);
                return;
            case 27:
                ((m8) this.f1254b).b((com.applovin.impl.sdk.network.e) this.f1255c, (AppLovinPostbackListener) this.f1256d);
                return;
            case 28:
                ((MaxAdViewImpl) this.f1254b).a((a.InterfaceC0014a) this.f1255c, (EnumC1641i) this.f1256d);
                return;
            default:
                ((MaxFullscreenAdImpl.b) this.f1254b).a((c3) this.f1255c, (MaxAd) this.f1256d);
                return;
        }
    }
}
