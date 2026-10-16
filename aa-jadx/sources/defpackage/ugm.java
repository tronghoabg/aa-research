package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ugm {
    public long a = 0;
    public defpackage.ukf b;

    public ugm(defpackage.ukf ukfVar) {
        this.b = ukfVar;
    }

    public final synchronized void a() {
        this.a++;
    }

    public final synchronized void b(defpackage.ukf ukfVar) {
        this.b = ukfVar;
        a();
    }
}
