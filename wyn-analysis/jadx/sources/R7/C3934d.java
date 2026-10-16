package r7;

import a9.C1342b;
import ad.C1355I;
import ad.r;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: r7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3934d {

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f44527f = null;

    /* renamed from: g, reason: collision with root package name */
    public static String f44528g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f44529h = false;

    /* renamed from: i, reason: collision with root package name */
    public static int f44530i = -1;

    /* renamed from: j, reason: collision with root package name */
    public static Boolean f44531j;

    /* renamed from: n, reason: collision with root package name */
    public static h f44534n;

    /* renamed from: o, reason: collision with root package name */
    public static i f44535o;

    /* renamed from: a, reason: collision with root package name */
    public final Context f44536a;
    public static final ThreadLocal k = new ThreadLocal();

    /* renamed from: l, reason: collision with root package name */
    public static final f0 f44532l = new f0(1);

    /* renamed from: m, reason: collision with root package name */
    public static final C1342b f44533m = new C1342b();

    /* renamed from: b, reason: collision with root package name */
    public static final ab.b f44523b = new ab.b();

    /* renamed from: c, reason: collision with root package name */
    public static final r f44524c = new r();

    /* renamed from: d, reason: collision with root package name */
    public static final C1355I f44525d = new C1355I(12);

    /* renamed from: e, reason: collision with root package name */
    public static final ae.b f44526e = new ae.b();

    public C3934d(Context context) {
        this.f44536a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (AbstractC1732v.m(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0320 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0329 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:31:0x00f8, B:122:0x02b0, B:123:0x02ba, B:131:0x02c9, B:133:0x02f1, B:135:0x0302, B:145:0x0332, B:146:0x0339, B:126:0x02bd, B:127:0x02be, B:128:0x02c5, B:147:0x033a, B:148:0x035a, B:149:0x035b, B:150:0x03ac), top: B:162:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.common.api.internal.f0, java.lang.ThreadLocal] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r7.C3934d c(android.content.Context r29, r7.InterfaceC3933c r30, java.lang.String r31) throws r7.C3931a {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C3934d.c(android.content.Context, r7.c, java.lang.String):r7.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:64:0x00e9, B:66:0x00ef, B:73:0x011b, B:103:0x01a4, B:111:0x01b7, B:129:0x023e, B:130:0x0241, B:124:0x0236, B:71:0x00f8, B:132:0x0243, B:5:0x0007, B:8:0x000e, B:9:0x002a, B:62:0x00e6, B:22:0x004e, B:45:0x00a4, B:48:0x00a7, B:55:0x00bf, B:63:0x00e8, B:61:0x00c5), top: B:143:0x0006, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[Catch: all -> 0x003b, TryCatch #12 {, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bc, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0053, B:28:0x0057, B:31:0x0060, B:33:0x0068, B:36:0x006f, B:43:0x009b, B:44:0x00a3, B:39:0x0076, B:41:0x007c, B:42:0x008d, B:47:0x00a6, B:50:0x00a9, B:51:0x00b3, B:18:0x0043), top: B:146:0x002b, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C3934d.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f44531j)) {
            return true;
        }
        boolean z2 = false;
        if (f44531j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (d7.f.f34129b.d(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z2 = true;
            }
            f44531j = Boolean.valueOf(z2);
            if (z2 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f44529h = true;
            }
        }
        if (!z2) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[PHI: r14
  0x013a: PHI (r14v10 boolean) = (r14v6 boolean), (r14v14 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.C3934d.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void g(ClassLoader classLoader) throws C3931a {
        i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof i) {
                    iVar = (i) iInterfaceQueryLocalInterface;
                } else {
                    try {
                        iVar = new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        throw new C3931a("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e10) {
                        e = e10;
                        throw new C3931a("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        throw new C3931a("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        throw new C3931a("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f44535o = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e13) {
            e = e13;
        }
    }

    public static h h(Context context) {
        h hVar;
        synchronized (C3934d.class) {
            h hVar2 = f44534n;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (hVar != null) {
                    f44534n = hVar;
                    return hVar;
                }
            } catch (Exception e7) {
                String message = e7.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws C3931a {
        try {
            return (IBinder) this.f44536a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new C3931a("Failed to instantiate module class: ".concat(str), e7);
        }
    }
}
