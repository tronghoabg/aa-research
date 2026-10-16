package org.chromium.net.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class CronetManifest {
    private static final java.lang.Object a = new java.lang.Object();
    private static android.content.Context b;
    private static android.os.Bundle c;

    private CronetManifest() {
    }

    public static android.os.Bundle a(android.content.Context context) {
        android.os.Bundle bundle;
        android.content.pm.ServiceInfo serviceInfo;
        android.content.Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                new defpackage.akcj("CronetManifest#getMetaData fetching info");
                try {
                    serviceInfo = applicationContext.getPackageManager().getServiceInfo(new android.content.ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
                    serviceInfo = null;
                }
                c = (serviceInfo == null || serviceInfo.metaData == null) ? new android.os.Bundle() : serviceInfo.metaData;
                b = applicationContext;
            }
            bundle = c;
        }
        return bundle;
    }

    public static boolean b(android.content.Context context, org.chromium.net.impl.CronetLogger.CronetSource cronetSource) {
        boolean z = true;
        if (cronetSource != org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM && cronetSource != org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES) {
            z = false;
        }
        return a(context).getBoolean("android.net.http.EnableTelemetry", z);
    }
}
