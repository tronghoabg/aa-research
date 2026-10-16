package com.waze.app_nav.hub.service;

import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f15377a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar) {
        super(true);
        this.f15377a = dVar;
        ai.m(ai.K(dVar.f15378a, new b(this, null)), LifecycleOwnerKt.getLifecycleScope(dVar));
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.f15377a.c();
    }
}
