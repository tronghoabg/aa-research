package defpackage;

/* loaded from: classes.dex */
final class eqk implements eqn {
    final eqj a;
    final eqn b;
    int c = -1;

    public eqk(eqj eqjVar, eqn eqnVar) {
        this.a = eqjVar;
        this.b = eqnVar;
    }

    final void b() {
        this.a.i(this);
    }

    final void c() {
        this.a.k(this);
    }

    @Override // defpackage.eqn
    public final void eS(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.eS(obj);
        }
    }
}
