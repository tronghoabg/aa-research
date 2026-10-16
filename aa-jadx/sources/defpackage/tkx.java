package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tkx extends defpackage.tky {
    private final int b;

    public tkx(android.content.Context context, defpackage.tkv tkvVar, int i, int i2) {
        super(context, tkvVar, java.lang.Integer.valueOf(i));
        this.b = i2;
    }

    @Override // defpackage.tky
    protected final android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable drawable) {
        int i = this.b;
        return new android.graphics.drawable.InsetDrawable(drawable, i, i, i, i);
    }
}
