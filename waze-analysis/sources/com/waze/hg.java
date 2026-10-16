package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class hg implements hq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeManager f24378a;

    hg(NativeManager nativeManager) {
        Objects.requireNonNull(nativeManager);
        this.f24378a = nativeManager;
    }

    @Override // com.waze.hq
    public final void a(boolean z) {
        this.f24378a.shouldDisplayGasSettings = z;
    }
}
