package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzghg {
    private final zzhcp zza;
    private final zzghl zzb;
    private final Set zzc;
    private final String zzd;
    private final zzaxt zze;
    private final zzgie zzf;
    private final zzgqo zzg;

    public zzghg(zzhcp zzhcpVar, zzghl zzghlVar, zzgie zzgieVar, zzgen zzgenVar, String str, zzaxt zzaxtVar, zzino zzinoVar, zzino zzinoVar2, zzino zzinoVar3, zzgqo zzgqoVar) {
        this.zza = zzhcpVar;
        this.zzb = zzghlVar;
        this.zzd = str;
        this.zzf = zzgieVar;
        this.zze = zzaxtVar;
        this.zzg = zzgqoVar;
        int iOrdinal = zzgenVar.ordinal();
        if (iOrdinal == 0) {
            this.zzc = ((zzinl) zzinoVar).zzb();
        } else if (iOrdinal == 1) {
            this.zzc = ((zzinl) zzinoVar2).zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.zzc = ((zzinl) zzinoVar3).zzb();
        }
    }

    public final p8.p zza() {
        if (!this.zzb.zzc()) {
            return zzhcf.zza(Integer.toString(7));
        }
        if (!this.zzf.zzb()) {
            return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzghf
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb();
                }
            }, this.zza);
        }
        Set set = this.zzc;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zza.zzc((zzgjh) it.next()));
        }
        return zzhcf.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzghd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }, zzhcw.zza());
    }

    public final /* synthetic */ String zzb() {
        return this.zzb.zzg(Http2.INITIAL_MAX_FRAME_SIZE, this.zzd);
    }

    public final /* synthetic */ String zzc() {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzghe
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        };
        zzgqm zzgqmVarZza = this.zzg.zza(101);
        try {
            zzgqmVarZza.zza();
            Object objCall = callable.call();
            zzgqmVarZza.zzc();
            return (String) objCall;
        } finally {
        }
    }

    public final /* synthetic */ String zzd() {
        zzayt zzaytVar = (zzayt) this.zze.zzbu();
        String str = this.zzd;
        zzghl zzghlVar = this.zzb;
        try {
            return Base64.encodeToString(((zzazm) zzghlVar.zzf(zzaytVar.zzaN(), str).zzbu()).zzaN(), 11);
        } catch (IllegalArgumentException unused) {
            return zzghlVar.zzg(4096, str);
        }
    }
}
