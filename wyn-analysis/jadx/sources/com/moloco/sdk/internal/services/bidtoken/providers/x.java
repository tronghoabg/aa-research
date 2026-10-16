package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class x implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final String f29529e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29531b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29532c;

    /* renamed from: d, reason: collision with root package name */
    public w f29533d;

    static {
        byte[] bArrDecode = Base64.decode(new byte[]{98, 87, 57, 115, 98, 50, 78, 118, 88, 50, 82, 108, 98, 87, 57, 102, 100, 71, 86, 122, 100, 71, 108, 117, 90, 119, 61, 61, 10}, 0);
        AbstractC3340k.d(bArrDecode, "decode(...)");
        f29529e = Bf.r.a0(bArrDecode);
    }

    public x(Context context) {
        String preferencesName = f29529e;
        AbstractC3340k.e(preferencesName, "preferencesName");
        this.f29530a = context;
        this.f29531b = preferencesName;
        this.f29532c = "test_config";
        this.f29533d = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.f29533d = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        w wVarD = d();
        boolean z2 = !wVarD.equals(this.f29533d);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "TCSignalProvider", "[CBT] TCS needsRefresh: " + z2 + ", current: " + wVarD.f29528a + ", cached: " + this.f29533d.f29528a, false, 4, null);
        return z2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "TCSignalProvider";
    }

    public final w d() {
        try {
            return new w(this.f29530a.getSharedPreferences(this.f29531b, 0).getString(this.f29532c, null));
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "TCSignalProvider", "[CBT] TCS Error", e7, false, 8, null);
            return new w(null);
        }
    }
}
