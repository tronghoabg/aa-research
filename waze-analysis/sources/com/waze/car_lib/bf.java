package com.waze.car_lib;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf implements com.waze.sdk.be {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f19180a;

    bf(Context context) {
        this.f19180a = context;
    }

    @Override // com.waze.sdk.be
    public final PackageManager a() {
        PackageManager packageManager = this.f19180a.getPackageManager();
        h.g.b.x.e(packageManager, "getPackageManager(...)");
        return packageManager;
    }

    @Override // com.waze.sdk.be
    public final Resources b() {
        Resources resources = this.f19180a.getResources();
        h.g.b.x.e(resources, "getResources(...)");
        return resources;
    }

    @Override // com.waze.sdk.be
    public final boolean c() {
        return true;
    }
}
