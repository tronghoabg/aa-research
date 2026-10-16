package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yu {
    public android.graphics.drawable.Drawable a;
    public final /* synthetic */ androidx.cardview.widget.CardView b;

    public yu(androidx.cardview.widget.CardView cardView) {
        this.b = cardView;
    }

    public final void a(int i, int i2, int i3, int i4) {
        androidx.cardview.widget.CardView cardView = this.b;
        cardView.d.set(i, i2, i3, i4);
        android.graphics.Rect rect = cardView.c;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public final boolean b() {
        return this.b.b;
    }

    public final boolean c() {
        return this.b.a;
    }
}
