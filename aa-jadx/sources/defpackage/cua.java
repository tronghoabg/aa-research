package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cua implements defpackage.ctz {
    final /* synthetic */ int a;
    final /* synthetic */ defpackage.cub b;
    final /* synthetic */ defpackage.affc c;
    private final int d;
    private final int e;
    private final java.util.Map f;
    private final defpackage.affc g;

    public cua(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.cub cubVar, defpackage.affc affcVar2) {
        this.a = i;
        this.b = cubVar;
        this.c = affcVar2;
        this.d = i;
        this.e = i2;
        this.f = map;
        this.g = affcVar;
    }

    @Override // defpackage.ctz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ctz
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ctz
    public final java.util.Map f() {
        return this.f;
    }

    @Override // defpackage.ctz
    public final defpackage.affc g() {
        return this.g;
    }

    @Override // defpackage.ctz
    public final void h() {
        defpackage.cub cubVar = this.b;
        this.c.invoke(new defpackage.cve(this.a, cubVar.p(), cubVar.a(), cubVar.b()));
    }

    @Override // defpackage.ctz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ctz
    public final /* synthetic */ void j() {
    }
}
