package com.qonversion.android.sdk;

import com.qonversion.android.sdk.Qonversion;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    static {
        Qonversion.Companion companion = Qonversion.INSTANCE;
    }

    public static Qonversion a() {
        return Qonversion.INSTANCE.getSharedInstance();
    }

    public static Qonversion b(QonversionConfig qonversionConfig) {
        return Qonversion.INSTANCE.initialize(qonversionConfig);
    }
}
