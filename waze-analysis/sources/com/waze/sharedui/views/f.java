package com.waze.sharedui.views;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBoxView f39236a;

    f(CheckBoxView checkBoxView) {
        Objects.requireNonNull(checkBoxView);
        this.f39236a = checkBoxView;
    }

    @Override // com.waze.sharedui.views.g
    final void a() {
        CheckBoxView checkBoxView = this.f39236a;
        checkBoxView.f39126c.setVisibility(checkBoxView.f39128e == 2 ? 4 : 0);
    }
}
