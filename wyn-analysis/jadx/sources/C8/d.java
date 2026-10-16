package C8;

import A.AbstractC0213f;
import E5.C0465o;
import E5.F;
import E5.H;
import E5.H0;
import E5.I;
import E5.J0;
import E5.O;
import E5.q0;
import E5.y0;
import E5.z0;
import Ef.C0502n;
import G5.C0535p;
import G5.G;
import J9.C0642a;
import K3.s;
import L8.p;
import L8.q;
import L8.r;
import Pc.C0788d;
import ac.C1346a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.X;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.api.internal.C1687a;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.qonversion.android.sdk.Qonversion;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.network.w;
import com.vungle.ads.internal.persistence.FilePreferences;
import ef.C2515C;
import f6.C2613z;
import ge.InterfaceC2753a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.internal.AbstractC3340k;
import l9.C3445a;
import l9.InterfaceC3446b;
import org.json.JSONException;
import org.json.JSONObject;
import qe.C3892a;
import re.C3979c;
import s8.C4026b;
import t8.C4147a;
import t8.C4148b;
import t8.C4149c;
import u6.AbstractC4256a;
import u6.v;
import uc.C4271h;
import y3.C4552j;
import z9.C4656y;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1914c;

    public /* synthetic */ d(int i5, Object obj, Object obj2) {
        this.f1912a = i5;
        this.f1913b = obj;
        this.f1914c = obj2;
    }

    private final void a() {
        y0 y0Var = (y0) this.f1914c;
        ((O) this.f1913b).getClass();
        try {
            synchronized (y0Var) {
            }
            try {
                y0Var.f3564a.c(y0Var.f3567d, y0Var.f3568e);
            } finally {
                y0Var.b(true);
            }
        } catch (C0465o e7) {
            AbstractC4256a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e7);
            throw new RuntimeException(e7);
        }
    }

    private final void b() {
        C0535p c0535p = (C0535p) this.f1913b;
        H5.e eVar = (H5.e) this.f1914c;
        c0535p.getClass();
        synchronized (eVar) {
        }
        F f10 = c0535p.f4434c;
        int i5 = v.f46721a;
        F5.f fVar = f10.f3030a.f3098r;
        fVar.O(fVar.L((C2613z) fVar.f3894d.f1848e), 1013, new F5.b(6));
    }

    private final void c() {
        AudioTrack audioTrack = (AudioTrack) this.f1913b;
        C4026b c4026b = (C4026b) this.f1914c;
        try {
            audioTrack.flush();
            audioTrack.release();
            c4026b.e();
            synchronized (G.f4255d0) {
                try {
                    int i5 = G.f4257f0 - 1;
                    G.f4257f0 = i5;
                    if (i5 == 0) {
                        G.f4256e0.shutdown();
                        G.f4256e0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            c4026b.e();
            synchronized (G.f4255d0) {
                try {
                    int i10 = G.f4257f0 - 1;
                    G.f4257f0 = i10;
                    if (i10 == 0) {
                        G.f4256e0.shutdown();
                        G.f4256e0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private final void d() {
        O9.a aVar;
        r rVar = (r) this.f1913b;
        O9.b bVar = (O9.b) this.f1914c;
        if (rVar.f7031b != r.f7029d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (rVar) {
            aVar = rVar.f7030a;
            rVar.f7030a = null;
            rVar.f7031b = bVar;
        }
        aVar.f(bVar);
    }

    private final void e() {
        q qVar = (q) this.f1913b;
        O9.b bVar = (O9.b) this.f1914c;
        synchronized (qVar) {
            try {
                if (qVar.f7027b == null) {
                    qVar.f7026a.add(bVar);
                } else {
                    qVar.f7027b.add(bVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        b bVarC;
        boolean z2;
        ae.c cVar;
        Object obj;
        Object obj2;
        Object obj3;
        ae.c cVar2;
        Object obj4;
        int i5 = 2;
        boolean zEquals = false;
        String string = null;
        int i10 = 1;
        switch (this.f1912a) {
            case 0:
                f fVar = (f) this.f1913b;
                fVar.getClass();
                String str = l.f1949b.f2562b;
                p pVar = fVar.f1922e.f1950a;
                String string2 = ((SharedPreferences) pVar.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string3 = ((SharedPreferences) pVar.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string2 == null || string3 == null) {
                    bVarC = null;
                } else {
                    try {
                    } catch (IllegalArgumentException e7) {
                        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Failed to parse TokenType of stored token  with type [", string2, "] with exception: ");
                        sbW.append(e7.getMessage());
                        Log.e(str, sbW.toString(), null);
                        ((SharedPreferences) pVar.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                    if (string2 == null) {
                        throw new NullPointerException("Name is null");
                    }
                    if (string2.equals("DEFAULT_APP_CHECK_TOKEN")) {
                        i5 = 1;
                    } else if (!string2.equals("UNKNOWN_APP_CHECK_TOKEN")) {
                        throw new IllegalArgumentException("No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType.".concat(string2));
                    }
                    int iF = AbstractC0213f.f(i5);
                    if (iF == 0) {
                        bVarC = b.c(string3);
                    } else if (iF != 1) {
                        Log.e(str, "Reached unreachable section in #retrieveAppCheckToken()", null);
                        bVarC = null;
                    } else {
                        bVarC = b.b(string3);
                    }
                }
                if (bVarC != null) {
                    fVar.f1929m = bVarC;
                }
                ((TaskCompletionSource) this.f1914c).setResult(null);
                return;
            case 1:
                l lVar = ((f) this.f1913b).f1922e;
                lVar.getClass();
                b bVar = (b) this.f1914c;
                boolean z10 = bVar instanceof b;
                p pVar2 = lVar.f1950a;
                if (!z10) {
                    ((SharedPreferences) pVar2.get()).edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", bVar.f1907a).putString("com.google.firebase.appcheck.TOKEN_TYPE", "UNKNOWN_APP_CHECK_TOKEN").apply();
                    return;
                }
                SharedPreferences.Editor editorEdit = ((SharedPreferences) pVar2.get()).edit();
                bVar.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("token", bVar.f1907a);
                    jSONObject.put("receivedAt", bVar.f1908b);
                    jSONObject.put("expiresIn", bVar.f1909c);
                    string = jSONObject.toString();
                } catch (JSONException e10) {
                    Log.e("C8.b", "Could not serialize token: " + e10.getMessage());
                }
                editorEdit.putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", string).putString("com.google.firebase.appcheck.TOKEN_TYPE", "DEFAULT_APP_CHECK_TOKEN").apply();
                return;
            case 2:
                com.vungle.ads.internal.load.c.a((com.vungle.ads.internal.load.g) this.f1913b, (com.vungle.ads.internal.model.b) this.f1914c);
                return;
            case 3:
                com.vungle.ads.internal.load.i.a((com.vungle.ads.internal.load.j) this.f1913b, (Throwable) this.f1914c);
                return;
            case 4:
                I i11 = (I) this.f1913b;
                A6.d dVar = (A6.d) this.f1914c;
                int i12 = i11.f3053H - dVar.f391b;
                i11.f3053H = i12;
                if (dVar.f392c) {
                    i11.f3054I = dVar.f393d;
                    i11.f3055J = true;
                }
                if (dVar.f394e) {
                    i11.f3056K = dVar.f395f;
                }
                if (i12 == 0) {
                    J0 j02 = ((q0) dVar.f396g).f3499a;
                    if (!i11.f3089j0.f3499a.p() && j02.p()) {
                        i11.f3090k0 = -1;
                        i11.f3092l0 = 0L;
                    }
                    if (!j02.p()) {
                        List listAsList = Arrays.asList(((z0) j02).f3583h);
                        AbstractC4256a.i(listAsList.size() == i11.f3095o.size());
                        for (int i13 = 0; i13 < listAsList.size(); i13++) {
                            ((H) i11.f3095o.get(i13)).f3038b = (J0) listAsList.get(i13);
                        }
                    }
                    long j8 = -9223372036854775807L;
                    if (i11.f3055J) {
                        if (((q0) dVar.f396g).f3500b.equals(i11.f3089j0.f3500b) && ((q0) dVar.f396g).f3502d == i11.f3089j0.f3515r) {
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            if (j02.p() || ((q0) dVar.f396g).f3500b.a()) {
                                j8 = ((q0) dVar.f396g).f3502d;
                            } else {
                                q0 q0Var = (q0) dVar.f396g;
                                C2613z c2613z = q0Var.f3500b;
                                long j10 = q0Var.f3502d;
                                Object obj5 = c2613z.f35112a;
                                H0 h02 = i11.f3094n;
                                j02.g(obj5, h02);
                                j8 = j10 + h02.f3043e;
                            }
                        }
                        z2 = i10;
                    } else {
                        z2 = 0;
                    }
                    long j11 = j8;
                    i11.f3055J = false;
                    i11.O0((q0) dVar.f396g, 1, i11.f3056K, false, z2, i11.f3054I, j11, -1, false);
                    return;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                FilePreferences.a((FilePreferences) this.f1913b, (HashMap) this.f1914c);
                return;
            case 7:
                Fe.h hVar = (Fe.h) this.f1913b;
                String str2 = (String) this.f1914c;
                Fe.m mVar = (Fe.m) hVar.f4087a;
                C1346a c1346a = (C1346a) mVar.f421a;
                try {
                    mVar.f4105e.getClass();
                    Map map = (Map) X.j(str2);
                    InterfaceC2753a interfaceC2753a = mVar.f4106f;
                    Object obj6 = map.get(JsonStorageKeyNames.DATA_KEY);
                    AbstractC3340k.c(obj6, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    ae.f fVar2 = (ae.f) interfaceC2753a.i((Map) obj6);
                    c1346a.O("ScreenPresenter -> handling action with type " + fVar2.f17648a);
                    ae.e eVar = fVar2.f17648a;
                    int iOrdinal = eVar.ordinal();
                    Fe.h hVar2 = mVar.f4103c;
                    Map map2 = fVar2.f17649b;
                    switch (iOrdinal) {
                        case 1:
                            if (map2 == null || (obj = map2.get((cVar = ae.c.f17628c))) == null) {
                                return;
                            }
                            String str3 = (String) obj;
                            hVar2.getClass();
                            ae.f fVar3 = new ae.f(ae.e.f17639d, cVar, str3);
                            C3979c c3979c = hVar2.f4089c;
                            if (c3979c != null) {
                                c3979c.f(fVar3);
                            }
                            try {
                                hVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                                if (c3979c != null) {
                                    c3979c.e(fVar3);
                                    return;
                                }
                                return;
                            } catch (ActivityNotFoundException unused) {
                                Ba.c.q(hVar2.f4088b, "ScreenActivity -> Couldn't find any Activity to handle the Intent with url ".concat(str3));
                                if (c3979c != null) {
                                    c3979c.b(fVar3);
                                    return;
                                }
                                return;
                            }
                        case 2:
                            if (map2 == null || (obj2 = map2.get(ae.c.f17629d)) == null) {
                                return;
                            }
                            String str4 = (String) obj2;
                            hVar2.getClass();
                            ae.f fVar4 = new ae.f(ae.e.f17640e, ae.c.f17628c, str4);
                            C3979c c3979c2 = hVar2.f4089c;
                            if (c3979c2 != null) {
                                c3979c2.f(fVar4);
                            }
                            try {
                                hVar2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                                hVar2.H(fVar4);
                                return;
                            } catch (ActivityNotFoundException unused2) {
                                Ba.c.q(hVar2.f4088b, "ScreenActivity -> Couldn't find any Activity to handle the Intent with deeplink ".concat(str4));
                                if (c3979c2 != null) {
                                    c3979c2.b(fVar4);
                                    return;
                                }
                                return;
                            }
                        case 3:
                            if (map2 == null || (obj3 = map2.get(ae.c.f17632g)) == null) {
                                return;
                            }
                            String str5 = (String) obj3;
                            try {
                                Ef.H.D(mVar.f4107g, null, new Fe.k(mVar, str5, null), 3);
                                return;
                            } catch (Exception unused3) {
                                Ba.c.q(c1346a, "ScreenPresenter -> failed to open the screen with id ".concat(str5));
                                return;
                            }
                        case 4:
                            if (map2 == null || (obj4 = map2.get((cVar2 = ae.c.f17630e))) == null) {
                                return;
                            }
                            String str6 = (String) obj4;
                            C3892a c3892a = mVar.f4108h;
                            String str7 = c3892a != null ? c3892a.f44260a : null;
                            hVar2.getClass();
                            ae.f fVar5 = new ae.f(ae.e.f17642g, cVar2, str6);
                            C3979c c3979c3 = hVar2.f4089c;
                            if (c3979c3 != null) {
                                c3979c3.f(fVar5);
                            }
                            X2.j jVar = hVar2.f4090d;
                            ProgressBar progressBar = jVar != null ? (ProgressBar) ((C4552j) jVar.f16075b).f48001b : null;
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                            }
                            FragmentActivity activity = hVar2.getActivity();
                            if (activity != null) {
                                Qonversion.INSTANCE.getSharedInstance().products(new Fe.f(str6, str7, activity, hVar2, fVar5));
                                return;
                            }
                            return;
                        case 5:
                            hVar2.getClass();
                            ae.f fVar6 = new ae.f(ae.e.f17643h);
                            C3979c c3979c4 = hVar2.f4089c;
                            if (c3979c4 != null) {
                                c3979c4.f(fVar6);
                            }
                            X2.j jVar2 = hVar2.f4090d;
                            ProgressBar progressBar2 = jVar2 != null ? (ProgressBar) ((C4552j) jVar2.f16075b).f48001b : null;
                            if (progressBar2 != null) {
                                progressBar2.setVisibility(0);
                            }
                            Qonversion.INSTANCE.getSharedInstance().restore(new Fe.d(hVar2, fVar6, i10));
                            return;
                        case 6:
                            hVar2.H(new ae.f(ae.e.f17644i));
                            return;
                        case 7:
                            ae.f fVar7 = new ae.f(ae.e.f17645j);
                            hVar2.getClass();
                            X2.j jVar3 = hVar2.f4090d;
                            ProgressBar progressBar3 = jVar3 != null ? (ProgressBar) ((C4552j) jVar3.f16075b).f48001b : null;
                            if (progressBar3 != null) {
                                progressBar3.setVisibility(8);
                            }
                            FragmentActivity activity2 = hVar2.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            C3979c c3979c5 = hVar2.f4089c;
                            if (c3979c5 != null) {
                                c3979c5.e(fVar7);
                            }
                            if (c3979c5 != null) {
                                c3979c5.c();
                                return;
                            }
                            return;
                        case 8:
                            Object obj7 = map2 != null ? map2.get(ae.c.f17631f) : null;
                            List list = obj7 instanceof List ? (List) obj7 : null;
                            if (list == null || list.isEmpty()) {
                                return;
                            }
                            Qonversion.INSTANCE.getSharedInstance().products(new Fe.j(mVar, list));
                            return;
                        case 9:
                            X2.j jVar4 = hVar2.f4090d;
                            WebView webView = jVar4 != null ? (WebView) jVar4.f16076c : null;
                            if (webView != null) {
                                webView.setVisibility(0);
                            }
                            X2.j jVar5 = hVar2.f4090d;
                            ProgressBar progressBar4 = jVar5 != null ? (ProgressBar) ((C4552j) jVar5.f16075b).f48001b : null;
                            if (progressBar4 == null) {
                                return;
                            }
                            progressBar4.setVisibility(8);
                            return;
                        default:
                            Ba.c.U(c1346a, "ScreenPresenter -> action type " + eVar + " is not supported");
                            return;
                    }
                } catch (Exception e11) {
                    Ba.c.q(c1346a, "ScreenPresenter -> failed to map action from web page: " + e11 + ". Original message: " + str2);
                    return;
                }
            case 8:
                ((C0502n) this.f1913b).C((Ff.e) this.f1914c, C2515C.f34653a);
                return;
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            case 11:
                com.vungle.ads.internal.platform.c.a((com.vungle.ads.internal.platform.c) this.f1913b, (w) this.f1914c);
                return;
            case 12:
                int i14 = d7.f.f34128a;
                d7.e eVar2 = d7.e.f34127d;
                Context context = (Context) this.f1913b;
                int iD = eVar2.d(context, i14);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1914c;
                if (iD != 0) {
                    taskCompletionSource.setException(new IllegalStateException("SafetyNet unavailable; unable to connect to Google Play Services: ".concat(iD != 1 ? iD != 2 ? iD != 3 ? iD != 9 ? iD != 18 ? "Unknown error." : "Google Play services is currently being updated on this device." : "The version of the Google Play services installed on this device is not authentic." : "The installed version of Google Play services has been disabled on this device." : "The installed version of Google Play services is out of date." : "Google Play services is missing on this device.")));
                    return;
                } else {
                    com.google.android.gms.common.api.i iVar = C7.c.f1894a;
                    taskCompletionSource.setResult(new C7.g(context, null, C7.c.f1894a, null, new com.google.android.gms.common.api.k(new C1687a(), Looper.getMainLooper())));
                    return;
                }
            case 13:
                com.vungle.ads.internal.session.b.a((com.vungle.ads.internal.session.b) this.f1913b, (String) this.f1914c);
                return;
            case 14:
                C4656y c4656y = (C4656y) this.f1914c;
                C0642a c0642a = (C0642a) this.f1913b;
                c0642a.getClass();
                try {
                    ic.d.E("Updating active experiment: " + c4656y.toString());
                    C4149c c4149c = c0642a.f5913a;
                    C4148b c4148b = new C4148b(c4656y.c(), c4656y.h(), c4656y.f(), new Date(c4656y.d()), c4656y.g(), c4656y.e());
                    c4149c.d();
                    C4148b.d(c4148b.c());
                    ArrayList arrayList = new ArrayList();
                    HashMap mapC = c4148b.c();
                    mapC.remove("triggerEvent");
                    arrayList.add(C4148b.a(mapC));
                    c4149c.a(arrayList);
                    return;
                } catch (C4147a e12) {
                    Log.e("FIAM.Headless", "Unable to set experiment as active with ABT, missing analytics?\n" + e12.getMessage());
                    return;
                }
            case 15:
                ((K3.f) this.f1913b).d((S3.j) this.f1914c, false);
                return;
            case 16:
                s sVar = (s) this.f1913b;
                U3.j jVar6 = (U3.j) this.f1914c;
                if (sVar.f6536q.f12264a instanceof U3.a) {
                    jVar6.cancel(true);
                    return;
                }
                return;
            case 17:
                d();
                return;
            case 18:
                e();
                return;
            case 19:
                ((InterfaceC3446b) ((Map.Entry) this.f1913b).getKey()).a((C3445a) this.f1914c);
                return;
            case 20:
                ((C4271h) this.f1913b).c("IllegalStateException", "Caught IllegalStateException: " + ((IllegalStateException) this.f1914c).getMessage(), null);
                return;
            case 21:
                M8.a aVar = (M8.a) this.f1913b;
                Process.setThreadPriority(aVar.f7533c);
                StrictMode.ThreadPolicy threadPolicy = aVar.f7534d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.f1914c).run();
                return;
            case 22:
                Callable callable = (Callable) this.f1913b;
                M8.h hVar3 = (M8.h) ((xa.d) this.f1914c).f47873b;
                try {
                    hVar3.i(callable.call());
                    return;
                } catch (Exception e13) {
                    hVar3.j(e13);
                    return;
                }
            case 23:
                com.vungle.ads.internal.util.p.a((String) this.f1913b, (tf.l) this.f1914c);
                return;
            case 24:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f1914c;
                HashMap map3 = C0788d.f9393i;
                C0788d c0788d = (C0788d) this.f1913b;
                c0788d.getClass();
                try {
                    c0788d.b();
                    C0788d.f9393i.clear();
                    taskCompletionSource2.setResult(null);
                    return;
                } catch (Exception e14) {
                    taskCompletionSource2.setException(e14);
                    return;
                }
            case 25:
                ((o2.f) this.f1914c).a(((Q1.n) this.f1913b).c());
                return;
            case 26:
                List<P3.b> list2 = (List) this.f1913b;
                Q3.f this$0 = (Q3.f) this.f1914c;
                AbstractC3340k.e(this$0, "this$0");
                for (P3.b bVar2 : list2) {
                    Object obj8 = this$0.f9833e;
                    bVar2.f9095d = obj8;
                    bVar2.d(bVar2.f9096e, obj8);
                }
                return;
            case 27:
                String str8 = (String) this.f1913b;
                TaskCompletionSource taskCompletionSource3 = (TaskCompletionSource) this.f1914c;
                HashMap map4 = Qc.c.f9945c;
                try {
                    try {
                        s8.g.f(str8).b();
                    } catch (IllegalStateException unused4) {
                    }
                    taskCompletionSource3.setResult(null);
                    return;
                } catch (Exception e15) {
                    taskCompletionSource3.setException(e15);
                    return;
                }
            case 28:
                ((R8.m) this.f1913b).c((String) this.f1914c, Boolean.FALSE);
                return;
            default:
                R8.s sVar2 = (R8.s) this.f1913b;
                String str9 = (String) this.f1914c;
                X8.c cVar3 = sVar2.f10517h.f10480d;
                cVar3.getClass();
                String strB = T8.d.b(Segment.SHARE_MINIMUM, str9);
                synchronized (((AtomicMarkableReference) cVar3.f16190g)) {
                    try {
                        String str10 = (String) ((AtomicMarkableReference) cVar3.f16190g).getReference();
                        if (strB != null) {
                            zEquals = strB.equals(str10);
                        } else if (str10 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) cVar3.f16190g).set(strB, true);
                        ((S8.f) cVar3.f16186c).f11035b.b(new g(cVar3, 12));
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ d(Context context, TaskCompletionSource taskCompletionSource) {
        this.f1912a = 12;
        Object obj = d7.e.f34126c;
        this.f1913b = context;
        this.f1914c = taskCompletionSource;
    }
}
