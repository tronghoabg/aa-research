package com.waze.reports;

import androidx.activity.OnBackPressedCallback;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cj extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cm f33778a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cj(cm cmVar) {
        super(true);
        Objects.requireNonNull(cmVar);
        this.f33778a = cmVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        cm.k(this.f33778a);
    }
}
