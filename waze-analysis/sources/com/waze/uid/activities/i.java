package com.waze.uid.activities;

import androidx.activity.OnBackPressedCallback;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UidFragmentActivity f44095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(UidFragmentActivity uidFragmentActivity) {
        super(true);
        this.f44095a = uidFragmentActivity;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.f44095a.f().o(new com.waze.uid.b.c());
    }
}
