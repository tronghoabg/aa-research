package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzapc {
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.EMPTY_SET;
    private String zzd = "";
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i5, String str, String str2, int i10) {
        if (str.isEmpty() || i5 == -1) {
            return i5;
        }
        if (str.equals(str2)) {
            return i5 + i10;
        }
        return -1;
    }

    public final void zza(String str) {
        this.zza = str;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public final void zzc(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public final int zze(String str, String str2, Set set, String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + iZzA;
    }

    public final int zzf() {
        int i5 = this.zzk;
        if (i5 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i5 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final boolean zzg() {
        return this.zzj == 1;
    }

    public final zzapc zzh(boolean z2) {
        this.zzj = 1;
        return this;
    }

    public final zzapc zzi(boolean z2) {
        this.zzk = 1;
        return this;
    }

    public final zzapc zzj(boolean z2) {
        this.zzl = 1;
        return this;
    }

    public final String zzk() {
        return this.zze;
    }

    public final zzapc zzl(String str) {
        this.zze = zzgsz.zza(str);
        return this;
    }

    public final int zzm() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final zzapc zzn(int i5) {
        this.zzf = i5;
        this.zzg = true;
        return this;
    }

    public final boolean zzo() {
        return this.zzg;
    }

    public final int zzp() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final zzapc zzq(int i5) {
        this.zzh = i5;
        this.zzi = true;
        return this;
    }

    public final boolean zzr() {
        return this.zzi;
    }

    public final zzapc zzs(float f10) {
        this.zzn = f10;
        return this;
    }

    public final zzapc zzt(int i5) {
        this.zzm = i5;
        return this;
    }

    public final int zzu() {
        return this.zzm;
    }

    public final float zzv() {
        return this.zzn;
    }

    public final zzapc zzw(int i5) {
        this.zzo = i5;
        return this;
    }

    public final int zzx() {
        return this.zzo;
    }

    public final zzapc zzy(boolean z2) {
        this.zzp = z2;
        return this;
    }

    public final boolean zzz() {
        return this.zzp;
    }
}
