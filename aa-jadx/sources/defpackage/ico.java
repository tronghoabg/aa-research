package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ico implements defpackage.hxg, defpackage.hxd {
    protected final android.graphics.drawable.Drawable a;

    public ico(android.graphics.drawable.Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.hxd
    public void d() {
        android.graphics.drawable.Drawable drawable = this.a;
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof defpackage.icv) {
            ((defpackage.icv) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.hxg
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final android.graphics.drawable.Drawable c() {
        android.graphics.drawable.Drawable drawable = this.a;
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
