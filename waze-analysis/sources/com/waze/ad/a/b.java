package com.waze.ad.a;

import androidx.activity.OnBackPressedCallback;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b extends OnBackPressedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13883a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f13884b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(String str, h.g.a.a aVar) {
        super(true);
        this.f13883a = str;
        this.f13884b = aVar;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public final void handleOnBackPressed() {
        com.waze.shared_infra.i.h.a(this.f13883a);
        this.f13884b.invoke();
    }
}
