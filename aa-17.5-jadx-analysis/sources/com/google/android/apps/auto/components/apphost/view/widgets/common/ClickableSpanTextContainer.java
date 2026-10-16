package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.jtu;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ClickableSpanTextContainer extends FrameLayout implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final List a;
    public TextView b;
    private final ForegroundColorSpan c;
    private final BackgroundColorSpan d;
    private int e;
    private boolean f;

    public ClickableSpanTextContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new ArrayList();
        this.e = -1;
        this.f = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateClickableSpanHighlightForegroundColor, R.attr.templateClickableSpanHighlightBackgroundColor});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.c = new ForegroundColorSpan(color);
        this.d = new BackgroundColorSpan(color2);
    }

    private final void a() {
        Spannable spannable = (Spannable) this.b.getText();
        if (spannable == null) {
            return;
        }
        int i = this.e;
        if (i == -1) {
            Selection.removeSelection(spannable);
            spannable.removeSpan(this.c);
            spannable.removeSpan(this.d);
        } else {
            ClickableSpan clickableSpan = (ClickableSpan) this.a.get(i);
            int spanStart = spannable.getSpanStart(clickableSpan);
            int spanEnd = spannable.getSpanEnd(clickableSpan);
            Selection.setSelection(spannable, spanStart, spanEnd);
            spannable.setSpan(this.c, spanStart, spanEnd, 33);
            spannable.setSpan(this.d, spanStart, spanEnd, 33);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.clickable_span_text_view);
        this.b = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.b.setHighlightColor(0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        int i;
        if (view2 == null) {
            Spannable spannable = (Spannable) this.b.getText();
            if (spannable != null) {
                spannable.removeSpan(this.c);
                spannable.removeSpan(this.d);
                return;
            }
            return;
        }
        if (view == null) {
            a();
            return;
        }
        int iC = jtu.c(view, view2);
        if (view2.equals(this.b)) {
            if (this.f) {
                this.f = false;
            } else {
                List list = this.a;
                if (iC == 33) {
                    this.e = list.isEmpty() ? -1 : (-1) + list.size();
                } else {
                    this.e = true != list.isEmpty() ? 0 : -1;
                }
            }
            a();
            return;
        }
        if (!view.equals(this.b) || (i = this.e) == -1) {
            return;
        }
        if (iC == 33) {
            if (i > 0) {
                this.e = i - 1;
                this.f = true;
                this.b.requestFocus();
                return;
            }
        } else if (iC == 130 && i < this.a.size() - 1) {
            this.e++;
            this.f = true;
            this.b.requestFocus();
            return;
        }
        this.e = -1;
        a();
    }

    public ClickableSpanTextContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClickableSpanTextContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ClickableSpanTextContainer(Context context) {
        this(context, null);
    }
}
