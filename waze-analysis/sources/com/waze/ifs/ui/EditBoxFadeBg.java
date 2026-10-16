package com.waze.ifs.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.waze.view.text.WazeEditText;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class EditBoxFadeBg extends WazeEditText {

    /* renamed from: b, reason: collision with root package name */
    private boolean f24462b;

    public EditBoxFadeBg(Context context) {
        super(context);
        b();
    }

    private final void b() {
        getBackground().setAlpha(89);
        this.f24462b = false;
        setGravity(19);
        addTextChangedListener(new f(this, 1));
    }

    @Override // com.waze.sharedui.views.WazeEditTextBase, android.widget.TextView, android.view.View
    protected final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.f24462b != z) {
            this.f24462b = z;
            if (!isShown()) {
                getBackground().setAlpha(true == this.f24462b ? 255 : 89);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(200L);
            valueAnimator.setInterpolator(new LinearInterpolator());
            if (this.f24462b) {
                valueAnimator.setIntValues(89, 255);
            } else {
                valueAnimator.setIntValues(255, 89);
            }
            valueAnimator.addUpdateListener(new aa(this, 1));
            valueAnimator.start();
        }
    }

    public EditBoxFadeBg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public EditBoxFadeBg(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b();
    }
}
