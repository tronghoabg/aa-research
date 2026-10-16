package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;

/* loaded from: classes4.dex */
final class zzff extends zzdy.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdy zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzdy zzdyVar, Long l10, String str, String str2, Bundle bundle, boolean z2, boolean z10) {
        super(zzdyVar);
        this.zzc = l10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z2;
        this.zzh = z10;
        this.zzi = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        Long l10 = this.zzc;
        long jLongValue = l10 == null ? this.zza : l10.longValue();
        zzdj zzdjVar = this.zzi.zzj;
        AbstractC1732v.i(zzdjVar);
        zzdjVar.logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, jLongValue);
    }
}
