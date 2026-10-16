package defpackage;

/* loaded from: classes3.dex */
public final class abfl extends abfp {
    public final abnj a;
    public final abfm b = new abfm(1);
    public final abfo c = new abfo();
    private final abfo e = new abfo();
    public abfn d = null;

    public abfl(abnj abnjVar) {
        this.a = abnjVar;
    }

    public final int a() {
        return this.e.b;
    }

    @Override // defpackage.abfp
    public final void b() {
        super.b();
        this.b.c();
        this.c.c();
        this.e.c();
        abfn abfnVar = this.d;
        if (abfnVar != null) {
            abfnVar.a();
        }
    }

    @Override // defpackage.abfp
    protected final void c(int i, int i2, int i3) {
        if (i == 1) {
            this.c.f(i2, i3);
        } else if (i == 2) {
            this.e.f(i2, i3);
        } else {
            if (i != 4) {
                return;
            }
            this.b.d(0, i2, i3);
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
        abfo abfoVar = this.e;
        return (abda) abpcVarL.k(bArr, abfoVar.b(i), abfoVar.a(i), this.a);
    }

    @Override // defpackage.abfp
    protected final boolean p(int i) {
        return i == 3;
    }
}
