package com.google.android.gms.internal.ads;

import D6.C0395s;
import Va.M6;
import android.text.TextUtils;

/* loaded from: classes3.dex */
final class zzepk {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzepk(String str, String str2, int i5, long j8, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i5;
        this.zzd = j8;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i5 = this.zzc;
        long j8 = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i5).length() + 1 + String.valueOf(j8).length());
        sb2.append(str);
        sb2.append(".");
        sb2.append(i5);
        sb2.append(".");
        sb2.append(j8);
        String string = sb2.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            string = M6.t(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcs)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}
