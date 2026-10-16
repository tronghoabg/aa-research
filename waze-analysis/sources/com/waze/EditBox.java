package com.waze;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.waze.sharedui.views.WazeEditTextBase;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class EditBox extends WazeEditTextBase {

    /* renamed from: b, reason: collision with root package name */
    private int f13547b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13548c;

    /* renamed from: d, reason: collision with root package name */
    private bp f13549d;

    /* renamed from: e, reason: collision with root package name */
    private String f13550e;

    public EditBox(Context context, int i2, boolean z, String str, bp bpVar) {
        super(context);
        this.f13547b = 0;
        this.f13548c = false;
        this.f13549d = null;
        this.f13550e = null;
        c(context);
        this.f13547b = i2;
        setImeOptions(getImeOptions() | this.f13547b);
        this.f13548c = z;
        this.f13550e = str;
        setText(str);
        this.f13549d = bpVar;
    }

    protected final void b() {
        bp bpVar = this.f13549d;
        if (bpVar != null) {
            bpVar.a(true, getText().toString());
        }
    }

    protected final void c(Context context) {
        if (context instanceof MainActivity) {
        }
        setSingleLine();
        setFocusableInTouchMode(true);
        setInputType(65537);
        setTag("@WazeEditBox");
        setOnEditorActionListener(new bo(this));
    }

    @Override // android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 && keyEvent.getAction() != 2) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4) {
            if (keyCode != 66) {
                return false;
            }
            b();
            return true;
        }
        bp bpVar = this.f13549d;
        if (bpVar != null) {
            bpVar.a(false, null);
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onCheckIsTextEditor() {
        return true;
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 66) {
            return super.onKeyDown(i2, keyEvent);
        }
        b();
        return true;
    }

    public EditBox(Context context) {
        super(context);
        this.f13547b = 0;
        this.f13548c = false;
        this.f13549d = null;
        this.f13550e = null;
        c(context);
    }

    public EditBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13547b = 0;
        this.f13548c = false;
        this.f13549d = null;
        this.f13550e = null;
        c(context);
    }
}
