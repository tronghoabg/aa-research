package com.waze.navigate;

import android.text.Editable;
import android.text.TextWatcher;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ak implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AutocompleteSearchActivity f30994a;

    ak(AutocompleteSearchActivity autocompleteSearchActivity) {
        Objects.requireNonNull(autocompleteSearchActivity);
        this.f30994a = autocompleteSearchActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        AutocompleteSearchActivity autocompleteSearchActivity = this.f30994a;
        autocompleteSearchActivity.f30919f.a();
        autocompleteSearchActivity.z(a.a.y(editable.toString()));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f30994a.z(a.a.y(charSequence.toString()));
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int length = charSequence.length();
        AutocompleteSearchActivity autocompleteSearchActivity = this.f30994a;
        if (length == 0) {
            autocompleteSearchActivity.f30919f.setTextSize(1, 20.0f);
        } else {
            autocompleteSearchActivity.f30919f.setTextSize(1, 20.0f);
        }
        this.f30994a.z(a.a.y(charSequence.toString()));
    }
}
