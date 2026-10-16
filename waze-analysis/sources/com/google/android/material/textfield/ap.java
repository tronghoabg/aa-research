package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    int f6877a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f6878b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TextInputLayout f6879c;

    ap(TextInputLayout textInputLayout, EditText editText) {
        this.f6878b = editText;
        Objects.requireNonNull(textInputLayout);
        this.f6879c = textInputLayout;
        this.f6877a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f6879c;
        textInputLayout.L(!textInputLayout.aA);
        if (textInputLayout.f6798b) {
            textInputLayout.I(editable);
        }
        if (textInputLayout.v) {
            textInputLayout.ar(editable);
        }
        EditText editText = this.f6878b;
        int lineCount = editText.getLineCount();
        int i2 = this.f6877a;
        if (lineCount != i2) {
            if (lineCount < i2) {
                int minimumHeight = editText.getMinimumHeight();
                int i3 = textInputLayout.f6799c;
                if (minimumHeight != i3) {
                    editText.setMinimumHeight(i3);
                }
            }
            this.f6877a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
