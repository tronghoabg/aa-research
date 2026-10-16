package com.waze.sharedui.views;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CheckBoxView f39235a;

    e(CheckBoxView checkBoxView) {
        Objects.requireNonNull(checkBoxView);
        this.f39235a = checkBoxView;
    }

    @Override // com.waze.sharedui.views.g
    final void a() {
        CheckBoxView checkBoxView = this.f39235a;
        checkBoxView.f39127d.setVisibility(checkBoxView.f39128e == 2 ? 4 : 0);
    }
}
