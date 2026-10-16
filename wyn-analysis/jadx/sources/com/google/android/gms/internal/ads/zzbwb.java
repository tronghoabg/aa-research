package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzbwb implements J6.d {
    private final Date zza;
    private final int zzb;
    private final Set zzc;
    private final boolean zzd;
    private final Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbwb(Date date, int i5, Set set, Location location, boolean z2, int i10, boolean z10, int i11, String str) {
        this.zza = date;
        this.zzb = i5;
        this.zzc = set;
        this.zze = location;
        this.zzd = z2;
        this.zzf = i10;
        this.zzg = z10;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.zza;
    }

    @Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // J6.d
    public final Set<String> getKeywords() {
        return this.zzc;
    }

    public final Location getLocation() {
        return this.zze;
    }

    @Override // J6.d
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    @Override // J6.d
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // J6.d
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
