package com.google.android.setupcompat.template;

/* JADX INFO: loaded from: classes3.dex */
public class FooterActionButton extends android.widget.Button {
    public FooterActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }
}
