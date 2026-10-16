package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzxv {
    public final int zza;
    public final zzxl zzb;
    private final CopyOnWriteArrayList zzc;

    private zzxv(CopyOnWriteArrayList copyOnWriteArrayList, int i5, zzxl zzxlVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxlVar;
    }

    public final zzxv zza(int i5, zzxl zzxlVar) {
        return new zzxv(this.zzc, 0, zzxlVar);
    }

    public final void zzb(Handler handler, zzxw zzxwVar) {
        this.zzc.add(new zzxo(handler, zzxwVar));
    }

    public final void zzc(zzxw zzxwVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzxo zzxoVar = (zzxo) it.next();
            if (zzxoVar.zzb == zzxwVar) {
                copyOnWriteArrayList.remove(zzxoVar);
            }
        }
    }

    public final void zzd(final zzxc zzxcVar, final zzxh zzxhVar, final int i5) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxu
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxw) obj).zzai(0, this.zza.zzb, zzxcVar, zzxhVar, i5);
            }
        });
    }

    public final void zze(final zzxc zzxcVar, final zzxh zzxhVar) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxp
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxw) obj).zzaj(0, this.zza.zzb, zzxcVar, zzxhVar);
            }
        });
    }

    public final void zzf(final zzxc zzxcVar, final zzxh zzxhVar) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxq
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxw) obj).zzak(0, this.zza.zzb, zzxcVar, zzxhVar);
            }
        });
    }

    public final void zzg(final zzxc zzxcVar, final zzxh zzxhVar, final IOException iOException, final boolean z2) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxr
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxw) obj).zzal(0, this.zza.zzb, zzxcVar, zzxhVar, iOException, z2);
            }
        });
    }

    public final void zzh(final zzxh zzxhVar) {
        zzi(new zzdu() { // from class: com.google.android.gms.internal.ads.zzxs
            @Override // com.google.android.gms.internal.ads.zzdu
            public final /* synthetic */ void zza(Object obj) {
                ((zzxw) obj).zzam(0, this.zza.zzb, zzxhVar);
            }
        });
    }

    public final void zzi(final zzdu zzduVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzxo zzxoVar = (zzxo) it.next();
            final zzxw zzxwVar = zzxoVar.zzb;
            zzfm.zze(zzxoVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzxt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzduVar.zza(zzxwVar);
                }
            });
        }
    }

    public zzxv() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
