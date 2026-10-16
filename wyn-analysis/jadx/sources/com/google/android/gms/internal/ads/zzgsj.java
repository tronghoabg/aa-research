package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j$.util.Objects;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgsj implements ServiceConnection {
    final /* synthetic */ zzgsp zza;

    public /* synthetic */ zzgsj(zzgsp zzgspVar, byte[] bArr) {
        Objects.requireNonNull(zzgspVar);
        this.zza = zzgspVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Object[] objArr = {componentName};
        zzgsp zzgspVar = this.zza;
        zzgspVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        zzgspVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws RemoteException {
                IInterface iInterfaceZzm;
                zzgqt zzgqtVarZzb = zzgqs.zzb(iBinder);
                zzgsj zzgsjVar = this.zza;
                zzgsp zzgspVar2 = zzgsjVar.zza;
                zzgspVar2.zzn(zzgqtVarZzb);
                zzgspVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    iInterfaceZzm = zzgspVar2.zzm();
                } catch (RemoteException e7) {
                    zzgsjVar.zza.zzi().zzd(e7, "linkToDeath failed", new Object[0]);
                }
                if (iInterfaceZzm == null) {
                    throw null;
                }
                iInterfaceZzm.asBinder().linkToDeath(zzgspVar2.zzl(), 0);
                zzgsp zzgspVar3 = zzgsjVar.zza;
                zzgspVar3.zzk(false);
                synchronized (zzgspVar3.zzj()) {
                    try {
                        Iterator it = zzgspVar3.zzj().iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzgspVar3.zzj().clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        zzgsp zzgspVar = this.zza;
        zzgspVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        zzgspVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgsh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgsp zzgspVar2 = this.zza.zza;
                zzgspVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzgspVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzgspVar2.zzl(), 0);
                zzgspVar2.zzn(null);
                zzgspVar2.zzk(false);
            }
        });
    }
}
