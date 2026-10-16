package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ctr implements ctq {
    final /* synthetic */ int a;
    final /* synthetic */ cts b;
    final /* synthetic */ afec c;
    private final int d;
    private final int e;
    private final Map f;
    private final afec g;

    public ctr(int i, int i2, Map map, afec afecVar, cts ctsVar, afec afecVar2) {
        this.a = i;
        this.b = ctsVar;
        this.c = afecVar2;
        this.d = i;
        this.e = i2;
        this.f = map;
        this.g = afecVar;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.f;
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.g;
    }

    @Override // defpackage.ctq
    public final void h() {
        cts ctsVar = this.b;
        this.c.invoke(new cuv(this.a, ctsVar.p(), ctsVar.a(), ctsVar.b()));
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void j() {
    }
}
