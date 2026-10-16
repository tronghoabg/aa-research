package androidx.room.concurrent;

import h.g.b.x;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FileLock {
    private FileChannel lockChannel;
    private final String lockFilename;

    public FileLock(String str) {
        x.f(str, "filename");
        this.lockFilename = String.valueOf(str).concat(".lck");
    }

    public final void lock() {
        if (this.lockChannel != null) {
            return;
        }
        try {
            File file = new File(this.lockFilename);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(file).getChannel());
            this.lockChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.lockChannel = null;
            throw new IllegalStateException("Unable to lock file: '" + this.lockFilename + "'.", th);
        }
    }

    public final void unlock() {
        FileChannel fileChannel = this.lockChannel;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } finally {
                this.lockChannel = null;
            }
        }
    }
}
