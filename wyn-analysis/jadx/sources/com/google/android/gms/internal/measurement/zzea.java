package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;
import q7.BinderC3877b;

/* loaded from: classes4.dex */
final class zzea extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ zzdy zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzdy zzdyVar, String str, String str2, Object obj, boolean z2) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = obj;
        this.zzf = z2;
        this.zzg = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        zzdj zzdjVar = this.zzg.zzj;
        AbstractC1732v.i(zzdjVar);
        zzdjVar.setUserProperty(this.zzc, this.zzd, new BinderC3877b(this.zze), this.zzf, this.zza);
    }
}
