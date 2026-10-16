package com.google.android.gms.car;

import android.content.Context;
import android.os.Looper;
import defpackage.oni;
import defpackage.qph;
import defpackage.qth;
import defpackage.qti;
import defpackage.rrd;
import defpackage.ssi;
import defpackage.std;
import defpackage.uqw;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class DynamicApiFactory {
    static final String CAR_ACTIVITY_HOST_IMPL = "com.google.android.gms.car.internal.CarActivityHostImpl";
    static final String CAR_API_CONNECTION_IMPL = "com.google.android.gms.car.internal.CarApiConnectionImpl";
    static final String CAR_VERSION_UTILS = "com.google.android.gms.car.CarVersionUtils";
    private static final String CAR_VERSION_UTILS_VERSION_CHECK = "versionCheck";
    private static final boolean DEBUG = false;
    private static final String DISABLE_GMS_VERSION_CHECKS = "disableGmsVersionChecks";
    static final String GMS_VERSION_CHECKER = "com.google.android.gms.car.internal.GmsVersionChecker";
    private static final String TAG = "DynamicApiFactory";
    private static Context implCtx;
    private static ClassLoader instance;

    private static ClassLoader getCarApiClassLoader(Context context) throws Exception {
        if (implCtx == null) {
            throw new IllegalStateException("initialize not called");
        }
        if (instance == null) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = implCtx;
            std stdVar = ssi.a;
            File file = new File(std.c(context2.getDir("impl", 0), "sdk_impl.jar"));
            if (!file.exists() || !file.canRead()) {
                if (oni.j("ImplStager")) {
                    rrd.a("ImplStager", null, "Using local impl jar");
                }
                File dir = applicationContext.getDir("car_sdk_impl", 0);
                try {
                    uqw.ag(dir, context2, false, false, false);
                    std stdVar2 = ssi.a;
                    file = new File(std.c(dir, "sdk_impl.jar"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else if (oni.j("ImplStager")) {
                rrd.a("ImplStager", null, "Gearhead impl exists");
            }
            instance = new qti(file.getAbsolutePath(), new qth(applicationContext));
            rrd.d(4, TAG, null, "Will load car API impls dynamically from %s", implCtx.getPackageName());
            instance.loadClass(GMS_VERSION_CHECKER).getMethod(DISABLE_GMS_VERSION_CHECKS, null).invoke(null, null);
            instance.loadClass(CAR_VERSION_UTILS).getMethod(CAR_VERSION_UTILS_VERSION_CHECK, null).invoke(null, null);
        }
        return instance;
    }

    public static void initialize(Context context) {
        implCtx = context;
    }

    public static boolean isApiInterface(String str) {
        return qph.a.contains(str);
    }

    public static Object newCarActivityServiceProxy(Context context) throws Exception {
        return getCarApiClassLoader(context).loadClass(CAR_ACTIVITY_HOST_IMPL).getConstructor(null).newInstance(null);
    }

    public static Object newCarApiConnection(Context context, Object obj, Looper looper) throws Exception {
        return getCarApiClassLoader(context).loadClass(CAR_API_CONNECTION_IMPL).getConstructor(Context.class, Object.class, Looper.class).newInstance(context, obj, looper);
    }
}
