package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import Va.M6;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.utils.StringUtils;
import p7.C3773c;

/* loaded from: classes3.dex */
public final class zzcaf implements zzcah {
    public static zzcah zza;
    static zzcah zzb;
    static zzcah zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final H6.a zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcaf(android.content.Context r4, H6.a r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.zzh = r0
            com.google.android.gms.internal.ads.zzgat r0 = com.google.android.gms.internal.ads.zzgaw.zza()
            r1 = 2
            java.util.concurrent.ExecutorService r0 = r0.zza(r1)
            r3.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.zzn = r0
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L2d
            android.content.Context r4 = r4.getApplicationContext()
        L2d:
            r3.zzg = r4
            r3.zzj = r5
            com.google.android.gms.internal.ads.zzbio r5 = com.google.android.gms.internal.ads.zzbix.zzjb
            D6.s r0 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r0 = r0.f2492c
            java.lang.Object r5 = r0.zzd(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto L4e
            com.google.android.gms.internal.ads.zzgax r5 = H6.f.f4939b
            if (r4 == 0) goto L4e
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            if (r5 != 0) goto L50
        L4e:
            r4 = r0
            goto L5f
        L50:
            E0.a r5 = p7.C3773c.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
            r1 = 0
            android.content.pm.PackageInfo r4 = r5.c(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4e
        L5f:
            r3.zzk = r4
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zziO
            D6.s r5 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r1 = r5.f2492c
            java.lang.Object r1 = r1.zzd(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L80
            com.google.android.gms.internal.ads.zzgax r1 = H6.f.f4939b
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            goto L81
        L80:
            r1 = r2
        L81:
            r3.zzl = r1
            com.google.android.gms.internal.ads.zzbiv r5 = r5.f2492c
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lae
            android.content.Context r4 = r3.zzg
            com.google.android.gms.internal.ads.zzgax r5 = H6.f.f4939b
            if (r4 != 0) goto L98
            goto Laf
        L98:
            E0.a r4 = p7.C3773c.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Laf
            java.lang.String r5 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.c(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Laf
            if (r4 != 0) goto La7
            goto Laf
        La7:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Laf
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Laf
            goto Laf
        Lae:
            r0 = r2
        Laf:
            r3.zzm = r0
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zziK
            D6.s r5 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r5 = r5.f2492c
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto Lca
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.zzp = r4
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcaf.<init>(android.content.Context, H6.a):void");
    }

    public static zzcah zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzj(context)) {
                        zza = new zzcaf(context, H6.a.V());
                    } else {
                        zza = new zzcag();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zza;
    }

    public static zzcah zzb(Context context, H6.a aVar) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z2 = false;
                    if (((Boolean) zzbkp.zzc.zze()).booleanValue()) {
                        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziI)).booleanValue() || ((Boolean) zzbkp.zza.zze()).booleanValue()) {
                            z2 = true;
                        }
                    }
                    if (zzj(context)) {
                        zzcaf zzcafVar = new zzcaf(context, aVar);
                        zzcafVar.zzl();
                        zzcafVar.zzk();
                        zzc = zzcafVar;
                    } else if (!z2 || context == null) {
                        zzc = new zzcag();
                    } else {
                        zzcaf zzcafVar2 = new zzcaf(context, aVar, true);
                        zzcafVar2.zzl();
                        zzcafVar2.zzk();
                        zzc = zzcafVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002b, B:14:0x0039, B:15:0x0040), top: B:20:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzcah zzc(android.content.Context r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcaf.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcah r1 = com.google.android.gms.internal.ads.zzcaf.zzb     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L40
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zziJ     // Catch: java.lang.Throwable -> L37
            D6.s r2 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbiv r3 = r2.f2492c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r3.zzd(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zziI     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            if (r4 == 0) goto L39
            com.google.android.gms.internal.ads.zzcaf r1 = new com.google.android.gms.internal.ads.zzcaf     // Catch: java.lang.Throwable -> L37
            H6.a r2 = H6.a.V()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzcaf.zzb = r1     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r4 = move-exception
            goto L44
        L39:
            com.google.android.gms.internal.ads.zzcag r4 = new com.google.android.gms.internal.ads.zzcag     // Catch: java.lang.Throwable -> L37
            r4.<init>()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzcaf.zzb = r4     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzcah r4 = com.google.android.gms.internal.ads.zzcaf.zzb
            return r4
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcaf.zzc(android.content.Context):com.google.android.gms.internal.ads.zzcah");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0033, B:14:0x003a), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzcah zzd(android.content.Context r4, H6.a r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzcaf.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzcah r1 = com.google.android.gms.internal.ads.zzcaf.zzb     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zziJ     // Catch: java.lang.Throwable -> L31
            D6.s r2 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbiv r3 = r2.f2492c     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r3.zzd(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zziI     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.zzcaf r1 = new com.google.android.gms.internal.ads.zzcaf     // Catch: java.lang.Throwable -> L31
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzcaf.zzb = r1     // Catch: java.lang.Throwable -> L31
            goto L3a
        L31:
            r4 = move-exception
            goto L3e
        L33:
            com.google.android.gms.internal.ads.zzcag r4 = new com.google.android.gms.internal.ads.zzcag     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzcaf.zzb = r4     // Catch: java.lang.Throwable -> L31
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzcah r4 = com.google.android.gms.internal.ads.zzcaf.zzb
            return r4
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcaf.zzd(android.content.Context, H6.a):com.google.android.gms.internal.ads.zzcah");
    }

    public static String zze(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th) {
        return zzgui.zza(H6.f.d(zze(th), "SHA-256"));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(C0392q.f2477g.f2482e.nextInt(100) < ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzot)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziI)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzcac(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzcad(this, thread.getUncaughtExceptionHandler()));
    }

    public final void zzg(Thread thread, Throwable th) {
        if (th != null) {
            boolean zO = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zO |= H6.f.o(stackTraceElement.getClassName());
                    zEquals |= zzcaf.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zziK)).intValue();
            if (iIntValue > 0) {
                if (this.zzp.size() >= iIntValue) {
                    return;
                }
                String strZzf = zzf(th);
                if (this.zzp.contains(strZzf)) {
                    return;
                } else {
                    this.zzp.add(strZzf);
                }
            }
            if (!zO || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbkp.zzc.zze()).booleanValue()) {
                return;
            }
            zzbii.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    public final void zzh(Throwable th, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    public final void zzi(Throwable th, String str, float f10) {
        Throwable th2;
        String packageName;
        PackageInfo packageInfoC;
        ActivityManager.MemoryInfo memoryInfoI;
        if (this.zzo) {
            return;
        }
        zzgax zzgaxVar = H6.f.f4939b;
        boolean zE = false;
        if (((Boolean) zzblg.zze.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z2 = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdk)).booleanValue() && stackTrace != null && stackTrace.length == 0 && H6.f.o(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (H6.f.o(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strZze = zze(th);
            String strZzf = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkj)).booleanValue() ? zzf(th) : "";
            double d3 = f10;
            double dRandom = Math.random();
            int i5 = f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (1.0f / f10) : 1;
            if (dRandom < d3) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zE = C3773c.a(this.zzg).e();
                } catch (Throwable th4) {
                    H6.l.d("Error fetching instant app info", th4);
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    H6.l.f("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zE)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i10 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i10));
                String str2 = Build.MANUFACTURER;
                String strT = Build.MODEL;
                if (!strT.startsWith(str2)) {
                    strT = M6.t(new StringBuilder(String.valueOf(str2).length() + 1 + strT.length()), str2, StringUtils.SPACE, strT);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strT);
                H6.a aVar = this.zzj;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", aVar.f4927a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze);
                C0395s c0395s = C0395s.f2489e;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("eids", TextUtils.join(",", c0395s.f2490a.zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "910357297").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i5)).appendQueryParameter("pb_tm", String.valueOf(zzblg.zzc.zze()));
                Context context = this.zzg;
                d7.f.f34129b.getClass();
                Uri.Builder builderAppendQueryParameter6 = builderAppendQueryParameter5.appendQueryParameter("gmscv", String.valueOf(d7.f.a(context)));
                boolean z10 = aVar.f4931e;
                String str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                Uri.Builder builderAppendQueryParameter7 = builderAppendQueryParameter6.appendQueryParameter("lite", true != z10 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter7.appendQueryParameter("hash", strZzf);
                }
                zzbio zzbioVar = zzbix.zziP;
                zzbiv zzbivVar = c0395s.f2492c;
                if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue() && (memoryInfoI = H6.f.i(context)) != null) {
                    builderAppendQueryParameter7.appendQueryParameter("available_memory", Long.toString(memoryInfoI.availMem));
                    builderAppendQueryParameter7.appendQueryParameter("total_memory", Long.toString(memoryInfoI.totalMem));
                    if (true != memoryInfoI.lowMemory) {
                        str3 = "0";
                    }
                    builderAppendQueryParameter7.appendQueryParameter("is_low_memory", str3);
                }
                if (((Boolean) zzbivVar.zzd(zzbix.zziO)).booleanValue()) {
                    String str4 = this.zzl;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter7.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.zzm;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter7.appendQueryParameter("psv", str5);
                    }
                    if (i10 >= 26) {
                        packageInfoC = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoC = null;
                    } else {
                        try {
                            packageInfoC = C3773c.a(context).c(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfoC != null) {
                        builderAppendQueryParameter7.appendQueryParameter("wvvc", Integer.toString(packageInfoC.versionCode));
                        builderAppendQueryParameter7.appendQueryParameter("wvvn", packageInfoC.versionName);
                        builderAppendQueryParameter7.appendQueryParameter("wvpn", packageInfoC.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    builderAppendQueryParameter7.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter7.appendQueryParameter("appvn", packageInfo.versionName);
                }
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznf)).booleanValue()) {
                    builderAppendQueryParameter7.appendQueryParameter("uev", zzgui.zza(H6.f.j(this.zzg)));
                }
                arrayList2.add(builderAppendQueryParameter7.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    final String str6 = (String) it.next();
                    final H6.p pVar = new H6.p(this.zzg, null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcae
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            pVar.a(null, str6);
                        }
                    });
                }
            }
        }
    }

    public zzcaf(Context context, H6.a aVar, boolean z2) {
        this(context, aVar);
        this.zzo = true;
    }
}
