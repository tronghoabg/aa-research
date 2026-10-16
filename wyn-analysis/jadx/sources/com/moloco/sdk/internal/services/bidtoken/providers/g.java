package com.moloco.sdk.internal.services.bidtoken.providers;

import android.media.AudioManager;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.G;
import com.moloco.sdk.internal.services.y;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final y f29479a;

    /* renamed from: b, reason: collision with root package name */
    public f f29480b;

    public g(y audioService) {
        AbstractC3340k.e(audioService, "audioService");
        this.f29479a = audioService;
        this.f29480b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29480b = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        f fVarD = d();
        boolean z2 = !fVarD.equals(this.f29480b);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] needsRefresh: " + z2 + ", with current: " + fVarD + ", cached: " + this.f29480b, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "AudSignalProvider";
    }

    public final f d() {
        y yVar = this.f29479a;
        try {
            AudioManager audioManager = yVar.f29738a;
            Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
            G g9 = (numValueOf != null && numValueOf.intValue() == 0) ? G.f29392a : (numValueOf != null && numValueOf.intValue() == 1) ? G.f29393b : (numValueOf != null && numValueOf.intValue() == 2) ? G.f29394c : G.f29394c;
            AudioManager audioManager2 = yVar.f29738a;
            return new f(g9, Integer.valueOf(audioManager2 != null ? audioManager2.getStreamVolume(3) : 0));
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudSignalProvider", "[CBT] AS Error", e7, false, 8, null);
            return new f(null, null);
        }
    }
}
