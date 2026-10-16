package i3;

import N0.n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final n f36776a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f36777b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static ae.d f36778c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static ae.d b() {
        ae.d dVar = new ae.d(7);
        f36778c = dVar;
        f36776a.i(dVar);
        return f36778c;
    }

    public static void c(Context context, boolean z2) {
        h hVarA;
        int i5;
        if (z2 || f36778c == null) {
            synchronized (f36777b) {
                if (!z2) {
                    try {
                        if (f36778c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28 && i10 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i11 = 0;
                    boolean z10 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z11 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                hVarA = h.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            hVarA = null;
                        }
                        if (hVarA != null && hVarA.f36774c == jA && (i5 = hVarA.f36773b) != 2) {
                            i11 = i5;
                        } else if (z10) {
                            i11 = 1;
                        } else if (z11) {
                            i11 = 2;
                        }
                        if (z2 && z11 && i11 != 1) {
                            i11 = 2;
                        }
                        if (hVarA != null && hVarA.f36773b == 2 && i11 == 1 && length < hVarA.f36775d) {
                            i11 = 3;
                        }
                        h hVar = new h(1, i11, jA, length2);
                        if (hVarA == null || !hVarA.equals(hVar)) {
                            try {
                                hVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
