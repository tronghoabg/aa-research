package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements java.nio.channels.Channel {
    public abstract void a(boolean z);

    public abstract java.util.concurrent.Future b(long j, long j2, boolean z);

    public abstract void c(long j, long j2, boolean z, java.lang.Object obj, j$.nio.channels.f fVar);

    public abstract java.util.concurrent.Future d(java.nio.ByteBuffer byteBuffer, long j);

    public abstract void e(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar);

    public abstract j$.nio.channels.c f(long j);

    public abstract java.nio.channels.FileLock g(long j, long j2, boolean z);

    public abstract java.util.concurrent.Future h(java.nio.ByteBuffer byteBuffer, long j);

    public abstract void i(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar);

    public abstract long size();
}
