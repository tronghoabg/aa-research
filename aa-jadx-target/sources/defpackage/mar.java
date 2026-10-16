package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mar implements defpackage.qss {
    public final java.lang.ref.WeakReference a;
    private final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    public mar(defpackage.mas masVar) {
        this.a = new java.lang.ref.WeakReference(masVar);
    }

    @Override // defpackage.qss
    public final void a(int i, int i2, int i3) {
        if (i == 1 && i2 == 0) {
            ((defpackage.yqj) defpackage.mas.a.l().ai(4629)).R("Car Message category %d key %d value %d", 1, 0, java.lang.Integer.valueOf(i3));
            this.b.post(new defpackage.kzz(this, i3 == 1 ? defpackage.maq.e : defpackage.maq.b, 20));
        }
    }

    @Override // defpackage.qss
    public final void b(int i) {
        if (i == 1) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.mas.a.f()).ai((char) 4630)).u("Car Message lost ownership");
            this.b.post(new defpackage.lzk(this, 5));
        }
    }
}
