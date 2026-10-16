package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.p1;
import D6.v1;
import Va.M6;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.fid.Constants;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import r7.C3934d;

/* loaded from: classes3.dex */
public final class zzceg {
    private zzdzt zze;
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference zzg = new AtomicReference(null);
    private final AtomicReference zzh = new AtomicReference(null);
    private final ConcurrentMap zzi = new ConcurrentHashMap(9);
    private final Object zzj = new Object();

    public static final Bundle zzr(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean zzs(Context context) throws ClassNotFoundException {
        zzbio zzbioVar = zzbix.zzbc;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            return false;
        }
        if (C3934d.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) c0395s.f2492c.zzd(zzbix.zzbd)).intValue()) {
            return false;
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzbe)).booleanValue()) {
            try {
                context.getClassLoader().loadClass(Constants.FID_CLASS);
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzt(Context context, String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzb(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e7) {
                String strValueOf = String.valueOf(str2);
                int i5 = G6.L.f4523b;
                H6.l.d("Invalid event ID: ".concat(strValueOf), e7);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                ConcurrentMap concurrentMap = this.zzi;
                Method declaredMethod = (Method) concurrentMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzx("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzx("logEventInternal", true);
                }
            }
        }
    }

    private final Method zzu(Context context, String str) throws NoSuchMethodException, SecurityException {
        ConcurrentMap concurrentMap = this.zzi;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzx(str, false);
            return null;
        }
    }

    private final void zzv(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            ConcurrentMap concurrentMap = this.zzi;
            Method declaredMethod = (Method) concurrentMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzx(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), str);
                StringBuilder sb2 = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb2.append("Invoke Firebase method ");
                sb2.append(str2);
                sb2.append(", Ad Unit Id: ");
                sb2.append(str);
                G6.L.k(sb2.toString());
            } catch (Exception unused2) {
                zzx(str2, false);
            }
        }
    }

    private final Object zzw(String str, Context context) throws NoSuchMethodException, SecurityException {
        AtomicReference atomicReference = this.zzg;
        if (!zzy(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzu(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            zzx(str, true);
            return null;
        }
    }

    private final void zzx(String str, boolean z2) {
        AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        String strT = M6.t(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
        int i5 = G6.L.f4523b;
        H6.l.f(strT);
        if (z2) {
            H6.l.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
        if (this.zze != null) {
            if (this.zzh.get() == null && this.zzg.get() == null) {
                return;
            }
            zzdzs zzdzsVarZza = this.zze.zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "ga_log_event_error");
            zzdzsVarZza.zzc("method_name", str);
            zzdzsVarZza.zzd();
        }
    }

    private final boolean zzy(Context context, String str, AtomicReference atomicReference, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (atomicReference.get() == null) {
            try {
                Object objInvoke = context.getClassLoader().loadClass(str).getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context);
                while (!atomicReference.compareAndSet(null, objInvoke) && atomicReference.get() == null) {
                }
            } catch (Exception unused) {
                zzx(Constants.GET_INSTANCE, z2);
                return false;
            }
        }
        return true;
    }

    public final void zza(zzdzt zzdztVar) {
        this.zze = zzdztVar;
    }

    public final boolean zzb(Context context) {
        int iD;
        zzbio zzbioVar = zzbix.zzaU;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && !this.zza.get()) {
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzbf)).booleanValue()) {
                AtomicInteger atomicInteger = this.zzf;
                if (atomicInteger.get() == -1) {
                    H6.f fVar = C0392q.f2477g.f2478a;
                    d7.f fVar2 = d7.f.f34129b;
                    if (fVar2.d(context, 12451000) != 0 && ((iD = fVar2.d(context, 12451000)) == 0 || iD == 2)) {
                        int i5 = G6.L.f4523b;
                        H6.l.f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final void zzc(Context context, p1 p1Var) {
        zzceh.zzb(context).zza().zzc(p1Var);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbh)).booleanValue() && zzb(context) && zzs(context)) {
            synchronized (this.zzj) {
            }
        }
    }

    public final void zzd(Context context, v1 v1Var) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbh)).booleanValue() && zzb(context) && zzs(context)) {
            synchronized (this.zzj) {
            }
        }
    }

    public final void zze(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzb(context)) {
            zzv(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzf(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzb(context)) {
            zzv(context, str, "endAdUnitExposure");
        }
    }

    public final String zzg(Context context) {
        if (zzb(context)) {
            AtomicReference atomicReference = this.zzg;
            if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) zzu(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
                    if (str == null) {
                        str = (String) zzu(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    zzx("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    @Deprecated
    public final void zzh(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzb(context) && (context instanceof Activity) && zzy(context, Constants.FID_CLASS, this.zzh, false)) {
            ConcurrentMap concurrentMap = this.zzi;
            Method declaredMethod = (Method) concurrentMap.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass(Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    zzx("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzx("setCurrentScreen", false);
            }
        }
    }

    public final String zzi(Context context) {
        if (!zzb(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzw("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzj(final Context context) {
        if (!zzb(context)) {
            return null;
        }
        zzbio zzbioVar = zzbix.zzba;
        C0395s c0395s = C0395s.f2489e;
        long jLongValue = ((Long) c0395s.f2492c.zzd(zzbioVar)).longValue();
        if (jLongValue < 0) {
            return (String) zzw(Constants.GET_APP_INSTANCE_ID, context);
        }
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            zzbio zzbioVar2 = zzbix.zzbb;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) c0395s.f2492c.zzd(zzbioVar2)).intValue(), ((Integer) c0395s.f2492c.zzd(zzbioVar2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcee(this));
            while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
            }
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcef
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzq(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzk(Context context) {
        Object objZzw;
        if (zzb(context) && (objZzw = zzw("generateEventId", context)) != null) {
            return objZzw.toString();
        }
        return null;
    }

    public final void zzl(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzt(context, "_ac", str, zzr(map));
    }

    public final void zzm(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzt(context, "_ai", str, zzr(map));
    }

    public final void zzn(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzt(context, "_aq", str, null);
    }

    public final void zzo(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzt(context, "_aa", str, null);
    }

    public final void zzp(Context context, String str, String str2, String str3, int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzb(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i5);
            zzt(context, "_ar", str, bundle);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i5).length());
            sb2.append("Log a Firebase reward video event, reward type: ");
            sb2.append(str3);
            sb2.append(", reward value: ");
            sb2.append(i5);
            G6.L.k(sb2.toString());
        }
    }

    public final /* synthetic */ String zzq(Context context) {
        return (String) zzw(Constants.GET_APP_INSTANCE_ID, context);
    }
}
