package androidx.media3.muxer;

import j$.nio.channels.DesugarChannels;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FileOutputStreamSeekableMuxerOutput implements SeekableMuxerOutput {
    private final FileChannel fileChannel;
    private final FileOutputStream fileOutputStream;

    public FileOutputStreamSeekableMuxerOutput(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
        this.fileChannel = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.fileOutputStream.close();
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public long getPosition() {
        return this.fileChannel.position();
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public long getSize() {
        return this.fileChannel.size();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.fileChannel.isOpen();
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public void setPosition(long j2) throws IOException {
        this.fileChannel.position(j2);
    }

    @Override // androidx.media3.muxer.SeekableMuxerOutput
    public void truncate(long j2) throws IOException {
        this.fileChannel.truncate(j2);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.fileChannel.write(byteBuffer);
    }
}
