package com.waze.network.c;

import com.waze.NativeManager;
import com.waze.sdk.SdkConfiguration;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f32172a;

    public b(NativeManager nativeManager) {
        x.f(nativeManager, "nativeManager");
        this.f32172a = nativeManager;
    }

    @Override // com.waze.network.c.a
    public final String a() {
        return SdkConfiguration.getExternalAppPackageName(2);
    }

    @Override // com.waze.network.c.a
    public final String b() {
        return SdkConfiguration.getExternalAppPackageName(1);
    }

    @Override // com.waze.network.c.a
    public final boolean c() {
        return this.f32172a.isCsvSimulatorActive();
    }
}
