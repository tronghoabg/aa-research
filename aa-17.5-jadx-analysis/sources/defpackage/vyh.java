package defpackage;

/* loaded from: classes.dex */
final class vyh implements vye {
    private final aezk b;
    private final tmb c;
    private final Object a = new Object();
    private int d = 0;
    private long e = 0;

    public vyh(aezk aezkVar, tmb tmbVar) {
        this.b = aezkVar;
        this.c = tmbVar;
    }

    @Override // defpackage.vye
    public final void a() {
        Object obj = this.a;
        long jA = this.c.a();
        synchronized (obj) {
            this.d++;
            if (jA - this.e > 1000) {
                this.d = 0;
                this.e = jA;
            }
        }
    }

    @Override // defpackage.vye
    public final boolean b() {
        int iIntValue = ((Integer) this.b.a()).intValue();
        if (iIntValue == 0) {
            return true;
        }
        if (iIntValue == Integer.MAX_VALUE) {
            return false;
        }
        synchronized (this.a) {
            if (this.d < iIntValue) {
                return false;
            }
            return this.c.a() - this.e <= 1000;
        }
    }
}
