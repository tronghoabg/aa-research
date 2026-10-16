package com.google.android.gms.carsetup.frx;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;

/* loaded from: classes2.dex */
public class FrxUtil$1 extends UnderlineSpan {
    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
