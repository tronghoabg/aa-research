package defpackage;

/* loaded from: classes2.dex */
public final class rqk extends rqx {
    public yxc a;
    public yxy b;
    public xxh c;
    public long d;
    public byte e;
    public int f;
    private final xxh g;
    private final xxh h;
    private yfq i;
    private ygp j;
    private ygr k;

    public rqk() {
        xvy xvyVar = xvy.a;
        this.c = xvyVar;
        this.g = xvyVar;
        this.h = xvyVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy a(rqy rqyVar) {
        rql rqlVar = (rql) rqyVar;
        super.a(rqlVar);
        long j = rqlVar.a;
        woy.ac(j >= 0, "Invalid timeSinceBootMillis: %s", j);
        return rqlVar;
    }

    @Override // defpackage.rqx
    protected final /* bridge */ /* synthetic */ rqy b() {
        yxc yxcVar;
        yxy yxyVar;
        int i;
        if (this.i == null) {
            int i2 = yfq.d;
            this.i = yls.a;
        }
        ygp ygpVar = this.j;
        if (ygpVar != null) {
            this.k = ygpVar.g();
        } else if (this.k == null) {
            this.k = yly.a;
        }
        if (this.e == 1 && (yxcVar = this.a) != null && (yxyVar = this.b) != null && (i = this.f) != 0) {
            return new rql(yxcVar, yxyVar, this.c, this.g, this.h, this.i, this.k, i, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" carEventType");
        }
        if (this.b == null) {
            sb.append(" domainIdType");
        }
        if (this.f == 0) {
            sb.append(" connectionType");
        }
        if (this.e == 0) {
            sb.append(" timeSinceBootMillis");
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
