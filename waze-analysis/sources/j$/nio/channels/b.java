package j$.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class b extends AsynchronousFileChannel {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f49691b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f49692a;

    public /* synthetic */ b(c cVar) {
        this.f49692a = cVar;
    }

    @Override // java.nio.channels.AsynchronousChannel, java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        ((a) this.f49692a).close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.f49692a;
        if (obj instanceof b) {
            obj = ((b) obj).f49692a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void force(boolean z) {
        this.f49692a.e(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49692a.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return ((a) this.f49692a).isOpen();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void lock(long j2, long j3, boolean z, Object obj, CompletionHandler completionHandler) {
        this.f49692a.i(j2, j3, z, obj, d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void read(ByteBuffer byteBuffer, long j2, Object obj, CompletionHandler completionHandler) {
        this.f49692a.n(byteBuffer, j2, obj, d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ long size() {
        return this.f49692a.size();
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ AsynchronousFileChannel truncate(long j2) {
        c cVarP = this.f49692a.p(j2);
        if (cVarP == null) {
            return null;
        }
        return cVarP instanceof a ? ((a) cVarP).f49690a : new b(cVarP);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ FileLock tryLock(long j2, long j3, boolean z) {
        return this.f49692a.q(j2, j3, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ void write(ByteBuffer byteBuffer, long j2, Object obj, CompletionHandler completionHandler) {
        this.f49692a.v(byteBuffer, j2, obj, d.b(completionHandler));
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future lock(long j2, long j3, boolean z) {
        return this.f49692a.g(j2, j3, z);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future read(ByteBuffer byteBuffer, long j2) {
        return this.f49692a.j(byteBuffer, j2);
    }

    @Override // java.nio.channels.AsynchronousFileChannel
    public final /* synthetic */ Future write(ByteBuffer byteBuffer, long j2) {
        return this.f49692a.r(byteBuffer, j2);
    }
}
