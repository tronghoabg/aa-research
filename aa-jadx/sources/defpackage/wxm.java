package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wxm extends defpackage.wvb {
    public final android.graphics.RectF w;

    public wxm(defpackage.wxm wxmVar) {
        super(wxmVar);
        this.w = wxmVar.w;
    }

    @Override // defpackage.wvb, android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        int i = defpackage.wxo.b;
        defpackage.wxn wxnVar = new defpackage.wxn(this);
        wxnVar.invalidateSelf();
        return wxnVar;
    }

    public wxm(defpackage.wvi wviVar, android.graphics.RectF rectF) {
        super(wviVar);
        this.w = rectF;
    }
}
