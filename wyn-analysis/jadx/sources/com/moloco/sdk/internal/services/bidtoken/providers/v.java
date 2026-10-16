package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Moloco;

/* loaded from: classes4.dex */
public final class v implements j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29527a;

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29527a = Moloco.isInitialized();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        StringBuilder sb2;
        boolean z2 = this.f29527a;
        boolean zIsInitialized = Moloco.isInitialized();
        boolean z10 = z2 != zIsInitialized;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        if (z10) {
            sb2 = new StringBuilder("[CBT] sdkInitialized updated from ");
            sb2.append(z2);
            sb2.append(" to ");
            sb2.append(zIsInitialized);
        } else {
            sb2 = new StringBuilder("[CBT] sdkInitialized didn't change (before: ");
            sb2.append(z2);
            sb2.append(", after: ");
            sb2.append(zIsInitialized);
            sb2.append(')');
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, "SDKInitStateSignalProvider", sb2.toString(), false, 4, null);
        return z10;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "SDKInitStateSignalProvider";
    }
}
