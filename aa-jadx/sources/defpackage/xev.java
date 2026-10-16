package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xev extends defpackage.xeu {
    public int g;
    public int h;
    public int i;
    public int j;
    public defpackage.xev k;
    public final java.util.ArrayList l;

    public xev(java.lang.String str, android.graphics.drawable.Drawable drawable, int i) {
        super(str, drawable, false, i, 0);
        this.j = -1;
        this.l = new java.util.ArrayList();
    }

    @Override // defpackage.xeu
    public final boolean d() {
        return true;
    }

    public final int g() {
        return this.l.size();
    }

    public final defpackage.xeu h(int i) {
        return (defpackage.xeu) this.l.get(i);
    }

    @Override // defpackage.xeu
    public final defpackage.xev a() {
        return this;
    }
}
