package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adtz implements java.lang.Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public adtz(java.lang.Object obj, int i, int i2) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            ((adud) this.b).g.m(this.a);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                ((defpackage.adui) this.b).f.g(this.a);
                return;
            }
            int i2 = this.a;
            if (i != 3) {
                ((defpackage.adui) this.b).f.l(i2);
                return;
            } else {
                ((defpackage.adui) this.b).f.k(i2);
                return;
            }
        }
        try {
            int i3 = defpackage.aefb.a;
            adxn adxnVar = ((adsk) this.b).j;
            int i4 = this.a;
            if (adxnVar.b()) {
                return;
            }
            adxnVar.e += (long) i4;
            adxnVar.a();
            return;
        } catch (java.lang.Throwable th) {
            ((adsk) this.b).b(th);
        }
        ((adsk) this.b).b(th);
    }
}
