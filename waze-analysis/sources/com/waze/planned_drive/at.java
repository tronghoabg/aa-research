package com.waze.planned_drive;

import androidx.activity.OnBackPressedCallback;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ay f33205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(ay ayVar) {
        super(true);
        this.f33205a = ayVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        ay ayVar = this.f33205a;
        ayVar.I().a(bh.f33246c);
        ayVar.G().c();
    }
}
