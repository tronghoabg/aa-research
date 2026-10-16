package defpackage;

/* loaded from: classes.dex */
public final class lhj extends eqj {
    public static final lhh a = new lhh();
    public static final afgl h = new kkp(mki.b, 10);
    private boolean i;
    private final lhi j;

    public lhj() {
        super(false);
        this.j = new lhi(this);
    }

    @Override // defpackage.eqj
    protected final void c() {
        if (this.i) {
            return;
        }
        ((lhm) mki.a.i(lhm.class)).gL(this.j, true);
        this.i = true;
    }
}
