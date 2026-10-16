package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class wfr implements wev {
    public boolean a;
    private final boolean b;

    public wfr(boolean z) {
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, wfv] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, wfv] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, wfv] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, wfv] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, wfv] */
    @Override // defpackage.wev
    public final /* synthetic */ Object a(rdx rdxVar) throws InterruptedException, IOException {
        wfe wfeVar;
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        xxh xxhVarA;
        ?? wfeVar2;
        FileLock fileLockTryLock;
        Uri uriBuild = ((Uri) rdxVar.f).buildUpon().path(String.valueOf(((Uri) rdxVar.a).getPath()).concat(".lock")).fragment("").build();
        Closeable closeable = null;
        if (this.a) {
            Semaphore semaphoreB = rdxVar.d.k().b(uriBuild.toString());
            if (true != semaphoreB.tryAcquire()) {
                semaphoreB = null;
            }
            wff wffVar = new wff(semaphoreB);
            try {
                if (wffVar.a != null) {
                    wfeVar = new wfe(wffVar.a(), 0);
                    wffVar.close();
                } else {
                    wffVar.close();
                    wfeVar = null;
                }
            } finally {
            }
        } else {
            Semaphore semaphoreB2 = rdxVar.d.k().b(uriBuild.toString());
            try {
                semaphoreB2.acquire();
                wff wffVar2 = new wff(semaphoreB2);
                try {
                    wfeVar = new wfe(wffVar2.a(), 0);
                    wffVar2.close();
                } finally {
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        wfi wfiVar = new wfi(wfeVar);
        try {
            if (wfiVar.a != null) {
                boolean z = this.b;
                wfi wfiVar2 = new wfi(z ? (Closeable) ((nfh) rdxVar.b).d(uriBuild, new wft(1)) : rdxVar.d.l(uriBuild));
                try {
                    Closeable closeable2 = wfiVar2.a;
                    if (closeable2 instanceof wfb) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((wfb) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof RandomAccessFile)) {
                            throw new IOException("Lock stream not convertible to FileChannel");
                        }
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                    }
                    FileChannel fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        rdxVar.d.k();
                        try {
                            fileLockTryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z);
                        } catch (IOException unused) {
                        }
                        wfeVar2 = fileLockTryLock == null ? 0 : new wfe(fileLockTryLock, 1);
                    } else {
                        rdxVar.d.k();
                        xxh xxhVarA2 = wfg.a(fileChannel, z);
                        if (xxhVarA2.f()) {
                            wfeVar2 = xxhVarA2.b();
                        } else {
                            wfg.a.longValue();
                            wfg.b.longValue();
                            wfm wfmVar = new wfm();
                            do {
                                SystemClock.sleep(wfmVar.next().longValue());
                                xxhVarA = wfg.a(fileChannel, z);
                            } while (!xxhVarA.f());
                            wfeVar2 = xxhVarA.b();
                        }
                    }
                    wfi wfiVar3 = new wfi(wfeVar2);
                    try {
                        if (wfiVar3.a != null) {
                            final Closeable closeableA = wfiVar.a();
                            final Closeable closeableA2 = wfiVar2.a();
                            final Closeable closeableA3 = wfiVar3.a();
                            closeable = new Closeable() { // from class: wfq
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() throws IOException {
                                    Closeable closeable3 = closeableA;
                                    Closeable closeable4 = closeableA2;
                                    Closeable closeable5 = closeableA3;
                                    if (closeable5 != null) {
                                        try {
                                            try {
                                                closeable5.close();
                                            } catch (Throwable th) {
                                                if (closeable4 != null) {
                                                    try {
                                                        closeable4.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            if (closeable3 != null) {
                                                try {
                                                    closeable3.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                    if (closeable3 != null) {
                                        closeable3.close();
                                    }
                                }
                            };
                        }
                        wfiVar3.close();
                        wfiVar2.close();
                    } finally {
                    }
                } finally {
                }
            }
            wfiVar.close();
            return closeable;
        } finally {
        }
    }
}
