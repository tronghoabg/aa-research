package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f9971a;

    /* renamed from: b, reason: collision with root package name */
    private final FileLock f9972b;

    private a(FileChannel fileChannel, FileLock fileLock) {
        this.f9971a = fileChannel;
        this.f9972b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.firebase.installations.a b(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L33 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2b java.lang.Error -> L2d java.io.IOException -> L2f
            com.google.firebase.installations.a r2 = new com.google.firebase.installations.a     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L27 java.io.IOException -> L29
            return r2
        L25:
            r2 = move-exception
            goto L3b
        L27:
            r2 = move-exception
            goto L3b
        L29:
            r2 = move-exception
            goto L3b
        L2b:
            r0 = move-exception
            goto L30
        L2d:
            r0 = move-exception
            goto L30
        L2f:
            r0 = move-exception
        L30:
            r2 = r0
            r0 = r1
            goto L3b
        L33:
            r5 = move-exception
            goto L38
        L35:
            r5 = move-exception
            goto L38
        L37:
            r5 = move-exception
        L38:
            r2 = r5
            r5 = r1
            r0 = r5
        L3b:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L47
            r0.release()     // Catch: java.io.IOException -> L47
        L47:
            if (r5 == 0) goto L4c
            r5.close()     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.b(android.content.Context):com.google.firebase.installations.a");
    }

    final void a() throws IOException {
        try {
            this.f9972b.release();
            this.f9971a.close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }
}
