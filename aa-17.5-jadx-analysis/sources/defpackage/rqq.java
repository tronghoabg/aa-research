package defpackage;

/* loaded from: classes2.dex */
public final class rqq extends rqx {
    public yxc a;
    public yxy b;
    public xxh c;
    public yxk d;
    public long e;
    public byte f;
    public int g;
    public int h;
    private final xxh i;
    private final xxh j;
    private yfq k;
    private ygp l;
    private ygr m;

    public rqq() {
        xvy xvyVar = xvy.a;
        this.c = xvyVar;
        this.i = xvyVar;
        this.j = xvyVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy a(rqy rqyVar) {
        rqr rqrVar = (rqr) rqyVar;
        super.a(rqrVar);
        long j = rqrVar.a;
        woy.ac(j >= 0, "Invalid timeSinceBootMillis: %s", j);
        return rqrVar;
    }

    @Override // defpackage.rqx
    protected final /* bridge */ /* synthetic */ rqy b() {
        yxc yxcVar;
        yxy yxyVar;
        int i;
        int i2;
        yxk yxkVar;
        if (this.k == null) {
            int i3 = yfq.d;
            this.k = yls.a;
        }
        ygp ygpVar = this.l;
        if (ygpVar != null) {
            this.m = ygpVar.g();
        } else if (this.m == null) {
            this.m = yly.a;
        }
        if (this.f == 1 && (yxcVar = this.a) != null && (yxyVar = this.b) != null && (i = this.g) != 0 && (i2 = this.h) != 0 && (yxkVar = this.d) != null) {
            return new rqr(yxcVar, yxyVar, this.c, this.i, this.j, this.k, this.m, i, i2, yxkVar, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" carEventType");
        }
        if (this.b == null) {
            sb.append(" domainIdType");
        }
        if (this.g == 0) {
            sb.append(" toState");
        }
        if (this.h == 0) {
            sb.append(" fromState");
        }
        if (this.d == null) {
            sb.append(" event");
        }
        if (this.f == 0) {
            sb.append(" timeSinceBootMillis");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rqx
    protected final ygp c() {
        if (this.l == null) {
            if (this.m == null) {
                this.l = new ygp();
            } else {
                ygp ygpVar = new ygp();
                this.l = ygpVar;
                ygpVar.k(this.m);
                this.m = null;
            }
        }
        return this.l;
    }
}
