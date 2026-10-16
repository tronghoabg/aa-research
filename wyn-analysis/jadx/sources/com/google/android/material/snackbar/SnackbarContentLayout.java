package com.google.android.material.snackbar;

import Ba.c;
import J7.a;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wynauto.wyn.R;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f27009a;

    /* renamed from: b, reason: collision with root package name */
    public Button f27010b;

    /* renamed from: c, reason: collision with root package name */
    public int f27011c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c.K(context, R.attr.motionEasingEmphasizedInterpolator, a.f5720b);
    }

    public final boolean a(int i5, int i10, int i11) {
        boolean z2;
        if (i5 != getOrientation()) {
            setOrientation(i5);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f27009a.getPaddingTop() == i10 && this.f27009a.getPaddingBottom() == i11) {
            return z2;
        }
        TextView textView = this.f27009a;
        WeakHashMap weakHashMap = S.f38779a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f27010b;
    }

    public TextView getMessageView() {
        return this.f27009a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f27009a = (TextView) findViewById(R.id.snackbar_text);
        this.f27010b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i10) throws Resources.NotFoundException {
        super.onMeasure(i5, i10);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f27009a.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f27011c <= 0 || this.f27010b.getMeasuredWidth() <= this.f27011c) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i5, i10);
    }

    public void setMaxInlineActionWidth(int i5) {
        this.f27011c = i5;
    }
}
