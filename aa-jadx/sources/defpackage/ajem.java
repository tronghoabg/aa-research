package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajem extends defpackage.aivy {
    private final java.lang.String a;
    private final defpackage.ajej b;

    public ajem(int i, int i2, long j, java.lang.String str) {
        this.a = str;
        this.b = new defpackage.ajej(i, i2, j, str);
    }

    @Override // defpackage.aiut
    public final void a(defpackage.afdo afdoVar, java.lang.Runnable runnable) {
        this.b.a(runnable, false, false);
    }

    public void close() {
        this.b.f();
    }

    @Override // defpackage.aivy
    public final java.util.concurrent.Executor e() {
        return this.b;
    }

    @Override // defpackage.aiut
    public final void f(defpackage.afdo afdoVar, java.lang.Runnable runnable) {
        this.b.a(runnable, false, true);
    }

    public final void h(java.lang.Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }
}
