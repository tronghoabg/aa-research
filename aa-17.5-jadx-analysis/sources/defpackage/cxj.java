package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class cxj implements ctq {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Map c;
    final /* synthetic */ afec d;
    final /* synthetic */ afec e;
    final /* synthetic */ cxk f;

    public cxj(int i, int i2, Map map, afec afecVar, afec afecVar2, cxk cxkVar) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = afecVar;
        this.e = afecVar2;
        this.f = cxkVar;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.a;
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.c;
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.d;
    }

    @Override // defpackage.ctq
    public final void h() {
        this.e.invoke(this.f.n);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void j() {
    }
}
