package A7;

import Ef.C0502n;
import Va.Pb;
import ac.C1346a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import ba.C1521a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbgy;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzccy;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzdzo;
import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import g5.C2704a;
import g5.C2708e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import jf.C3104d;
import jf.InterfaceC3108h;
import k3.C3182n;
import k3.C3183o;
import n7.C3597b;
import od.AbstractC3668a;
import od.EnumC3721s;
import od.InterfaceC3724t;
import org.json.JSONObject;
import p.C3753d;
import p.ViewOnKeyListenerC3754e;
import x6.AbstractC4473d;
import x6.C4476g;
import x6.EnumC4471b;
import y3.C4552j;
import z6.AbstractC4618a;

/* loaded from: classes4.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f731a;

    /* renamed from: b, reason: collision with root package name */
    public Object f732b;

    /* renamed from: c, reason: collision with root package name */
    public Object f733c;

    /* renamed from: d, reason: collision with root package name */
    public Object f734d;

    /* renamed from: e, reason: collision with root package name */
    public Object f735e;

    public /* synthetic */ W0() {
        this.f731a = 14;
    }

    private final void a() {
        synchronized (C2708e.f35749h) {
            C2704a c2704a = (C2704a) this.f733c;
            if (c2704a != null) {
                C2708e.a((C2708e) this.f735e, c2704a);
            }
            try {
                if (Ba.c.B(C2708e.f35747f)) {
                    Log.d("Sqflite", "delete database " + ((String) this.f732b));
                }
                C2704a.a((String) this.f732b);
            } catch (Exception e7) {
                Log.e("Sqflite", "error " + e7 + " while closing database " + C2708e.f35751j);
            }
        }
        ((Wa.h) this.f734d).a(null);
    }

    private final void b() {
        synchronized (jb.l.f38743f) {
            jb.e eVar = (jb.e) this.f733c;
            if (eVar != null) {
                jb.l.a((jb.l) this.f735e, eVar);
            }
            try {
                if (jb.a.a(jb.l.f38744g)) {
                    Log.d("Sqflite", "delete database " + ((String) this.f732b));
                }
                SQLiteDatabase.deleteDatabase(new File((String) this.f732b));
            } catch (Exception e7) {
                Log.e("Sqflite", "error " + e7 + " while closing database " + jb.l.k);
            }
        }
        ((tc.g) this.f734d).a(null);
    }

    /* JADX WARN: Finally extract failed */
    private final void c() {
        synchronized (((od.V1) this.f735e)) {
            try {
                if (((od.T1) this.f733c).f41813b == 0) {
                    try {
                        ((od.U1) this.f734d).h(this.f732b);
                        ((od.V1) this.f735e).f41822a.remove((od.U1) this.f734d);
                        if (((od.V1) this.f735e).f41822a.isEmpty()) {
                            ((od.V1) this.f735e).f41824c.shutdown();
                            ((od.V1) this.f735e).f41824c = null;
                        }
                    } catch (Throwable th) {
                        ((od.V1) this.f735e).f41822a.remove((od.U1) this.f734d);
                        if (((od.V1) this.f735e).f41822a.isEmpty()) {
                            ((od.V1) this.f735e).f41824c.shutdown();
                            ((od.V1) this.f735e).f41824c = null;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x041c -> B:180:0x0423). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C0271m1 c0271m1;
        F f10;
        S3.p pVarH;
        byte[] bArrW = null;
        switch (this.f731a) {
            case 0:
                C0271m1 c0271m1H = AbstractC0279p0.h(((AppMeasurementDynamiteService) this.f735e).f26746a);
                int iD = d7.f.f34129b.d(((C0273n0) c0271m1H.b0().f421a).f973a, 12451000);
                zzdo zzdoVar = (zzdo) this.f733c;
                if (iD == 0) {
                    c0271m1H.m0(new W0(c0271m1H, (C0301x) this.f734d, (String) this.f732b, zzdoVar));
                    return;
                } else {
                    c0271m1H.zzj().f608i.c("Not bundling data. Service unavailable or out of date");
                    c0271m1H.b0().D0(zzdoVar, new byte[0]);
                    return;
                }
            case 1:
                C0271m1 c0271m1H2 = AbstractC0279p0.h((C0273n0) ((P0) this.f735e).f421a);
                c0271m1H2.m0(new RunnableC0285r1(c0271m1H2, (AtomicReference) this.f733c, (String) this.f732b, (String) this.f734d, c0271m1H2.w0(false), 0));
                return;
            case 2:
                C0271m1 c0271m1H3 = AbstractC0279p0.h(((AppMeasurementDynamiteService) this.f735e).f26746a);
                c0271m1H3.m0(new RunnableC0285r1(c0271m1H3, (String) this.f732b, (String) this.f734d, c0271m1H3.w0(false), (zzdo) this.f733c));
                return;
            case 3:
                synchronized (((AtomicReference) this.f733c)) {
                    try {
                        try {
                            c0271m1 = (C0271m1) this.f735e;
                            f10 = c0271m1.f954d;
                        } catch (RemoteException e7) {
                            ((C0271m1) this.f735e).zzj().f605f.d("Failed to get trigger URIs; remote exception", e7);
                        }
                        if (f10 == null) {
                            c0271m1.zzj().f605f.c("Failed to get trigger URIs; not connected to service");
                            return;
                        }
                        ((AtomicReference) this.f733c).set(f10.a((N1) this.f734d, (Bundle) this.f732b));
                        ((C0271m1) this.f735e).v0();
                        ((AtomicReference) this.f733c).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.f733c).notify();
                    }
                }
            case 4:
                zzdo zzdoVar2 = (zzdo) this.f733c;
                C0271m1 c0271m12 = (C0271m1) this.f735e;
                try {
                    F f11 = c0271m12.f954d;
                    if (f11 == null) {
                        c0271m12.zzj().f605f.c("Discarding data. Failed to send event to service to bundle");
                    } else {
                        bArrW = f11.w((C0301x) this.f734d, (String) this.f732b);
                        c0271m12.v0();
                        c0271m12.b0().D0(zzdoVar2, bArrW);
                    }
                } catch (RemoteException e10) {
                    c0271m12.zzj().f605f.d("Failed to send event to the service to bundle", e10);
                } finally {
                    c0271m12.b0().D0(zzdoVar2, bArrW);
                }
                return;
            case 5:
                C4552j c4552j = (C4552j) this.f735e;
                U1 u1Y = ((L1) c4552j.f48001b).Y();
                L1 l12 = (L1) c4552j.f48001b;
                ((C3597b) l12.zzb()).getClass();
                C0301x c0301xM0 = u1Y.m0((String) this.f733c, (Bundle) this.f734d, "auto", System.currentTimeMillis(), false);
                AbstractC1732v.i(c0301xM0);
                l12.k(c0301xM0, (String) this.f732b);
                return;
            case 6:
                I6.b bVar = (I6.b) this.f735e;
                C4476g c4476g = (C4476g) this.f734d;
                Context context = (Context) this.f733c;
                try {
                    new zzbss(context, (String) this.f732b).zza(c4476g.f47736a, bVar);
                    return;
                } catch (IllegalStateException e11) {
                    zzcaf.zza(context).zzh(e11, "InterstitialAd.load");
                    return;
                }
            case 7:
                N6.C c10 = (N6.C) this.f733c;
                zzdzo zzdzoVar = (zzdzo) this.f734d;
                c10.g(zzdzoVar, (ArrayDeque) this.f732b, "to");
                c10.g(zzdzoVar, (ArrayDeque) this.f735e, "of");
                return;
            case 8:
                C4476g c4476g2 = (C4476g) this.f732b;
                new zzbzz((Context) this.f733c, (EnumC4471b) this.f734d, c4476g2 == null ? null : c4476g2.f47736a, null).zzb((Q6.b) this.f735e);
                return;
            case 9:
                R6.d dVar = (R6.d) this.f735e;
                y6.b bVar2 = (y6.b) this.f734d;
                Context context2 = (Context) this.f733c;
                try {
                    new zzccy(context2, (String) this.f732b).zza(bVar2.f47736a, dVar);
                    return;
                } catch (IllegalStateException e12) {
                    zzcaf.zza(context2).zzh(e12, "RewardedAd.loadAdManager");
                    return;
                }
            case 10:
                R6.d dVar2 = (R6.d) this.f735e;
                C4476g c4476g3 = (C4476g) this.f734d;
                Context context3 = (Context) this.f733c;
                try {
                    new zzccy(context3, (String) this.f732b).zza(c4476g3.f47736a, dVar2);
                    return;
                } catch (IllegalStateException e13) {
                    zzcaf.zza(context3).zzh(e13, "RewardedAd.load");
                    return;
                }
            case 11:
                S6.b bVar3 = (S6.b) this.f735e;
                y6.b bVar4 = (y6.b) this.f734d;
                Context context4 = (Context) this.f733c;
                try {
                    new zzcdj(context4, (String) this.f732b).zza(bVar4.f47736a, bVar3);
                    return;
                } catch (IllegalStateException e14) {
                    zzcaf.zza(context4).zzh(e14, "RewardedInterstitialAdManager.load");
                    return;
                }
            case 12:
                S6.b bVar5 = (S6.b) this.f735e;
                C4476g c4476g4 = (C4476g) this.f734d;
                Context context5 = (Context) this.f733c;
                try {
                    new zzcdj(context5, (String) this.f732b).zza(c4476g4.f47736a, bVar5);
                    return;
                } catch (IllegalStateException e15) {
                    zzcaf.zza(context5).zzh(e15, "RewardedInterstitialAd.load");
                    return;
                }
            case 13:
                U3.j jVar = (U3.j) this.f732b;
                UUID uuid = (UUID) this.f733c;
                String string = uuid.toString();
                J3.r rVarD = J3.r.d();
                String str = T3.u.f11447c;
                StringBuilder sb2 = new StringBuilder("Updating progress for ");
                sb2.append(uuid);
                sb2.append(" (");
                J3.h hVar = (J3.h) this.f734d;
                sb2.append(hVar);
                sb2.append(")");
                rVarD.a(str, sb2.toString());
                T3.u uVar = (T3.u) this.f735e;
                WorkDatabase workDatabase = uVar.f11448a;
                WorkDatabase workDatabase2 = uVar.f11448a;
                workDatabase.c();
                try {
                    pVarH = workDatabase2.u().h(string);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (pVarH == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (pVarH.f10978b == 2) {
                    S3.m mVar = new S3.m(string, hVar);
                    S3.n nVarT = workDatabase2.t();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nVarT.f10970a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((S3.b) nVarT.f10971b).x(mVar);
                        workDatabase_Impl.n();
                        workDatabase_Impl.j();
                    } catch (Throwable th) {
                        workDatabase_Impl.j();
                        throw th;
                    }
                } else {
                    J3.r.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                jVar.i(null);
                workDatabase2.n();
                return;
            case 14:
                Pb pb2 = (Pb) this.f735e;
                Object obj = this.f733c;
                ArrayList arrayList = (ArrayList) this.f734d;
                pb2.z(obj, arrayList);
                super/*Va.Mb*/.v((JSONObject) this.f732b, (WebView) arrayList.get(0), obj);
                return;
            case 15:
                a();
                return;
            case 16:
                ((Wa.h) this.f735e).f15449c.b((String) this.f732b, (String) this.f733c, this.f734d);
                return;
            case 17:
                b();
                return;
            case 18:
                k1.b0.h((View) this.f733c, (k1.g0) this.f734d, (C1521a) this.f732b);
                ((ValueAnimator) this.f735e).start();
                return;
            case 19:
                C0502n c0502n = (C0502n) this.f734d;
                try {
                    Ef.H.I(((InterfaceC3108h) this.f733c).minusKey(C3104d.f38758a), new C3182n((MetricsDb_Impl) this.f732b, c0502n, (C3183o) this.f735e, null));
                    return;
                } catch (Throwable th2) {
                    c0502n.a(th2);
                    return;
                }
            case 20:
                ((AbstractC3668a) this.f735e).b((md.k0) this.f733c, (EnumC3721s) this.f734d, (md.b0) this.f732b);
                return;
            case 21:
                ((InterfaceC3724t) ((od.K) this.f735e).f41616b).m((md.k0) this.f733c, (EnumC3721s) this.f734d, (md.b0) this.f732b);
                return;
            case 22:
                od.B0 b02 = (od.B0) this.f735e;
                b02.f41519z = true;
                b02.f41514u.m((md.k0) this.f733c, (EnumC3721s) this.f734d, (md.b0) this.f732b);
                return;
            case 23:
                c();
                return;
            case 24:
                C3753d c3753d = (C3753d) this.f733c;
                if (c3753d != null) {
                    C1346a c1346a = (C1346a) this.f735e;
                    ((ViewOnKeyListenerC3754e) c1346a.f17489b).f43023z = true;
                    c3753d.f42998b.c(false);
                    ((ViewOnKeyListenerC3754e) c1346a.f17489b).f43023z = false;
                }
                p.m mVar2 = (p.m) this.f734d;
                if (mVar2.isEnabled() && mVar2.hasSubMenu()) {
                    ((p.k) this.f732b).q(mVar2, null, 4);
                    return;
                }
                return;
            case 25:
                tc.g gVar = (tc.g) this.f735e;
                com.google.android.gms.ads.nativead.l lVar = (com.google.android.gms.ads.nativead.l) this.f734d;
                String str2 = (String) this.f733c;
                String str3 = (String) this.f732b;
                try {
                    Log.d("ffmpeg-kit-flutter", "Starting copy " + str3 + " to pipe " + str2 + " operation.");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iWaitFor = Runtime.getRuntime().exec(new String[]{"sh", "-c", "cat " + str3 + " > " + str2}).waitFor();
                    Log.d("ffmpeg-kit-flutter", String.format("Copying %s to pipe %s operation completed with rc %d in %d seconds.", str3, str2, Integer.valueOf(iWaitFor), Long.valueOf((System.currentTimeMillis() - jCurrentTimeMillis) / 1000)));
                    lVar.l(gVar, Integer.valueOf(iWaitFor));
                    return;
                } catch (IOException | InterruptedException e16) {
                    Log.e("ffmpeg-kit-flutter", R8.v.g("Copy ", str3, " to pipe ", str2, " failed with error."), e16);
                    lVar.j("WRITE_TO_PIPE_FAILED", e16.getMessage(), gVar);
                    return;
                }
            case 26:
                y6.e eVar = (y6.e) this.f735e;
                y6.b bVar6 = (y6.b) this.f734d;
                Context context6 = (Context) this.f733c;
                try {
                    new zzbss(context6, (String) this.f732b).zza(bVar6.f47736a, eVar);
                    return;
                } catch (IllegalStateException e17) {
                    zzcaf.zza(context6).zzh(e17, "AdManagerInterstitialAd.load");
                    return;
                }
            default:
                AbstractC4618a abstractC4618a = (AbstractC4618a) this.f735e;
                C4476g c4476g5 = (C4476g) this.f734d;
                Context context7 = (Context) this.f733c;
                try {
                    new zzbgy(context7, (String) this.f732b, c4476g5.f47736a, abstractC4618a).zza();
                    return;
                } catch (IllegalStateException e18) {
                    zzcaf.zza(context7).zzh(e18, "AppOpenAd.load");
                    return;
                }
        }
    }

    public /* synthetic */ W0(int i5, String str, Object obj, Object obj2, Object obj3) {
        this.f731a = i5;
        this.f733c = obj2;
        this.f732b = str;
        this.f734d = obj3;
        this.f735e = obj;
    }

    public /* synthetic */ W0(Context context, String str, C4476g c4476g, AbstractC4473d abstractC4473d, int i5) {
        this.f731a = i5;
        this.f733c = context;
        this.f732b = str;
        this.f734d = c4476g;
        this.f735e = abstractC4473d;
    }

    public /* synthetic */ W0(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f731a = i5;
        this.f733c = obj2;
        this.f734d = obj3;
        this.f732b = obj4;
        this.f735e = obj;
    }

    public /* synthetic */ W0(Object obj, Object obj2, Object obj3, Object obj4, int i5, boolean z2) {
        this.f731a = i5;
        this.f733c = obj;
        this.f734d = obj2;
        this.f732b = obj3;
        this.f735e = obj4;
    }

    public /* synthetic */ W0(Object obj, String str, String str2, Object obj2, int i5) {
        this.f731a = i5;
        this.f732b = str;
        this.f733c = str2;
        this.f734d = obj2;
        this.f735e = obj;
    }

    public W0(C0271m1 c0271m1, C0301x c0301x, String str, zzdo zzdoVar) {
        this.f731a = 4;
        this.f734d = c0301x;
        this.f732b = str;
        this.f733c = zzdoVar;
        this.f735e = c0271m1;
    }

    public W0(String str, String str2, com.google.android.gms.ads.nativead.l lVar, tc.g gVar) {
        this.f731a = 25;
        this.f732b = str;
        this.f733c = str2;
        this.f734d = lVar;
        this.f735e = gVar;
    }
}
