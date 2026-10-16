package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.RemoteException;
import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzebq extends zzccr {
    final /* synthetic */ zzebr zza;

    public zzebq(zzebr zzebrVar) {
        Objects.requireNonNull(zzebrVar);
        this.zza = zzebrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze() throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzm(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf() throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzo(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg(zzccm zzccmVar) throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzp(zzebrVar.zzd(), zzccmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh(int i5) throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzn(zzebrVar.zzd(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi(K0 k02) throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzn(zzebrVar.zzd(), k02.f2338a);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj() throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzq(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzr(zzebrVar.zzd());
    }
}
