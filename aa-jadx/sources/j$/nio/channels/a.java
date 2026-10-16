package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a extends j$.nio.channels.c {
    public final /* synthetic */ java.nio.channels.AsynchronousFileChannel a;

    public a(java.nio.channels.AsynchronousFileChannel asynchronousFileChannel) {
        this.a = asynchronousFileChannel;
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void a(boolean z) throws java.io.IOException {
        this.a.force(z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.util.concurrent.Future b(long j, long j2, boolean z) {
        return this.a.lock(j, j2, z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void c(long j, long j2, boolean z, java.lang.Object obj, j$.nio.channels.f fVar) {
        this.a.lock(j, j2, z, obj, j$.nio.channels.e.a(fVar));
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.io.IOException {
        this.a.close();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.util.concurrent.Future d(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.read(byteBuffer, j);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void e(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar) {
        this.a.read(byteBuffer, j, obj, j$.nio.channels.e.a(fVar));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.channels.AsynchronousFileChannel asynchronousFileChannel = this.a;
        if (obj instanceof j$.nio.channels.a) {
            obj = ((j$.nio.channels.a) obj).a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ j$.nio.channels.c f(long j) throws java.io.IOException {
        java.nio.channels.AsynchronousFileChannel asynchronousFileChannelTruncate = this.a.truncate(j);
        if (asynchronousFileChannelTruncate == null) {
            return null;
        }
        return asynchronousFileChannelTruncate instanceof j$.nio.channels.b ? ((j$.nio.channels.b) asynchronousFileChannelTruncate).a : new j$.nio.channels.a(asynchronousFileChannelTruncate);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.nio.channels.FileLock g(long j, long j2, boolean z) {
        return this.a.tryLock(j, j2, z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ java.util.concurrent.Future h(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.write(byteBuffer, j);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void i(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, j$.nio.channels.f fVar) {
        this.a.write(byteBuffer, j, obj, j$.nio.channels.e.a(fVar));
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
