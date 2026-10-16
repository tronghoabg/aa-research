package com.qonversion.android.sdk.internal;

import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class QHandledPurchasesCache_Factory implements InterfaceC2432a {
    private static final QHandledPurchasesCache_Factory INSTANCE = new QHandledPurchasesCache_Factory();

    public static QHandledPurchasesCache_Factory create() {
        return INSTANCE;
    }

    public static QHandledPurchasesCache newInstance() {
        return new QHandledPurchasesCache();
    }

    @Override // df.InterfaceC2432a
    public QHandledPurchasesCache get() {
        return new QHandledPurchasesCache();
    }
}
