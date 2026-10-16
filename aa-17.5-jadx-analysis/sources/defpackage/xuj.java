package defpackage;

/* loaded from: classes3.dex */
public final class xuj implements xul {
    private final xua a;

    public xuj(xua xuaVar) {
        this.a = xuaVar;
    }

    @Override // defpackage.xul, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
