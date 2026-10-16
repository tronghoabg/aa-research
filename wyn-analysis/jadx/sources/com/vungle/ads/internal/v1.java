package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class v1 {
    public final ServiceLocator a(Context context) {
        ServiceLocator serviceLocator;
        AbstractC3340k.e(context, "context");
        ServiceLocator serviceLocator2 = ServiceLocator.INSTANCE;
        if (serviceLocator2 != null) {
            return serviceLocator2;
        }
        synchronized (this) {
            serviceLocator = ServiceLocator.INSTANCE;
            if (serviceLocator == null) {
                serviceLocator = new ServiceLocator(context, 0);
                ServiceLocator.INSTANCE = serviceLocator;
            }
        }
        return serviceLocator;
    }
}
