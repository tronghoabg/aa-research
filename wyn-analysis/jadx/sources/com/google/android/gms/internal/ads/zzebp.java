package com.google.android.gms.internal.ads;

import D6.K0;
import android.os.RemoteException;
import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzebp extends zzccv {
    final /* synthetic */ zzebr zza;

    public zzebp(zzebr zzebrVar) {
        Objects.requireNonNull(zzebrVar);
        this.zza = zzebrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzk(zzebrVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i5) throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzl(zzebrVar.zzd(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(K0 k02) throws JSONException, RemoteException {
        zzebr zzebrVar = this.zza;
        zzebrVar.zze().zzl(zzebrVar.zzd(), k02.f2338a);
    }
}
