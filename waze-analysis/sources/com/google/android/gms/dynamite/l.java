package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f5191b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f5192c = null;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f5193d = false;

    /* renamed from: e, reason: collision with root package name */
    private static int f5194e = -1;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f5195f;

    /* renamed from: k, reason: collision with root package name */
    private static m f5199k;

    /* renamed from: l, reason: collision with root package name */
    private static n f5200l;

    /* renamed from: j, reason: collision with root package name */
    private final Context f5201j;

    /* renamed from: g, reason: collision with root package name */
    private static final ThreadLocal f5196g = new ThreadLocal();

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal f5197h = new c();

    /* renamed from: i, reason: collision with root package name */
    private static final i f5198i = new d();

    /* renamed from: a, reason: collision with root package name */
    public static final k f5190a = new e();

    private l(Context context) {
        this.f5201j = context;
    }

    public static int a(Context context, String str) throws NoSuchFieldException, ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equals(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0151 A[Catch: all -> 0x01ad, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x01ad, blocks: (B:3:0x0002, B:57:0x00c6, B:59:0x00cc, B:64:0x00ed, B:86:0x0143, B:90:0x0151, B:111:0x01a6, B:112:0x01a9, B:106:0x019e, B:62:0x00d2, B:115:0x01ac, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:55:0x00c3, B:19:0x0044, B:37:0x0085, B:40:0x0088, B:48:0x00a1, B:56:0x00c5, B:54:0x00a7), top: B:129:0x0002, inners: #6, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.l.b(android.content.Context, boolean):int");
    }

    public static l d(Context context, k kVar) throws Throwable {
        long j2;
        l lVarI;
        int i2;
        Boolean bool;
        com.google.android.gms.g.c cVarB;
        n nVar;
        Boolean boolValueOf;
        com.google.android.gms.g.c cVarA;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new h("null application Context");
        }
        ThreadLocal threadLocal = f5196g;
        f fVar = (f) threadLocal.get();
        f fVar2 = new f(null);
        threadLocal.set(fVar2);
        ThreadLocal threadLocal2 = f5197h;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            j jVarA = kVar.a(context, f5198i);
            j2 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module com.google.android.gms.googlecertificates:" + jVarA.f5187a + " and remote module com.google.android.gms.googlecertificates:" + jVarA.f5188b);
                int i3 = jVarA.f5189c;
                if (i3 != 0 && (i3 != -1 || jVarA.f5187a != 0)) {
                    boolean z = true;
                    if (i3 != 1 || jVarA.f5188b != 0) {
                        if (i3 == -1) {
                            l lVarI2 = i(applicationContext);
                            if (j2 == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l2);
                            }
                            Cursor cursor = fVar2.f5185a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(fVar);
                            return lVarI2;
                        }
                        if (i3 != 1) {
                            throw new h("VersionPolicy returned invalid code:0");
                        }
                        try {
                            i2 = jVarA.f5188b;
                        } catch (h e2) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e2.getMessage());
                            int i4 = jVarA.f5187a;
                            if (i4 == 0 || kVar.a(context, new g(i4)).f5189c != -1) {
                                throw new h("Remote load failed. No local fallback found.", e2);
                            }
                            lVarI = i(applicationContext);
                        }
                        try {
                            synchronized (l.class) {
                                if (!g(context)) {
                                    throw new h("Remote loading disabled");
                                }
                                bool = f5191b;
                            }
                            if (bool == null) {
                                throw new h("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.googlecertificates, version >= " + i2);
                                synchronized (l.class) {
                                    nVar = f5200l;
                                }
                                if (nVar == null) {
                                    throw new h("DynamiteLoaderV2 was not cached.");
                                }
                                f fVar3 = (f) threadLocal.get();
                                if (fVar3 == null || fVar3.f5185a == null) {
                                    throw new h("No result cursor");
                                }
                                Context applicationContext2 = context.getApplicationContext();
                                Cursor cursor2 = fVar3.f5185a;
                                com.google.android.gms.g.b.b(null);
                                synchronized (l.class) {
                                    if (f5194e < 2) {
                                        z = false;
                                    }
                                    boolValueOf = Boolean.valueOf(z);
                                }
                                boolValueOf.getClass();
                                if (z) {
                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    cVarA = nVar.b(com.google.android.gms.g.b.b(applicationContext2), i2, com.google.android.gms.g.b.b(cursor2));
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    cVarA = nVar.a(com.google.android.gms.g.b.b(applicationContext2), i2, com.google.android.gms.g.b.b(cursor2));
                                }
                                Context context2 = (Context) com.google.android.gms.g.b.c(cVarA);
                                if (context2 == null) {
                                    throw new h("Failed to get module context");
                                }
                                lVarI = new l(context2);
                            } else {
                                Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.googlecertificates, version >= " + i2);
                                m mVarJ = j(context);
                                if (mVarJ == null) {
                                    throw new h("Failed to create IDynamiteLoader.");
                                }
                                int iA = mVarJ.a();
                                if (iA >= 3) {
                                    f fVar4 = (f) threadLocal.get();
                                    if (fVar4 == null) {
                                        throw new h("No cached result cursor holder");
                                    }
                                    cVarB = mVarJ.c(com.google.android.gms.g.b.b(context), i2, com.google.android.gms.g.b.b(fVar4.f5185a));
                                } else if (iA == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    cVarB = mVarJ.d(com.google.android.gms.g.b.b(context), i2);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    cVarB = mVarJ.b(com.google.android.gms.g.b.b(context), i2);
                                }
                                Object objC = com.google.android.gms.g.b.c(cVarB);
                                if (objC == null) {
                                    throw new h("Failed to load remote module.");
                                }
                                lVarI = new l((Context) objC);
                            }
                            if (j2 == 0) {
                                f5197h.remove();
                            } else {
                                f5197h.set(l2);
                            }
                            Cursor cursor3 = fVar2.f5185a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            f5196g.set(fVar);
                            return lVarI;
                        } catch (RemoteException e3) {
                            throw new h("Failed to load remote module.", e3);
                        } catch (h e4) {
                            throw e4;
                        } catch (Throwable th) {
                            com.google.android.gms.common.util.g.b(context);
                            throw new h("Failed to load remote module.", th);
                        }
                    }
                }
                throw new h("No acceptable module com.google.android.gms.googlecertificates found. Local version is " + jVarA.f5187a + " and remote version is " + jVarA.f5188b + ".");
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    f5197h.remove();
                } else {
                    f5197h.set(l2);
                }
                Cursor cursor4 = fVar2.f5185a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f5196g.set(fVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = jLongValue;
        }
    }

    private static void e(ClassLoader classLoader) throws h {
        try {
            n nVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new n(iBinder);
            }
            f5200l = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new h("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean f(Cursor cursor) {
        f fVar = (f) f5196g.get();
        if (fVar == null || fVar.f5185a != null) {
            return false;
        }
        fVar.f5185a = cursor;
        return true;
    }

    private static boolean g(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(f5195f)) {
            return true;
        }
        boolean z = false;
        if (f5195f == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (com.google.android.gms.common.i.o().m(context, DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            f5195f = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5193d = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126 A[PHI: r14
  0x0126: PHI (r14v10 boolean) = (r14v9 boolean), (r14v13 boolean) binds: [B:59:0x00ee, B:74:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int h(android.content.Context r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.l.h(android.content.Context, boolean, boolean):int");
    }

    private static l i(Context context) {
        Log.i("DynamiteModule", "Selected local version of com.google.android.gms.googlecertificates");
        return new l(context);
    }

    private static m j(Context context) {
        m mVar;
        synchronized (l.class) {
            m mVar2 = f5199k;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f5199k = mVar;
                    return mVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder c() throws h {
        try {
            return (IBinder) this.f5201j.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new h("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
