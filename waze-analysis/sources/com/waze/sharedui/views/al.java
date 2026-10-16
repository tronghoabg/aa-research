package com.waze.sharedui.views;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeSwitchView f39215a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f39216b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(WazeSwitchView wazeSwitchView, int i2) {
        super(wazeSwitchView);
        this.f39216b = i2;
        Objects.requireNonNull(wazeSwitchView);
        this.f39215a = wazeSwitchView;
    }

    @Override // com.waze.sharedui.views.am
    final void a() {
        WazeSwitchView.f(this.f39215a, this.f39216b);
    }
}
