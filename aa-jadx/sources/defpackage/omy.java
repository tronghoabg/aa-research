package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class omy extends defpackage.ifg {
    public boolean b;
    final /* synthetic */ com.google.android.apps.auto.components.ui.image.CrossfadeImageView c;
    private android.graphics.Bitmap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omy(com.google.android.apps.auto.components.ui.image.CrossfadeImageView crossfadeImageView) {
        super(crossfadeImageView);
        this.c = crossfadeImageView;
    }

    @Override // defpackage.iew, defpackage.ifd
    public final void b(android.graphics.drawable.Drawable drawable) {
        this.c.c(null);
    }

    @Override // defpackage.ifd
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, defpackage.ifm ifmVar) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        this.d = bitmap.copy(bitmap.getConfig(), false);
        i();
    }

    public final void i() {
        android.graphics.Bitmap bitmap;
        if (this.b || (bitmap = this.d) == null) {
            return;
        }
        this.c.c(bitmap);
    }
}
