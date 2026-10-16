package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oec extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public int a = 0;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setAlpha(this.a);
    }
}
