package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface ajpa extends java.io.Closeable, java.io.Flushable {
    void a(defpackage.ajny ajnyVar, long j) throws java.io.IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws java.io.IOException;

    void flush() throws java.io.IOException;

    defpackage.ajpe hh();
}
