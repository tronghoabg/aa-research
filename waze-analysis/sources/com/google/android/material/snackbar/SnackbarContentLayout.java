package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f6739a;

    /* renamed from: b, reason: collision with root package name */
    private Button f6740b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f6741c;

    /* renamed from: d, reason: collision with root package name */
    private int f6742d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6741c = com.google.android.material.k.f.d(context, R.attr.motionEasingEmphasizedInterpolator, com.google.android.material.a.a.f6174b);
    }

    private final boolean f(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f6739a.getPaddingTop() == i3 && this.f6739a.getPaddingBottom() == i4) {
            return z;
        }
        TextView textView = this.f6739a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        }
        return true;
    }

    public final TextView a() {
        return this.f6739a;
    }

    public final void b(int i2, int i3) {
        this.f6739a.setAlpha(0.0f);
        long j2 = i3;
        ViewPropertyAnimator duration = this.f6739a.animate().alpha(1.0f).setDuration(j2);
        TimeInterpolator timeInterpolator = this.f6741c;
        long j3 = i2;
        duration.setInterpolator(timeInterpolator).setStartDelay(j3).start();
        if (this.f6740b.getVisibility() == 0) {
            this.f6740b.setAlpha(0.0f);
            this.f6740b.animate().alpha(1.0f).setDuration(j2).setInterpolator(timeInterpolator).setStartDelay(j3).start();
        }
    }

    public final void c(int i2) {
        this.f6742d = i2;
    }

    final void d(float f2) {
        if (f2 != 1.0f) {
            this.f6740b.setTextColor(com.google.android.material.focus.d.d(com.google.android.material.focus.d.b(this, R.attr.colorSurface), this.f6740b.getCurrentTextColor(), f2));
        }
    }

    public final void e(int i2) {
        this.f6739a.setAlpha(1.0f);
        long j2 = i2;
        ViewPropertyAnimator duration = this.f6739a.animate().alpha(0.0f).setDuration(j2);
        TimeInterpolator timeInterpolator = this.f6741c;
        duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
        if (this.f6740b.getVisibility() == 0) {
            this.f6740b.setAlpha(1.0f);
            this.f6740b.animate().alpha(0.0f).setDuration(j2).setInterpolator(timeInterpolator).setStartDelay(0L).start();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f6739a = (TextView) findViewById(R.id.snackbar_text);
        this.f6740b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        super.onMeasure(i2, i3);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f6739a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f6742d <= 0 || this.f6740b.getMeasuredWidth() <= this.f6742d) {
            if (true != z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!f(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!f(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i2, i3);
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }
}
