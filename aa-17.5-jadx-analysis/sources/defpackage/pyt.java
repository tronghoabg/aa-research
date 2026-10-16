package defpackage;

/* loaded from: classes2.dex */
public final class pyt {
    public volatile zhc a = new zhc();

    public pyt() {
        this.a.o(true);
    }

    public final synchronized void a() {
        if (this.a.isDone()) {
            return;
        }
        this.a.o(true);
    }
}
