package com.waze.planned_drive;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class x extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlannedDriveFragment f33373a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(PlannedDriveFragment plannedDriveFragment) {
        super(true);
        Objects.requireNonNull(plannedDriveFragment);
        this.f33373a = plannedDriveFragment;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        PlannedDriveFragment.s(this.f33373a);
    }
}
