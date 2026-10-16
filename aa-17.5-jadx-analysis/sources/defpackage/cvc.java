package defpackage;

/* loaded from: classes.dex */
public final class cvc {
    public final cvf a;
    public ctl b;
    public final afeg c;
    public final afeg d;
    public final afeg e;

    public cvc(cvf cvfVar) {
        this.a = cvfVar;
        this.c = new cuz(this, 0);
        this.d = new cuz(this, 2);
        this.e = new cuz(this, 3);
    }

    public final ctl a() {
        ctl ctlVar = this.b;
        if (ctlVar != null) {
            return ctlVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public cvc() {
        this(cty.a);
    }
}
