package org.chromium.net.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import defpackage.akbj;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes2.dex */
public final class CronetManifest {
    private static final Object a = new Object();
    private static Context b;
    private static Bundle c;

    private CronetManifest() {
    }

    public static Bundle a(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                new akbj("CronetManifest#getMetaData fetching info");
                try {
                    serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                c = (serviceInfo == null || serviceInfo.metaData == null) ? new Bundle() : serviceInfo.metaData;
                b = applicationContext;
            }
            bundle = c;
        }
        return bundle;
    }

    public static boolean b(Context context, CronetLogger.CronetSource cronetSource) {
        boolean z = true;
        if (cronetSource != CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM && cronetSource != CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES) {
            z = false;
        }
        return a(context).getBoolean("android.net.http.EnableTelemetry", z);
    }
}
