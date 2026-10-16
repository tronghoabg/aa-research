package com.waze.reports;

import android.text.Editable;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dc implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f33828a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ di f33829b;

    dc(di diVar, int i2) {
        this.f33828a = i2;
        Objects.requireNonNull(diVar);
        this.f33829b = diVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f33829b.t.setText(String.format("%d/%d", Integer.valueOf(editable.length()), Integer.valueOf(this.f33828a)));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
