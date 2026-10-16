package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;

/* loaded from: classes4.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29475a;

    /* renamed from: b, reason: collision with root package name */
    public d f29476b = new d(d());

    public e(Context context) {
        this.f29475a = context;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29476b = new d(d());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        Long lD = d();
        boolean z2 = !new d(lD).equals(this.f29476b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ADISignalProvider", "[CBT] ADI needsRefresh: " + z2 + ", with adi: " + lD, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "ADISignalProvider";
    }

    public final Long d() {
        try {
            return Long.valueOf(this.f29475a.getFilesDir().getTotalSpace());
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ADISignalProvider", "ADI Error", e7, false, 8, null);
            return null;
        }
    }
}
