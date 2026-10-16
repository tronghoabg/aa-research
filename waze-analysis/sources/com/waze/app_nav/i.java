package com.waze.app_nav;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ca;
import com.waze.planned_drive.PlannedDriveFragment;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements ca {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15415a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15416b;

    public /* synthetic */ i(Object obj, int i2) {
        this.f15416b = i2;
        this.f15415a = obj;
    }

    @Override // android.support.v4.app.ca
    public final void onFragmentResult(String str, Bundle bundle) {
        int i2 = this.f15416b;
        if (i2 == 0) {
            j.a((j) this.f15415a, bundle);
            return;
        }
        if (i2 == 1) {
            PlannedDriveFragment.x((PlannedDriveFragment) this.f15415a, bundle);
        } else if (bundle.getBoolean("PlannedDriveFragmentResultValue", false)) {
            new Handler(Looper.getMainLooper()).postDelayed(new com.waze.ads.f(this.f15415a, 16), 500L);
        }
    }
}
