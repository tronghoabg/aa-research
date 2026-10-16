package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import dalvik.system.DelegateLastClassLoader;
import defpackage.a;
import defpackage.ijp;
import defpackage.ntn;
import defpackage.sjw;
import defpackage.spu;
import defpackage.sqh;
import defpackage.sqi;
import defpackage.sqj;
import defpackage.sqm;
import defpackage.sqn;
import defpackage.sqo;
import defpackage.sqp;
import defpackage.sqq;
import defpackage.sqr;
import defpackage.sqs;
import defpackage.sqt;
import defpackage.squ;
import defpackage.sqv;
import defpackage.sqw;
import defpackage.sqx;
import defpackage.thg;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class DynamiteModule {
    private static Boolean d = null;
    private static String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static Boolean h;
    private static sqw l;
    private static sqx m;
    public final Context c;
    private static final ThreadLocal i = new ThreadLocal();
    private static final ThreadLocal j = new sqo();
    private static final sqt k = new sqp();
    public static final sqv a = new sqq(1);
    public static final sqv b = new sqq(0);

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    private DynamiteModule(Context context) {
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [android.database.Cursor, java.lang.Object] */
    public static int a(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException e2;
        int i2;
        sqj sqhVar;
        ?? r1;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = d;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        Log.w("DynamiteModule", a.bX(e3, "Failed to load module via V2: "));
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                f(classLoader);
                            } catch (sqs unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!h(context)) {
                                return 0;
                            }
                            if (f || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int iD = d(context, str, z, true);
                                    String str2 = e;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader classLoaderA = sqm.a();
                                        if (classLoaderA == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = e;
                                                if (str3 == null) {
                                                    throw new NullPointerException("null reference");
                                                }
                                                classLoaderA = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = e;
                                                if (str4 == null) {
                                                    throw new NullPointerException("null reference");
                                                }
                                                classLoaderA = new sqn(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        f(classLoaderA);
                                        declaredField.set(null, classLoaderA);
                                        d = Boolean.TRUE;
                                        return iD;
                                    }
                                    return iD;
                                } catch (sqs unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return d(context, str, z, false);
                    } catch (sqs e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                sqw sqwVarI = i(context);
                try {
                    if (sqwVarI == null) {
                        return 0;
                    }
                    try {
                        int iE = sqwVarI.e();
                        if (iE >= 3) {
                            ntn ntnVar = (ntn) i.get();
                            if (ntnVar != null && (r1 = ntnVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            sqi sqiVar = new sqi(context);
                            long jLongValue = ((Long) j.get()).longValue();
                            Parcel parcelGh = sqwVarI.gh();
                            ijp.i(parcelGh, sqiVar);
                            parcelGh.writeString(str);
                            parcelGh.writeInt(z ? 1 : 0);
                            parcelGh.writeLong(jLongValue);
                            Parcel parcelGi = sqwVarI.gi(7, parcelGh);
                            IBinder strongBinder = parcelGi.readStrongBinder();
                            if (strongBinder == null) {
                                sqhVar = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                sqhVar = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                            }
                            parcelGi.recycle();
                            Cursor cursor = (Cursor) sqi.a(sqhVar);
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        i2 = cursor.getInt(0);
                                        cursor = (i2 <= 0 || !g(cursor)) ? cursor : null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (RemoteException e5) {
                                    e2 = e5;
                                    cursor = cursor;
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursor;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor == null) {
                                return 0;
                            }
                            cursor.close();
                            return 0;
                        }
                        if (iE == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            sqi sqiVar2 = new sqi(context);
                            Parcel parcelGh2 = sqwVarI.gh();
                            ijp.i(parcelGh2, sqiVar2);
                            parcelGh2.writeString(str);
                            parcelGh2.writeInt(z ? 1 : 0);
                            Parcel parcelGi2 = sqwVarI.gi(5, parcelGh2);
                            i2 = parcelGi2.readInt();
                            parcelGi2.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            sqi sqiVar3 = new sqi(context);
                            Parcel parcelGh3 = sqwVarI.gh();
                            ijp.i(parcelGh3, sqiVar3);
                            parcelGh3.writeString(str);
                            parcelGh3.writeInt(z ? 1 : 0);
                            Parcel parcelGi3 = sqwVarI.gi(3, parcelGh3);
                            i2 = parcelGi3.readInt();
                            parcelGi3.recycle();
                        }
                        return i2;
                    } catch (RemoteException e6) {
                        e2 = e6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            thg.u(context);
            throw th4;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    @ResultIgnorabilityUnspecified
    public static DynamiteModule b(Context context, sqv sqvVar, String str) throws Throwable {
        long j2;
        long j3;
        DynamiteModule dynamiteModuleE;
        int i2;
        Boolean bool;
        sqj sqhVar;
        sqx sqxVar;
        boolean z;
        Boolean boolValueOf;
        sqj sqhVar2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new sqs("null application Context");
        }
        ThreadLocal threadLocal = i;
        ntn ntnVar = (ntn) threadLocal.get();
        ntn ntnVar2 = new ntn();
        threadLocal.set(ntnVar2);
        ThreadLocal threadLocal2 = j;
        Long l2 = (Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            squ squVarA = sqvVar.a(context, str, k);
            j3 = 0;
            try {
                int i3 = squVarA.a;
                j2 = jLongValue;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + i3 + " and remote module " + str + ":" + squVarA.b);
                    int i4 = squVarA.c;
                    if (i4 == 0 || ((i4 == -1 && squVarA.a == 0) || (i4 == 1 && squVarA.b == 0))) {
                        throw new sqs("No acceptable module " + str + " found. Local version is " + squVarA.a + " and remote version is " + squVarA.b + ".");
                    }
                    if (i4 == -1) {
                        DynamiteModule dynamiteModuleE2 = e(applicationContext, str);
                        if (j2 == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l2);
                        }
                        ?? r1 = ntnVar2.a;
                        if (r1 != 0) {
                            r1.close();
                        }
                        threadLocal.set(ntnVar);
                        return dynamiteModuleE2;
                    }
                    if (i4 != 1) {
                        throw new sqs(a.bp(0, "VersionPolicy returned invalid code:"));
                    }
                    try {
                        i2 = squVarA.b;
                    } catch (sqs e2) {
                        Log.w("DynamiteModule", "Failed to load remote module: " + e2.getMessage());
                        int i5 = squVarA.a;
                        if (i5 == 0 || sqvVar.a(context, str, new sqr(i5)).c != -1) {
                            throw new sqs("Remote load failed. No local fallback found.", e2);
                        }
                        dynamiteModuleE = e(applicationContext, str);
                    }
                    try {
                        synchronized (DynamiteModule.class) {
                            if (!h(context)) {
                                throw new sqs("Remote loading disabled");
                            }
                            bool = d;
                        }
                        if (bool == null) {
                            throw new sqs("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", a.bA(i2, str, "Selected remote version of ", ", version >= "));
                            synchronized (DynamiteModule.class) {
                                sqxVar = m;
                            }
                            if (sqxVar == null) {
                                throw new sqs("DynamiteLoaderV2 was not cached.");
                            }
                            ntn ntnVar3 = (ntn) threadLocal.get();
                            if (ntnVar3 == null || ntnVar3.a == null) {
                                throw new sqs("No result cursor");
                            }
                            Context applicationContext2 = context.getApplicationContext();
                            Object obj = ntnVar3.a;
                            new sqi(null);
                            synchronized (DynamiteModule.class) {
                                z = g >= 2;
                                boolValueOf = Boolean.valueOf(z);
                            }
                            boolValueOf.getClass();
                            if (z) {
                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                sqi sqiVar = new sqi(applicationContext2);
                                sqi sqiVar2 = new sqi(obj);
                                Parcel parcelGh = sqxVar.gh();
                                ClassLoader classLoader = ijp.a;
                                parcelGh.writeStrongBinder(sqiVar);
                                parcelGh.writeString(str);
                                parcelGh.writeInt(i2);
                                parcelGh.writeStrongBinder(sqiVar2);
                                Parcel parcelGi = sqxVar.gi(3, parcelGh);
                                IBinder strongBinder = parcelGi.readStrongBinder();
                                if (strongBinder == null) {
                                    sqhVar2 = null;
                                } else {
                                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    sqhVar2 = iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(strongBinder);
                                }
                                parcelGi.recycle();
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                sqi sqiVar3 = new sqi(applicationContext2);
                                sqi sqiVar4 = new sqi(obj);
                                Parcel parcelGh2 = sqxVar.gh();
                                ijp.i(parcelGh2, sqiVar3);
                                parcelGh2.writeString(str);
                                parcelGh2.writeInt(i2);
                                ijp.i(parcelGh2, sqiVar4);
                                Parcel parcelGi2 = sqxVar.gi(2, parcelGh2);
                                IBinder strongBinder2 = parcelGi2.readStrongBinder();
                                if (strongBinder2 == null) {
                                    sqhVar2 = null;
                                } else {
                                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    sqhVar2 = iInterfaceQueryLocalInterface2 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface2 : new sqh(strongBinder2);
                                }
                                parcelGi2.recycle();
                            }
                            Context context2 = (Context) sqi.a(sqhVar2);
                            if (context2 == null) {
                                throw new sqs("Failed to get module context");
                            }
                            dynamiteModuleE = new DynamiteModule(context2);
                        } else {
                            Log.i("DynamiteModule", a.bA(i2, str, "Selected remote version of ", ", version >= "));
                            sqw sqwVarI = i(context);
                            if (sqwVarI == null) {
                                throw new sqs("Failed to create IDynamiteLoader.");
                            }
                            int iE = sqwVarI.e();
                            if (iE >= 3) {
                                ntn ntnVar4 = (ntn) threadLocal.get();
                                if (ntnVar4 == null) {
                                    throw new sqs("No cached result cursor holder");
                                }
                                sqi sqiVar5 = new sqi(context);
                                sqi sqiVar6 = new sqi(ntnVar4.a);
                                Parcel parcelGh3 = sqwVarI.gh();
                                ijp.i(parcelGh3, sqiVar5);
                                parcelGh3.writeString(str);
                                parcelGh3.writeInt(i2);
                                ijp.i(parcelGh3, sqiVar6);
                                Parcel parcelGi3 = sqwVarI.gi(8, parcelGh3);
                                IBinder strongBinder3 = parcelGi3.readStrongBinder();
                                if (strongBinder3 == null) {
                                    sqhVar = null;
                                } else {
                                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    sqhVar = iInterfaceQueryLocalInterface3 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface3 : new sqh(strongBinder3);
                                }
                                parcelGi3.recycle();
                            } else if (iE == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                sqi sqiVar7 = new sqi(context);
                                Parcel parcelGh4 = sqwVarI.gh();
                                ijp.i(parcelGh4, sqiVar7);
                                parcelGh4.writeString(str);
                                parcelGh4.writeInt(i2);
                                Parcel parcelGi4 = sqwVarI.gi(4, parcelGh4);
                                IBinder strongBinder4 = parcelGi4.readStrongBinder();
                                if (strongBinder4 == null) {
                                    sqhVar = null;
                                } else {
                                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    sqhVar = iInterfaceQueryLocalInterface4 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface4 : new sqh(strongBinder4);
                                }
                                parcelGi4.recycle();
                            } else {
                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                sqi sqiVar8 = new sqi(context);
                                Parcel parcelGh5 = sqwVarI.gh();
                                ijp.i(parcelGh5, sqiVar8);
                                parcelGh5.writeString(str);
                                parcelGh5.writeInt(i2);
                                Parcel parcelGi5 = sqwVarI.gi(2, parcelGh5);
                                IBinder strongBinder5 = parcelGi5.readStrongBinder();
                                if (strongBinder5 == null) {
                                    sqhVar = null;
                                } else {
                                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                    sqhVar = iInterfaceQueryLocalInterface5 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface5 : new sqh(strongBinder5);
                                }
                                parcelGi5.recycle();
                            }
                            Object objA = sqi.a(sqhVar);
                            if (objA == null) {
                                throw new sqs("Failed to load remote module.");
                            }
                            dynamiteModuleE = new DynamiteModule((Context) objA);
                        }
                        if (j2 == 0) {
                            j.remove();
                        } else {
                            j.set(l2);
                        }
                        ?? r0 = ntnVar2.a;
                        if (r0 != 0) {
                            r0.close();
                        }
                        i.set(ntnVar);
                        return dynamiteModuleE;
                    } catch (RemoteException e3) {
                        throw new sqs("Failed to load remote module.", e3);
                    } catch (sqs e4) {
                        throw e4;
                    } catch (Throwable th) {
                        thg.u(context);
                        throw new sqs("Failed to load remote module.", th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (j2 == j3) {
                        j.remove();
                    } else {
                        j.set(l2);
                    }
                    ?? r12 = ntnVar2.a;
                    if (r12 != 0) {
                        r12.close();
                    }
                    i.set(ntnVar);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j2 = jLongValue;
            }
        } catch (Throwable th4) {
            th = th4;
            j2 = jLongValue;
            j3 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125 A[PHI: r13
  0x0125: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:60:0x00ed, B:75:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int d(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule e(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new DynamiteModule(context);
    }

    private static void f(ClassLoader classLoader) throws sqs {
        try {
            sqx sqxVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                sqxVar = iInterfaceQueryLocalInterface instanceof sqx ? (sqx) iInterfaceQueryLocalInterface : new sqx(iBinder);
            }
            m = sqxVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new sqs("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean g(Cursor cursor) {
        ntn ntnVar = (ntn) i.get();
        if (ntnVar == null || ntnVar.a != null) {
            return false;
        }
        ntnVar.a = cursor;
        return true;
    }

    private static boolean h(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != spu.c() ? 0 : 268435456);
            if (sjw.d.l(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            h = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static sqw i(Context context) {
        sqw sqwVar;
        synchronized (DynamiteModule.class) {
            sqw sqwVar2 = l;
            if (sqwVar2 != null) {
                return sqwVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    sqwVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    sqwVar = iInterfaceQueryLocalInterface instanceof sqw ? (sqw) iInterfaceQueryLocalInterface : new sqw(iBinder);
                }
                if (sqwVar != null) {
                    l = sqwVar;
                    return sqwVar;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final IBinder c() throws sqs {
        try {
            return (IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new sqs("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
