package com.google.android.gms.internal.ads;

import D6.AbstractBinderC0383l0;
import D6.C0392q;
import D6.C0395s;
import D6.InterfaceC0404w0;
import D6.p1;
import G6.C0546j;
import G6.U;
import Va.M6;
import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzcqy extends AbstractBinderC0383l0 {
    private final Context zza;
    private final H6.a zzb;
    private final zzdxk zzc;
    private final zzemc zzd;
    private final zzese zze;
    private final zzece zzf;
    private final zzceg zzg;
    private final zzdxp zzh;
    private final zzecz zzi;
    private final zzblr zzj;
    private final zzfqt zzk;
    private final zzfmc zzl;
    private final zzdal zzm;
    private final zzdzt zzn;
    private final zzeeg zzo;
    private boolean zzp = false;
    private final Long zzq;

    public zzcqy(Context context, H6.a aVar, zzdxk zzdxkVar, zzemc zzemcVar, zzese zzeseVar, zzece zzeceVar, zzceg zzcegVar, zzdxp zzdxpVar, zzecz zzeczVar, zzblr zzblrVar, zzfqt zzfqtVar, zzfmc zzfmcVar, zzdal zzdalVar, zzdzt zzdztVar, zzeeg zzeegVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzdxkVar;
        this.zzd = zzemcVar;
        this.zze = zzeseVar;
        this.zzf = zzeceVar;
        this.zzg = zzcegVar;
        this.zzh = zzdxpVar;
        this.zzi = zzeczVar;
        this.zzj = zzblrVar;
        this.zzk = zzfqtVar;
        this.zzl = zzfmcVar;
        this.zzm = zzdalVar;
        this.zzn = zzdztVar;
        this.zzo = zzeegVar;
        C6.n.f1857D.k.getClass();
        this.zzq = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void zzb() {
        String str;
        C6.n nVar = C6.n.f1857D;
        if (((G6.O) nVar.f1868h.zzp()).f()) {
            G6.O o7 = (G6.O) nVar.f1868h.zzp();
            o7.l();
            synchronized (o7.f4531a) {
                str = o7.f4555z;
            }
            if (nVar.f1874o.b(this.zza, str, this.zzb.f4927a)) {
                return;
            }
            ((G6.O) nVar.f1868h.zzp()).g(false);
            ((G6.O) nVar.f1868h.zzp()).h("");
        }
    }

    public final /* synthetic */ void zzc() {
        zzfml.zza(this.zza, true);
    }

    public final void zzd() {
        C6.n.f1857D.f1873n.zza(this.zza, this.zzn);
    }

    @Override // D6.InterfaceC0385m0
    public final synchronized void zze() {
        if (this.zzp) {
            int i5 = G6.L.f4523b;
            H6.l.f("Mobile ads is initialized already.");
            return;
        }
        zzbio zzbioVar = zzbix.zzdn;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            C0392q.a();
        }
        Context context = this.zza;
        zzbix.zza(context);
        H6.a aVar = this.zzb;
        zzdzt zzdztVar = this.zzn;
        C6.n nVar = C6.n.f1857D;
        nVar.f1868h.zzf(context, aVar, zzdztVar);
        this.zzm.zzc();
        nVar.f1870j.zza(context);
        this.zzp = true;
        this.zzf.zzc();
        this.zze.zza();
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfd)).booleanValue()) {
            this.zzh.zza();
        }
        this.zzi.zza();
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzmC)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzea)).booleanValue()) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfI)).booleanValue()) {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfJ)).booleanValue()) {
                zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqt
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd();
                    }
                });
            }
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfX)).booleanValue()) {
            final zzeeg zzeegVar = this.zzo;
            zzhcp zzhcpVar = zzcfy.zzf;
            Objects.requireNonNull(zzeegVar);
            zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeegVar.zza();
                }
            });
        }
    }

    @Override // D6.InterfaceC0385m0
    public final synchronized void zzf(float f10) {
        C6.n.f1857D.f1869i.a(f10);
    }

    @Override // D6.InterfaceC0385m0
    public final synchronized void zzg(String str) {
        Context context = this.zza;
        zzbix.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfb)).booleanValue()) {
                C6.n.f1857D.f1871l.Q(context, this.zzb, true, null, str, null, null, this.zzk, null, null, this.zzi.zzs());
            }
        }
    }

    @Override // D6.InterfaceC0385m0
    public final synchronized void zzh(boolean z2) {
        C6.n.f1857D.f1869i.c(z2);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzi(InterfaceC3876a interfaceC3876a, String str) {
        if (interfaceC3876a == null) {
            int i5 = G6.L.f4523b;
            H6.l.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) BinderC3877b.S(interfaceC3876a);
        if (context == null) {
            int i10 = G6.L.f4523b;
            H6.l.c("Context is null. Failed to open debug menu.");
        } else {
            C0546j c0546j = new C0546j(context);
            c0546j.f4604d = str;
            c0546j.f4605e = this.zzb.f4927a;
            c0546j.b();
        }
    }

    @Override // D6.InterfaceC0385m0
    public final void zzj(String str, InterfaceC3876a interfaceC3876a) throws JSONException {
        String strM;
        Runnable runnable;
        Context context = this.zza;
        zzbix.zza(context);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfi)).booleanValue()) {
            try {
                U u10 = C6.n.f1857D.f1863c;
                strM = U.M(context);
            } catch (RemoteException | RuntimeException e7) {
                C6.n.f1857D.f1868h.zzh(e7, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strM = "";
        }
        boolean z2 = true;
        String str2 = true == TextUtils.isEmpty(strM) ? str : strM;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzbio zzbioVar = zzbix.zzfb;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        zzbio zzbioVar2 = zzbix.zzbI;
        zzbiv zzbivVar = c0395s.f2492c;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue();
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue()) {
            final Runnable runnable2 = (Runnable) BinderC3877b.S(interfaceC3876a);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhcp zzhcpVar = zzcfy.zzf;
                    final zzcqy zzcqyVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqw
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcqyVar.zzy(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z2 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z2) {
            C6.n.f1857D.f1871l.Q(this.zza, this.zzb, true, null, str2, null, runnable3, this.zzk, this.zzn, this.zzq, this.zzi.zzs());
        }
    }

    @Override // D6.InterfaceC0385m0
    public final synchronized float zzk() {
        return C6.n.f1857D.f1869i.b();
    }

    @Override // D6.InterfaceC0385m0
    public final synchronized boolean zzl() {
        return C6.n.f1857D.f1869i.d();
    }

    @Override // D6.InterfaceC0385m0
    public final String zzm() {
        return this.zzb.f4927a;
    }

    @Override // D6.InterfaceC0385m0
    public final void zzn(String str) {
        this.zze.zze(str);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzo(zzbvj zzbvjVar) throws RemoteException {
        this.zzl.zzc(zzbvjVar);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzp(zzbsd zzbsdVar) throws RemoteException {
        this.zzf.zzb(zzbsdVar);
    }

    @Override // D6.InterfaceC0385m0
    public final List zzq() throws RemoteException {
        return this.zzf.zzd();
    }

    @Override // D6.InterfaceC0385m0
    public final void zzr(p1 p1Var) throws RemoteException {
        this.zzg.zzc(this.zza, p1Var);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzs() {
        this.zzf.zza();
    }

    @Override // D6.InterfaceC0385m0
    public final void zzt(InterfaceC0404w0 interfaceC0404w0) throws RemoteException {
        this.zzi.zzo(interfaceC0404w0, zzecy.API);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzu(boolean z2) throws RemoteException {
        try {
            zzgcs.zza(this.zza).zzb(z2);
        } catch (IOException e7) {
            throw new RemoteException(e7.getMessage());
        }
    }

    @Override // D6.InterfaceC0385m0
    public final void zzv(String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkW)).booleanValue()) {
            C6.n.f1857D.f1868h.zzu(str);
        }
    }

    @Override // D6.InterfaceC0385m0
    public final synchronized void zzw() {
        zzbio zzbioVar = zzbix.zzdm;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            C6.n.f1857D.f1877r.zzc();
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzdn)).booleanValue()) {
                C0392q.f2477g.f2480c = true;
            }
        }
    }

    public final /* synthetic */ void zzx() {
        this.zzj.zza(new zzcaj());
    }

    public final void zzy(Runnable runnable) {
        AbstractC1732v.e("Adapters must be initialized on the main thread.");
        Map mapZzf = ((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzf();
        if (mapZzf.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                int i5 = G6.L.f4523b;
                H6.l.g("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzc()) {
            HashMap map = new HashMap();
            Iterator it = mapZzf.values().iterator();
            while (it.hasNext()) {
                for (zzbvc zzbvcVar : ((zzbvd) it.next()).zza) {
                    String str = zzbvcVar.zzb;
                    for (String str2 : zzbvcVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzemd zzemdVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzemdVarZza != null) {
                        zzfme zzfmeVar = (zzfme) zzemdVarZza.zzb;
                        if (!zzfmeVar.zzn() && zzfmeVar.zzq()) {
                            zzfmeVar.zzr(this.zza, (zzenq) zzemdVarZza.zzc, (List) entry.getValue());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 45);
                            sb2.append("Initialized rewarded video mediation adapter ");
                            sb2.append(str3);
                            String string = sb2.toString();
                            int i10 = G6.L.f4523b;
                            H6.l.a(string);
                        }
                    }
                } catch (zzfln e7) {
                    String strT = M6.t(new StringBuilder(String.valueOf(str3).length() + 56), "Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                    int i11 = G6.L.f4523b;
                    H6.l.g(strT, e7);
                }
            }
        }
    }
}
