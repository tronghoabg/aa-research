package com.google.android.gms.internal.ads;

import Va.M6;
import com.google.android.gms.internal.ads.zzhay;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.tika.utils.StringUtils;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class zzhaz<V> extends zzhdh implements p8.p {
    private static final zza zzbs;
    static final Object zze = new Object();
    static final zzhcn zzf = new zzhcn(zzhay.class);
    static final boolean zzg;
    volatile zzhay.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    abstract class zza {
        public /* synthetic */ zza(byte[] bArr) {
        }

        public abstract void zza(zze zzeVar, Thread thread);

        public abstract void zzb(zze zzeVar, zze zzeVar2);

        public abstract boolean zzc(zzhaz zzhazVar, zze zzeVar, zze zzeVar2);

        public abstract boolean zzd(zzhaz zzhazVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2);

        public abstract zze zze(zzhaz zzhazVar, zze zzeVar);

        public abstract zzhay.zzd zzf(zzhaz zzhazVar, zzhay.zzd zzdVar);

        public abstract boolean zzg(zzhaz zzhazVar, Object obj, Object obj2);
    }

    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "thread");
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "next");
        private static final AtomicReferenceFieldUpdater<? super zzhaz<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzhaz.class, zze.class, "waitersField");
        private static final AtomicReferenceFieldUpdater<? super zzhaz<?>, zzhay.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzhaz.class, zzhay.zzd.class, "listenersField");
        private static final AtomicReferenceFieldUpdater<? super zzhaz<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzhaz.class, Object.class, "valueField");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzc(zzhaz zzhazVar, zze zzeVar, zze zzeVar2) {
            AtomicReferenceFieldUpdater<? super zzhaz<?>, zze> atomicReferenceFieldUpdater = zzc;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzhazVar, zzeVar, zzeVar2)) {
                if (atomicReferenceFieldUpdater.get(zzhazVar) != zzeVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzd(zzhaz zzhazVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2) {
            AtomicReferenceFieldUpdater<? super zzhaz<?>, zzhay.zzd> atomicReferenceFieldUpdater = zzd;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzhazVar, zzdVar, zzdVar2)) {
                if (atomicReferenceFieldUpdater.get(zzhazVar) != zzdVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final zze zze(zzhaz zzhazVar, zze zzeVar) {
            return zzc.getAndSet(zzhazVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final zzhay.zzd zzf(zzhaz zzhazVar, zzhay.zzd zzdVar) {
            return zzd.getAndSet(zzhazVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzg(zzhaz zzhazVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super zzhaz<?>, Object> atomicReferenceFieldUpdater = zze;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzhazVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(zzhazVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ zzb(byte[] bArr) {
            super(null);
        }
    }

    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final void zza(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzc(zzhaz zzhazVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzhazVar) {
                try {
                    if (zzhazVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzhazVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzd(zzhaz zzhazVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2) {
            synchronized (zzhazVar) {
                try {
                    if (zzhazVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzhazVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final zze zze(zzhaz zzhazVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzhazVar) {
                try {
                    zzeVar2 = zzhazVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzhazVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final zzhay.zzd zzf(zzhaz zzhazVar, zzhay.zzd zzdVar) {
            zzhay.zzd zzdVar2;
            synchronized (zzhazVar) {
                try {
                    zzdVar2 = zzhazVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzhazVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzg(zzhaz zzhazVar, Object obj, Object obj2) {
            synchronized (zzhazVar) {
                try {
                    if (zzhazVar.valueField != obj) {
                        return false;
                    }
                    zzhazVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzc(byte[] bArr) {
            super(null);
        }
    }

    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafeZzi;
            try {
                try {
                    try {
                        unsafeZzi = Unsafe.getUnsafe();
                    } catch (Exception unused) {
                        unsafeZzi = zzi();
                        Unsafe unsafe = unsafeZzi;
                    }
                } catch (Exception e7) {
                    throw new RuntimeException("Could not initialize intrinsics", e7);
                }
            } catch (SecurityException unused2) {
                unsafeZzi = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, zzhba.zza);
            }
            try {
                zzc = unsafeZzi.objectFieldOffset(zzhaz.class.getDeclaredField("waitersField"));
                zzb = unsafeZzi.objectFieldOffset(zzhaz.class.getDeclaredField("listenersField"));
                zzd = unsafeZzi.objectFieldOffset(zzhaz.class.getDeclaredField("valueField"));
                zze = unsafeZzi.objectFieldOffset(zze.class.getDeclaredField("thread"));
                zzf = unsafeZzi.objectFieldOffset(zze.class.getDeclaredField("next"));
                zza = unsafeZzi;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        }

        private zzd() {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unsafe zzi() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final void zza(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final void zzb(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzc(zzhaz zzhazVar, zze zzeVar, zze zzeVar2) {
            return w.a(zza, zzhazVar, zzc, zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzd(zzhaz zzhazVar, zzhay.zzd zzdVar, zzhay.zzd zzdVar2) {
            return w.a(zza, zzhazVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final zze zze(zzhaz zzhazVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzhazVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzc(zzhazVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final zzhay.zzd zzf(zzhaz zzhazVar, zzhay.zzd zzdVar) {
            zzhay.zzd zzdVar2;
            do {
                zzdVar2 = zzhazVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zzd(zzhazVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzhaz.zza
        public final boolean zzg(zzhaz zzhazVar, Object obj, Object obj2) {
            return w.a(zza, zzhazVar, zzd, obj, obj2);
        }

        public /* synthetic */ zzd(byte[] bArr) {
            super(null);
        }
    }

    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        public zze(boolean z2) {
        }

        public zze() {
            zzhaz.zzv(this, Thread.currentThread());
        }
    }

    static {
        boolean z2;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        zzg = z2;
        String property = System.getProperty("java.runtime.name", "");
        byte[] bArr = null;
        if (property == null || property.contains("Android")) {
            try {
                zzcVar = new zzd(bArr);
            } catch (Error | Exception e7) {
                try {
                    zzcVar = new zzb(bArr);
                    th = null;
                    th2 = e7;
                } catch (Error | Exception e10) {
                    th = e10;
                    th2 = e7;
                    zzcVar = new zzc(bArr);
                }
            }
        } else {
            try {
                zzcVar = new zzb(bArr);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(bArr);
            }
        }
        th = null;
        th2 = null;
        zzbs = zzcVar;
        if (th != null) {
            zzhcn zzhcnVar = zzf;
            Logger loggerZza = zzhcnVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzhcnVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbs.zzc(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public static boolean zzr(zzhaz zzhazVar, Object obj, Object obj2) {
        return zzbs.zzg(zzhazVar, obj, obj2);
    }

    public static /* synthetic */ void zzv(zze zzeVar, Thread thread) {
        zzbs.zza(zzeVar, thread);
    }

    public abstract /* synthetic */ void addListener(Runnable runnable, Executor executor);

    public final boolean zzp(zzhay.zzd zzdVar, zzhay.zzd zzdVar2) {
        return zzbs.zzd(this, zzdVar, zzdVar2);
    }

    public final zzhay.zzd zzq(zzhay.zzd zzdVar) {
        return zzbs.zzf(this, zzdVar);
    }

    public final void zzs() {
        for (zze zzeVarZze = zzbs.zze(this, zze.zza); zzeVarZze != null; zzeVarZze = zzeVarZze.next) {
            Thread thread = zzeVarZze.thread;
            if (thread != null) {
                zzeVarZze.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final Object zzt(long j8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        if ((obj != null) && zzhay.zzh(obj)) {
            return zzhay.zzg(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzbs;
                    zzaVar.zzb(zzeVar2, zzeVar);
                    if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzhay.zzh(obj2)) {
                                return zzhay.zzg(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzhay.zzg(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzhay.zzh(obj4)) {
                return zzhay.zzg(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 8 + String.valueOf(lowerCase2).length());
        M6.A(sb2, "Waited ", j8, StringUtils.SPACE);
        sb2.append(lowerCase2);
        String string3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                M6.A(sb3, strConcat, jConvert, StringUtils.SPACE);
                sb3.append(lowerCase);
                String string4 = sb3.toString();
                if (z2) {
                    string4 = string4.concat(",");
                }
                strConcat = string4.concat(StringUtils.SPACE);
            }
            if (z2) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                sb4.append(strConcat);
                sb4.append(nanos2);
                sb4.append(" nanoseconds ");
                strConcat = sb4.toString();
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(M6.t(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
    }

    public final Object zzu() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzhay.zzh(obj2)) {
            return zzhay.zzg(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzbs;
                zzaVar.zzb(zzeVar2, zzeVar);
                if (zzaVar.zzc(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzhay.zzh(obj)));
                    return zzhay.zzg(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzhay.zzg(obj3);
    }
}
