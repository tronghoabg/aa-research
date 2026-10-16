package com.google.android.gms.internal.p002firebaseauthapi;

import J8.H;
import J8.I;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzage {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzagu zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private I zzk;
    private List<zzags> zzl;
    private zzal<H> zzm;

    public zzage() {
        this.zzf = new zzagu();
        this.zzm = zzal.zzh();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzal<H> zzd() {
        return this.zzm;
    }

    public final I zze() {
        return this.zzk;
    }

    public final zzagu zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzags> zzk() {
        return this.zzl;
    }

    public final List<zzagr> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzage zza(I i5) {
        this.zzk = i5;
        return this;
    }

    public final zzage zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzage zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzage zzc(String str) {
        this.zze = str;
        return this;
    }

    public zzage(String str, String str2, boolean z2, String str3, String str4, zzagu zzaguVar, String str5, String str6, long j8, long j10, boolean z10, I i5, List<zzags> list, zzal<H> zzalVar) {
        zzagu zzaguVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z2;
        this.zzd = str3;
        this.zze = str4;
        if (zzaguVar == null) {
            zzaguVar2 = new zzagu();
        } else {
            List<zzagr> listZza = zzaguVar.zza();
            zzagu zzaguVar3 = new zzagu();
            if (listZza != null) {
                zzaguVar3.zza().addAll(listZza);
            }
            zzaguVar2 = zzaguVar3;
        }
        this.zzf = zzaguVar2;
        this.zzg = str6;
        this.zzh = j8;
        this.zzi = j10;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzalVar;
    }

    public final zzage zza(boolean z2) {
        this.zzj = z2;
        return this;
    }

    public final zzage zza(zzal<H> zzalVar) {
        AbstractC1732v.i(zzalVar);
        this.zzm = zzalVar;
        return this;
    }

    public final zzage zza(List<zzagr> list) {
        AbstractC1732v.i(list);
        zzagu zzaguVar = new zzagu();
        this.zzf = zzaguVar;
        zzaguVar.zza().addAll(list);
        return this;
    }
}
