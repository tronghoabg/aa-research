package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class wxo extends defpackage.wvd {
    public static final /* synthetic */ int b = 0;
    public defpackage.wxm a;

    public wxo(defpackage.wxm wxmVar) {
        super(wxmVar);
        this.a = wxmVar;
    }

    public final void b(float f, float f2, float f3, float f4) {
        if (f == this.a.w.left && f2 == this.a.w.top && f3 == this.a.w.right && f4 == this.a.w.bottom) {
            return;
        }
        this.a.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.wvd, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        this.a = new defpackage.wxm(this.a);
        return this;
    }
}
