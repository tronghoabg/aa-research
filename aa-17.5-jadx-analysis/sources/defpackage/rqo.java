package defpackage;

/* loaded from: classes.dex */
public final class rqo extends rqx {
    public yxc a;
    public yxy b;
    public xxh c;
    public int d;
    public xxh e;
    public int f;
    public xxh g;
    public xxh h;
    public byte i;
    private final xxh j;
    private final xxh k;
    private yfq l;
    private ygp m;
    private ygr n;
    private final xxh o;

    public rqo() {
        xvy xvyVar = xvy.a;
        this.c = xvyVar;
        this.j = xvyVar;
        this.k = xvyVar;
        this.o = xvyVar;
        this.e = xvyVar;
        this.g = xvyVar;
        this.h = xvyVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy a(rqy rqyVar) {
        rqp rqpVar = (rqp) rqyVar;
        super.a(rqpVar);
        int i = rqpVar.d;
        woy.ab(i >= 0, "Invalid eventIndex: %s", i);
        int i2 = rqpVar.b;
        woy.ab(i2 != yxi.UNKNOWN.pC, "Invalid connectionEventType: ", i2);
        xxh xxhVar = rqpVar.c;
        if (xxhVar.f()) {
            woy.ad(((Long) xxhVar.b()).longValue() >= 0, "Invalid timeSinceBootMillis: %s", xxhVar.b());
        }
        return rqpVar;
    }

    @Override // defpackage.rqx
    protected final /* synthetic */ rqy b() {
        yxc yxcVar;
        yxy yxyVar;
        if (this.l == null) {
            int i = yfq.d;
            this.l = yls.a;
        }
        ygp ygpVar = this.m;
        if (ygpVar != null) {
            this.n = ygpVar.g();
        } else if (this.n == null) {
            this.n = yly.a;
        }
        if (this.i == 3 && (yxcVar = this.a) != null && (yxyVar = this.b) != null) {
            return new rqp(yxcVar, yxyVar, this.c, this.j, this.k, this.l, this.n, this.d, this.o, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" carEventType");
        }
        if (this.b == null) {
            sb.append(" domainIdType");
        }
        if ((this.i & 1) == 0) {
            sb.append(" connectionEventType");
        }
        if ((this.i & 2) == 0) {
            sb.append(" eventIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rqx
    protected final ygp c() {
        if (this.m == null) {
            if (this.n == null) {
                this.m = new ygp();
            } else {
                ygp ygpVar = new ygp();
                this.m = ygpVar;
                ygpVar.k(this.n);
                this.n = null;
            }
        }
        return this.m;
    }
}
