package com.google.android.apps.auto.components.apphost.view.widgets.common;

/* JADX INFO: loaded from: classes2.dex */
public final class CarTextView extends android.widget.TextView {
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H.Tem");
    public defpackage.gfa a;
    private final android.view.ViewTreeObserver.OnPreDrawListener c;
    private androidx.car.app.model.CarText d;
    private defpackage.hmb e;

    public CarTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new defpackage.ffg(this, 2);
    }

    private final boolean d(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i, int i2) {
        return new android.text.StaticLayout(charSequence, 0, charSequence.length(), textPaint, i, android.text.Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true, android.text.TextUtils.TruncateAt.END, 0).getLineCount() <= i2;
    }

    public final void a(defpackage.gfa gfaVar, androidx.car.app.model.CarText carText) {
        b(gfaVar, carText, defpackage.hmb.a);
    }

    public final void b(defpackage.gfa gfaVar, androidx.car.app.model.CarText carText, defpackage.hmb hmbVar) {
        this.d = carText;
        this.e = hmbVar;
        this.a = gfaVar;
        setText(defpackage.hlc.i(gfaVar, carText, hmbVar, -1), android.widget.TextView.BufferType.NORMAL);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean c(int i) {
        defpackage.gfa gfaVar = this.a;
        if (gfaVar == null) {
            java.util.concurrent.TimeUnit.SECONDS.getClass();
            return false;
        }
        boolean zJ = ((defpackage.ggq) gfaVar.F(defpackage.ggq.class)).J();
        if (zJ || gfaVar.i().c() >= 2) {
            androidx.car.app.model.CarText carText = this.d;
            defpackage.hmb hmbVar = this.e;
            if (carText == null) {
                java.util.concurrent.TimeUnit.SECONDS.getClass();
                return false;
            }
            if (zJ && carText.getVariants().isEmpty()) {
                java.util.concurrent.TimeUnit.SECONDS.getClass();
                return false;
            }
            if (hmbVar == null) {
                java.util.concurrent.TimeUnit.SECONDS.getClass();
                return false;
            }
            android.text.TextPaint paint = getPaint();
            if (paint == null) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).l(5, java.util.concurrent.TimeUnit.SECONDS)).ai(2923)).u("Cannot get the text paint, not updating the text");
                return false;
            }
            int maxLines = getMaxLines();
            java.lang.CharSequence text = getText();
            if (text == null || !d(text, paint, i, maxLines)) {
                int size = carText.getVariants().size();
                for (int i2 = 0; i2 < size; i2++) {
                    java.lang.CharSequence charSequenceI = defpackage.hlc.i(gfaVar, carText, hmbVar, i2);
                    if (d(charSequenceI, paint, i, maxLines)) {
                        setText(charSequenceI, android.widget.TextView.BufferType.NORMAL);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.c);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.c);
        super.onDetachedFromWindow();
    }

    public CarTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarTextView(android.content.Context context) {
        this(context, null);
    }
}
