package com.waze.rtalerts;

import android.text.Editable;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RtAlertsComments f35123a;

    h(RtAlertsComments rtAlertsComments) {
        Objects.requireNonNull(rtAlertsComments);
        this.f35123a = rtAlertsComments;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f35123a.v();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
