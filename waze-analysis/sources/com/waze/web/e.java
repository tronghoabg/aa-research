package com.waze.web;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f45487a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(i iVar) {
        super(true);
        Objects.requireNonNull(iVar);
        this.f45487a = iVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        if (this.f45487a.f45494a.I()) {
            return;
        }
        i.s();
    }
}
