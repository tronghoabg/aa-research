package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityManager f29517a;

    /* renamed from: b, reason: collision with root package name */
    public q f29518b;

    public r(ActivityManager activityManager) {
        AbstractC3340k.e(activityManager, "activityManager");
        this.f29517a = activityManager;
        this.f29518b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] Updating m state", false, 4, null);
        this.f29518b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        q qVarD = d();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] cached lm: " + this.f29518b.f29514a + ", t: " + this.f29518b.f29515b + ", tm: " + this.f29518b.f29516c, false, 4, null);
        StringBuilder sb2 = new StringBuilder("[CBT] current lm: ");
        Boolean bool = qVarD.f29514a;
        sb2.append(bool);
        sb2.append(", t: ");
        Long l10 = qVarD.f29515b;
        sb2.append(l10);
        sb2.append(", tm: ");
        Long l11 = qVarD.f29516c;
        sb2.append(l11);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", sb2.toString(), false, 4, null);
        q qVar = this.f29518b;
        boolean z2 = (AbstractC3340k.a(bool, qVar.f29514a) && AbstractC3340k.a(l10, qVar.f29515b) && AbstractC3340k.a(l11, qVar.f29516c)) ? false : true;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] m needsRefresh: " + z2, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "MemorySignalProvider";
    }

    public final q d() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.f29517a.getMemoryInfo(memoryInfo);
            return new q(Boolean.valueOf(memoryInfo.lowMemory), Long.valueOf(memoryInfo.threshold), Long.valueOf(memoryInfo.totalMem));
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] MI Error", e7, false, 8, null);
            return new q(null, null, null);
        }
    }
}
