package com.qonversion.android.sdk.automations.internal;

import android.app.Application;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class ActivityProvider_Factory implements InterfaceC2432a {
    private final InterfaceC2432a applicationProvider;

    public ActivityProvider_Factory(InterfaceC2432a interfaceC2432a) {
        this.applicationProvider = interfaceC2432a;
    }

    public static ActivityProvider_Factory create(InterfaceC2432a interfaceC2432a) {
        return new ActivityProvider_Factory(interfaceC2432a);
    }

    public static ActivityProvider newInstance(Application application) {
        return new ActivityProvider(application);
    }

    @Override // df.InterfaceC2432a
    public ActivityProvider get() {
        return new ActivityProvider((Application) this.applicationProvider.get());
    }
}
