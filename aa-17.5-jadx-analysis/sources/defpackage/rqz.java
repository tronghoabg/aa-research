package defpackage;

/* loaded from: classes2.dex */
public final class rqz extends rqx {
    public yxc a;
    public yxy b;
    public yxo c;
    public int d;
    private final xxh e;
    private final xxh f;
    private final xxh g;
    private yfq h;
    private ygp i;
    private ygr j;

    public rqz() {
        xvy xvyVar = xvy.a;
        this.e = xvyVar;
        this.f = xvyVar;
        this.g = xvyVar;
    }

    @Override // defpackage.rqx
    protected final /* bridge */ /* synthetic */ rqy b() {
        yxy yxyVar;
        yxo yxoVar;
        int i;
        if (this.h == null) {
            int i2 = yfq.d;
            this.h = yls.a;
        }
        ygp ygpVar = this.i;
        if (ygpVar != null) {
            this.j = ygpVar.g();
        } else if (this.j == null) {
            this.j = yly.a;
        }
        yxc yxcVar = this.a;
        if (yxcVar != null && (yxyVar = this.b) != null && (yxoVar = this.c) != null && (i = this.d) != 0) {
            return new rra(yxcVar, yxyVar, this.e, this.f, this.g, this.h, this.j, yxoVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" carEventType");
        }
        if (this.b == null) {
            sb.append(" domainIdType");
        }
        if (this.c == null) {
            sb.append(" detectorType");
        }
        if (this.d == 0) {
            sb.append(" troubleshooterEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rqx
    protected final ygp c() {
        if (this.i == null) {
            if (this.j == null) {
                this.i = new ygp();
            } else {
                ygp ygpVar = new ygp();
                this.i = ygpVar;
                ygpVar.k(this.j);
                this.j = null;
            }
        }
        return this.i;
    }
}
