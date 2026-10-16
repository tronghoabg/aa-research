package com.waze.settings;

import androidx.activity.OnBackPressedCallback;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class db extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dc f37015a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cs f37016b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    db(dc dcVar, cs csVar) {
        super(true);
        this.f37015a = dcVar;
        this.f37016b = csVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        if (this.f37015a.w().a().C()) {
            return;
        }
        this.f37016b.b(0);
    }
}
