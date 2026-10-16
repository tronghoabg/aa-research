package defpackage;

/* loaded from: classes3.dex */
public final class abfj extends abfp {
    public final abnj a;
    public final abfm b = new abfm(4);
    public final abfo c = new abfo();
    private final abfo d = new abfo();

    public abfj(abnj abnjVar) {
        this.a = abnjVar;
    }

    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.abfp
    public final void b() {
        super.b();
        this.b.c();
        this.c.c();
        this.d.c();
    }

    @Override // defpackage.abfp
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
        }
    }
}
