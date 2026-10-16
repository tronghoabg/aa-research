package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eqz implements defpackage.eqg {
    public static final defpackage.eqz a = new defpackage.eqz();
    public android.os.Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final defpackage.eqi f = new defpackage.eqi(this, true);
    public final java.lang.Runnable g = new defpackage.eaw(this, 8, null);
    final defpackage.ajnd h = new defpackage.ajnd(this, null);

    private eqz() {
    }

    final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.g);
            } else {
                this.f.e(defpackage.epw.ON_RESUME);
                this.d = false;
            }
        }
    }

    final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.i) {
            this.f.e(defpackage.epw.ON_START);
            this.i = false;
        }
    }

    public final void c() {
        if (this.b == 0 && this.d) {
            this.f.e(defpackage.epw.ON_STOP);
            this.i = true;
        }
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.f;
    }
}
