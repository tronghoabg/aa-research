package defpackage;

/* loaded from: classes2.dex */
public final class rqs extends rqx {
    public yxc a;
    public yxy b;
    public xxh c;
    public xxh d;
    public xxh e;
    private final xxh f;
    private final xxh g;
    private final xxh h;
    private yfq i;
    private ygp j;
    private ygr k;

    public rqs() {
        xvy xvyVar = xvy.a;
        this.f = xvyVar;
        this.g = xvyVar;
        this.h = xvyVar;
        this.c = xvyVar;
        this.d = xvyVar;
        this.e = xvyVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy b() {
        yxy yxyVar;
        if (this.i == null) {
            int i = yfq.d;
            this.i = yls.a;
        }
        ygp ygpVar = this.j;
        if (ygpVar != null) {
            this.k = ygpVar.g();
        } else if (this.k == null) {
            this.k = yly.a;
        }
        yxc yxcVar = this.a;
        if (yxcVar != null && (yxyVar = this.b) != null) {
            return new rqt(yxcVar, yxyVar, this.f, this.g, this.h, this.i, this.k, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" carEventType");
        }
        if (this.b == null) {
            sb.append(" domainIdType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rqx
    protected final ygp c() {
        if (this.j == null) {
            if (this.k == null) {
                this.j = new ygp();
            } else {
                ygp ygpVar = new ygp();
                this.j = ygpVar;
                ygpVar.k(this.k);
                this.k = null;
            }
        }
        return this.j;
    }
}
