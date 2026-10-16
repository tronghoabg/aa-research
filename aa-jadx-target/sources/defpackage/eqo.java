package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class eqo {
    final defpackage.eqt c;
    boolean d;
    int e = -1;
    final /* synthetic */ defpackage.eqp f;

    public eqo(defpackage.eqp eqpVar, defpackage.eqt eqtVar) {
        this.f = eqpVar;
        this.c = eqtVar;
    }

    public boolean c(defpackage.eqg eqgVar) {
        return false;
    }

    final void d(boolean z) {
        boolean z2;
        if (z == this.d) {
            return;
        }
        this.d = z;
        defpackage.eqp eqpVar = this.f;
        int i = true != z ? -1 : 1;
        int i2 = eqpVar.d;
        eqpVar.d = i + i2;
        if (!eqpVar.e) {
            eqpVar.e = true;
            while (true) {
                try {
                    int i3 = eqpVar.d;
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
                        eqpVar.c();
                    } else if (z3) {
                        eqpVar.d();
                    }
                    i2 = i3;
                } catch (java.lang.Throwable th) {
                    eqpVar.e = false;
                    throw th;
                }
            }
            eqpVar.e = false;
        }
        if (this.d) {
            this.f.g(this);
        }
    }

    public abstract boolean dZ();

    public void b() {
    }
}
