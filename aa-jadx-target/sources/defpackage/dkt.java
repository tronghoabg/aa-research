package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkt extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final java.lang.Object a;
    private final /* synthetic */ int b;

    public dkt(defpackage.dai daiVar, int i) {
        this.b = i;
        this.a = daiVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint textPaint) {
        if (this.b == 0) {
            throw null;
        }
        if (textPaint != null) {
            if (!defpackage.afga.f(this.a, defpackage.cmn.a)) {
                throw new defpackage.afas();
            }
            textPaint.setStyle(android.graphics.Paint.Style.FILL);
        }
    }
}
