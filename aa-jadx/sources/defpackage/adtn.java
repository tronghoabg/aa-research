package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface adtn extends java.io.Closeable {
    defpackage.adtt a(java.net.SocketAddress socketAddress, defpackage.adtm adtmVar, defpackage.adjy adjyVar);

    java.util.Collection b();

    java.util.concurrent.ScheduledExecutorService c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
