package com.google.android.gms.internal.identity;

import N0.a;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1701o;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;
import com.google.android.gms.common.internal.AbstractC1723l;
import com.google.android.gms.common.internal.C1720i;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.d;
import j$.util.Objects;
import x.C4429v;
import x7.C4495g;
import x7.j;
import x7.k;
import x7.u;
import x7.z;

/* loaded from: classes.dex */
public final class zzdz extends AbstractC1723l {
    public static final /* synthetic */ int zze = 0;
    private final C4429v zzf;
    private final C4429v zzg;
    private final C4429v zzh;
    private final C4429v zzi;

    public zzdz(Context context, Looper looper, C1720i c1720i, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        super(context, looper, 23, c1720i, interfaceC1694h, interfaceC1704s);
        this.zzf = new C4429v(0);
        this.zzg = new C4429v(0);
        this.zzh = new C4429v(0);
        this.zzi = new C4429v(0);
    }

    private final boolean zzG(d dVar) {
        d dVar2;
        d[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= availableFeatures.length) {
                    dVar2 = null;
                    break;
                }
                dVar2 = availableFeatures[i5];
                if (dVar.f34122a.equals(dVar2.f34122a)) {
                    break;
                }
                i5++;
            }
            if (dVar2 != null && dVar2.V() >= dVar.V()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof zzv ? (zzv) iInterfaceQueryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final d[] getApiFeatures() {
        return z.f47848i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final void onConnectionSuspended(int i5) {
        super.onConnectionSuspended(i5);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(Location location, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47844e)) {
            ((zzv) getService()).zzB(location, new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzA(location);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzB(TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zzv) getService()).zzC(new zzdn(null, taskCompletionSource));
    }

    public final void zzC(C1703q c1703q, C4495g c4495g, TaskCompletionSource taskCompletionSource) throws RemoteException {
        C1701o c1701o = c1703q.f26552c;
        Objects.requireNonNull(c1701o);
        synchronized (this.zzh) {
            try {
                zzdq zzdqVar = (zzdq) this.zzh.get(c1701o);
                if (zzdqVar == null) {
                    zzdqVar = new zzdq(c1703q);
                    this.zzh.put(c1701o, zzdqVar);
                } else {
                    zzdqVar.zzc(c1703q);
                }
                ((zzv) getService()).zzF(new zzj(1, new zzh(c4495g, zzh.zza, null), zzdqVar, new zzdn(null, taskCompletionSource)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(C1701o c1701o, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzh) {
            try {
                zzdq zzdqVar = (zzdq) this.zzh.remove(c1701o);
                if (zzdqVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                } else {
                    zzdqVar.zze();
                    ((zzv) getService()).zzF(new zzj(2, null, zzdqVar, new zzdn(Boolean.TRUE, taskCompletionSource)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(j jVar, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47847h)) {
            ((zzv) getService()).zze(jVar, pendingIntent, new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzd(jVar, pendingIntent, new zzdg(taskCompletionSource));
        }
    }

    public final void zzF(zzem zzemVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47847h)) {
            ((zzv) getService()).zzg(zzemVar, new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzf(zzemVar, new zzdg(taskCompletionSource));
        }
    }

    public final void zzp(u uVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47845f)) {
            ((zzv) getService()).zzo(uVar, new zzee(5, null, new zzdl(taskCompletionSource), null, null));
        } else {
            taskCompletionSource.setResult(((zzv) getService()).zzp(getContext().getPackageName()));
        }
    }

    public final void zzq(k kVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47845f)) {
            ((zzv) getService()).zzq(kVar, zzee.zzd(new zzdk(taskCompletionSource)));
        } else if (zzG(z.f47842c)) {
            ((zzv) getService()).zzr(kVar, new zzdk(taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzv) getService()).zzs());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzr(x7.C4492d r12, com.google.android.gms.tasks.CancellationToken r13, final com.google.android.gms.tasks.TaskCompletionSource r14) throws android.os.RemoteException {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            d7.d r2 = x7.z.f47845f
            boolean r2 = r11.zzG(r2)
            if (r2 == 0) goto L28
            android.os.IInterface r0 = r11.getService()
            com.google.android.gms.internal.location.zzv r0 = (com.google.android.gms.internal.identity.zzv) r0
            com.google.android.gms.internal.location.zzdk r1 = new com.google.android.gms.internal.location.zzdk
            r1.<init>(r14)
            com.google.android.gms.internal.location.zzee r14 = com.google.android.gms.internal.identity.zzee.zzd(r1)
            com.google.android.gms.common.internal.q r12 = r0.zzt(r12, r14)
            if (r13 == 0) goto Ld4
            com.google.android.gms.internal.location.zzed r14 = new com.google.android.gms.internal.location.zzed
            r14.<init>()
            r13.onCanceledRequested(r14)
            return
        L28:
            d7.d r2 = x7.z.f47841b
            boolean r2 = r11.zzG(r2)
            if (r2 == 0) goto L4a
            android.os.IInterface r0 = r11.getService()
            com.google.android.gms.internal.location.zzv r0 = (com.google.android.gms.internal.identity.zzv) r0
            com.google.android.gms.internal.location.zzdk r1 = new com.google.android.gms.internal.location.zzdk
            r1.<init>(r14)
            com.google.android.gms.common.internal.q r12 = r0.zzu(r12, r1)
            if (r13 == 0) goto Ld4
            com.google.android.gms.internal.location.zzeb r14 = new com.google.android.gms.internal.location.zzeb
            r14.<init>()
            r13.onCanceledRequested(r14)
            return
        L4a:
            com.google.android.gms.internal.location.zzdh r2 = new com.google.android.gms.internal.location.zzdh
            r2.<init>(r11, r14)
            java.util.concurrent.Executor r3 = com.google.android.gms.internal.identity.zzfc.zza()
            java.lang.String r4 = "GetCurrentLocation"
            com.google.android.gms.common.api.internal.q r2 = U8.v0.v(r2, r4, r3)
            com.google.android.gms.common.api.internal.o r3 = r2.f26552c
            j$.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.location.zzdi r4 = new com.google.android.gms.internal.location.zzdi
            r4.<init>(r11, r2, r14)
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            x7.n r5 = new x7.n
            int r6 = r12.f47771c
            r7 = 0
            r5.<init>(r6, r7)
            r5.d(r7)
            long r9 = r12.f47772d
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L7c
            r6 = r0
            goto L7d
        L7c:
            r6 = r1
        L7d:
            java.lang.String r7 = "durationMillis must be greater than 0"
            com.google.android.gms.common.internal.AbstractC1732v.a(r7, r6)
            r5.f47797e = r9
            int r6 = r12.f47770b
            r5.b(r6)
            long r6 = r12.f47769a
            r5.c(r6)
            boolean r6 = r12.f47773e
            r5.f47803l = r6
            int r6 = r12.f47774f
            if (r6 == 0) goto La0
            if (r6 == r0) goto La0
            r7 = 2
            if (r6 != r7) goto L9d
            r8 = r0
            goto La2
        L9d:
            r8 = r1
        L9e:
            r7 = r6
            goto La2
        La0:
            r8 = r0
            goto L9e
        La2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r1] = r7
            java.lang.String r1 = "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant"
            com.google.android.gms.common.internal.AbstractC1732v.c(r8, r1, r9)
            r5.k = r6
            r5.f47800h = r0
            android.os.WorkSource r12 = r12.f47775g
            r5.f47804m = r12
            com.google.android.gms.location.LocationRequest r12 = r5.a()
            r11.zzt(r4, r12, r2)
            com.google.android.gms.tasks.Task r12 = r2.getTask()
            com.google.android.gms.internal.location.zzea r0 = new com.google.android.gms.internal.location.zzea
            r0.<init>()
            r12.addOnCompleteListener(r0)
            if (r13 == 0) goto Ld4
            com.google.android.gms.internal.location.zzec r12 = new com.google.android.gms.internal.location.zzec
            r12.<init>()
            r13.onCanceledRequested(r12)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.identity.zzdz.zzr(x7.d, com.google.android.gms.tasks.CancellationToken, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final void zzs(zzdr zzdrVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzdy zzdyVar;
        C1703q c1703qZza = zzdrVar.zza();
        C1701o c1701o = c1703qZza.f26552c;
        Objects.requireNonNull(c1701o);
        boolean zZzG = zzG(z.f47845f);
        synchronized (this.zzf) {
            try {
                zzdy zzdyVar2 = (zzdy) this.zzf.get(c1701o);
                if (zzdyVar2 == null || zZzG) {
                    zzdy zzdyVar3 = new zzdy(zzdrVar);
                    this.zzf.put(c1701o, zzdyVar3);
                    zzdyVar = zzdyVar3;
                } else {
                    zzdyVar2.zzc(c1703qZza);
                    zzdyVar = zzdyVar2;
                    zzdyVar2 = null;
                }
                if (zZzG) {
                    ((zzv) getService()).zzw(zzee.zza(zzdyVar2, zzdyVar, c1701o.a()), locationRequest, new zzdj(null, taskCompletionSource));
                } else {
                    ((zzv) getService()).zzv(new zzei(1, zzeg.zza(null, locationRequest), zzdyVar, null, null, new zzdo(taskCompletionSource, zzdyVar), c1701o.a()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzt(zzdr zzdrVar, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzdv zzdvVar;
        C1703q c1703qZza = zzdrVar.zza();
        C1701o c1701o = c1703qZza.f26552c;
        Objects.requireNonNull(c1701o);
        boolean zZzG = zzG(z.f47845f);
        synchronized (this.zzg) {
            try {
                zzdv zzdvVar2 = (zzdv) this.zzg.get(c1701o);
                if (zzdvVar2 == null || zZzG) {
                    zzdv zzdvVar3 = new zzdv(zzdrVar);
                    this.zzg.put(c1701o, zzdvVar3);
                    zzdvVar = zzdvVar3;
                } else {
                    zzdvVar2.zzc(c1703qZza);
                    zzdvVar = zzdvVar2;
                    zzdvVar2 = null;
                }
                if (zZzG) {
                    ((zzv) getService()).zzw(zzee.zzb(zzdvVar2, zzdvVar, c1701o.a()), locationRequest, new zzdj(null, taskCompletionSource));
                } else {
                    ((zzv) getService()).zzv(new zzei(1, zzeg.zza(null, locationRequest), null, zzdvVar, null, new zzdd(taskCompletionSource, zzdvVar), c1701o.a()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzu(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47845f)) {
            ((zzv) getService()).zzw(zzee.zzc(pendingIntent), locationRequest, new zzdj(null, taskCompletionSource));
            return;
        }
        zzv zzvVar = (zzv) getService();
        zzeg zzegVarZza = zzeg.zza(null, locationRequest);
        zzdn zzdnVar = new zzdn(null, taskCompletionSource);
        int iHashCode = pendingIntent.hashCode();
        zzvVar.zzv(new zzei(1, zzegVarZza, null, null, pendingIntent, zzdnVar, a.d(iHashCode, "PendingIntent@", new StringBuilder(String.valueOf(iHashCode).length() + 14))));
    }

    public final void zzv(C1701o c1701o, boolean z2, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzf) {
            try {
                zzdy zzdyVar = (zzdy) this.zzf.remove(c1701o);
                if (zzdyVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdyVar.zzf();
                if (!z2) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzG(z.f47845f)) {
                    zzv zzvVar = (zzv) getService();
                    int iIdentityHashCode = System.identityHashCode(zzdyVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationListener@");
                    sb2.append(iIdentityHashCode);
                    zzvVar.zzx(zzee.zza(null, zzdyVar, sb2.toString()), new zzdj(Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzv) getService()).zzv(new zzei(2, null, zzdyVar, null, null, new zzdn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzw(C1701o c1701o, boolean z2, TaskCompletionSource taskCompletionSource) throws RemoteException {
        synchronized (this.zzg) {
            try {
                zzdv zzdvVar = (zzdv) this.zzg.remove(c1701o);
                if (zzdvVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdvVar.zzg();
                if (!z2) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (zzG(z.f47845f)) {
                    zzv zzvVar = (zzv) getService();
                    int iIdentityHashCode = System.identityHashCode(zzdvVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationCallback@");
                    sb2.append(iIdentityHashCode);
                    zzvVar.zzx(zzee.zzb(null, zzdvVar, sb2.toString()), new zzdj(Boolean.TRUE, taskCompletionSource));
                } else {
                    ((zzv) getService()).zzv(new zzei(2, null, null, zzdvVar, null, new zzdn(Boolean.TRUE, taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) throws RemoteException {
        if (zzG(z.f47845f)) {
            ((zzv) getService()).zzx(zzee.zzc(pendingIntent), new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzv(new zzei(2, null, null, null, pendingIntent, new zzdn(null, taskCompletionSource), null));
        }
    }

    public final void zzy(TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47843d)) {
            ((zzv) getService()).zzz(true, new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzy(true);
            taskCompletionSource.setResult(null);
        }
    }

    public final void zzz(TaskCompletionSource taskCompletionSource) throws RemoteException {
        if (zzG(z.f47843d)) {
            ((zzv) getService()).zzz(false, new zzdj(Boolean.TRUE, taskCompletionSource));
        } else {
            ((zzv) getService()).zzy(false);
            taskCompletionSource.setResult(Boolean.TRUE);
        }
    }
}
