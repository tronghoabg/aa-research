package com.waze.sharedui.views;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak extends am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeSwitchView f39213a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f39214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(WazeSwitchView wazeSwitchView, int i2) {
        super(wazeSwitchView);
        this.f39214b = i2;
        Objects.requireNonNull(wazeSwitchView);
        this.f39213a = wazeSwitchView;
    }

    @Override // com.waze.sharedui.views.am
    final void a() {
        WazeSwitchView.e(this.f39213a, this.f39214b);
    }
}
