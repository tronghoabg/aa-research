package defpackage;

/* loaded from: classes.dex */
abstract class eqi {
    final eqn c;
    boolean d;
    int e = -1;
    final /* synthetic */ eqj f;

    public eqi(eqj eqjVar, eqn eqnVar) {
        this.f = eqjVar;
        this.c = eqnVar;
    }

    public boolean c(eqa eqaVar) {
        return false;
    }

    final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        eqj eqjVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = eqjVar.d;
        eqjVar.d = i + i2;
        if (!eqjVar.e) {
            eqjVar.e = true;
            while (true) {
                try {
                    int i3 = eqjVar.d;
                    if (i2 == i3) {
                        break;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    } else if (i3 > 0) {
                        i2 = 0;
                        z2 = true;
                    } else {
                        i2 = 0;
                        z2 = false;
                    }
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        eqjVar.c();
                    } else if (z3) {
                        eqjVar.d();
                    }
                    i2 = i3;
                } finally {
                    eqjVar.e = false;
                }
            }
        }
        if (this.d) {
            this.f.g(this);
        }
    }

    public abstract boolean eR();

    public void b() {
    }
}
