package com.google.android.gms.internal.ads;

import D6.AbstractBinderC0377i0;
import D6.InterfaceC0379j0;
import D6.d1;
import G6.U;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfmc {
    private static zzfmc zza;
    private final Context zzb;
    private final InterfaceC0379j0 zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfmc(Context context, InterfaceC0379j0 interfaceC0379j0) {
        this.zzb = context;
        this.zzc = interfaceC0379j0;
    }

    public static zzfmc zza(Context context) {
        synchronized (zzfmc.class) {
            try {
                zzfmc zzfmcVar = zza;
                if (zzfmcVar != null) {
                    return zzfmcVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbky.zzb.zze()).longValue();
                InterfaceC0379j0 interfaceC0379j0Zzf = null;
                if (jLongValue > 0 && jLongValue <= 254730000) {
                    interfaceC0379j0Zzf = zzf(applicationContext);
                }
                zzfmc zzfmcVar2 = new zzfmc(applicationContext, interfaceC0379j0Zzf);
                zza = zzfmcVar2;
                return zzfmcVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static InterfaceC0379j0 zzf(Context context) {
        try {
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            e = e7;
        }
        try {
            return AbstractBinderC0377i0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassNotFoundException e10) {
            e = e10;
            int i5 = G6.L.f4523b;
            H6.l.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (IllegalAccessException e11) {
            e = e11;
            int i52 = G6.L.f4523b;
            H6.l.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (InstantiationException e12) {
            e = e12;
            int i522 = G6.L.f4523b;
            H6.l.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (NoSuchMethodException e13) {
            e = e13;
            int i5222 = G6.L.f4523b;
            H6.l.d("Failed to retrieve lite SDK info.", e);
            return null;
        } catch (InvocationTargetException e14) {
            e = e14;
            int i52222 = G6.L.f4523b;
            H6.l.d("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final d1 zzg() {
        InterfaceC0379j0 interfaceC0379j0 = this.zzc;
        if (interfaceC0379j0 != null) {
            try {
                return interfaceC0379j0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final H6.a zzb(int i5, boolean z2, int i10) {
        d1 d1VarZzg;
        U u10 = C6.n.f1857D.f1863c;
        boolean zF = U.f(this.zzb);
        H6.a aVar = new H6.a(261710000, i10, true, zF);
        return (((Boolean) zzbky.zzc.zze()).booleanValue() && (d1VarZzg = zzg()) != null) ? new H6.a(261710000, d1VarZzg.f2416b, true, zF) : aVar;
    }

    public final void zzc(zzbvj zzbvjVar) {
        zzbvj adapterCreator;
        if (!((Boolean) zzbky.zza.zze()).booleanValue()) {
            AtomicReference atomicReference = this.zzd;
            while (!atomicReference.compareAndSet(null, zzbvjVar) && atomicReference.get() == null) {
            }
            return;
        }
        InterfaceC0379j0 interfaceC0379j0 = this.zzc;
        if (interfaceC0379j0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC0379j0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator == null) {
            adapterCreator = zzbvjVar;
        }
        while (!atomicReference2.compareAndSet(null, adapterCreator) && atomicReference2.get() == null) {
        }
    }

    public final zzbvj zzd() {
        return (zzbvj) this.zzd.get();
    }

    public final String zze() {
        d1 d1VarZzg = zzg();
        if (d1VarZzg != null) {
            return d1VarZzg.f2417c;
        }
        return null;
    }
}
