package defpackage;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class eqt implements eqa {
    public static final eqt a = new eqt();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final eqc f = new eqc(this, true);
    public final Runnable g = new elt(this, 3, null);
    final ajmd h = new ajmd(this, null);

    private eqt() {
    }

    final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.g);
            } else {
                this.f.e(epr.ON_RESUME);
                this.d = false;
            }
        }
    }

    final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1 && this.i) {
            this.f.e(epr.ON_START);
            this.i = false;
        }
    }

    public final void c() {
        if (this.b == 0 && this.d) {
            this.f.e(epr.ON_STOP);
            this.i = true;
        }
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.f;
    }
}
