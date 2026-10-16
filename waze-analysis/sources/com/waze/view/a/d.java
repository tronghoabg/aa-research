package com.waze.view.a;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f44946a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar) {
        super(true);
        Objects.requireNonNull(fVar);
        this.f44946a = fVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        f.e(this.f44946a);
    }
}
