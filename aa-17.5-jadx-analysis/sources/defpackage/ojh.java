package defpackage;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class ojh extends oji {
    final /* synthetic */ oky a;
    final /* synthetic */ ojj b;
    private final ojn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojh(ojj ojjVar, oky okyVar) {
        super(ojjVar);
        this.a = okyVar;
        this.b = ojjVar;
        this.d = ojjVar.a();
    }

    @Override // defpackage.ojn
    public final xxh a() {
        return this.d.a();
    }

    @Override // defpackage.ojn
    public final String b() {
        return this.a.g;
    }

    @Override // defpackage.ojn
    public final String c() {
        return this.a.h;
    }

    @Override // defpackage.ojn
    public final boolean d() {
        return this.a.j || this.d.d();
    }

    @Override // defpackage.ojn
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.ojn
    public final int f() {
        int iAt = a.at(this.a.i);
        if (iAt == 0) {
            return 1;
        }
        return iAt;
    }

    @Override // defpackage.ojn
    public final int g() {
        return this.d.g();
    }

    @Override // defpackage.ojn
    public final int h() {
        return this.d.h();
    }

    @Override // defpackage.ojn
    public final xxh i() {
        return this.d.i();
    }

    @Override // defpackage.ojn
    public final xxh j() {
        return this.d.j();
    }

    @Override // defpackage.ojn
    public final xxh k() {
        oky okyVar = this.a;
        return (okyVar.b & 1) != 0 ? xxh.h(UUID.fromString(okyVar.c)) : xvy.a;
    }

    @Override // defpackage.ojn
    public final xxh l() {
        return this.d.l();
    }

    @Override // defpackage.ojn
    public final xxh m() {
        return this.d.m();
    }

    @Override // defpackage.ojn
    public final xxh n() {
        oky okyVar = this.a;
        return (okyVar.b & 256) != 0 ? xxh.h(okyVar.k) : xvy.a;
    }

    @Override // defpackage.ojn
    public final String o() {
        return this.d.o();
    }
}
