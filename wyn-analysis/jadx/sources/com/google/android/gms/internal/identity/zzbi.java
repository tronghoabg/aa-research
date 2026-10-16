package com.google.android.gms.internal.identity;

import Lc.b;
import U8.v0;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.os.WorkSource;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C1701o;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.api.internal.C1707v;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d7.d;
import java.util.concurrent.Executor;
import x7.C4492d;
import x7.C4495g;
import x7.InterfaceC4494f;
import x7.InterfaceC4496h;
import x7.m;
import x7.z;

/* loaded from: classes.dex */
public final class zzbi extends l implements InterfaceC4496h {
    static final h zza;
    public static final i zzb;
    private static final Object zzc;
    private static Object zzd;

    static {
        h hVar = new h();
        zza = hVar;
        zzb = new i("LocationServices.API", new zzbf(), hVar);
        zzc = new Object();
    }

    public zzbi(Activity activity) {
        super(activity, activity, zzb, e.f26433X8, k.f26561c);
    }

    private final Task zza(final LocationRequest locationRequest, C1703q c1703q) {
        final zzbh zzbhVar = new zzbh(this, c1703q, zzcd.zza);
        InterfaceC1708w interfaceC1708w = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbt
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzs(zzbhVar, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        b bVarA = C1707v.a();
        bVarA.f7076c = interfaceC1708w;
        bVarA.f7077d = zzbhVar;
        bVarA.f7078e = c1703q;
        bVarA.f7075b = 2435;
        return doRegisterEventListener(bVarA.b());
    }

    private final Task zzb(final LocationRequest locationRequest, C1703q c1703q) {
        final zzbh zzbhVar = new zzbh(this, c1703q, zzbz.zza);
        InterfaceC1708w interfaceC1708w = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbu
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzt(zzbhVar, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        b bVarA = C1707v.a();
        bVarA.f7076c = interfaceC1708w;
        bVarA.f7077d = zzbhVar;
        bVarA.f7078e = c1703q;
        bVarA.f7075b = 2436;
        return doRegisterEventListener(bVarA.b());
    }

    private final Task zzc(final C4495g c4495g, final C1703q c1703q) {
        InterfaceC1708w interfaceC1708w = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbm
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzC(c1703q, c4495g, (TaskCompletionSource) obj2);
            }
        };
        InterfaceC1708w interfaceC1708w2 = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbn
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                i iVar = zzbi.zzb;
                C1701o c1701o = c1703q.f26552c;
                if (c1701o != null) {
                    zzdzVar.zzD(c1701o, taskCompletionSource);
                }
            }
        };
        b bVarA = C1707v.a();
        bVarA.f7076c = interfaceC1708w;
        bVarA.f7077d = interfaceC1708w2;
        bVarA.f7078e = c1703q;
        bVarA.f7075b = 2434;
        return doRegisterEventListener(bVarA.b());
    }

    public final Task<Void> flushLocations() {
        N7.e eVarA = A.a();
        eVarA.f8590d = zzca.zza;
        eVarA.f8589c = 2422;
        return doWrite(eVarA.e());
    }

    @Override // com.google.android.gms.common.api.l
    public final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final Task<Location> getCurrentLocation(int i5, CancellationToken cancellationToken) {
        z.b(i5);
        C4492d c4492d = new C4492d(10000L, 0, i5, Long.MAX_VALUE, false, 0, new WorkSource(null), null);
        if (cancellationToken != null) {
            AbstractC1732v.a("cancellationToken may not be already canceled", !cancellationToken.isCancellationRequested());
        }
        N7.e eVarA = A.a();
        eVarA.f8590d = new zzbp(c4492d, cancellationToken);
        eVarA.f8589c = 2415;
        Task<Location> taskDoRead = doRead(eVarA.e());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWith(new zzbq(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // x7.InterfaceC4496h
    public final Task<Location> getLastLocation() {
        N7.e eVarA = A.a();
        eVarA.f8590d = zzby.zza;
        eVarA.f8589c = 2414;
        return doRead(eVarA.e());
    }

    public final Task<LocationAvailability> getLocationAvailability() {
        N7.e eVarA = A.a();
        eVarA.f8590d = zzbr.zza;
        eVarA.f8589c = 2416;
        return doRead(eVarA.e());
    }

    public final Task<Void> removeDeviceOrientationUpdates(InterfaceC4494f interfaceC4494f) {
        return doUnregisterEventListener(v0.w(interfaceC4494f, InterfaceC4494f.class.getSimpleName()), 2440).continueWith(zzcg.zza, zzbo.zza);
    }

    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzx(pendingIntent, (TaskCompletionSource) obj2, null);
            }
        };
        eVarA.f8589c = 2418;
        return doWrite(eVarA.e());
    }

    public final Task<Void> requestDeviceOrientationUpdates(C4495g c4495g, InterfaceC4494f interfaceC4494f, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC1732v.j(looper, "invalid null looper");
        }
        return zzc(c4495g, v0.u(looper, interfaceC4494f, InterfaceC4494f.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbs
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzu(pendingIntent, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8589c = 2417;
        return doWrite(eVarA.e());
    }

    public final Task<Void> setMockLocation(final Location location) {
        AbstractC1732v.b(location != null);
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzA(location, (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8589c = 2421;
        return doWrite(eVarA.e());
    }

    public final Task<Void> setMockMode(boolean z2) {
        synchronized (zzc) {
            try {
                if (!z2) {
                    Object obj = zzd;
                    if (obj != null) {
                        zzd = null;
                        return doUnregisterEventListener(v0.w(obj, "Object"), 2420).continueWith(zzcf.zza, zzbk.zza);
                    }
                } else if (zzd == null) {
                    Object obj2 = new Object();
                    zzd = obj2;
                    b bVarA = C1707v.a();
                    bVarA.f7076c = zzcb.zza;
                    bVarA.f7077d = zzcc.zza;
                    bVarA.f7078e = v0.u(Looper.getMainLooper(), obj2, "Object");
                    bVarA.f7075b = 2420;
                    return doRegisterEventListener(bVarA.b());
                }
                return Tasks.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbi(Context context) {
        super(context, null, zzb, e.f26433X8, k.f26561c);
    }

    public final Task<Location> getLastLocation(final x7.k kVar) {
        N7.e eVarA = A.a();
        eVarA.f8590d = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzbj
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzq(kVar, (TaskCompletionSource) obj2);
            }
        };
        eVarA.f8589c = 2414;
        eVarA.f8591e = new d[]{z.f47842c};
        return doRead(eVarA.e());
    }

    @Override // x7.InterfaceC4496h
    public final Task<Void> removeLocationUpdates(x7.l lVar) {
        return doUnregisterEventListener(v0.w(lVar, x7.l.class.getSimpleName()), 2418).continueWith(zzce.zza, zzbw.zza);
    }

    public final Task<Void> requestDeviceOrientationUpdates(C4495g c4495g, Executor executor, InterfaceC4494f interfaceC4494f) {
        return zzc(c4495g, v0.v(interfaceC4494f, InterfaceC4494f.class.getSimpleName(), executor));
    }

    @Override // x7.InterfaceC4496h
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, x7.l lVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC1732v.j(looper, "invalid null looper");
        }
        return zzb(locationRequest, v0.u(looper, lVar, x7.l.class.getSimpleName()));
    }

    public final Task<Void> removeLocationUpdates(m mVar) {
        return doUnregisterEventListener(v0.w(mVar, m.class.getSimpleName()), 2418).continueWith(zzch.zza, zzbv.zza);
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, m mVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            AbstractC1732v.j(looper, "invalid null looper");
        }
        return zza(locationRequest, v0.u(looper, mVar, m.class.getSimpleName()));
    }

    public final Task<Location> getCurrentLocation(C4492d c4492d, CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            AbstractC1732v.a("cancellationToken may not be already canceled", !cancellationToken.isCancellationRequested());
        }
        N7.e eVarA = A.a();
        eVarA.f8590d = new zzbp(c4492d, cancellationToken);
        eVarA.f8589c = 2415;
        Task<Location> taskDoRead = doRead(eVarA.e());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWith(new zzbq(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, x7.l lVar) {
        return zzb(locationRequest, v0.v(lVar, x7.l.class.getSimpleName(), executor));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, m mVar) {
        return zza(locationRequest, v0.v(mVar, m.class.getSimpleName(), executor));
    }
}
