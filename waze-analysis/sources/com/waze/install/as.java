package com.waze.install;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class as extends OnBackPressedCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(LocationFailedActivity locationFailedActivity) {
        super(true);
        Objects.requireNonNull(locationFailedActivity);
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
    }
}
