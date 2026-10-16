package defpackage;

/* loaded from: classes3.dex */
public final class admx extends adqs {
    private final adjq a;
    private final adqs b;

    public admx(adqs adqsVar, adjq adjqVar) {
        this();
        this.b = adqsVar;
        this.a = adjqVar;
    }

    @Override // defpackage.adqs
    public final void b() {
        adjq adjqVarA = this.a.a();
        try {
            this.b.b();
        } finally {
            this.a.f(adjqVarA);
        }
    }

    @Override // defpackage.adqs
    public final void c() {
        adjq adjqVarA = this.a.a();
        try {
            this.b.c();
        } finally {
            this.a.f(adjqVarA);
        }
    }

    @Override // defpackage.adqs
    public final void d() {
        adjq adjqVarA = this.a.a();
        try {
            this.b.d();
        } finally {
            this.a.f(adjqVarA);
        }
    }

    @Override // defpackage.adqs
    public final void e(Object obj) {
        adjq adjqVarA = this.a.a();
        try {
            this.b.e(obj);
        } finally {
            this.a.f(adjqVarA);
        }
    }

    @Override // defpackage.adqs
    public final void f() {
        adjq adjqVarA = this.a.a();
        try {
            this.b.f();
        } finally {
            this.a.f(adjqVarA);
        }
    }

    protected final adqs g() {
        return this.b;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", g());
        return xxgVarAo.toString();
    }

    public admx() {
        super(null, null);
    }
}
