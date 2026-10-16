package androidx.sqlite.util;

import android.util.Log;
import androidx.autofill.HintConstants;
import h.g.b.o;
import h.g.b.x;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ProcessLock {
    private static final String TAG = "SupportSQLiteLock";
    private FileChannel lockChannel;
    private final File lockFile;
    private final boolean processLock;
    private final Lock threadLock;
    private static final Companion Companion = new Companion(null);
    private static final Map<String, Lock> threadLocksMap = new HashMap();

    public ProcessLock(String str, File file, boolean z) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.processLock = z;
        this.lockFile = file != null ? new File(file, String.valueOf(str).concat(".lck")) : null;
        this.threadLock = Companion.getThreadLock(str);
    }

    public static /* synthetic */ void lock$default(ProcessLock processLock, boolean z, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            z = processLock.processLock;
        }
        processLock.lock(z);
    }

    public final void lock(boolean z) throws IOException {
        this.threadLock.lock();
        if (z) {
            try {
                File file = this.lockFile;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(this.lockFile).getChannel());
                fileChannelConvertMaybeLegacyFileChannelFromLibrary.lock();
                this.lockChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            } catch (IOException e2) {
                this.lockChannel = null;
                Log.w(TAG, "Unable to grab file lock.", e2);
            }
        }
    }

    public final void unlock() {
        try {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.threadLock.unlock();
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock getThreadLock(String str) {
            Lock lock;
            synchronized (ProcessLock.threadLocksMap) {
                Map map = ProcessLock.threadLocksMap;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = (Lock) new ReentrantLock();
                    map.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
