package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dgt extends defpackage.dgs {
    private final java.lang.CharSequence a;
    private final android.text.TextPaint b;

    public dgt(java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    @Override // defpackage.dgs
    public final int a(int i) {
        android.text.TextPaint textPaint = this.b;
        java.lang.CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.dgs
    public final int d(int i) {
        android.text.TextPaint textPaint = this.b;
        java.lang.CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
