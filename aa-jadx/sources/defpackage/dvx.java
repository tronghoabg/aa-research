package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dvx extends defpackage.dvy {
    @Override // defpackage.dvy
    public final void a(int i, int i2, int i3, android.graphics.Rect rect, android.graphics.Rect rect2) {
        android.view.Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        b();
        outline.setRoundRect(this.e, this.d);
    }
}
