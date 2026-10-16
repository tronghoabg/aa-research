package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abgm extends defpackage.abgs {
    public final defpackage.abol a;
    public final defpackage.abgp b = new defpackage.abgp(5);
    public final defpackage.abgr c = new defpackage.abgr();
    private final defpackage.abgr d = new defpackage.abgr();

    public abgm(defpackage.abol abolVar) {
        this.a = abolVar;
    }

    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.abgs
    public final void b() {
        super.b();
        this.b.c();
        this.c.c();
        this.d.c();
    }

    @Override // defpackage.abgs
    protected final void c(int i, int i2, int i3) {
        switch (i) {
            case 1:
                this.c.f(i2, i3);
                break;
            case 2:
                this.b.d(0, i2, i3);
                break;
            case 3:
                this.b.d(1, i2, i3);
                break;
            case 4:
                this.b.d(2, i2, i3);
                break;
            case 5:
                this.d.f(i2, i3);
                break;
            case 6:
                this.b.d(3, i2, i3);
                break;
            case 7:
                this.b.d(4, i2, i3);
                break;
        }
    }
}
