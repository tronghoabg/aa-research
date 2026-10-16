package com.google.android.apps.auto.components.apphost.view.widgets.common;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.car.app.model.CarText;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.fez;
import defpackage.geu;
import defpackage.ggk;
import defpackage.hlb;
import defpackage.hlv;
import defpackage.ype;
import defpackage.yph;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class CarTextView extends TextView {
    private static final yph b = yph.c("CarApp.H.Tem");
    public geu a;
    private final ViewTreeObserver.OnPreDrawListener c;
    private CarText d;
    private hlv e;

    public CarTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new fez(this, 2);
    }

    private final boolean d(CharSequence charSequence, TextPaint textPaint, int i, int i2) {
        return new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true, TextUtils.TruncateAt.END, 0).getLineCount() <= i2;
    }

    public final void a(geu geuVar, CarText carText) {
        b(geuVar, carText, hlv.a);
    }

    public final void b(geu geuVar, CarText carText, hlv hlvVar) {
        this.d = carText;
        this.e = hlvVar;
        this.a = geuVar;
        setText(hlb.e(geuVar, carText, hlvVar, -1), TextView.BufferType.NORMAL);
    }

    @ResultIgnorabilityUnspecified
    public final boolean c(int i) {
        geu geuVar = this.a;
        if (geuVar == null) {
            TimeUnit.SECONDS.getClass();
            return false;
        }
        boolean zI = ((ggk) geuVar.F(ggk.class)).I();
        if (zI || geuVar.i().c() >= 2) {
            CarText carText = this.d;
            hlv hlvVar = this.e;
            if (carText == null) {
                TimeUnit.SECONDS.getClass();
                return false;
            }
            if (zI && carText.getVariants().isEmpty()) {
                TimeUnit.SECONDS.getClass();
                return false;
            }
            if (hlvVar == null) {
                TimeUnit.SECONDS.getClass();
                return false;
            }
            TextPaint paint = getPaint();
            if (paint == null) {
                ((ype) ((ype) ((ype) b.h()).l(5, TimeUnit.SECONDS)).ai(2920)).u("Cannot get the text paint, not updating the text");
                return false;
            }
            int maxLines = getMaxLines();
            CharSequence text = getText();
            if (text == null || !d(text, paint, i, maxLines)) {
                int size = carText.getVariants().size();
                for (int i2 = 0; i2 < size; i2++) {
                    CharSequence charSequenceE = hlb.e(geuVar, carText, hlvVar, i2);
                    if (d(charSequenceE, paint, i, maxLines)) {
                        setText(charSequenceE, TextView.BufferType.NORMAL);
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

    public CarTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CarTextView(Context context) {
        this(context, null);
    }
}
