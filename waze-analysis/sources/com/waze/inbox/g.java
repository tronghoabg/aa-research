package com.waze.inbox;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f24643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(i iVar) {
        super(true);
        Objects.requireNonNull(iVar);
        this.f24643a = iVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        i.p();
    }
}
