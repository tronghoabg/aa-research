package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes.dex */
public final class dkl extends CharacterStyle implements UpdateAppearance {
    public final Object a;
    private final /* synthetic */ int b;

    public dkl(czz czzVar, int i) {
        this.b = i;
        this.a = czzVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.b == 0) {
            throw null;
        }
        if (textPaint != null) {
            if (!affa.f(this.a, cmf.a)) {
                throw new aezs();
            }
            textPaint.setStyle(Paint.Style.FILL);
        }
    }
}
