package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends java.nio.channels.FileChannel implements java.nio.channels.SeekableByteChannel {
    public static final /* synthetic */ int e = 0;
    public final java.nio.channels.FileChannel a;
    public final boolean b;
    public final boolean c;
    public final j$.nio.file.Path d;

    public e(java.nio.channels.FileChannel fileChannel, boolean z, boolean z2, j$.nio.file.Path path) {
        this.a = fileChannel;
        this.b = z;
        this.c = z2;
        this.d = z ? path : null;
    }

    @Override // java.nio.channels.FileChannel
    public final void force(boolean z) throws java.io.IOException {
        this.a.force(z);
    }

    @Override // java.nio.channels.spi.AbstractInterruptibleChannel
    public final void implCloseChannel() throws java.io.IOException {
        this.a.close();
        if (this.b) {
            this.d.toFile().delete();
        }
    }

    @Override // java.nio.channels.FileChannel
    public final java.nio.channels.FileLock lock(long j, long j2, boolean z) throws java.io.IOException {
        java.nio.channels.FileLock fileLockLock = this.a.lock(j, j2, z);
        if (fileLockLock == null) {
            return null;
        }
        return new j$.desugar.sun.nio.fs.f(fileLockLock, this);
    }

    @Override // java.nio.channels.FileChannel
    public final java.nio.MappedByteBuffer map(java.nio.channels.FileChannel.MapMode mapMode, long j, long j2) {
        return this.a.map(mapMode, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final java.nio.channels.FileChannel position(long j) throws java.io.IOException {
        java.nio.channels.FileChannel fileChannelPosition = this.a.position(j);
        return fileChannelPosition instanceof j$.desugar.sun.nio.fs.e ? (j$.desugar.sun.nio.fs.e) fileChannelPosition : new j$.desugar.sun.nio.fs.e(fileChannelPosition, false, false, null);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel
    public final long size() {
        return this.a.size();
    }

    @Override // java.nio.channels.FileChannel
    public final long transferFrom(java.nio.channels.ReadableByteChannel readableByteChannel, long j, long j2) {
        return this.a.transferFrom(readableByteChannel, j, j2);
    }

    @Override // java.nio.channels.FileChannel
    public final long transferTo(long j, long j2, java.nio.channels.WritableByteChannel writableByteChannel) {
        return this.a.transferTo(j, j2, writableByteChannel);
    }

    @Override // java.nio.channels.FileChannel
    public final java.nio.channels.FileChannel truncate(long j) throws java.io.IOException {
        java.nio.channels.FileChannel fileChannelTruncate = this.a.truncate(j);
        return fileChannelTruncate instanceof j$.desugar.sun.nio.fs.e ? (j$.desugar.sun.nio.fs.e) fileChannelTruncate : new j$.desugar.sun.nio.fs.e(fileChannelTruncate, false, false, null);
    }

    @Override // java.nio.channels.FileChannel
    public final java.nio.channels.FileLock tryLock(long j, long j2, boolean z) throws java.io.IOException {
        java.nio.channels.FileLock fileLockTryLock = this.a.tryLock(j, j2, z);
        if (fileLockTryLock == null) {
            return null;
        }
        return new j$.desugar.sun.nio.fs.f(fileLockTryLock, this);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) {
        boolean z = this.c;
        java.nio.channels.FileChannel fileChannel = this.a;
        return z ? fileChannel.write(byteBuffer, fileChannel.size()) : fileChannel.write(byteBuffer);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.ScatteringByteChannel
    public final long read(java.nio.ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.a.read(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel
    public final int read(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.read(byteBuffer, j);
    }

    @Override // java.nio.channels.FileChannel, java.nio.channels.GatheringByteChannel
    public final long write(java.nio.ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.a.write(byteBufferArr, i, i2);
    }

    @Override // java.nio.channels.FileChannel
    public final long position() {
        return this.a.position();
    }

    @Override // java.nio.channels.FileChannel
    public final int write(java.nio.ByteBuffer byteBuffer, long j) {
        return this.a.write(byteBuffer, j);
    }
}
