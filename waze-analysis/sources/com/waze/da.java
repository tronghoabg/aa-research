package com.waze;

import com.waze.planned_drive.PlannedDriveFragment;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class da implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23276b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f23277c;

    da(NativeManager nativeManager, int i2, int i3) {
        this.f23277c = i3;
        this.f23275a = i2;
        Objects.requireNonNull(nativeManager);
        this.f23276b = nativeManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23277c;
        if (i2 == 0) {
            ((MainActivity) this.f23276b).q.setVisibility(this.f23275a);
            return;
        }
        if (i2 == 1) {
            ((NativeManager) this.f23276b).getPopupsBridgeCompat().d(this.f23275a);
            return;
        }
        if (i2 == 2) {
            PlannedDriveFragment.c((PlannedDriveFragment) this.f23276b, this.f23275a);
            return;
        }
        int i3 = this.f23275a;
        if (i2 != 3) {
            ((com.waze.view.navbar.p) this.f23276b).f45106a.getDecorView().setSystemUiVisibility(i3);
        } else {
            com.waze.sdk.an.V((com.waze.sdk.an) this.f23276b, i3);
        }
    }

    public /* synthetic */ da(Object obj, int i2, int i3) {
        this.f23277c = i3;
        this.f23276b = obj;
        this.f23275a = i2;
    }
}
