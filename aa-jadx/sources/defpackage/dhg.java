package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dhg extends android.text.style.CharacterStyle {
    private final int a;
    private final float b;
    private final float c;
    private final float d;

    public dhg(int i, float f, float f2, float f3) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
