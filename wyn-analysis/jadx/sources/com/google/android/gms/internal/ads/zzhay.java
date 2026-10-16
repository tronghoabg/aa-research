package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public abstract class zzhay<V> extends zzhaz<V> {

    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzhaz.zzg) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        public zza(boolean z2, Throwable th) {
            this.zzc = z2;
            this.zzd = th;
        }
    }

    final class zzb<V> implements Runnable {
        final zzhay<V> zza;
        final p8.p zzb;

        public zzb(zzhay zzhayVar, p8.p pVar) {
            this.zza = zzhayVar;
            this.zzb = pVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzhaz.zzr(this.zza, this, zzhay.zze(this.zzb))) {
                zzhay.zzw(this.zza, false);
            }
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzhay.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    interface zze<V> extends p8.p {
        @Override // p8.p
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    abstract class zzf<V> extends zzhay<V> implements zze<V> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(p8.p pVar) {
        Throwable thZzl;
        if (pVar instanceof zze) {
            Object zzaVar = ((zzhay) pVar).valueField;
            if (zzaVar instanceof zza) {
                zza zzaVar2 = (zza) zzaVar;
                if (zzaVar2.zzc) {
                    Throwable th = zzaVar2.zzd;
                    zzaVar = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(zzaVar);
            return zzaVar;
        }
        if ((pVar instanceof zzhdh) && (thZzl = ((zzhdh) pVar).zzl()) != null) {
            return new zzc(thZzl);
        }
        boolean zIsCancelled = pVar.isCancelled();
        if ((!zzhaz.zzg) && zIsCancelled) {
            zza zzaVar3 = zza.zzb;
            Objects.requireNonNull(zzaVar3);
            return zzaVar3;
        }
        try {
            Object objZzf = zzf(pVar);
            if (!zIsCancelled) {
                return zzz(objZzf);
            }
            String strValueOf = String.valueOf(pVar);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 84);
            sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb2.append(strValueOf);
            return new zza(false, new IllegalArgumentException(sb2.toString()));
        } catch (Error | Exception e7) {
            return new zzc(e7);
        } catch (CancellationException e10) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(pVar)), e10)) : new zza(false, e10);
        } catch (ExecutionException e11) {
            return zIsCancelled ? new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(pVar)), e11)) : new zzc(e11.getCause());
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object zzg(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(((zza) obj).zzd);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzhaz.zze) {
            return null;
        }
        return obj;
    }

    public static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(zzhay zzhayVar, boolean z2) {
        zzd zzdVar = null;
        while (true) {
            zzhayVar.zzs();
            if (z2) {
                zzhayVar.zzi();
            }
            zzhayVar.zzc();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZzq = zzhayVar.zzq(zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZzq != null) {
                zzd zzdVar4 = zzdVarZzq.next;
                zzdVarZzq.next = zzdVar3;
                zzdVar3 = zzdVarZzq;
                zzdVarZzq = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.zzb;
                zzdVar = zzdVar3.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzhayVar = zzbVar.zza;
                    if (zzhayVar.valueField != zzbVar || !zzhaz.zzr(zzhayVar, zzbVar, zze(zzbVar.zzb))) {
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z2 = false;
        }
    }

    private final void zzx(StringBuilder sb2) {
        try {
            Object objZzf = zzf(this);
            sb2.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb2.append("null");
            } else if (objZzf == this) {
                sb2.append("this future");
            } else {
                sb2.append(objZzf.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(objZzf)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (ExecutionException e7) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e7.getCause());
            sb2.append("]");
        } catch (Exception e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e7) {
            Logger loggerZza = zzhaz.zzf.zza();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC3256n.h(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e7);
        }
    }

    private static Object zzz(Object obj) {
        return obj == null ? zzhaz.zze : obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz, p8.p
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzgtr.zzk(runnable, "Runnable was null.");
        zzgtr.zzk(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.valueField
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzhay.zzb
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.android.gms.internal.ads.zzhaz.zzg
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.ads.zzhay$zza r1 = new com.google.android.gms.internal.ads.zzhay$zza
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.ads.zzhay$zza r1 = com.google.android.gms.internal.ads.zzhay.zza.zza
            goto L26
        L24:
            com.google.android.gms.internal.ads.zzhay$zza r1 = com.google.android.gms.internal.ads.zzhay.zza.zzb
        L26:
            j$.util.Objects.requireNonNull(r1)
        L29:
            r4 = r7
            r5 = r2
        L2b:
            boolean r6 = com.google.android.gms.internal.ads.zzhaz.zzr(r4, r0, r1)
            if (r6 == 0) goto L56
            zzw(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzhay.zzb
            if (r4 == 0) goto L55
            com.google.android.gms.internal.ads.zzhay$zzb r0 = (com.google.android.gms.internal.ads.zzhay.zzb) r0
            p8.p r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzhay.zze
            if (r4 == 0) goto L52
            r4 = r0
            com.google.android.gms.internal.ads.zzhay r4 = (com.google.android.gms.internal.ads.zzhay) r4
            java.lang.Object r0 = r4.valueField
            if (r0 != 0) goto L49
            r5 = r3
            goto L4a
        L49:
            r5 = r2
        L4a:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.zzhay.zzb
            r5 = r5 | r6
            if (r5 == 0) goto L51
            r5 = r3
            goto L2b
        L51:
            return r3
        L52:
            r0.cancel(r8)
        L55:
            return r3
        L56:
            java.lang.Object r0 = r4.valueField
            boolean r6 = zzh(r0)
            if (r6 == 0) goto L2b
            return r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhay.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        return zzu();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public String toString() {
        String strConcat;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            zzx(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.valueField;
            if (obj instanceof zzb) {
                sb2.append(", setFuture=[");
                p8.p pVar = ((zzb) obj).zzb;
                try {
                    if (pVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(pVar);
                    }
                } catch (Throwable th) {
                    zzhcx.zzb(th);
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(th.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strConcat = zzgui.zzb(zzd());
                } catch (Throwable th2) {
                    zzhcx.zzb(th2);
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (strConcat != null) {
                    N0.a.r(sb2, ", info=[", strConcat, "]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                zzx(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public boolean zza(Object obj) {
        if (!zzhaz.zzr(this, null, zzz(obj))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public boolean zzb(Throwable th) {
        if (!zzhaz.zzr(this, null, new zzc(th))) {
            return false;
        }
        zzw(this, false);
        return true;
    }

    public void zzc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String zzd() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb2 = new StringBuilder(String.valueOf(delay).length() + 21);
        sb2.append("remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    public void zzi() {
    }

    public final boolean zzj() {
        Object obj = this.valueField;
        return (obj instanceof zza) && ((zza) obj).zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzk(p8.p r5) {
        /*
            r4 = this;
            r5.getClass()
            java.lang.Object r0 = r4.valueField
            r1 = 0
            if (r0 != 0) goto L3e
            boolean r0 = r5.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            java.lang.Object r5 = zze(r5)
            boolean r5 = com.google.android.gms.internal.ads.zzhaz.zzr(r4, r3, r5)
            if (r5 == 0) goto L49
            zzw(r4, r1)
            return r2
        L1e:
            com.google.android.gms.internal.ads.zzhay$zzb r0 = new com.google.android.gms.internal.ads.zzhay$zzb
            r0.<init>(r4, r5)
            boolean r3 = com.google.android.gms.internal.ads.zzhaz.zzr(r4, r3, r0)
            if (r3 == 0) goto L3c
            com.google.android.gms.internal.ads.zzhbu r1 = com.google.android.gms.internal.ads.zzhbu.INSTANCE     // Catch: java.lang.Throwable -> L2f
            r5.addListener(r0, r1)     // Catch: java.lang.Throwable -> L2f
            return r2
        L2f:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzhay$zzc r1 = new com.google.android.gms.internal.ads.zzhay$zzc     // Catch: java.lang.Throwable -> L36
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L36
            goto L38
        L36:
            com.google.android.gms.internal.ads.zzhay$zzc r1 = com.google.android.gms.internal.ads.zzhay.zzc.zza
        L38:
            com.google.android.gms.internal.ads.zzhaz.zzr(r4, r0, r1)
            return r2
        L3c:
            java.lang.Object r0 = r4.valueField
        L3e:
            boolean r2 = r0 instanceof com.google.android.gms.internal.ads.zzhay.zza
            if (r2 == 0) goto L49
            com.google.android.gms.internal.ads.zzhay$zza r0 = (com.google.android.gms.internal.ads.zzhay.zza) r0
            boolean r0 = r0.zzc
            r5.cancel(r0)
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhay.zzk(p8.p):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhdh
    public final Throwable zzl() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public final void zzm(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzj());
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return zzt(j8, timeUnit);
    }
}
