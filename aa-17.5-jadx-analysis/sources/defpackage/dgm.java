package defpackage;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class dgm extends dgl {
    private final CharSequence a;
    private final TextPaint b;

    public dgm(CharSequence charSequence, TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    @Override // defpackage.dgl
    public final int a(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.dgl
    public final int d(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
