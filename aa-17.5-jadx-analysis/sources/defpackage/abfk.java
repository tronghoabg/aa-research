package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes3.dex */
public final class abfk extends abfp {
    public final abnj a;
    public final abfm b = new abfm(3);
    public final abfo c = new abfo();
    public final abfo d = new abfo();
    public final abfo e = new abfo();
    public final abfo f = new abfo();
    private final abfo t = new abfo();
    public final abfo g = new abfo();
    public final abfo h = new abfo();
    public final abfo i = new abfo();
    private final abfo u = new abfo();
    private final abfo v = new abfo();
    private final abfo w = new abfo();
    private final abfo x = new abfo();
    private final abfo y = new abfo();
    private final abfo z = new abfo();
    private final abfo A = new abfo();
    private final abfo B = new abfo();
    private final abfo C = new abfo();
    private final abfo D = new abfo();
    public final abfo j = new abfo();
    public final abfo k = new abfo();
    private final abfo E = new abfo();
    private final abfo F = new abfo();
    public final abfo l = new abfo();
    public ajds q = null;
    public String m = null;
    public String n = null;
    private final abfo G = new abfo();
    public abfn o = null;
    public final abfo p = new abfo();

    public abfk(abnj abnjVar) {
        this.a = abnjVar;
    }

    public final int a() {
        return this.G.b;
    }

    @Override // defpackage.abfp
    public final void b() {
        super.b();
        this.b.c();
        this.c.c();
        this.d.c();
        this.e.c();
        this.f.c();
        this.t.c();
        this.g.c();
        this.h.c();
        this.i.c();
        this.u.c();
        this.v.c();
        this.w.c();
        this.x.c();
        this.y.c();
        this.z.c();
        this.A.c();
        this.B.c();
        this.C.c();
        this.D.c();
        this.j.c();
        this.k.c();
        this.E.c();
        this.F.c();
        abfo abfoVar = this.l;
        abfoVar.c();
        synchronized (abfoVar) {
            this.q = null;
        }
        this.m = null;
        this.n = null;
        this.G.c();
        abfn abfnVar = this.o;
        if (abfnVar != null) {
            abfnVar.a();
        }
        this.p.c();
    }

    @Override // defpackage.abfp
    protected final void c(int i, int i2, int i3) {
        switch (i) {
            case 1:
                this.c.f(i2, i3);
                break;
            case 2:
                this.d.f(i2, i3);
                break;
            case 3:
                this.e.f(i2, i3);
                break;
            case 4:
                this.f.f(i2, i3);
                break;
            case 5:
                this.t.f(i2, i3);
                break;
            case 6:
                this.g.f(i2, i3);
                break;
            case 7:
                this.h.f(i2, i3);
                break;
            case 8:
                this.D.f(i2, i3);
                break;
            case 9:
                this.j.f(i2, i3);
                break;
            case 10:
                this.l.f(i2, i3);
                break;
            case 11:
                this.b.d(0, i2, i3);
                break;
            case 12:
                this.b.d(1, i2, i3);
                break;
            case 13:
                this.G.f(i2, i3);
                break;
            case 15:
                this.b.d(2, i2, i3);
                break;
            case 16:
                this.k.f(i2, i3);
                break;
            case 17:
                this.i.f(i2, i3);
                break;
            case 18:
                this.p.f(i2, i3);
                break;
            case 19:
                this.E.f(i2, i3);
                break;
            case 20:
                this.u.f(i2, i3);
                break;
            case 21:
                this.v.f(i2, i3);
                break;
            case 22:
                this.w.f(i2, i3);
                break;
            case 23:
                this.F.f(i2, i3);
                break;
            case 24:
                this.x.f(i2, i3);
                break;
            case 27:
                this.y.f(i2, i3);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.z.f(i2, i3);
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                this.A.f(i2, i3);
                break;
            case 30:
                this.B.f(i2, i3);
                break;
            case 31:
                this.C.f(i2, i3);
                break;
        }
    }

    public final long d(int i) {
        abfo abfoVar = this.c;
        return j(abfoVar.b(i), abfoVar.a(i));
    }

    public final abda e(int i) throws ClassNotFoundException, abon {
        abda abdaVar = abda.a;
        abpc abpcVarL = abnv.L(abda.class);
        byte[] bArr = this.s;
        abfo abfoVar = this.G;
        return (abda) abpcVarL.k(bArr, abfoVar.b(i), abfoVar.a(i), this.a);
    }

    public final abes f(int i) throws ClassNotFoundException, abon {
        abes abesVar = abes.a;
        abpc abpcVarL = abnv.L(abes.class);
        byte[] bArr = this.s;
        abfo abfoVar = this.D;
        return (abes) abpcVarL.k(bArr, abfoVar.b(i), abfoVar.a(i), this.a);
    }

    @Override // defpackage.abfp
    protected final boolean g(int i) {
        return i == 26;
    }

    @Override // defpackage.abfp
    protected final boolean h(int i) {
        return i == 26;
    }
}
