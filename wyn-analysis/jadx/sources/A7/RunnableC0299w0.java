package A7;

import N6.C0776a;
import ac.C1346a;
import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ImageView;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import c7.C1565a;
import c7.C1575k;
import c7.C1576l;
import c7.ExecutorC1572h;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest$Builder;
import com.google.android.gms.common.api.internal.AbstractC1699m;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzdzy;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.inappmessaging.model.MessageType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import g5.C2704a;
import g5.C2708e;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import md.AbstractC3537e;
import md.EnumC3545m;
import od.C3742z;
import sb.C4033a;
import uc.C4278o;
import x6.C4476g;
import x6.EnumC4471b;

/* renamed from: A7.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0299w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1092a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1093b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1094c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1095d;

    public /* synthetic */ RunnableC0299w0(int i5) {
        this.f1092a = i5;
    }

    private final void a() throws InterruptedException {
        Y8.c cVar = (Y8.c) this.f1094c;
        R8.b bVar = (R8.b) this.f1095d;
        cVar.b(bVar, (TaskCompletionSource) this.f1093b);
        ((AtomicInteger) cVar.f16730i.f11010c).set(0);
        double dMin = Math.min(3600000.0d, Math.pow(cVar.f16723b, cVar.a()) * (60000.0d / cVar.f16722a));
        String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + bVar.f10445b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        try {
            Thread.sleep((long) dMin);
        } catch (InterruptedException unused) {
        }
    }

    private final void b() {
        int i5;
        Task taskL;
        C1565a c1565a = (C1565a) this.f1093b;
        Intent intent = c1565a.f19670a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            taskL = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = c1565a.f19670a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = c1565a.f19670a;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            C1576l c1576lK = C1576l.k((Context) this.f1095d);
            synchronized (c1576lK) {
                i5 = c1576lK.f19705a;
                c1576lK.f19705a = i5 + 1;
            }
            taskL = c1576lK.l(new C1575k(i5, 2, bundle, 0));
        }
        taskL.addOnCompleteListener(ExecutorC1572h.f19688b, new C1346a((CountDownLatch) this.f1094c, 2));
    }

    private final void c() {
        E4.n nVar = (E4.n) this.f1094c;
        int i5 = nVar.f2938b;
        AbstractC1699m abstractC1699m = (AbstractC1699m) this.f1095d;
        if (i5 > 0) {
            Bundle bundle = (Bundle) nVar.f2940d;
            abstractC1699m.onCreate(bundle != null ? bundle.getBundle((String) this.f1093b) : null);
        }
        if (nVar.f2938b >= 2) {
            abstractC1699m.onStart();
        }
        if (nVar.f2938b >= 3) {
            abstractC1699m.onResume();
        }
        if (nVar.f2938b >= 4) {
            abstractC1699m.onStop();
        }
        if (nVar.f2938b >= 5) {
            abstractC1699m.onDestroy();
        }
    }

    private final void d() {
        synchronized (C2708e.f35749h) {
            C2708e.a((C2708e) this.f1094c, (C2704a) this.f1095d);
        }
        ((Wa.h) this.f1093b).a(null);
    }

    private final void e() {
        Object objCall;
        try {
            objCall = ((h1.e) this.f1095d).call();
        } catch (Exception unused) {
            objCall = null;
        }
        ((Handler) this.f1094c).post(new L7.b(19, (h1.f) this.f1093b, objCall));
    }

    private final void f() {
        synchronized (jb.l.f38743f) {
            jb.l.a((jb.l) this.f1094c, (jb.e) this.f1095d);
        }
        ((tc.g) this.f1093b).a(null);
    }

    private final void g() {
        ((od.E) this.f1094c).f41545d.i((md.k0) this.f1095d, (md.b0) this.f1093b);
    }

    private final void h() {
        od.M0 m02 = (od.M0) this.f1094c;
        d7.j jVar = m02.f41697r;
        v9.n nVar = (v9.n) this.f1095d;
        Executor executor = m02.f41688h;
        EnumC3545m enumC3545m = (EnumC3545m) this.f1093b;
        jVar.getClass();
        Fe.e.t(executor, "executor");
        Fe.e.t(enumC3545m, "source");
        C3742z c3742z = new C3742z(nVar, executor);
        if (((EnumC3545m) jVar.f34138b) != enumC3545m) {
            executor.execute(nVar);
        } else {
            ((ArrayList) jVar.f34137a).add(c3742z);
        }
    }

    public void i(int i5, IOException iOException, byte[] bArr, Map map) {
        C0264k0 c0264k0Zzl = ((C0250f1) this.f1094c).zzl();
        RunnableC0253g1 runnableC0253g1 = new RunnableC0253g1(0);
        runnableC0253g1.f873c = this;
        runnableC0253g1.f872b = i5;
        runnableC0253g1.f874d = iOException;
        runnableC0253g1.f875e = bArr;
        c0264k0Zzl.m0(runnableC0253g1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzfr.zzd zzdVar;
        C0298w c0298w;
        Map<String, List<String>> headerFields;
        HttpURLConnection httpURLConnection;
        N9.f fVarA;
        Object bVar;
        CookieManager cookieManagerH;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean zBooleanValue = true;
        int responseCode = 0;
        boolean zZza = false;
        int i5 = 0;
        zAcceptThirdPartyCookies = false;
        boolean zAcceptThirdPartyCookies = false;
        responseCode = 0;
        responseCode = 0;
        responseCode = 0;
        switch (this.f1092a) {
            case 0:
                BinderC0287s0 binderC0287s0 = (BinderC0287s0) this.f1094c;
                binderC0287s0.f1045a.Z();
                C0242d c0242d = (C0242d) this.f1095d;
                Object objZza = c0242d.f835c.zza();
                N1 n12 = (N1) this.f1093b;
                if (objZza == null) {
                    binderC0287s0.f1045a.i(c0242d, n12);
                    return;
                } else {
                    binderC0287s0.f1045a.F(c0242d, n12);
                    return;
                }
            case 1:
                BinderC0287s0 binderC0287s02 = (BinderC0287s0) this.f1094c;
                binderC0287s02.getClass();
                C0301x c0301x = (C0301x) this.f1095d;
                boolean zEquals = "_cmp".equals(c0301x.f1103a);
                L1 l12 = binderC0287s02.f1045a;
                if (zEquals && (c0298w = c0301x.f1104b) != null) {
                    Bundle bundle = c0298w.f1091a;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            l12.zzj().f610l.d("Event has been filtered ", c0301x.toString());
                            c0301x = new C0301x("_cmpx", c0301x.f1104b, c0301x.f1105c, c0301x.f1106d);
                        }
                    }
                }
                String str4 = c0301x.f1103a;
                C0249f0 c0249f0 = l12.f567a;
                S1 s12 = l12.f573g;
                L1.m(c0249f0);
                N1 n13 = (N1) this.f1093b;
                String str5 = n13.f619a;
                if (TextUtils.isEmpty(str5) || (zzdVar = (zzfr.zzd) c0249f0.f862h.get(str5)) == null || zzdVar.zza() == 0) {
                    binderC0287s02.V(c0301x, n13);
                    return;
                }
                P p10 = l12.zzj().f612n;
                String str6 = n13.f619a;
                p10.d("EES config found for", str6);
                C0249f0 c0249f02 = l12.f567a;
                L1.m(c0249f02);
                zzb zzbVar = TextUtils.isEmpty(str6) ? null : (zzb) c0249f02.f864j.get(str6);
                if (zzbVar == null) {
                    l12.zzj().f612n.d("EES not loaded for", str6);
                    binderC0287s02.V(c0301x, n13);
                    return;
                }
                try {
                    L1.m(s12);
                    HashMap mapX0 = S1.x0(c0301x.f1104b.W(), true);
                    String strC = I0.c(str4, I0.f525c, I0.f523a);
                    if (strC == null) {
                        strC = str4;
                    }
                    zZza = zzbVar.zza(new zzad(strC, c0301x.f1106d, mapX0));
                } catch (zzc unused) {
                    l12.zzj().f605f.b(n13.f620b, "EES error. appId, eventName", str4);
                }
                if (!zZza) {
                    l12.zzj().f612n.d("EES was not applied to event", str4);
                    binderC0287s02.V(c0301x, n13);
                    return;
                }
                if (zzbVar.zzd()) {
                    l12.zzj().f612n.d("EES edited event", str4);
                    L1.m(s12);
                    binderC0287s02.V(S1.m0(zzbVar.zza().zzb()), n13);
                } else {
                    binderC0287s02.V(c0301x, n13);
                }
                if (zzbVar.zzc()) {
                    for (zzad zzadVar : zzbVar.zza().zzc()) {
                        l12.zzj().f612n.d("EES logging created event", zzadVar.zzb());
                        L1.m(s12);
                        binderC0287s02.V(S1.m0(zzadVar), n13);
                    }
                    return;
                }
                return;
            case 2:
                BinderC0287s0 binderC0287s03 = (BinderC0287s0) this.f1094c;
                binderC0287s03.f1045a.Z();
                binderC0287s03.f1045a.k((C0301x) this.f1095d, (String) this.f1093b);
                return;
            case 3:
                BinderC0287s0 binderC0287s04 = (BinderC0287s0) this.f1094c;
                binderC0287s04.f1045a.Z();
                R1 r12 = (R1) this.f1095d;
                Object objZza2 = r12.zza();
                N1 n14 = (N1) this.f1093b;
                if (objZza2 == null) {
                    binderC0287s04.f1045a.t(r12.f681b, n14);
                    return;
                } else {
                    binderC0287s04.f1045a.n(r12, n14);
                    return;
                }
            case 4:
                C0264k0 c0264k0 = ((C0273n0) ((C0250f1) this.f1094c).f421a).f982j;
                C0273n0.d(c0264k0);
                c0264k0.p0();
                try {
                    URLConnection uRLConnectionZza = zzcy.zza().zza((URL) this.f1095d, "client-measurement");
                    if (!(uRLConnectionZza instanceof HttpURLConnection)) {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                    httpURLConnection = (HttpURLConnection) uRLConnectionZza;
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setReadTimeout(61000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    try {
                        responseCode = httpURLConnection.getResponseCode();
                        headerFields = httpURLConnection.getHeaderFields();
                    } catch (IOException e7) {
                        e = e7;
                        headerFields = null;
                    } catch (Throwable th) {
                        th = th;
                        headerFields = null;
                    }
                    try {
                        byte[] bArrH0 = C0250f1.h0(httpURLConnection);
                        httpURLConnection.disconnect();
                        i(responseCode, null, bArrH0, headerFields);
                        return;
                    } catch (IOException e10) {
                        e = e10;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        i(responseCode, e, null, headerFields);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        i(responseCode, null, null, headerFields);
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    headerFields = null;
                    httpURLConnection = null;
                } catch (Throwable th3) {
                    th = th3;
                    headerFields = null;
                    httpURLConnection = null;
                }
            case 5:
                synchronized (((AtomicReference) this.f1095d)) {
                    try {
                        try {
                        } catch (RemoteException e12) {
                            ((C0271m1) this.f1094c).zzj().f605f.d("Failed to get app instance id", e12);
                        }
                        if (!((C0271m1) this.f1094c).a0().n0().i(E0.ANALYTICS_STORAGE)) {
                            ((C0271m1) this.f1094c).zzj().k.c("Analytics storage consent denied; will not get app instance id");
                            ((C0271m1) this.f1094c).e0().G0(null);
                            ((C0271m1) this.f1094c).a0().f768h.v(null);
                            ((AtomicReference) this.f1095d).set(null);
                            return;
                        }
                        C0271m1 c0271m1 = (C0271m1) this.f1094c;
                        F f10 = c0271m1.f954d;
                        if (f10 == null) {
                            c0271m1.zzj().f605f.c("Failed to get app instance id");
                            return;
                        }
                        ((AtomicReference) this.f1095d).set(f10.o((N1) this.f1093b));
                        String str7 = (String) ((AtomicReference) this.f1095d).get();
                        if (str7 != null) {
                            ((C0271m1) this.f1094c).e0().G0(str7);
                            ((C0271m1) this.f1094c).a0().f768h.v(str7);
                        }
                        ((C0271m1) this.f1094c).v0();
                        ((AtomicReference) this.f1095d).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f1095d).notify();
                    }
                }
            case 6:
                N1 n15 = (N1) this.f1093b;
                zzdo zzdoVar = (zzdo) this.f1095d;
                C0271m1 c0271m12 = (C0271m1) this.f1094c;
                try {
                    if (!c0271m12.a0().n0().i(E0.ANALYTICS_STORAGE)) {
                        c0271m12.zzj().k.c("Analytics storage consent denied; will not get app instance id");
                        c0271m12.e0().G0(null);
                        c0271m12.a0().f768h.v(null);
                        return;
                    }
                    F f11 = c0271m12.f954d;
                    if (f11 == null) {
                        c0271m12.zzj().f605f.c("Failed to get app instance id");
                        return;
                    }
                    String strO = f11.o(n15);
                    if (strO != null) {
                        c0271m12.e0().G0(strO);
                        c0271m12.a0().f768h.v(strO);
                    }
                    c0271m12.v0();
                    c0271m12.b0().E0(strO, zzdoVar);
                    return;
                } catch (RemoteException e13) {
                    c0271m12.zzj().f605f.d("Failed to get app instance id", e13);
                    return;
                } finally {
                    c0271m12.b0().E0(null, zzdoVar);
                }
            case 7:
                N1 n16 = (N1) this.f1093b;
                C0271m1 c0271m13 = (C0271m1) this.f1094c;
                F f12 = c0271m13.f954d;
                if (f12 == null) {
                    c0271m13.zzj().f605f.c("Failed to send default event parameters to service");
                    return;
                }
                try {
                    f12.mo2a(n16, (Bundle) this.f1095d);
                    return;
                } catch (RemoteException e14) {
                    c0271m13.zzj().f605f.d("Failed to send default event parameters to service", e14);
                    return;
                }
            case 8:
                S3.l lVar = (S3.l) this.f1095d;
                ((N) this.f1093b).f612n.c("AppMeasurementJobService processed last upload request.");
                ((InterfaceC0306y1) ((Service) lVar.f10967a)).b((JobParameters) this.f1094c);
                return;
            case 9:
                B9.f fVar = (B9.f) this.f1094c;
                if (fVar.f1636j == null) {
                    return;
                }
                Activity activity = (Activity) this.f1095d;
                B9.a aVar = new B9.a(fVar, activity);
                HashMap map = new HashMap();
                N9.h hVar = fVar.f1636j;
                ArrayList arrayList = new ArrayList();
                int i10 = B9.e.f1626a[hVar.f8622a.ordinal()];
                if (i10 == 1) {
                    arrayList.add(((N9.c) hVar).f8608f);
                } else if (i10 == 2) {
                    arrayList.add(((N9.i) hVar).f8627f);
                } else if (i10 == 3) {
                    arrayList.add(((N9.g) hVar).f8621d);
                } else if (i10 != 4) {
                    arrayList.add(new N9.a(null, null));
                } else {
                    N9.e eVar = (N9.e) hVar;
                    arrayList.add(eVar.f8615f);
                    arrayList.add(eVar.f8616g);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    N9.a aVar2 = (N9.a) it.next();
                    if (aVar2 == null || TextUtils.isEmpty(aVar2.f8601a)) {
                        D9.e.e("No action url found for action. Treating as dismiss.");
                        bVar = aVar;
                    } else {
                        bVar = new B9.b(fVar, aVar2, activity);
                    }
                    map.put(aVar2, bVar);
                }
                E9.c cVar = (E9.c) this.f1093b;
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerK = cVar.k(map, aVar);
                if (onGlobalLayoutListenerK != null) {
                    cVar.i().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerK);
                }
                N9.h hVar2 = fVar.f1636j;
                if (hVar2.f8622a == MessageType.CARD) {
                    N9.e eVar2 = (N9.e) hVar2;
                    int i11 = fVar.f1634h.getResources().getConfiguration().orientation;
                    fVarA = eVar2.f8617h;
                    N9.f fVar2 = eVar2.f8618i;
                    if (i11 != 1 ? !(fVar2 == null || TextUtils.isEmpty(fVar2.f8619a)) : !(fVarA != null && !TextUtils.isEmpty(fVarA.f8619a))) {
                        fVarA = fVar2;
                    }
                } else {
                    fVarA = hVar2.a();
                }
                B9.d dVar = new B9.d(fVar, cVar, activity, onGlobalLayoutListenerK);
                if (fVarA == null || TextUtils.isEmpty(fVarA.f8619a)) {
                    dVar.f();
                    return;
                }
                String str8 = fVarA.f8619a;
                D9.g gVar = fVar.f1629c;
                gVar.getClass();
                D9.e.a("Starting Downloading Image : " + str8);
                I4.h hVar3 = new I4.h();
                I4.i iVar = new I4.i("image/*");
                HashMap map2 = new HashMap(hVar3.f5341a.size());
                for (Map.Entry entry : hVar3.f5341a.entrySet()) {
                    map2.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
                }
                hVar3.f5341a = map2;
                List arrayList2 = (List) hVar3.f5341a.get("Accept");
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hVar3.f5341a.put("Accept", arrayList2);
                }
                arrayList2.add(iVar);
                I4.f fVar3 = new I4.f(str8, new I4.j(hVar3.f5341a));
                com.bumptech.glide.h hVar4 = gVar.f2572a;
                hVar4.getClass();
                com.bumptech.glide.g gVar2 = new com.bumptech.glide.g(hVar4.f24249a, hVar4, Drawable.class, hVar4.f24250b);
                gVar2.f24245v = fVar3;
                gVar2.f24247x = true;
                com.bumptech.glide.g gVar3 = (com.bumptech.glide.g) gVar2.k(L4.m.f6907f).k(P4.i.f9140a);
                Dd.c cVar2 = new Dd.c(gVar, gVar3);
                D9.j jVar = new D9.j(fVar.f1636j, fVar.k);
                if (gVar3.f24246w == null) {
                    gVar3.f24246w = new ArrayList();
                }
                gVar3.f24246w.add(jVar);
                cVar2.f2643c = activity.getClass().getSimpleName();
                cVar2.A();
                gVar3.g();
                D9.e.a("Downloading Image Placeholder : 2131231060");
                ImageView imageViewI = cVar.i();
                D9.e.a("Downloading Image Callback : " + dVar);
                dVar.f1621d = imageViewI;
                gVar3.r(dVar);
                cVar2.f2642b = dVar;
                cVar2.A();
                return;
            case 10:
                boolean zBooleanValue2 = ((Boolean) ((C4278o) this.f1093b).a("toAlbum")).booleanValue();
                Uri uri = Cg.c.f2230e;
                ((tc.g) this.f1095d).a(Boolean.valueOf(((Cg.c) this.f1094c).b(zBooleanValue2)));
                return;
            case 11:
                zzclb zzclbVar = (zzclb) ((F6.r) this.f1095d).f4014e;
                if (zzclbVar != null) {
                    zzclbVar.zze((String) this.f1093b, (HashMap) this.f1094c);
                    return;
                }
                return;
            case 12:
                try {
                    zBooleanValue = ((Boolean) ((U3.j) this.f1094c).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((K3.f) this.f1095d).d((S3.j) this.f1093b, zBooleanValue);
                return;
            case 13:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f1094c;
                Context context = (Context) this.f1093b;
                Intent intent = (Intent) this.f1095d;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    J3.r.d().a(ConstraintProxyUpdateReceiver.f19074a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    T3.k.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    T3.k.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    T3.k.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    T3.k.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 14:
                C0776a c0776a = (C0776a) this.f1095d;
                CookieManager cookieManagerH2 = C6.n.f1857D.f1866f.h();
                boolean zAcceptThirdPartyCookies2 = cookieManagerH2 != null ? cookieManagerH2.acceptThirdPartyCookies(c0776a.f8447b) : false;
                Bundle bundle2 = (Bundle) this.f1093b;
                bundle2.putBoolean("accept_3p_cookie", zAcceptThirdPartyCookies2);
                Q6.a.a(c0776a.f8446a, EnumC4471b.BANNER, new C4476g((AdRequest$Builder) new AdRequest$Builder(14).x(AdMobAdapter.class, bundle2)), (C4033a) this.f1094c);
                return;
            case 15:
                N6.x xVar = (N6.x) this.f1095d;
                xVar.getClass();
                Object obj = this.f1093b;
                if ((obj instanceof WebView) && (cookieManagerH = C6.n.f1857D.f1866f.h()) != null) {
                    zAcceptThirdPartyCookies = cookieManagerH.acceptThirdPartyCookies((WebView) obj);
                }
                HashMap map3 = xVar.f8561a;
                Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
                N6.z zVar = (N6.z) map3.get(boolValueOf);
                Pair pair = (Pair) this.f1094c;
                if (zVar != null) {
                    C6.n.f1857D.k.getClass();
                    if (zVar.f8574c > System.currentTimeMillis()) {
                        xVar.e(zVar, pair, true);
                        return;
                    }
                }
                HashMap map4 = xVar.f8562b;
                List arrayList3 = (List) map4.get(boolValueOf);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    map4.put(boolValueOf, arrayList3);
                }
                arrayList3.add(pair);
                return;
            case 16:
                zzdzy zzdzyVar = (zzdzy) this.f1095d;
                ConcurrentHashMap concurrentHashMapZzd = zzdzyVar.zzd();
                String str9 = (String) this.f1093b;
                if (!TextUtils.isEmpty(HandleInvocationsFromAdViewer.KEY_ACTION) && !TextUtils.isEmpty(str9)) {
                    concurrentHashMapZzd.put(HandleInvocationsFromAdViewer.KEY_ACTION, str9);
                }
                while (true) {
                    Pair[] pairArr = (Pair[]) this.f1094c;
                    if (i5 >= pairArr.length) {
                        zzdzyVar.zzb(concurrentHashMapZzd);
                        return;
                    }
                    Pair pair2 = pairArr[i5];
                    String str10 = (String) pair2.first;
                    String str11 = (String) pair2.second;
                    if (!TextUtils.isEmpty(str10) && !TextUtils.isEmpty(str11)) {
                        concurrentHashMapZzd.put(str10, str11);
                    }
                    i5++;
                }
                break;
            case 17:
                ((Oa.g) this.f1094c).getClass();
                Oa.g.b((WebView) this.f1095d, (String) this.f1093b);
                return;
            case 18:
                ((K3.q) this.f1095d).f6506f.j((K3.j) this.f1093b, (b7.k) this.f1094c);
                return;
            case 19:
                a();
                return;
            case 20:
                b();
                return;
            case 21:
                c();
                return;
            case 22:
                d();
                return;
            case 23:
                e();
                return;
            case 24:
                f();
                return;
            case 25:
                ((md.n0) this.f1094c).execute((N6.w) this.f1095d);
                return;
            case 26:
                ((od.I0) this.f1094c).f41594f.e((AbstractC3537e) this.f1095d, (md.b0) this.f1093b);
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                od.E0 e02 = (od.E0) this.f1094c;
                od.M0 m02 = e02.f41549b;
                if (e02 != m02.f41703x) {
                    return;
                }
                md.M m10 = (md.M) this.f1095d;
                m02.f41704y = m10;
                m02.f41657E.i(m10);
                EnumC3545m enumC3545m = EnumC3545m.f40696e;
                EnumC3545m enumC3545m2 = (EnumC3545m) this.f1093b;
                if (enumC3545m2 != enumC3545m) {
                    e02.f41549b.f41666O.h(2, "Entering {0} state with picker: {1}", enumC3545m2, m10);
                    e02.f41549b.f41697r.d(enumC3545m2);
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.f1092a) {
            case 25:
                return ((Runnable) this.f1093b).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC0299w0(int i5, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f1092a = i5;
        this.f1095d = obj;
        this.f1093b = obj2;
        this.f1094c = obj3;
    }

    public /* synthetic */ RunnableC0299w0(C0271m1 c0271m1, N1 n12, Object obj, int i5) {
        this.f1092a = i5;
        this.f1093b = n12;
        this.f1095d = obj;
        this.f1094c = c0271m1;
    }

    public /* synthetic */ RunnableC0299w0(Object obj, Object obj2, Object obj3, int i5) {
        this.f1092a = i5;
        this.f1095d = obj2;
        this.f1093b = obj3;
        this.f1094c = obj;
    }

    public RunnableC0299w0(C0250f1 c0250f1, String str, URL url, A.e0 e0Var) {
        this.f1092a = 4;
        this.f1094c = c0250f1;
        AbstractC1732v.f(str);
        this.f1095d = url;
        this.f1093b = e0Var;
    }

    public RunnableC0299w0(E4.n nVar, AbstractC1699m abstractC1699m, String str) {
        this.f1092a = 21;
        this.f1095d = abstractC1699m;
        this.f1093b = str;
        Objects.requireNonNull(nVar);
        this.f1094c = nVar;
    }
}
