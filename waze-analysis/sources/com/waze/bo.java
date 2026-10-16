package com.waze;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bo implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ EditBox f17165a;

    bo(EditBox editBox) {
        Objects.requireNonNull(editBox);
        this.f17165a = editBox;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        EditBox editBox = this.f17165a;
        if (i2 != editBox.f13547b) {
            return false;
        }
        boolean zOnKeyDown = editBox.onKeyDown(66, new KeyEvent(0, 66));
        if (editBox.f13548c) {
            return zOnKeyDown;
        }
        ((InputMethodManager) editBox.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editBox.getWindowToken(), 0);
        return zOnKeyDown;
    }
}
