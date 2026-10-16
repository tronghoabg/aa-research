package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class csb implements ctq {
    final /* synthetic */ afec a;
    final /* synthetic */ csc b;
    private final int c;
    private final int d;
    private final Map e;
    private final afec f;

    public csb(int i, int i2, Map map, afec afecVar, afec afecVar2, csc cscVar) {
        this.a = afecVar2;
        this.b = cscVar;
        this.c = i;
        this.d = i2;
        this.e = map;
        this.f = afecVar;
    }

    @Override // defpackage.ctq
    public final int b() {
        return this.d;
    }

    @Override // defpackage.ctq
    public final int c() {
        return this.c;
    }

    @Override // defpackage.ctq
    public final Map f() {
        return this.e;
    }

    @Override // defpackage.ctq
    public final afec g() {
        return this.f;
    }

    @Override // defpackage.ctq
    public final void h() {
        this.a.invoke(this.b.a.n);
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ctq
    public final /* synthetic */ void j() {
    }
}
