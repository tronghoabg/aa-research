package com.waze.car_lib.screens.core;

import androidx.activity.OnBackPressedCallback;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScreenPresentable f21961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ScreenPresentable screenPresentable) {
        super(true);
        this.f21961a = screenPresentable;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.f21961a.onBackPressed();
    }
}
