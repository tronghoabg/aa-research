package org.chromium.net;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CronetProvider {
    static final int EMBEDDED_CRONET_PROVIDER_SCORE = 5;
    static final int FALLBACK_CRONET_PROVIDER_SCORE = 1;
    private static final java.lang.String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final java.lang.String HTTPENGINE_PROVIDER_CLASS = "org.chromium.net.impl.HttpEngineNativeProvider";
    private static final java.lang.String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final java.lang.String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    static final int NOT_PREFERRED_HTTP_ENGINE_PROVIDER_SCORE = 2;
    private static final java.lang.String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    static final int PLAY_SERVICES_CRONET_PROVIDER_SCORE = 3;
    static final int PREFERRED_HTTP_ENGINE_PROVIDER_SCORE = 4;
    static final java.lang.String PREFERRED_MINIMUM_HTTPENGINE_VERSION_HTTP_FLAG_NAME = "Cronet_PreferredMinimumHttpEngineVersion";
    public static final java.lang.String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final java.lang.String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    public static final java.lang.String PROVIDER_NAME_HTTPENGINE_NATIVE = "HttpEngine-Native-Provider";
    static final int RESOURCES_CRONET_PROVIDER_SCORE = 6;
    private static final java.lang.String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final java.lang.String TAG = "CronetProvider";
    static final java.lang.String USE_SCORE_BASED_PROVIDER_SELECTION_HTTP_FLAG_NAME = "Cronet_UseScoreBasedProviderSelection";
    protected final android.content.Context mContext;

    protected CronetProvider(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    private static boolean addCronetProviderFromResourceFile(android.content.Context context, org.chromium.net.impl.CronetLogger.CronetSource cronetSource, java.util.Set<defpackage.akcm> set) {
        java.lang.String string;
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        if (identifier == 0 || (string = context.getString(identifier)) == null || string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) || string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) || string.equals(JAVA_CRONET_PROVIDER_CLASS) || string.equals(NATIVE_CRONET_PROVIDER_CLASS) || string.equals(HTTPENGINE_PROVIDER_CLASS)) {
            return false;
        }
        if (addCronetProviderImplByClassName(context, string, 6, cronetSource, set, true)) {
            return true;
        }
        android.util.Log.e(defpackage.agwk.b(TAG), defpackage.a.bp(string, "Unable to instantiate Cronet implementation class ", " that is listed as in the app string resource file under CronetProviderClassName key"));
        return true;
    }

    private static boolean addCronetProviderImplByClassName(android.content.Context context, java.lang.String str, int i, org.chromium.net.impl.CronetLogger.CronetSource cronetSource, java.util.Set<defpackage.akcm> set, boolean z) {
        try {
            java.lang.reflect.Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(org.chromium.net.CronetProvider.class).getConstructor(android.content.Context.class);
            defpackage.akcm akcmVar = new defpackage.akcm();
            akcmVar.a = (org.chromium.net.CronetProvider) constructor.newInstance(context);
            akcmVar.b = i;
            akcmVar.c = cronetSource;
            set.add(akcmVar);
            return true;
        } catch (java.lang.ClassNotFoundException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (java.lang.IllegalAccessException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (java.lang.InstantiationException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (java.lang.NoSuchMethodException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (java.lang.reflect.InvocationTargetException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    private static int calculateHttpEngineNativeProviderScore(android.content.Context context) {
        return calculateHttpEngineNativeProviderScoreInternal(context, null);
    }

    static int calculateHttpEngineNativeProviderScoreInternal(android.content.Context context, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.ext.SdkExtensions.getExtensionVersion(31) < 7) {
            return Integer.MIN_VALUE;
        }
        defpackage.akcx akcxVar = (defpackage.akcx) defpackage.agwr.b(context).X().get(PREFERRED_MINIMUM_HTTPENGINE_VERSION_HTTP_FLAG_NAME);
        java.lang.String strA = akcxVar == null ? "133.0.6876.3" : akcxVar.a();
        if (str == null) {
            str = android.net.http.HttpEngine.getVersionString();
        }
        return compareVersions(str, strA) >= 0 ? 4 : 2;
    }

    public static int compareVersions(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            throw new java.lang.IllegalArgumentException("The input values cannot be null");
        }
        java.lang.String[] strArrSplit = str.split("\\.");
        java.lang.String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length != strArrSplit2.length) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bL(str2, str, "Version strings must have an equal number of segments for comparison: ", " vs "));
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                int i2 = java.lang.Integer.parseInt(strArrSplit[i]);
                int i3 = java.lang.Integer.parseInt(strArrSplit2[i]);
                if (i2 != i3) {
                    return java.lang.Integer.compare(i2, i3);
                }
            } catch (java.lang.NumberFormatException e) {
                throw new java.lang.IllegalArgumentException("Unable to convert version segments into integers: " + strArrSplit[i] + " & " + strArrSplit2[i], e);
            }
        }
        return 0;
    }

    static java.util.List<defpackage.akcm> getAllProviderInfos(android.content.Context context) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        addCronetProviderFromResourceFile(context, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED, linkedHashSet);
        org.chromium.net.impl.CronetLogger.CronetSource cronetSource = org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, 3, cronetSource, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, 3, cronetSource, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, 5, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED, linkedHashSet, false);
        if (shouldUseScoreBasedProviderSelection(context)) {
            addCronetProviderImplByClassName(context, HTTPENGINE_PROVIDER_CLASS, calculateHttpEngineNativeProviderScore(context), org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM, linkedHashSet, false);
        }
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, 1, org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK, linkedHashSet, false);
        return j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(linkedHashSet));
    }

    public static java.util.List<org.chromium.net.CronetProvider> getAllProviders(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<defpackage.akcm> it = getAllProviderInfos(context).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a);
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    private static void logReflectiveOperationException(java.lang.String str, boolean z, java.lang.Exception exc) {
        if (z) {
            defpackage.agwk.d(TAG, "Unable to load provider class: ".concat(java.lang.String.valueOf(str)), exc);
        } else {
            java.lang.String str2 = TAG;
            if (defpackage.agwk.i(str2, 3)) {
                defpackage.agwk.c(str2, defpackage.a.bp(str, "Tried to load ", " provider class but it wasn't included in the app classpath"), new java.lang.Object[0]);
            }
        }
    }

    static boolean shouldUseScoreBasedProviderSelection(android.content.Context context) {
        defpackage.akcx akcxVar = (defpackage.akcx) defpackage.agwr.b(context).X().get(USE_SCORE_BASED_PROVIDER_SELECTION_HTTP_FLAG_NAME);
        return akcxVar != null && akcxVar.b();
    }

    public abstract org.chromium.net.CronetEngine.Builder createBuilder();

    public abstract java.lang.String getName();

    public abstract java.lang.String getVersion();

    public abstract boolean isEnabled();

    public java.lang.String toString() {
        return "[class=" + getClass().getName() + ", name=" + getName() + ", version=" + getVersion() + ", enabled=" + isEnabled() + "]";
    }
}
