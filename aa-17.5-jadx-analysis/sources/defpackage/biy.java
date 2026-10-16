package defpackage;

/* loaded from: classes.dex */
public final class biy {
    public final long a;
    public final bld b;
    public final long c;
    public bjd d = bjd.a;
    public final cfy e;
    public awx f;
    private final bca g;

    public biy(long j, bld bldVar, long j2) {
        this.a = j;
        this.b = bldVar;
        this.c = j2;
        bca bcaVar = new bca();
        this.g = bcaVar;
        this.e = tl.i(new biz(bldVar, j, new bih(this, 3)).a(new bby(bcaVar)), cqq.b);
    }

    public final void a() {
        this.f = this.b.i();
    }

    public final void b() {
        if (this.f != null) {
            this.b.h();
            this.f = null;
        }
    }

    public final void c(azp azpVar) {
        this.d = bjd.a(this.d, null, null, azpVar, 3);
    }
}
