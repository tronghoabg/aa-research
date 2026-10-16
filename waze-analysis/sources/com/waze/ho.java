package com.waze;

import com.waze.navigate.NavigationInfoNativeManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ho implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f24400a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f24401b;

    ho(NativeManager nativeManager, boolean z, boolean z2) {
        this.f24400a = z;
        this.f24401b = z2;
        Objects.requireNonNull(nativeManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        NavigationInfoNativeManager navigationInfoNativeManager = NavigationInfoNativeManager.getInstance();
        com.waze.sdk.bd.d();
        navigationInfoNativeManager.onEtaScreenNavDataReceived(new com.waze.main_screen.bottom_bars.scrollable_eta.i(this.f24400a, this.f24401b, com.waze.sdk.bd.R()));
    }
}
