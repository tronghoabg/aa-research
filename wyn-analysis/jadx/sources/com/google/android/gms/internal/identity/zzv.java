package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1697k;
import com.google.android.gms.common.internal.InterfaceC1728q;
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
public interface zzv extends IInterface {
    @Deprecated
    void zzA(Location location) throws RemoteException;

    void zzB(Location location, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzC(zzr zzrVar) throws RemoteException;

    void zzD(p pVar, zzab zzabVar, String str) throws RemoteException;

    void zzE(zzo zzoVar) throws RemoteException;

    void zzF(zzj zzjVar) throws RemoteException;

    @Deprecated
    void zzd(j jVar, PendingIntent pendingIntent, zzt zztVar) throws RemoteException;

    void zze(j jVar, PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException;

    @Deprecated
    void zzf(zzem zzemVar, zzt zztVar) throws RemoteException;

    void zzg(zzem zzemVar, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzh(long j8, boolean z2, PendingIntent pendingIntent) throws RemoteException;

    void zzi(y yVar, PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzj(C4491c c4491c, PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzk(PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzl(PendingIntent pendingIntent) throws RemoteException;

    void zzm(PendingIntent pendingIntent, t tVar, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzn(PendingIntent pendingIntent, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzo(u uVar, zzee zzeeVar) throws RemoteException;

    @Deprecated
    LocationAvailability zzp(String str) throws RemoteException;

    void zzq(k kVar, zzee zzeeVar) throws RemoteException;

    @Deprecated
    void zzr(k kVar, zzz zzzVar) throws RemoteException;

    @Deprecated
    Location zzs() throws RemoteException;

    InterfaceC1728q zzt(C4492d c4492d, zzee zzeeVar) throws RemoteException;

    @Deprecated
    InterfaceC1728q zzu(C4492d c4492d, zzz zzzVar) throws RemoteException;

    @Deprecated
    void zzv(zzei zzeiVar) throws RemoteException;

    void zzw(zzee zzeeVar, LocationRequest locationRequest, InterfaceC1697k interfaceC1697k) throws RemoteException;

    void zzx(zzee zzeeVar, InterfaceC1697k interfaceC1697k) throws RemoteException;

    @Deprecated
    void zzy(boolean z2) throws RemoteException;

    void zzz(boolean z2, InterfaceC1697k interfaceC1697k) throws RemoteException;
}
