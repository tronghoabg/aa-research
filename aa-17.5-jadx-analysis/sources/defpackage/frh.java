package defpackage;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class frh implements Closeable {
    public final frd a;

    public frh(frd frdVar) {
        this.a = frdVar;
    }

    public final ajnr a() {
        return this.a.a(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
