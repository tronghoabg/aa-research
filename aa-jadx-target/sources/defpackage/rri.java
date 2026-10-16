package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rri extends defpackage.rrr {
    public defpackage.yyh a;
    public defpackage.yzd b;
    public defpackage.xyn c;
    public int d;
    public defpackage.xyn e;
    public int f;
    public defpackage.xyn g;
    public defpackage.xyn h;
    public byte i;
    private final defpackage.xyn j;
    private final defpackage.xyn k;
    private defpackage.ygw l;
    private defpackage.yhv m;
    private defpackage.yhx n;
    private final defpackage.xyn o;

    public rri() {
        defpackage.xxe xxeVar = defpackage.xxe.a;
        this.c = xxeVar;
        this.j = xxeVar;
        this.k = xxeVar;
        this.o = xxeVar;
        this.e = xxeVar;
        this.g = xxeVar;
        this.h = xxeVar;
    }

    @Override // defpackage.rrr
    protected final /* synthetic */ defpackage.rrs a(defpackage.rrs rrsVar) {
        defpackage.rrj rrjVar = (defpackage.rrj) rrsVar;
        super.a(rrjVar);
        int i = rrjVar.d;
        defpackage.ysr.bl(i >= 0, "Invalid eventIndex: %s", i);
        int i2 = rrjVar.b;
        defpackage.ysr.bl(i2 != defpackage.yyn.UNKNOWN.pE, "Invalid connectionEventType: ", i2);
        defpackage.xyn xynVar = rrjVar.c;
        if (xynVar.f()) {
            defpackage.ysr.bn(((java.lang.Long) xynVar.b()).longValue() >= 0, "Invalid timeSinceBootMillis: %s", xynVar.b());
        }
        return rrjVar;
    }

    @Override // defpackage.rrr
    protected final /* synthetic */ defpackage.rrs b() {
        defpackage.yyh yyhVar;
        defpackage.yzd yzdVar;
        if (this.l == null) {
            int i = defpackage.ygw.d;
            this.l = defpackage.ymx.a;
        }
        defpackage.yhv yhvVar = this.m;
        if (yhvVar != null) {
            this.n = yhvVar.g();
        } else if (this.n == null) {
            this.n = defpackage.ynd.a;
        }
        if (this.i == 3 && (yyhVar = this.a) != null && (yzdVar = this.b) != null) {
            return new defpackage.rrj(yyhVar, yzdVar, this.c, this.j, this.k, this.l, this.n, this.d, this.o, this.e, this.f, this.g, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.rrr
    protected final defpackage.yhv c() {
        if (this.m == null) {
            if (this.n == null) {
                this.m = new defpackage.yhv();
            } else {
                defpackage.yhv yhvVar = new defpackage.yhv();
                this.m = yhvVar;
                yhvVar.k(this.n);
                this.n = null;
            }
        }
        return this.m;
    }
}
