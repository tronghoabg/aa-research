package com.waze.sdk;

import com.waze.navigate.NavigationInfoNativeManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f35232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f35233b;

    al(an anVar, boolean z) {
        this.f35232a = z;
        Objects.requireNonNull(anVar);
        this.f35233b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        an anVar = this.f35233b;
        anVar.f35245l = this.f35232a;
        boolean z = false;
        if (anVar.f35245l && an.ac(anVar)) {
            z = true;
        }
        NavigationInfoNativeManager navigationInfoNativeManager = NavigationInfoNativeManager.getInstance();
        if (navigationInfoNativeManager == null) {
            com.waze.shared_infra.i.h.c("WazeSdk: Can't set/unset listener, NavigationInfoNativeManager is null...");
        } else if (z) {
            com.waze.shared_infra.i.h.a("WazeSdk: Listening to navigation data for ".concat(String.valueOf(anVar.f35234a)));
            navigationInfoNativeManager.addNavigationUpdateListener(anVar);
        } else {
            com.waze.shared_infra.i.h.a("WazeSdk: Stop listening to navigation data for ".concat(String.valueOf(anVar.f35234a)));
            navigationInfoNativeManager.removeNavigationUpdateListener(anVar);
        }
    }
}
