package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes5.dex */
public final class t extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final InputMethodManager f37158a;

    public t(Context context, InputMethodManager inputMethodManager) {
        super(context);
        this.f37158a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return new t(super.createDisplayContext(display), this.f37158a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return "input_method".equals(str) ? this.f37158a : super.getSystemService(str);
    }
}
