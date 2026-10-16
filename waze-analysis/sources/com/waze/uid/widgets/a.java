package com.waze.uid.widgets;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.waze.sharedui.views.WazeEditTextBase;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class a extends WazeEditTextBase {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44802b;

    public a(Context context) {
        super(context);
        this.f44802b = true;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i2, int i3) {
        Editable text;
        if (this.f44802b || (text = getText()) == null || (i2 == text.length() && i3 == text.length())) {
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

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44802b = true;
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f44802b = true;
    }
}
