package com.waze.settings;

import androidx.activity.OnBackPressedCallback;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class as extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ba f36790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(ba baVar) {
        super(true);
        this.f36790a = baVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.f36790a.X();
    }
}
