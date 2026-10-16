package j$.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class a extends c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AsynchronousFileChannel f49690a;

    public a(AsynchronousFileChannel asynchronousFileChannel) {
        this.f49690a = asynchronousFileChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws IOException {
        this.f49690a.close();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void e(boolean z) throws IOException {
        this.f49690a.force(z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AsynchronousFileChannel asynchronousFileChannel = this.f49690a;
        if (obj instanceof a) {
            obj = ((a) obj).f49690a;
        }
        return asynchronousFileChannel.equals(obj);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ Future g(long j2, long j3, boolean z) {
        return this.f49690a.lock(j2, j3, z);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49690a.hashCode();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void i(long j2, long j3, boolean z, Object obj, f fVar) {
        this.f49690a.lock(j2, j3, z, obj, e.a(fVar));
    }

    @Override // java.nio.channels.Channel
    public final /* synthetic */ boolean isOpen() {
        return this.f49690a.isOpen();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ Future j(ByteBuffer byteBuffer, long j2) {
        return this.f49690a.read(byteBuffer, j2);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void n(ByteBuffer byteBuffer, long j2, Object obj, f fVar) {
        this.f49690a.read(byteBuffer, j2, obj, e.a(fVar));
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ c p(long j2) throws IOException {
        AsynchronousFileChannel asynchronousFileChannelTruncate = this.f49690a.truncate(j2);
        if (asynchronousFileChannelTruncate == null) {
            return null;
        }
        return asynchronousFileChannelTruncate instanceof b ? ((b) asynchronousFileChannelTruncate).f49692a : new a(asynchronousFileChannelTruncate);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ FileLock q(long j2, long j3, boolean z) {
        return this.f49690a.tryLock(j2, j3, z);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ Future r(ByteBuffer byteBuffer, long j2) {
        return this.f49690a.write(byteBuffer, j2);
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ long size() {
        return this.f49690a.size();
    }

    @Override // j$.nio.channels.c
    public final /* synthetic */ void v(ByteBuffer byteBuffer, long j2, Object obj, f fVar) {
        this.f49690a.write(byteBuffer, j2, obj, e.a(fVar));
    }
}
