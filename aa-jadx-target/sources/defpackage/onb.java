package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class onb extends defpackage.iey {
    final /* synthetic */ defpackage.onf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onb(defpackage.onf onfVar) {
        super(128, 128);
        this.a = onfVar;
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        int i = defpackage.onf.h;
        defpackage.onf onfVar = this.a;
        onfVar.k = false;
        defpackage.tgg.a.d(onfVar.b, 3);
    }

    @Override // defpackage.iey
    public final void b(android.graphics.drawable.Drawable drawable) {
        int i = defpackage.onf.h;
        defpackage.onf onfVar = this.a;
        onfVar.k = false;
        defpackage.tgg.a.d(onfVar.b, 2);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, ifm ifmVar) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int i = defpackage.onf.h;
        bitmap.getAllocationByteCount();
        bitmap.getWidth();
        bitmap.getHeight();
        defpackage.onf onfVar = this.a;
        onfVar.k = false;
        onfVar.d = bitmap;
        defpackage.tgg.a.d(onfVar.b, 1);
        onfVar.c.a(bitmap);
    }
}
