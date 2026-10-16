package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class e extends FileChannel implements SeekableByteChannel {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f49658e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f49659a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f49660b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49661c;

    /* renamed from: d, reason: collision with root package name */
    public final Path f49662d;

    public e(FileChannel fileChannel, boolean z, boolean z2, Path path) {
        this.f49659a = fileChannel;
        this.f49660b = z;
        this.f49661c = z2;
        this.f49662d = z ? path : null;
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) throws IOException {
        this.f49659a.force(z);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() throws IOException {
        this.f49659a.close();
        if (this.f49660b) {
            this.f49662d.toFile().delete();
        }
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock lock(long j2, long j3, boolean z) throws IOException {
        FileLock fileLockLock = this.f49659a.lock(j2, j3, z);
        if (fileLockLock == null) {
            return null;
        }
        return new f(fileLockLock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final MappedByteBuffer map(FileChannel.MapMode mapMode, long j2, long j3) {
        return this.f49659a.map(mapMode, j2, j3);
    }

    @Override // java.nio.channels.FileChannel
    public final FileChannel position(long j2) throws IOException {
        FileChannel fileChannelPosition = this.f49659a.position(j2);
        return fileChannelPosition instanceof e ? (e) fileChannelPosition : new e(fileChannelPosition, false, false, null);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f49659a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel
    public final long size() {
        return this.f49659a.size();
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(ReadableByteChannel readableByteChannel, long j2, long j3) {
        return this.f49659a.transferFrom(readableByteChannel, j2, j3);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j2, long j3, WritableByteChannel writableByteChannel) {
        return this.f49659a.transferTo(j2, j3, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final FileChannel truncate(long j2) throws IOException {
        FileChannel fileChannelTruncate = this.f49659a.truncate(j2);
        return fileChannelTruncate instanceof e ? (e) fileChannelTruncate : new e(fileChannelTruncate, false, false, null);
    }

    @Override // java.nio.channels.FileChannel
    public final FileLock tryLock(long j2, long j3, boolean z) throws IOException {
        FileLock fileLockTryLock = this.f49659a.tryLock(j2, j3, z);
        if (fileLockTryLock == null) {
            return null;
        }
        return new f(fileLockTryLock, this);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        boolean z = this.f49661c;
        FileChannel fileChannel = this.f49659a;
        return z ? fileChannel.write(byteBuffer, fileChannel.size()) : fileChannel.write(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(ByteBuffer[] byteBufferArr, int i2, int i3) {
        return this.f49659a.read(byteBufferArr, i2, i3);
    }

    @Override // java.nio.channels.FileChannel
    public final int read(ByteBuffer byteBuffer, long j2) {
        return this.f49659a.read(byteBuffer, j2);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(ByteBuffer[] byteBufferArr, int i2, int i3) {
        return this.f49659a.write(byteBufferArr, i2, i3);
    }

    @Override // java.nio.channels.FileChannel
    public final long position() {
        return this.f49659a.position();
    }

    @Override // java.nio.channels.FileChannel
    public final int write(ByteBuffer byteBuffer, long j2) {
        return this.f49659a.write(byteBuffer, j2);
    }
}
