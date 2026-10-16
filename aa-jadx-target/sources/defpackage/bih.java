package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bih extends defpackage.cwo implements defpackage.czc {
    public defpackage.dkg a;
    public defpackage.dkd b;
    public defpackage.beg c;
    public boolean d;
    public defpackage.djv e;
    public defpackage.blw f;
    public defpackage.djl g;
    public defpackage.cit h;

    public bih(defpackage.dkg dkgVar, defpackage.dkd dkdVar, defpackage.beg begVar, boolean z, defpackage.djv djvVar, defpackage.blw blwVar, defpackage.djl djlVar, defpackage.cit citVar) {
        this.a = dkgVar;
        this.b = dkdVar;
        this.c = begVar;
        this.d = z;
        this.e = djvVar;
        this.f = blwVar;
        this.g = djlVar;
        this.h = citVar;
        blwVar.f = new defpackage.bfd(this, 15);
    }

    public static final void b(defpackage.beg begVar, java.lang.String str, boolean z) {
        if (z) {
            defpackage.fbl fblVar = begVar.u;
            if (fblVar != null) {
                defpackage.asq.V(defpackage.afga.ac(new defpackage.djd(), new defpackage.djb(str, 1)), begVar.s, begVar.m, fblVar);
                return;
            }
            defpackage.affc affcVar = begVar.m;
            int length = str.length();
            long jG = defpackage.dax.g(length, length);
            long j = defpackage.dgc.a;
            affcVar.invoke(new defpackage.dkd(str, jG, 4));
        }
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
        dekVar.a(defpackage.def.G, this.b.a);
        dekVar.a(defpackage.def.H, this.a.a);
        dekVar.a(defpackage.def.I, new defpackage.dgc(this.b.b));
        dekVar.a(defpackage.def.s, defpackage.cgr.b);
        dekVar.a(defpackage.def.t, new defpackage.cgo(a$.ExternalSyntheticApiModelOutline1.m(defpackage.vz.f(this.b.a))));
        dekVar.a(defpackage.ddy.h, new defpackage.ddn(null, new defpackage.bge(this, 12)));
        int i = this.g.e;
        int i2 = 4;
        if (defpackage.a.X(1, 6)) {
            int i3 = cgt.b;
            defpackage.dbb.h(dekVar, cgs.b);
        } else if (defpackage.a.X(1, 7) || defpackage.a.X(1, 8)) {
            int i4 = cgt.b;
            defpackage.dbb.h(dekVar, cgs.a);
        } else if (defpackage.a.X(1, 4)) {
            int i5 = cgt.b;
            defpackage.dbb.h(dekVar, cgs.c);
        }
        if (!this.d) {
            defpackage.dbb.f(dekVar);
        }
        boolean z = this.d;
        dekVar.a(defpackage.def.R, java.lang.Boolean.valueOf(z));
        dekVar.a(defpackage.ddy.a, new defpackage.ddn(null, new defpackage.bge(this, 13)));
        int i6 = 14;
        if (z) {
            dekVar.a(defpackage.ddy.k, new defpackage.ddn(null, new defpackage.bge(this, i6)));
            dekVar.a(defpackage.ddy.o, new defpackage.ddn(null, new defpackage.bge(this, 15)));
        }
        dekVar.a(defpackage.ddy.j, new defpackage.ddn(null, new defpackage.akm(this, i2)));
        int i7 = this.g.f;
        defpackage.bfd bfdVar = new defpackage.bfd(this, 17);
        dekVar.a(defpackage.def.K, new defpackage.djk(i7));
        dekVar.a(defpackage.ddy.p, new defpackage.ddn(null, bfdVar));
        dekVar.a(defpackage.ddy.b, new defpackage.ddn(null, new defpackage.bfd(this, 18)));
        dekVar.a(defpackage.ddy.c, new defpackage.ddn(null, new defpackage.bfd(this, 12)));
        if (!defpackage.dgc.i(this.b.b)) {
            dekVar.a(defpackage.ddy.q, new defpackage.ddn(null, new defpackage.bfd(this, 13)));
            if (this.d) {
                dekVar.a(defpackage.ddy.r, new defpackage.ddn(null, new defpackage.bfd(this, 14)));
            }
        }
        if (this.d) {
            dekVar.a(defpackage.ddy.s, new defpackage.ddn(null, new defpackage.bfd(this, 16)));
        }
    }

    @Override // defpackage.czc
    public final boolean y() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }
}
