package com.google.android.gms.car;

/* JADX INFO: loaded from: classes2.dex */
public class DynamicApiFactory {
    static final java.lang.String CAR_ACTIVITY_HOST_IMPL = "com.google.android.gms.car.internal.CarActivityHostImpl";
    static final java.lang.String CAR_API_CONNECTION_IMPL = "com.google.android.gms.car.internal.CarApiConnectionImpl";
    static final java.lang.String CAR_VERSION_UTILS = "com.google.android.gms.car.CarVersionUtils";
    private static final java.lang.String CAR_VERSION_UTILS_VERSION_CHECK = "versionCheck";
    private static final boolean DEBUG = false;
    private static final java.lang.String DISABLE_GMS_VERSION_CHECKS = "disableGmsVersionChecks";
    static final java.lang.String GMS_VERSION_CHECKER = "com.google.android.gms.car.internal.GmsVersionChecker";
    private static final java.lang.String TAG = "DynamicApiFactory";
    private static android.content.Context implCtx;
    private static java.lang.ClassLoader instance;

    private static java.lang.ClassLoader getCarApiClassLoader(android.content.Context context) throws java.lang.Exception {
        if (implCtx == null) {
            throw new java.lang.IllegalStateException("initialize not called");
        }
        if (instance == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            android.content.Context context2 = implCtx;
            defpackage.sub subVar = defpackage.stg.a;
            java.io.File file = new java.io.File(defpackage.sub.f(context2.getDir("impl", 0), "sdk_impl.jar"));
            if (!file.exists() || !file.canRead()) {
                if (defpackage.ooa.i("ImplStager")) {
                    defpackage.rrx.a("ImplStager", null, "Using local impl jar");
                }
                java.io.File dir = applicationContext.getDir("car_sdk_impl", 0);
                try {
                    defpackage.sqg.q(dir, context2, false, false, false);
                    defpackage.sub subVar2 = defpackage.stg.a;
                    file = new java.io.File(defpackage.sub.f(dir, "sdk_impl.jar"));
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            } else if (defpackage.ooa.i("ImplStager")) {
                defpackage.rrx.a("ImplStager", null, "Gearhead impl exists");
            }
            instance = new defpackage.que(file.getAbsolutePath(), new defpackage.qud(applicationContext));
            defpackage.rrx.d(4, TAG, null, "Will load car API impls dynamically from %s", implCtx.getPackageName());
            instance.loadClass(GMS_VERSION_CHECKER).getMethod(DISABLE_GMS_VERSION_CHECKS, null).invoke(null, null);
            instance.loadClass(CAR_VERSION_UTILS).getMethod(CAR_VERSION_UTILS_VERSION_CHECK, null).invoke(null, null);
        }
        return instance;
    }

    public static void initialize(android.content.Context context) {
        implCtx = context;
    }

    public static boolean isApiInterface(java.lang.String str) {
        return defpackage.qqd.a.contains(str);
    }

    public static java.lang.Object newCarActivityServiceProxy(android.content.Context context) throws java.lang.Exception {
        return getCarApiClassLoader(context).loadClass(CAR_ACTIVITY_HOST_IMPL).getConstructor(null).newInstance(null);
    }

    public static java.lang.Object newCarApiConnection(android.content.Context context, java.lang.Object obj, android.os.Looper looper) throws java.lang.Exception {
        return getCarApiClassLoader(context).loadClass(CAR_API_CONNECTION_IMPL).getConstructor(android.content.Context.class, java.lang.Object.class, android.os.Looper.class).newInstance(context, obj, looper);
    }
}
