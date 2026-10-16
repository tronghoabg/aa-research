package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.InterfaceC0358a;
import D6.K0;
import G6.U;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzcuc implements zzdcz, zzden, zzddt, InterfaceC0358a, zzddp, zzdkx, zzdfu {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfky zze;
    private final zzfkn zzf;
    private final zzfsi zzg;
    private final zzflt zzh;
    private final zzbaw zzi;
    private final zzbke zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzdcc zzm;
    private final zzdfo zzn;
    private final zzdbv zzo;
    private final Set zzp;
    private boolean zzq;
    private final AtomicBoolean zzr = new AtomicBoolean();
    private zzcfl zzs = null;

    public zzcuc(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfky zzfkyVar, zzfkn zzfknVar, zzfsi zzfsiVar, zzflt zzfltVar, View view, zzclb zzclbVar, zzbaw zzbawVar, zzbke zzbkeVar, zzbkg zzbkgVar, zzfqq zzfqqVar, zzdcc zzdccVar, zzdfo zzdfoVar, zzdbv zzdbvVar, Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfkyVar;
        this.zzf = zzfknVar;
        this.zzg = zzfsiVar;
        this.zzh = zzfltVar;
        this.zzi = zzbawVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzclbVar);
        this.zzj = zzbkeVar;
        this.zzm = zzdccVar;
        this.zzn = zzdfoVar;
        this.zzo = zzdbvVar;
        this.zzp = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmZ)).booleanValue()) {
            U u10 = C6.n.f1857D.f1863c;
            Context context = this.zza;
            if (U.d(context)) {
                Object systemService = context.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(final int i5, final int i10) {
        View view;
        if (i5 <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcty
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(i5, i10);
                }
            }, i10, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String strZzj;
        int i5;
        zzfkn zzfknVar = this.zzf;
        List list = zzfknVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        zzbio zzbioVar = zzbix.zzpv;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && this.zzs == null) {
            this.zzs = C6.n.f1857D.f1868h.zzs().zzm(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzeB)).booleanValue()) {
            strZzj = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzj = null;
        }
        if ((((Boolean) c0395s.f2492c.zzd(zzbix.zzbi)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbkw.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfknVar, false, strZzj, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((Boolean) zzbkw.zzg.zze()).booleanValue() && ((i5 = zzfknVar.zzb) == 1 || i5 == 2 || i5 == 5)) {
        }
        zzhcf.zzr((zzhbx) zzhcf.zzi(zzhbx.zzw(zzhcf.zza(null)), ((Long) c0395s.f2492c.zzd(zzbix.zzbM)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzctw(this, strZzj), this.zzb);
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() {
        if (!(((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbi)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbkw.zzd.zze()).booleanValue()) {
            zzhcf.zzr((zzhbx) zzhcf.zzg(zzhbx.zzw(this.zzj.zzb()), Throwable.class, zzcub.zza, zzcfy.zzh), new zzctv(this), this.zzb);
            return;
        }
        zzflt zzfltVar = this.zzh;
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zzb(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzc), true == C6.n.f1857D.f1868h.zzt(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
        zzfsi zzfsiVar = this.zzg;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zzc(zzfknVar, zzfknVar.zzh, zzcbwVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            zzbio zzbioVar = zzbix.zzeK;
            C0395s c0395s = C0395s.f2489e;
            int iIntValue = ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue();
            if (iIntValue > 0) {
                zzy(iIntValue, ((Integer) c0395s.f2492c.zzd(zzbix.zzeL)).intValue());
                return;
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzeJ)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzg() {
        zzdcc zzdccVar;
        try {
            if (this.zzq) {
                ArrayList arrayList = new ArrayList(zzp());
                zzfkn zzfknVar = this.zzf;
                arrayList.addAll(zzfknVar.zzf);
                this.zzh.zza(this.zzg.zzb(this.zze, zzfknVar, true, null, null, arrayList, null, null), null);
            } else {
                zzflt zzfltVar = this.zzh;
                zzfsi zzfsiVar = this.zzg;
                zzfky zzfkyVar = this.zze;
                zzfkn zzfknVar2 = this.zzf;
                zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar2, zzfknVar2.zzm), null);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeG)).booleanValue() && (zzdccVar = this.zzm) != null) {
                    List list = zzdccVar.zzb().zzm;
                    String strZzg = zzdccVar.zzc().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfsi.zzd((String) it.next(), "@gw_adnetstatus@", strZzg));
                    }
                    long jZzh = zzdccVar.zzc().zzh();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfsi.zzd((String) it2.next(), "@gw_ttr@", Long.toString(jZzh, 10)));
                    }
                    zzfltVar.zza(zzfsiVar.zza(zzdccVar.zza(), zzdccVar.zzb(), arrayList3), null);
                }
                zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar2, zzfknVar2.zzf), null);
            }
            this.zzq = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzi() {
        zzfsi zzfsiVar = this.zzg;
        zzfky zzfkyVar = this.zze;
        zzflt zzfltVar = this.zzh;
        zzfkn zzfknVar = this.zzf;
        zzfltVar.zza(zzfsiVar.zza(zzfkyVar, zzfknVar, zzfknVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzj(K0 k02) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcl)).booleanValue()) {
            int i5 = k02.f2338a;
            zzfkn zzfknVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfknVar.zzo) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 2);
                sb2.append("2.");
                sb2.append(i5);
                arrayList.add(zzfsi.zzd(str, "@gw_mpe@", sb2.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfknVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfu
    public final void zzk() {
        zzfkn zzfknVar = this.zzf;
        if (zzfknVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfknVar, zzfknVar.zzaA), null);
        }
    }

    public final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcua
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo();
            }
        });
    }

    public final /* synthetic */ void zzm(final int i5, final int i10) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(i5, i10);
            }
        });
    }

    public final /* synthetic */ void zzn(int i5, int i10) {
        zzy(i5 - 1, i10);
    }

    public final /* synthetic */ Context zzq() {
        return this.zza;
    }

    public final /* synthetic */ zzfky zzr() {
        return this.zze;
    }

    public final /* synthetic */ zzfkn zzs() {
        return this.zzf;
    }

    public final /* synthetic */ zzfsi zzt() {
        return this.zzg;
    }

    public final /* synthetic */ zzflt zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzdfo zzv() {
        return this.zzn;
    }

    public final /* synthetic */ zzdbv zzw() {
        return this.zzo;
    }

    public final /* synthetic */ zzcfl zzx() {
        return this.zzs;
    }
}
