package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.net.HttpEngineProviderSingleton;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class sud {
    public static String b = "0";
    private static final String c = "sud";
    private static DynamiteModule e;
    private static boolean f;
    private static final sjw d = sjw.d;
    public static final Object a = new Object();

    private sud() {
    }

    public static DynamiteModule a() {
        DynamiteModule dynamiteModule;
        synchronized (a) {
            dynamiteModule = e;
        }
        return dynamiteModule;
    }

    @Deprecated
    public static void b(Context context) throws skk, skl {
        synchronized (a) {
            if (c()) {
                return;
            }
            suf sufVar = new suf(context, 37401, 1.0f);
            try {
                spu.ax(context, "Context must not be null");
                if (HttpEngineProviderSingleton.getInstance(context).shouldUseHttpEngine()) {
                    f = true;
                    sufVar.a();
                    sufVar.close();
                    return;
                }
                ClassLoader classLoader = sud.class.getClassLoader();
                spu.aw(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    skm.c(context, 11925000);
                    try {
                        DynamiteModule dynamiteModuleB = DynamiteModule.b(context, DynamiteModule.a, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = dynamiteModuleB.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == sud.class.getClassLoader()) {
                                Log.e(c, "ImplVersion class is missing from Cronet module.");
                                throw new skk(8);
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", null);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                            Integer num = (Integer) method.invoke(null, null);
                            spu.aw(num);
                            int iIntValue = num.intValue();
                            String str = (String) method2.invoke(null, null);
                            spu.aw(str);
                            b = str;
                            if (iIntValue >= 3) {
                                e = dynamiteModuleB;
                                sufVar.a();
                                sufVar.close();
                                return;
                            }
                            Intent intentM = d.m(context, 2, "cr");
                            if (intentM == null) {
                                Log.e(c, "Unable to fetch error resolution intent");
                                throw new skk(2);
                            }
                            throw new skl(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + iIntValue + ". The Cronet implementation version is " + b, intentM);
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassNotFoundException e2) {
                    Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((skk) new skk(10).initCause(e2));
                }
            } finally {
            }
        }
    }

    public static boolean c() {
        synchronized (a) {
            boolean z = true;
            if (f) {
                return true;
            }
            if (a() == null) {
                z = false;
            }
            return z;
        }
    }
}
