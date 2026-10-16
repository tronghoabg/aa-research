package com.waze;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class de implements com.waze.sdk.be {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f23281a;

    de(MainActivity mainActivity) {
        Objects.requireNonNull(mainActivity);
        this.f23281a = mainActivity;
    }

    @Override // com.waze.sdk.be
    public final PackageManager a() {
        return this.f23281a.getPackageManager();
    }

    @Override // com.waze.sdk.be
    public final Resources b() {
        return this.f23281a.getResources();
    }

    @Override // com.waze.sdk.be
    public final boolean c() {
        return this.f23281a.aK();
    }
}
