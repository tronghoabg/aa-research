package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gd implements defpackage.gk {
    final defpackage.gk a;
    int b = 0;
    int c = -1;
    int d = -1;

    public gd(defpackage.gk gkVar) {
        this.a = gkVar;
    }

    @Override // defpackage.gk
    public final void a(int i, int i2) {
        throw null;
    }

    @Override // defpackage.gk
    public final void b(int i, int i2) {
        throw null;
    }

    public final void c() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            defpackage.gk gkVar = this.a;
            if (i != 2) {
                ((defpackage.gc) gkVar).a.b.c(this.c, this.d, null);
            } else {
                gkVar.b(this.c, this.d);
            }
        } else {
            this.a.a(this.c, this.d);
        }
        this.b = 0;
    }

    public final void d(int i, int i2) {
        c();
        ((defpackage.gc) this.a).a.i(i, i2);
    }

    public final void e(int i) {
        int i2;
        int i3;
        int i4;
        if (this.b == 3 && i <= (i3 = this.d + (i2 = this.c)) && (i4 = i + 1) >= i2) {
            this.c = java.lang.Math.min(i, i2);
            this.d = java.lang.Math.max(i3, i4) - this.c;
        } else {
            c();
            this.c = i;
            this.d = 1;
            this.b = 3;
        }
    }
}
