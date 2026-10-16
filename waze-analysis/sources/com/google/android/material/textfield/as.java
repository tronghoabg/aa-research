package com.google.android.material.textfield;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class as extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f6881a;

    public as(TextInputLayout textInputLayout) {
        this.f6881a = textInputLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        TextInputLayout textInputLayout = this.f6881a;
        EditText editText = textInputLayout.f6797a;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence charSequenceN = textInputLayout.n();
        CharSequence charSequenceM = textInputLayout.m();
        CharSequence charSequenceL = textInputLayout.l();
        CharSequence charSequenceO = textInputLayout.o();
        int iB = textInputLayout.b();
        CharSequence charSequenceK = textInputLayout.k();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequenceN);
        boolean zR = textInputLayout.R();
        boolean zIsEmpty3 = TextUtils.isEmpty(charSequenceL);
        boolean z = !zIsEmpty3;
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(charSequenceK)) ? false : true;
        String string = !zIsEmpty2 ? charSequenceN.toString() : "";
        if (!TextUtils.isEmpty(charSequenceM) && textInputLayout.o.w()) {
            if (TextUtils.isEmpty(string)) {
                string = charSequenceM.toString();
            } else {
                string = string + ", " + String.valueOf(charSequenceM);
            }
        }
        textInputLayout.f6802g.j(accessibilityNodeInfoCompat);
        if (!zIsEmpty) {
            accessibilityNodeInfoCompat.setText(text);
        } else if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfoCompat.setText(string);
            if (!zR && charSequenceO != null) {
                accessibilityNodeInfoCompat.setText(string + ", " + charSequenceO.toString());
            }
        } else if (charSequenceO != null) {
            accessibilityNodeInfoCompat.setText(charSequenceO);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfoCompat.setHintText(string);
            accessibilityNodeInfoCompat.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != iB) {
            iB = -1;
        }
        accessibilityNodeInfoCompat.setMaxTextLength(iB);
        if (z2) {
            if (true != z) {
                charSequenceL = charSequenceK;
            }
            accessibilityNodeInfoCompat.setError(charSequenceL);
        }
        textInputLayout.f6803h.i().y(accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        this.f6881a.f6803h.i().z(accessibilityEvent);
    }
}
