package com.google.android.gms.internal.ads;

import D6.AbstractBinderC0405x;
import D6.K0;
import android.os.RemoteException;
import j$.util.Objects;
import org.json.JSONException;

/* loaded from: classes3.dex */
final class zzebm extends AbstractBinderC0405x {
    final /* synthetic */ zzebg zza;
    final /* synthetic */ zzebn zzb;

    public zzebm(zzebn zzebnVar, zzebg zzebgVar) {
        this.zza = zzebgVar;
        Objects.requireNonNull(zzebnVar);
        this.zzb = zzebnVar;
    }

    @Override // D6.InterfaceC0407y
    public final void zzb() throws JSONException, RemoteException {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // D6.InterfaceC0407y
    public final void zzc(int i5) throws JSONException, RemoteException {
        this.zza.zzf(this.zzb.zzd(), i5);
    }

    @Override // D6.InterfaceC0407y
    public final void zzd(K0 k02) throws JSONException, RemoteException {
        this.zza.zzf(this.zzb.zzd(), k02.f2338a);
    }

    @Override // D6.InterfaceC0407y
    public final void zze() {
    }

    @Override // D6.InterfaceC0407y
    public final void zzf() throws JSONException, RemoteException {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // D6.InterfaceC0407y
    public final void zzg() throws JSONException, RemoteException {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // D6.InterfaceC0407y
    public final void zzh() throws JSONException, RemoteException {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // D6.InterfaceC0407y
    public final void zzi() {
    }

    @Override // D6.InterfaceC0407y
    public final void zzj() {
    }
}
