package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sev extends android.graphics.drawable.BitmapDrawable {
    public sev(android.content.res.Resources resources, int i) {
        super(resources, android.graphics.BitmapFactory.decodeResource(resources, i));
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        canvas.save();
        canvas.translate(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (-(canvas.getHeight() / 2)) + (getIntrinsicHeight() / 2));
        super.draw(canvas);
        canvas.restore();
    }
}
