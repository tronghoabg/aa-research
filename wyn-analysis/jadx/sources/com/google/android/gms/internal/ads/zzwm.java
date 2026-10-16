package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class zzwm implements zzxn {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzxv zzc = new zzxv();
    private final zzul zzd = new zzul();
    private Looper zze;
    private zzbf zzf;
    private zzqh zzg;
    private zzabr zzh;

    @Override // com.google.android.gms.internal.ads.zzxn
    public /* synthetic */ void zzB(zzak zzakVar) {
        Q.a(this, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public /* synthetic */ zzbf zzI() {
        return Q.b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public /* synthetic */ boolean zzJ() {
        return Q.c(this);
    }

    public void zzN() {
    }

    public abstract void zza(zzip zzipVar);

    public void zzc() {
    }

    public abstract void zzd();

    public final void zze(zzbf zzbfVar) {
        this.zzf = zzbfVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((zzxm) arrayList.get(i5)).zza(this, zzbfVar);
        }
    }

    public final zzxv zzf(zzxl zzxlVar) {
        return this.zzc.zza(0, zzxlVar);
    }

    public final zzxv zzg(int i5, zzxl zzxlVar) {
        return this.zzc.zza(0, zzxlVar);
    }

    public final zzul zzh(zzxl zzxlVar) {
        return this.zzd.zza(0, zzxlVar);
    }

    public final zzul zzi(int i5, zzxl zzxlVar) {
        return this.zzd.zza(0, zzxlVar);
    }

    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    public final zzqh zzk() {
        zzqh zzqhVar = this.zzg;
        zzqhVar.getClass();
        return zzqhVar;
    }

    public final zzabr zzl() {
        zzabr zzabrVar = this.zzh;
        zzabrVar.getClass();
        return zzabrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzm(Handler handler, zzxw zzxwVar) {
        this.zzc.zzb(handler, zzxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzn(zzxw zzxwVar) {
        this.zzc.zzc(zzxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzo(Handler handler, zzum zzumVar) {
        this.zzd.zzb(handler, zzumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzp(zzum zzumVar) {
        this.zzd.zzc(zzumVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzq(zzxm zzxmVar, zzqh zzqhVar, zzabr zzabrVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z2 = true;
        if (looper != null && looper != looperMyLooper) {
            z2 = false;
        }
        zzgtr.zza(z2);
        this.zzg = zzqhVar;
        this.zzh = zzabrVar;
        zzbf zzbfVar = this.zzf;
        this.zza.add(zzxmVar);
        if (this.zze == null) {
            this.zze = looperMyLooper;
            this.zzb.add(zzxmVar);
            zza(zzabrVar.zze());
        } else if (zzbfVar != null) {
            zzr(zzxmVar);
            zzxmVar.zza(this, zzbfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzr(zzxm zzxmVar) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(zzxmVar);
        if (zIsEmpty) {
            zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzs(zzxm zzxmVar) {
        HashSet hashSet = this.zzb;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(zzxmVar);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzt(zzxm zzxmVar) {
        ArrayList arrayList = this.zza;
        arrayList.remove(zzxmVar);
        if (!arrayList.isEmpty()) {
            zzs(zzxmVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzd();
    }
}
