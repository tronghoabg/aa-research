package defpackage;

/* loaded from: classes2.dex */
public final class qds implements Runnable {
    RuntimeException a;

    public qds(RuntimeException runtimeException) {
        this.a = runtimeException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw this.a;
    }
}
