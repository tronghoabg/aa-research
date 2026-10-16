package com.waze.install;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class au extends OnBackPressedCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(SelectCountryActivity selectCountryActivity) {
        super(true);
        Objects.requireNonNull(selectCountryActivity);
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
    }
}
