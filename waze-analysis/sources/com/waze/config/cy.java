package com.waze.config;

import android.text.Editable;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cy implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DebugConfigListActivity f22598a;

    cy(DebugConfigListActivity debugConfigListActivity) {
        Objects.requireNonNull(debugConfigListActivity);
        this.f22598a = debugConfigListActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        DebugConfigListActivity.m(this.f22598a, editable.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
