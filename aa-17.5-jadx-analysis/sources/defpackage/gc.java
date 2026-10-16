package defpackage;

/* loaded from: classes2.dex */
public final class gc implements gj {
    final gj a;
    int b = 0;
    int c = -1;
    int d = -1;

    public gc(gj gjVar) {
        this.a = gjVar;
    }

    @Override // defpackage.gj
    public final void a(int i, int i2) {
        throw null;
    }

    @Override // defpackage.gj
    public final void b(int i, int i2) {
        throw null;
    }

    public final void c() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i != 1) {
            gj gjVar = this.a;
            if (i != 2) {
                ((gb) gjVar).a.b.c(this.c, this.d, null);
            } else {
                gjVar.b(this.c, this.d);
            }
        } else {
            this.a.a(this.c, this.d);
        }
        this.b = 0;
    }

    public final void d(int i, int i2) {
        c();
        ((gb) this.a).a.i(i, i2);
    }

    public final void e(int i) {
        int i2;
        int i3;
        int i4;
        if (this.b == 3 && i <= (i3 = this.d + (i2 = this.c)) && (i4 = i + 1) >= i2) {
            this.c = Math.min(i, i2);
            this.d = Math.max(i3, i4) - this.c;
        } else {
            c();
            this.c = i;
            this.d = 1;
            this.b = 3;
        }
    }
}
