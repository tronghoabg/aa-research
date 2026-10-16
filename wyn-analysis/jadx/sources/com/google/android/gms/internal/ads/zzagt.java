package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzagt {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) throws NumberFormatException {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzfm.zza;
            int i5 = Integer.parseInt(strGroup, 16);
            int i10 = Integer.parseInt(matcher.group(2), 16);
            if (i5 <= 0 && i10 <= 0) {
                return false;
            }
            this.zza = i5;
            this.zzb = i10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzap zzapVar) {
        zzgwt zzgwtVarZze = zzapVar.zze(zzajm.class, zzags.zza);
        int size = zzgwtVarZze.size();
        int i5 = 0;
        while (i5 < size) {
            boolean zZzc = zzc(((zzajm) zzgwtVarZze.get(i5)).zzc);
            i5++;
            if (zZzc) {
                return true;
            }
        }
        zzgwt zzgwtVarZze2 = zzapVar.zze(zzaju.class, zzagr.zza);
        int size2 = zzgwtVarZze2.size();
        int i10 = 0;
        while (i10 < size2) {
            boolean zZzc2 = zzc(((zzaju) zzgwtVarZze2.get(i10)).zzc);
            i10++;
            if (zZzc2) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
