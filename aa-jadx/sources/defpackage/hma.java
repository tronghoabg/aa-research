package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hma {
    public boolean b;
    public android.graphics.Rect c;
    public int d;
    public boolean g;
    public defpackage.gib a = defpackage.gib.c;
    public int e = 0;
    public int f = 2;

    public final defpackage.hmb a() {
        if (this.c != null || this.d <= 0) {
            return new defpackage.hmb(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        throw new java.lang.IllegalStateException("A bounding box needs to be provided if images are allowed in the text");
    }
}
