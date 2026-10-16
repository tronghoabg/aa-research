package j$.nio.channels;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b extends java.nio.channels.AsynchronousFileChannel {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ j$.nio.channels.c a;

    public /* synthetic */ b(j$.nio.channels.c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.channels.AsynchronousChannel, java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws java.io.IOException {
        ((j$.nio.channels.a) this.a).close();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.channels.c cVar = this.a;
        if (obj instanceof j$.nio.channels.b) {
            obj = ((j$.nio.channels.b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void force(boolean z) {
        this.a.a(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return ((j$.nio.channels.a) this.a).isOpen();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void lock(long j, long j2, boolean z, java.lang.Object obj, java.nio.channels.CompletionHandler completionHandler) {
        this.a.c(j, j2, z, obj, j$.nio.channels.d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void read(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, java.nio.channels.CompletionHandler completionHandler) {
        this.a.e(byteBuffer, j, obj, j$.nio.channels.d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ long size() {
        return this.a.size();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.nio.channels.AsynchronousFileChannel truncate(long j) {
        j$.nio.channels.c cVarF = this.a.f(j);
        if (cVarF == null) {
            return null;
        }
        return cVarF instanceof j$.nio.channels.a ? ((j$.nio.channels.a) cVarF).a : new j$.nio.channels.b(cVarF);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.nio.channels.FileLock tryLock(long j, long j2, boolean z) {
        return this.a.g(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void write(java.nio.ByteBuffer byteBuffer, long j, java.lang.Object obj, java.nio.channels.CompletionHandler completionHandler) {
        this.a.i(byteBuffer, j, obj, j$.nio.channels.d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.util.concurrent.Future lock(long j, long j2, boolean z) {
        return this.a.b(j, j2, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.util.concurrent.Future read(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.d(byteBuffer, j);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ java.util.concurrent.Future write(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.h(byteBuffer, j);
    }
}
