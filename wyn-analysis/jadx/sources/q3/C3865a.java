package q3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3865a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f44115e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f44116a;

    /* renamed from: b, reason: collision with root package name */
    public final File f44117b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f44118c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f44119d;

    public C3865a(File file, String str, boolean z2) {
        Lock lock;
        this.f44116a = z2;
        this.f44117b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f44115e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f44118c = lock;
    }

    public final void a(boolean z2) throws IOException {
        this.f44118c.lock();
        if (z2) {
            File file = this.f44117b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f44119d = channel;
            } catch (IOException e7) {
                this.f44119d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e7);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f44119d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f44118c.unlock();
    }
}
