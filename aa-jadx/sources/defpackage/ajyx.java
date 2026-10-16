package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class ajyx {
    public final java.util.concurrent.locks.Condition a;
    public java.lang.Thread b;
    public boolean c;

    public ajyx(java.util.concurrent.locks.Condition condition) {
        defpackage.aguw.e(condition, "Condition");
        this.a = condition;
    }

    public final void a() {
        this.c = true;
        this.a.signalAll();
    }

    public final void b() {
        if (this.b == null) {
            throw new java.lang.IllegalStateException("Nobody waiting on this object.");
        }
        this.a.signalAll();
    }
}
