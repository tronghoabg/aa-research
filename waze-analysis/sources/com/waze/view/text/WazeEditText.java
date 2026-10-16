package com.waze.view.text;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.waze.sharedui.views.WazeEditTextBase;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class WazeEditText extends WazeEditTextBase {

    /* renamed from: b, reason: collision with root package name */
    private boolean f45373b;

    public WazeEditText(Context context) {
        super(context);
        this.f45373b = true;
    }

    public final void a() {
        this.f45373b = false;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i2, int i3) {
        Editable text;
        if (this.f45373b || (text = getText()) == null || (i2 == text.length() && i3 == text.length())) {
            super.onSelectionChanged(i2, i3);
        } else {
            setSelection(text.length(), text.length());
        }
    }

    @Override // com.waze.sharedui.views.WazeEditTextBase, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }

    public WazeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45373b = true;
    }

    public WazeEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f45373b = true;
    }
}
