package com.waze.menus;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SideMenuSearchBar f29692a;

    ab(SideMenuSearchBar sideMenuSearchBar) {
        Objects.requireNonNull(sideMenuSearchBar);
        this.f29692a = sideMenuSearchBar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        SideMenuSearchBar sideMenuSearchBar = this.f29692a;
        if (TextUtils.isEmpty(sideMenuSearchBar.f29625a.getText())) {
            sideMenuSearchBar.s();
        } else {
            SideMenuSearchBar.f(sideMenuSearchBar);
        }
        if (sideMenuSearchBar.f29631g != null) {
            sideMenuSearchBar.f29631g.c(sideMenuSearchBar.f29625a.getText().toString());
        }
    }
}
