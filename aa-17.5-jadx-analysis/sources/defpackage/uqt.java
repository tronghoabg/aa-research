package defpackage;

import j$.lang.Iterable$EL;

/* loaded from: classes3.dex */
public final class uqt {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/v3/content/ClientContentImpl");
    public final tnr b;
    public final trt c;
    public final xxh d;
    public final trs e;
    public uqp f;
    public abbd g;
    public urv h;
    private boolean i = false;
    private boolean j = false;

    public uqt(abbd abbdVar, tnr tnrVar, xxh xxhVar, urv urvVar, trt trtVar, trs trsVar) {
        this.b = tnrVar;
        this.c = trtVar;
        this.d = xxhVar;
        this.e = trsVar;
        this.f = new uqp(this, abbdVar, urvVar, xxhVar.f() ? new uqr(this, abbdVar, urvVar) : new uqs(this, abbdVar, urvVar));
        this.g = abbdVar;
        this.h = urvVar;
    }

    public static abax a(abax abaxVar, trt trtVar) {
        abnr abnrVar = (abnr) abaxVar.K();
        abdl abdlVar = abaxVar.m;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abdl abdlVarC = uqp.c(abdlVar, trtVar);
        abnrVar.t();
        abax abaxVar2 = (abax) abnrVar.b;
        abdlVarC.getClass();
        abaxVar2.m = abdlVarC;
        abaxVar2.b |= 4096;
        return (abax) abnrVar.q();
    }

    public static abdd b(abdd abddVar, trt trtVar) {
        abnr abnrVar = (abnr) abddVar.K();
        abdl abdlVar = abddVar.q;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abdl abdlVarC = uqp.c(abdlVar, trtVar);
        abnrVar.t();
        abdd abddVar2 = (abdd) abnrVar.b;
        abdlVarC.getClass();
        abddVar2.q = abdlVarC;
        abddVar2.b |= 16384;
        return (abdd) abnrVar.q();
    }

    public final synchronized void c() {
        if (!this.j && this.i) {
            this.i = false;
            uqp uqpVar = this.f;
            uqpVar.c.a();
            Iterable$EL.forEach(uqpVar.a, new qio(uqpVar, 8));
            Iterable$EL.forEach(uqpVar.b, new qio(uqpVar, 9));
        }
    }

    public final synchronized void d() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f.a();
    }

    public final synchronized void e(uqp uqpVar, uqp uqpVar2) {
        uqpVar.a();
        if (this.i) {
            uqpVar2.b();
        }
    }

    public final synchronized void f() {
        if (!this.j && !this.i) {
            this.i = true;
            this.f.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(abdo abdoVar) {
        abct abctVar = this.g.g;
        if (abctVar == null) {
            abctVar = abct.a;
        }
        if (abctVar.b.size() != 1) {
            return;
        }
        abct abctVar2 = this.g.g;
        if (abctVar2 == null) {
            abctVar2 = abct.a;
        }
        abcs abcsVar = (abcs) abctVar2.b.get(0);
        abnr abnrVar = (abnr) abcsVar.K();
        abnh abnhVar = abbf.U;
        abcsVar.j(abnhVar);
        Object objJ = abcsVar.w.j(abnhVar.d);
        abnp abnpVarK = ((abdp) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).K();
        abnpVarK.t();
        abdp abdpVar = (abdp) abnpVarK.b;
        abdoVar.getClass();
        abdpVar.d = abdoVar;
        abdpVar.b |= 2;
        abnrVar.bc(abnhVar, (abdp) abnpVarK.q());
        abdl abdlVar = abcsVar.u;
        if (abdlVar == null) {
            abdlVar = abdl.a;
        }
        abnr abnrVar2 = (abnr) abdlVar.K();
        abnh abnhVar2 = abdn.v;
        abdl abdlVar2 = abcsVar.u;
        if (abdlVar2 == null) {
            abdlVar2 = abdl.a;
        }
        abdlVar2.j(abnhVar2);
        Object objJ2 = abdlVar2.w.j(abnhVar2.d);
        abnp abnpVarK2 = ((abdp) (objJ2 == null ? abnhVar2.b : abnhVar2.c(objJ2))).K();
        abnpVarK2.t();
        abdp abdpVar2 = (abdp) abnpVarK2.b;
        abdoVar.getClass();
        abdpVar2.d = abdoVar;
        abdpVar2.b |= 2;
        abnrVar2.bc(abnhVar2, (abdp) abnpVarK2.q());
        abnrVar.t();
        abcs abcsVar2 = (abcs) abnrVar.b;
        abdl abdlVar3 = (abdl) abnrVar2.q();
        abdlVar3.getClass();
        abcsVar2.u = abdlVar3;
        abcsVar2.b |= 65536;
        abnr abnrVar3 = (abnr) this.g.K();
        abnp abnpVarN = abct.a.n();
        abnpVarN.Z((abcs) abnrVar.q());
        abct abctVar3 = (abct) abnpVarN.q();
        abnrVar3.t();
        abbd abbdVar = (abbd) abnrVar3.b;
        abctVar3.getClass();
        abbdVar.g = abctVar3;
        abbdVar.b |= 64;
        abbd abbdVar2 = (abbd) abnrVar3.q();
        this.g = abbdVar2;
        i(abbdVar2, this.h);
    }

    public final twi h() {
        return this.f.c.d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ucf] */
    public final synchronized void i(abbd abbdVar, urv urvVar) {
        if (this.j) {
            return;
        }
        uqp uqpVar = this.f;
        urv urvVar2 = urvVar == null ? null : urvVar;
        xxh xxhVar = this.d;
        this.f = new uqp(this, abbdVar, urvVar2, xxhVar.f() ? new uqr(this, abbdVar, urvVar) : new uqs(this, abbdVar, urvVar));
        if (xxhVar.f()) {
            ((ncp) xxhVar.b()).a.w(new unj(this, uqpVar, 5, null));
        } else {
            e(uqpVar, this.f);
        }
        this.g = abbdVar;
        this.h = urvVar;
    }
}
