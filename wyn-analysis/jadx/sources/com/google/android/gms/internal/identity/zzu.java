package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1697k;
import com.google.android.gms.common.internal.AbstractBinderC1727p;
import com.google.android.gms.common.internal.InterfaceC1728q;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import x7.C4491c;
import x7.C4492d;
import x7.j;
import x7.k;
import x7.p;
import x7.t;
import x7.u;
import x7.y;

/* loaded from: classes.dex */
public final class zzu extends zza implements zzv {
    public zzu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzA(Location location) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, location);
        zzc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzB(Location location, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, location);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(85, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzC(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzrVar);
        zzc(67, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzD(p pVar, zzab zzabVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, pVar);
        zzc.zzc(parcelZza, zzabVar);
        parcelZza.writeString(null);
        zzc(63, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzE(zzo zzoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, zzoVar);
        zzc(95, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzF(zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzjVar);
        zzc(75, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzd(j jVar, PendingIntent pendingIntent, zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, jVar);
        zzc.zzb(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, zztVar);
        zzc(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zze(j jVar, PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, jVar);
        zzc.zzb(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(97, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzf(zzem zzemVar, zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzemVar);
        zzc.zzc(parcelZza, zztVar);
        zzc(74, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzg(zzem zzemVar, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzemVar);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(98, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzh(long j8, boolean z2, PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j8);
        int i5 = zzc.zza;
        parcelZza.writeInt(1);
        zzc.zzb(parcelZza, pendingIntent);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzi(y yVar, PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, yVar);
        zzc.zzb(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(70, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzj(C4491c c4491c, PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, c4491c);
        zzc.zzb(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(72, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzk(PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(73, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzl(PendingIntent pendingIntent) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, pendingIntent);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzm(PendingIntent pendingIntent, t tVar, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, pendingIntent);
        zzc.zzb(parcelZza, tVar);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(79, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzn(PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, pendingIntent);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(69, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzo(u uVar, zzee zzeeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, uVar);
        zzc.zzb(parcelZza, zzeeVar);
        zzc(91, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final LocationAvailability zzp(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(34, parcelZza);
        LocationAvailability locationAvailability = (LocationAvailability) zzc.zza(parcelZzb, LocationAvailability.CREATOR);
        parcelZzb.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzq(k kVar, zzee zzeeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, kVar);
        zzc.zzb(parcelZza, zzeeVar);
        zzc(90, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzr(k kVar, zzz zzzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, kVar);
        zzc.zzc(parcelZza, zzzVar);
        zzc(82, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final Location zzs() throws RemoteException {
        Parcel parcelZzb = zzb(7, zza());
        Location location = (Location) zzc.zza(parcelZzb, Location.CREATOR);
        parcelZzb.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final InterfaceC1728q zzt(C4492d c4492d, zzee zzeeVar) throws RemoteException {
        InterfaceC1728q a0Var;
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, c4492d);
        zzc.zzb(parcelZza, zzeeVar);
        Parcel parcelZzb = zzb(92, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        int i5 = AbstractBinderC1727p.f26678a;
        if (strongBinder == null) {
            a0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            a0Var = iInterfaceQueryLocalInterface instanceof InterfaceC1728q ? (InterfaceC1728q) iInterfaceQueryLocalInterface : new a0(strongBinder, "com.google.android.gms.common.internal.ICancelToken");
        }
        parcelZzb.recycle();
        return a0Var;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final InterfaceC1728q zzu(C4492d c4492d, zzz zzzVar) throws RemoteException {
        InterfaceC1728q a0Var;
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, c4492d);
        zzc.zzc(parcelZza, zzzVar);
        Parcel parcelZzb = zzb(87, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        int i5 = AbstractBinderC1727p.f26678a;
        if (strongBinder == null) {
            a0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            a0Var = iInterfaceQueryLocalInterface instanceof InterfaceC1728q ? (InterfaceC1728q) iInterfaceQueryLocalInterface : new a0(strongBinder, "com.google.android.gms.common.internal.ICancelToken");
        }
        parcelZzb.recycle();
        return a0Var;
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzv(zzei zzeiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzeiVar);
        zzc(59, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzw(zzee zzeeVar, LocationRequest locationRequest, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzeeVar);
        zzc.zzb(parcelZza, locationRequest);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(88, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzx(zzee zzeeVar, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, zzeeVar);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(89, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzy(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzc.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.identity.zzv
    public final void zzz(boolean z2, InterfaceC1697k interfaceC1697k) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzc.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzc.zzc(parcelZza, interfaceC1697k);
        zzc(84, parcelZza);
    }
}
