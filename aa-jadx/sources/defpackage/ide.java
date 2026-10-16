package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ide implements defpackage.idf {
    private final defpackage.hxn a;
    private final defpackage.idf b;
    private final defpackage.idf c;

    public ide(defpackage.hxn hxnVar, defpackage.idf idfVar, defpackage.idf idfVar2) {
        this.a = hxnVar;
        this.b = idfVar;
        this.c = idfVar2;
    }

    @Override // defpackage.idf
    public final defpackage.hxg a(defpackage.hxg hxgVar, defpackage.huw huwVar) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) hxgVar.c();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return this.b.a(defpackage.ibw.g(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap(), this.a), huwVar);
        }
        if (drawable instanceof defpackage.icv) {
            return this.c.a(hxgVar, huwVar);
        }
        return null;
    }
}
