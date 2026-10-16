package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class ac {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f6825a;

    /* renamed from: b, reason: collision with root package name */
    final ab f6826b;

    /* renamed from: c, reason: collision with root package name */
    final Context f6827c;

    /* renamed from: d, reason: collision with root package name */
    final CheckableImageButton f6828d;

    ac(ab abVar) {
        this.f6825a = abVar.f6813a;
        this.f6826b = abVar;
        this.f6827c = abVar.getContext();
        this.f6828d = abVar.h();
    }

    final void A() {
        this.f6826b.t(false);
    }

    void B() {
    }

    AccessibilityManager.TouchExplorationStateChangeListener H() {
        return null;
    }

    int a() {
        return 0;
    }

    int b() {
        return 0;
    }

    View.OnClickListener c() {
        return null;
    }

    View.OnFocusChangeListener d() {
        return null;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    void h(EditText editText) {
    }

    void i(boolean z) {
    }

    void j() {
    }

    void k() {
    }

    void m() {
    }

    boolean p(int i2) {
        return true;
    }

    boolean q() {
        return false;
    }

    boolean r() {
        return false;
    }

    boolean s() {
        return false;
    }

    boolean t() {
        return false;
    }

    boolean u() {
        return false;
    }

    void y(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    void z(AccessibilityEvent accessibilityEvent) {
    }
}
