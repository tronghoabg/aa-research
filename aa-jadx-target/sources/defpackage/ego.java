package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ego implements defpackage.eew {
    public final java.io.File a;
    public final defpackage.ehh b;
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public ego(java.io.File file, defpackage.ehh ehhVar) {
        this.a = file;
        this.b = ehhVar;
    }

    @Override // defpackage.eew
    public final void a() {
        this.c.set(true);
    }

    protected final void b() {
        if (this.c.get()) {
            throw new java.lang.IllegalStateException("This scope has already been closed.");
        }
    }
}
