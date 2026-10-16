package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.v1;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzcfp implements zzbfr {
    final zzcfm zza;
    private final G6.N zze;
    private final Object zzd = new Object();
    final HashSet zzb = new HashSet();
    final HashSet zzc = new HashSet();
    private boolean zzg = false;
    private final zzcfn zzf = new zzcfn();

    public zzcfp(String str, G6.N n10) {
        this.zza = new zzcfm(str, n10);
        this.zze = n10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z2) {
        C6.n.f1857D.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z2) {
            G6.O o7 = (G6.O) this.zze;
            if (jCurrentTimeMillis - o7.s() > ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzbL)).longValue()) {
                this.zza.zzd = -1;
            } else {
                this.zza.zzd = o7.u();
            }
            this.zzg = true;
            return;
        }
        G6.O o10 = (G6.O) this.zze;
        o10.l();
        synchronized (o10.f4531a) {
            try {
                if (o10.f4544o != jCurrentTimeMillis) {
                    o10.f4544o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = o10.f4537g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        o10.f4537g.apply();
                    }
                    o10.m();
                }
            } finally {
            }
        }
        o10.t(this.zza.zzd);
    }

    public final void zzb(zzcfe zzcfeVar) {
        synchronized (this.zzd) {
            this.zzb.add(zzcfeVar);
        }
    }

    public final void zzc(HashSet hashSet) {
        synchronized (this.zzd) {
            this.zzb.addAll(hashSet);
        }
    }

    public final void zzd() {
        synchronized (this.zzd) {
            this.zza.zza();
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            this.zza.zzb();
        }
    }

    public final void zzf(v1 v1Var, long j8) {
        synchronized (this.zzd) {
            this.zza.zze(v1Var, j8);
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zza.zzf();
        }
    }

    public final void zzh() {
        synchronized (this.zzd) {
            this.zza.zzg();
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zza.zzc();
        }
    }

    public final int zzj() {
        int iZzd;
        synchronized (this.zzd) {
            iZzd = this.zza.zzd();
        }
        return iZzd;
    }

    public final zzcfe zzk(InterfaceC3596a interfaceC3596a, String str) {
        return new zzcfe(interfaceC3596a, this, this.zzf.zza(), str);
    }

    public final boolean zzl() {
        return this.zzg;
    }

    public final zzcfl zzm(Set set, String str) {
        return this.zza.zzi(set, str);
    }

    public final Bundle zzn(Context context, zzfmo zzfmoVar) {
        HashSet hashSet = new HashSet();
        synchronized (this.zzd) {
            HashSet hashSet2 = this.zzb;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.zza.zzh(context, this.zzf.zzb()));
        Bundle bundle2 = new Bundle();
        Iterator it = this.zzc.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle.putBundle("slots", bundle2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzcfe) it2.next()).zzi());
        }
        bundle.putParcelableArrayList("ads", arrayList);
        zzfmoVar.zzb(hashSet);
        return bundle;
    }
}
