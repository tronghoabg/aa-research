package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzabs implements zzabm {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzabk[] zzd = new zzabk[100];

    public zzabs(boolean z2, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized zzabk zza() {
        zzabk zzabkVar;
        try {
            this.zzb++;
            int i5 = this.zzc;
            if (i5 > 0) {
                zzabk[] zzabkVarArr = this.zzd;
                int i10 = i5 - 1;
                this.zzc = i10;
                zzabkVar = zzabkVarArr[i10];
                if (zzabkVar == null) {
                    throw null;
                }
                zzabkVarArr[i10] = null;
            } else {
                zzabkVar = new zzabk(new byte[65536], 0);
                int i11 = this.zzb;
                zzabk[] zzabkVarArr2 = this.zzd;
                int length = zzabkVarArr2.length;
                if (i11 > length) {
                    this.zzd = (zzabk[]) Arrays.copyOf(zzabkVarArr2, length + length);
                    return zzabkVar;
                }
            }
            return zzabkVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzb(zzabk zzabkVar) {
        zzabk[] zzabkVarArr = this.zzd;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        zzabkVarArr[i5] = zzabkVar;
        this.zzb--;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzc(zzabl zzablVar) {
        while (zzablVar != null) {
            zzabk[] zzabkVarArr = this.zzd;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            zzabkVarArr[i5] = zzablVar.zzd();
            this.zzb--;
            zzablVar = zzablVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized void zzd() {
        int i5 = this.zza;
        String str = zzfm.zza;
        int iMax = Math.max(0, ((i5 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.zzb);
        int i10 = this.zzc;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i10, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i5) {
        int i10 = this.zza;
        this.zza = i5;
        if (i5 < i10) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * 65536;
    }

    public final synchronized int zzh() {
        return this.zzc * 65536;
    }
}
