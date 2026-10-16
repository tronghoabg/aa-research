package com.google.android.gms.internal.ads;

import Va.M6;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzqi {
    public static final zzqi zza;
    public final int zzb;
    public final int zzc;
    private final zzgxd zzd;

    static {
        zzqi zzqiVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgxc zzgxcVar = new zzgxc();
            for (int i5 = 1; i5 <= 10; i5++) {
                zzgxcVar.zzf(Integer.valueOf(zzfm.zzG(i5)));
            }
            zzqiVar = new zzqi(2, zzgxcVar.zzh());
        } else {
            zzqiVar = new zzqi(2, 10);
        }
        zza = zzqiVar;
    }

    public zzqi(int i5, int i10) {
        this.zzb = i5;
        this.zzc = i10;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqi)) {
            return false;
        }
        zzqi zzqiVar = (zzqi) obj;
        return this.zzb == zzqiVar.zzb && this.zzc == zzqiVar.zzc && Objects.equals(this.zzd, zzqiVar.zzd);
    }

    public final int hashCode() {
        zzgxd zzgxdVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgxdVar == null ? 0 : zzgxdVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i5 = this.zzb;
        int length = String.valueOf(i5).length();
        int i10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i10).length() + 15 + strValueOf.length() + 1);
        N0.a.l(i5, i10, "AudioProfile[format=", ", maxChannelCount=", sb2);
        return M6.t(sb2, ", channelMasks=", strValueOf, "]");
    }

    public final int zza(int i5, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzqj.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i10 = this.zzb;
        for (int i11 = 10; i11 > 0; i11--) {
            int iZzG = zzfm.zzG(i11);
            if (iZzG != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i5).setChannelMask(iZzG).build(), zzdVar.zza())) {
                return i11;
            }
        }
        return 0;
    }

    public final /* synthetic */ boolean zzb(int i5, zzv zzvVar) {
        zzgxd zzgxdVar = this.zzd;
        if (zzgxdVar == null) {
            return i5 <= this.zzc;
        }
        int iZzG = zzvVar.zzI;
        if (iZzG == -1 || zzvVar.zzH != i5) {
            iZzG = zzfm.zzG(i5);
        }
        if (iZzG != 0) {
            return zzgxdVar.contains(Integer.valueOf(iZzG));
        }
        return false;
    }

    public zzqi(int i5, Set set) {
        this.zzb = i5;
        zzgxd zzgxdVarZzp = zzgxd.zzp(set);
        this.zzd = zzgxdVarZzp;
        zzgzh it = zzgxdVarZzp.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
