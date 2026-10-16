package defpackage;

/* loaded from: classes3.dex */
public final class ajie {
    public ajib a;
    public int b;
    public String c;
    public ajhu d;
    public ajih e;
    public ajob f;
    public ajif g;
    public ajif h;
    public long i;
    public long j;
    public ajik k;
    public scz l;
    public erb m;
    private ajid n;

    public ajie(ajif ajifVar) {
        this.b = -1;
        this.e = ajih.c;
        this.k = ajik.a;
        this.n = ajifVar.a;
        this.a = ajifVar.b;
        this.b = ajifVar.d;
        this.c = ajifVar.c;
        this.d = ajifVar.e;
        this.m = ahdw.j(ajifVar.f);
        this.e = ajifVar.g;
        this.f = ajifVar.h;
        this.g = ajifVar.i;
        this.h = ajifVar.j;
        this.i = ajifVar.k;
        this.j = ajifVar.l;
        this.l = ajifVar.p;
        this.k = ajifVar.m;
    }

    public final ajif a() {
        int i = this.b;
        if (i < 0) {
            throw new IllegalStateException(a.bp(i, "code < 0: "));
        }
        ajid ajidVar = this.n;
        if (ajidVar == null) {
            throw new IllegalStateException("request == null");
        }
        ajib ajibVar = this.a;
        if (ajibVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.c;
        if (str != null) {
            return new ajif(ajidVar, ajibVar, str, i, this.d, ahdw.k(this.m), this.e, this.f, this.g, this.h, this.i, this.j, this.l, this.k);
        }
        throw new IllegalStateException("message == null");
    }

    public final void b(ajhv ajhvVar) {
        this.m = ahdw.j(ajhvVar);
    }

    public final void c(ajid ajidVar) {
        ajidVar.getClass();
        this.n = ajidVar;
    }

    public ajie() {
        this.b = -1;
        this.e = ajih.c;
        this.k = ajik.a;
        this.m = new erb((byte[]) null, (short[]) null);
    }
}
