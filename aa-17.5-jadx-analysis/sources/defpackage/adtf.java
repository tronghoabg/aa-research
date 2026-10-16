package defpackage;

/* loaded from: classes.dex */
final class adtf implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public adtf(Object obj, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            ((adti) this.b).f.g(this.a);
        } else {
            if (i == 1) {
                ((adtc) this.b).g.m(this.a);
                return;
            }
            int i2 = this.a;
            if (i != 2) {
                ((adti) this.b).f.l(i2);
            } else {
                ((adti) this.b).f.k(i2);
            }
        }
    }
}
