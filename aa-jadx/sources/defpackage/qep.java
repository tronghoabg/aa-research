package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qep implements java.lang.Runnable {
    java.lang.RuntimeException a;

    public qep(java.lang.RuntimeException runtimeException) {
        this.a = runtimeException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw this.a;
    }
}
