package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class orv extends defpackage.eqr {
    public final java.lang.Object a = new java.lang.Object();
    public j$.util.Optional h = j$.util.Optional.empty();
    public final android.content.Context i;
    public final int j;

    protected orv(android.content.Context context, int i) {
        this.i = context;
        this.j = i;
    }

    public final void b() {
        synchronized (this.a) {
            if (this.h.isEmpty()) {
                return;
            }
            java.lang.Object obj = this.h.get();
            synchronized (obj) {
                ((orc) obj).d = false;
                if (((orc) obj).e.isPresent()) {
                    ((orc) obj).a(((orc) obj).f, (android.bluetooth.BluetoothProfile) ((orc) obj).e.get());
                    ((orc) obj).e = j$.util.Optional.empty();
                }
            }
            this.h = j$.util.Optional.empty();
        }
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void c() {
        super.c();
        r(defpackage.orn.a(), new defpackage.nuk(this, 14));
    }

    @Override // defpackage.eqr, defpackage.eqp
    protected final void d() {
        boolean zIsPresent;
        synchronized (this.a) {
            s(defpackage.orn.a());
            if (this.h.isPresent()) {
                java.lang.Object obj = this.h.get();
                synchronized (obj) {
                    zIsPresent = ((orc) obj).e.isPresent();
                }
                if (!zIsPresent) {
                    b();
                }
            }
            p();
        }
        super.d();
    }
}
