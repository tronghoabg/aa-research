package com.google.android.gms.internal.ads;

import D6.v1;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzcfe {
    private final InterfaceC3596a zza;
    private final zzcfp zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzcfe(InterfaceC3596a interfaceC3596a, zzcfp zzcfpVar, String str, String str2) {
        this.zza = interfaceC3596a;
        this.zzb = zzcfpVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final void zza(v1 v1Var) {
        synchronized (this.zzd) {
            ((C3597b) this.zza).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzj = jElapsedRealtime;
            this.zzb.zzf(v1Var, jElapsedRealtime);
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzc() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzd(long j8) {
        synchronized (this.zzd) {
            try {
                this.zzk = j8;
                if (j8 != -1) {
                    this.zzb.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && this.zzg == -1) {
                    ((C3597b) this.zza).getClass();
                    this.zzg = SystemClock.elapsedRealtime();
                    this.zzb.zzb(this);
                }
                this.zzb.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    zzcfd zzcfdVar = new zzcfd(this);
                    zzcfdVar.zzc();
                    this.zzc.add(zzcfdVar);
                    this.zzi++;
                    zzcfp zzcfpVar = this.zzb;
                    zzcfpVar.zzd();
                    zzcfpVar.zzb(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    LinkedList linkedList = this.zzc;
                    if (!linkedList.isEmpty()) {
                        zzcfd zzcfdVar = (zzcfd) linkedList.getLast();
                        if (zzcfdVar.zza() == -1) {
                            zzcfdVar.zzb();
                            this.zzb.zzb(this);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzh(boolean z2) {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    ((C3597b) this.zza).getClass();
                    this.zzh = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle zzi() {
        Bundle bundle;
        synchronized (this.zzd) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.zze);
                bundle.putString("slotid", this.zzf);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.zzj);
                bundle.putLong("tresponse", this.zzk);
                bundle.putLong("timp", this.zzg);
                bundle.putLong("tload", this.zzh);
                bundle.putLong("pcc", this.zzi);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzcfd) it.next()).zzd());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String zzj() {
        return this.zze;
    }

    public final /* synthetic */ InterfaceC3596a zzk() {
        return this.zza;
    }
}
