package com.waze.bt;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f17460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(f fVar) {
        super(true);
        Objects.requireNonNull(fVar);
        this.f17460a = fVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.f17460a.i(0, null);
    }
}
