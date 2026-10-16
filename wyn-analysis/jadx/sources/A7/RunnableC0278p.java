package A7;

import D6.C0395s;
import Ef.C0485e0;
import Ef.C0502n;
import J8.AbstractC0640o;
import K8.C0690b;
import K8.C0700l;
import Pc.C0785a;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.os.Looper;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.view.View;
import androidx.work.Worker;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import ef.C2515C;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import jf.C3109i;
import org.json.JSONException;
import org.json.JSONObject;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* renamed from: A7.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0278p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1017a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1018b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1019c;

    public /* synthetic */ RunnableC0278p(int i5) {
        this.f1017a = i5;
    }

    private final void a() throws Throwable {
        L1 l12 = (L1) this.f1018b;
        l12.Z();
        l12.zzl().c0();
        if (l12.f581p == null) {
            l12.f581p = new ArrayList();
        }
        l12.f581p.add((Runnable) this.f1019c);
        l12.b0();
    }

    private final void b() {
        Context context = (Context) this.f1018b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f1019c;
        try {
            B7.a.c(context);
            taskCompletionSource.setResult(null);
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }

    private final void c() {
        C6.n.f1857D.k.getClass();
        A2.d.R((zzdzt) this.f1018b, "cld_r", SystemClock.elapsedRealtime() - ((Long) this.f1019c).longValue());
    }

    private final /* synthetic */ void d() {
        D6.S0 s02 = (D6.S0) this.f1018b;
        s02.getClass();
        s02.f2385l.addView((View) BinderC3877b.S((InterfaceC3876a) this.f1019c));
    }

    private final void e() throws Ef.N {
        ((C0502n) this.f1019c).C((C0485e0) this.f1018b, C2515C.f34653a);
    }

    private final /* synthetic */ void f() {
        ((F6.l) ((F6.j) this.f1018b).f3969b).f3971a.getWindow().setBackgroundDrawable((BitmapDrawable) this.f1019c);
    }

    private final void g() {
        G6.O o7 = (G6.O) this.f1018b;
        Context context = (Context) this.f1019c;
        o7.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (o7.f4531a) {
                try {
                    o7.f4536f = sharedPreferences;
                    o7.f4537g = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    o7.f4538h = o7.f4536f.getBoolean("use_https", o7.f4538h);
                    o7.f4550u = o7.f4536f.getBoolean("content_url_opted_out", o7.f4550u);
                    o7.f4539i = o7.f4536f.getString("content_url_hashes", o7.f4539i);
                    o7.k = o7.f4536f.getBoolean("gad_idless", o7.k);
                    o7.f4551v = o7.f4536f.getBoolean("content_vertical_opted_out", o7.f4551v);
                    o7.f4540j = o7.f4536f.getString("content_vertical_hashes", o7.f4540j);
                    o7.f4547r = o7.f4536f.getInt("version_code", o7.f4547r);
                    if (((Boolean) zzbkp.zzg.zze()).booleanValue() && C0395s.f2489e.f2492c.zzc()) {
                        o7.f4543n = new zzcff("", 0L);
                    } else {
                        o7.f4543n = new zzcff(o7.f4536f.getString("app_settings_json", o7.f4543n.zzd()), o7.f4536f.getLong("app_settings_last_update_ms", o7.f4543n.zzb()));
                    }
                    o7.f4544o = o7.f4536f.getLong("app_last_background_time_ms", o7.f4544o);
                    o7.f4546q = o7.f4536f.getInt("request_in_session_count", o7.f4546q);
                    o7.f4545p = o7.f4536f.getLong("first_ad_req_time_ms", o7.f4545p);
                    o7.f4548s = o7.f4536f.getStringSet("never_pool_slots", o7.f4548s);
                    o7.f4552w = o7.f4536f.getString("display_cutout", o7.f4552w);
                    o7.f4525B = o7.f4536f.getInt("app_measurement_npa", o7.f4525B);
                    o7.f4526C = o7.f4536f.getInt("sd_app_measure_npa", o7.f4526C);
                    o7.f4527D = o7.f4536f.getLong("sd_app_measure_npa_ts", o7.f4527D);
                    o7.f4553x = o7.f4536f.getString("inspector_info", o7.f4553x);
                    o7.f4554y = o7.f4536f.getBoolean("linked_device", o7.f4554y);
                    o7.f4555z = o7.f4536f.getString("linked_ad_unit", o7.f4555z);
                    o7.f4524A = o7.f4536f.getString("inspector_ui_storage", o7.f4524A);
                    o7.f4541l = o7.f4536f.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, o7.f4541l);
                    o7.f4542m = o7.f4536f.getInt("gad_has_consent_for_cookies", o7.f4542m);
                    o7.f4528E = o7.f4536f.getBoolean("is_install_referrer_reported", o7.f4528E);
                    o7.f4529F = o7.f4536f.getInt("total_inflight_ad_limit", o7.f4529F);
                    o7.f4530G = o7.f4536f.getInt("default_queue_capacity", o7.f4530G);
                    try {
                        o7.f4549t = new JSONObject(o7.f4536f.getString("native_advanced_settings", JsonUtils.EMPTY_JSON));
                    } catch (JSONException e7) {
                        int i5 = G6.L.f4523b;
                        H6.l.g("Could not convert native advanced settings to json object", e7);
                    }
                    o7.m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            C6.n.f1857D.f1868h.zzh(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            G6.L.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    private final void h() {
        C0502n c0502n = (C0502n) this.f1018b;
        try {
            c0502n.resumeWith(((p8.p) this.f1019c).get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                c0502n.a(cause);
            } else {
                c0502n.resumeWith(Fe.e.z(cause));
            }
        }
    }

    private final void i() {
        U3.j jVar = (U3.j) this.f1018b;
        try {
            jVar.i(((Worker) this.f1019c).getForegroundInfo());
        } catch (Throwable th) {
            jVar.j(th);
        }
    }

    private final void j() {
        ((Pc.S) this.f1018b).a((FirebaseAuth) this.f1019c);
    }

    private final void k() {
        ((J8.x) this.f1018b).onVerificationFailed((s8.j) this.f1019c);
    }

    private final void l() {
        ((C0785a) this.f1018b).a((FirebaseAuth) this.f1019c);
    }

    private final void m() {
        int i5 = 0;
        while (true) {
            try {
                ((Runnable) this.f1018b).run();
            } catch (Throwable th) {
                Ef.H.w(C3109i.f38759a, th);
            }
            Runnable runnableZ = ((Jf.g) this.f1019c).z();
            if (runnableZ == null) {
                return;
            }
            try {
                this.f1018b = runnableZ;
                i5++;
                if (i5 >= 16) {
                    Jf.g gVar = (Jf.g) this.f1019c;
                    if (Jf.b.j(gVar.f6115c, gVar)) {
                        Jf.g gVar2 = (Jf.g) this.f1019c;
                        Jf.b.i(gVar2.f6115c, gVar2, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                Jf.g gVar3 = (Jf.g) this.f1019c;
                synchronized (gVar3.f6118f) {
                    Jf.g.f6113g.decrementAndGet(gVar3);
                    throw th2;
                }
            }
        }
    }

    private final void n() {
        K1.a aVar = (K1.a) this.f1019c;
        Object obj = this.f1018b;
        if (aVar.f6328c.get()) {
            b7.d dVar = aVar.f6330e;
            if (dVar.f19384i == aVar) {
                SystemClock.uptimeMillis();
                dVar.f19384i = null;
                dVar.b();
            }
        } else {
            b7.d dVar2 = aVar.f6330e;
            if (dVar2.f19383h != aVar) {
                if (dVar2.f19384i == aVar) {
                    SystemClock.uptimeMillis();
                    dVar2.f19384i = null;
                    dVar2.b();
                }
            } else if (!dVar2.f19379d) {
                SystemClock.uptimeMillis();
                dVar2.f19383h = null;
                J1.b bVar = dVar2.f19376a;
                if (bVar != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar.j(obj);
                    } else {
                        bVar.h(obj);
                    }
                }
            }
        }
        aVar.f6327b = 3;
    }

    private final void o() {
        if (((K3.s) this.f1019c).f6536q.f12264a instanceof U3.a) {
            return;
        }
        try {
            ((U3.j) this.f1018b).get();
            J3.r.d().a(K3.s.f6520s, "Starting work for " + ((K3.s) this.f1019c).f6525e.f10979c);
            K3.s sVar = (K3.s) this.f1019c;
            sVar.f6536q.k(sVar.f6526f.startWork());
        } catch (Throwable th) {
            ((K3.s) this.f1019c).f6536q.j(th);
        }
    }

    private final void p() {
        String str = (String) this.f1018b;
        K3.s sVar = (K3.s) this.f1019c;
        try {
            try {
                J3.p pVar = (J3.p) sVar.f6536q.get();
                if (pVar == null) {
                    J3.r.d().b(K3.s.f6520s, sVar.f6525e.f10979c + " returned a null result. Treating it as a failure.");
                } else {
                    J3.r.d().a(K3.s.f6520s, sVar.f6525e.f10979c + " returned a " + pVar + ".");
                    sVar.f6528h = pVar;
                }
                sVar.b();
            } catch (InterruptedException e7) {
                e = e7;
                J3.r.d().c(K3.s.f6520s, str + " failed because it threw an exception/error", e);
                sVar.b();
            } catch (CancellationException e10) {
                J3.r rVarD = J3.r.d();
                String str2 = K3.s.f6520s;
                String str3 = str + " was cancelled";
                if (rVarD.f5584a <= 4) {
                    Log.i(str2, str3, e10);
                }
                sVar.b();
            } catch (ExecutionException e11) {
                e = e11;
                J3.r.d().c(K3.s.f6520s, str + " failed because it threw an exception/error", e);
                sVar.b();
            }
        } catch (Throwable th) {
            sVar.b();
            throw th;
        }
    }

    private final void q() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f((String) this.f1018b));
        AbstractC0640o abstractC0640o = firebaseAuth.f27288f;
        if (abstractC0640o != null) {
            Task taskI = firebaseAuth.i(abstractC0640o, true);
            C0700l.f6658f.e("Token refreshing started", new Object[0]);
            taskI.addOnFailureListener(new C0690b(this, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0428 A[Catch: NameNotFoundException -> 0x0447, TryCatch #3 {NameNotFoundException -> 0x0447, blocks: (B:154:0x041d, B:156:0x0428, B:158:0x0434), top: B:488:0x041d }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0537 A[Catch: IllegalStateException -> 0x0577, TryCatch #6 {IllegalStateException -> 0x0577, blocks: (B:191:0x0528, B:195:0x053b, B:199:0x0547, B:203:0x054f, B:205:0x0557, B:209:0x0568, B:213:0x0574, B:212:0x0570, B:208:0x0564, B:217:0x057b, B:219:0x058d, B:221:0x0592, B:220:0x0590, B:198:0x0543, B:194:0x0537), top: B:494:0x0528 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0557 A[Catch: IllegalStateException -> 0x0577, TryCatch #6 {IllegalStateException -> 0x0577, blocks: (B:191:0x0528, B:195:0x053b, B:199:0x0547, B:203:0x054f, B:205:0x0557, B:209:0x0568, B:213:0x0574, B:212:0x0570, B:208:0x0564, B:217:0x057b, B:219:0x058d, B:221:0x0592, B:220:0x0590, B:198:0x0543, B:194:0x0537), top: B:494:0x0528 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x057b A[Catch: IllegalStateException -> 0x0577, TryCatch #6 {IllegalStateException -> 0x0577, blocks: (B:191:0x0528, B:195:0x053b, B:199:0x0547, B:203:0x054f, B:205:0x0557, B:209:0x0568, B:213:0x0574, B:212:0x0570, B:208:0x0564, B:217:0x057b, B:219:0x058d, B:221:0x0592, B:220:0x0590, B:198:0x0543, B:194:0x0537), top: B:494:0x0528 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x073c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0543 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x05d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 3348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.RunnableC0278p.run():void");
    }

    public /* synthetic */ RunnableC0278p(int i5, Object obj, Object obj2) {
        this.f1017a = i5;
        this.f1018b = obj2;
        this.f1019c = obj;
    }

    public /* synthetic */ RunnableC0278p(Object obj, boolean z2, Object obj2, int i5) {
        this.f1017a = i5;
        this.f1018b = obj;
        this.f1019c = obj2;
    }

    public RunnableC0278p(ServiceConnectionC0243d0 serviceConnectionC0243d0, zzbz zzbzVar, ServiceConnectionC0243d0 serviceConnectionC0243d02) {
        this.f1017a = 1;
        this.f1018b = zzbzVar;
        this.f1019c = serviceConnectionC0243d0;
    }

    public RunnableC0278p(C0700l c0700l, String str) {
        this.f1017a = 28;
        this.f1019c = c0700l;
        AbstractC1732v.f(str);
        this.f1018b = str;
    }
}
