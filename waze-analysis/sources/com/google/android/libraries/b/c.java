package com.google.android.libraries.b;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import com.google.android.gms.o.k;
import com.google.android.gms.o.t;
import com.google.android.libraries.e.a.f;
import com.google.b.d.b.ah;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class c {
    public static bm a(t tVar) {
        final b bVar = new b(tVar);
        tVar.n(cf.y(), new k() { // from class: com.google.android.libraries.b.a
            @Override // com.google.android.gms.o.k
            public final void a(t tVar2) {
                b bVar2 = bVar;
                if (tVar2.i()) {
                    bVar2.cancel(false);
                    return;
                }
                if (tVar2.k()) {
                    bVar2.c(tVar2.g());
                    return;
                }
                Exception excF = tVar2.f();
                if (excF == null) {
                    throw new IllegalStateException();
                }
                bVar2.d(excF);
            }
        });
        return bVar;
    }

    public static void b(Level level, Executor executor, String str, Object... objArr) {
        e(level, executor, null, str, objArr);
    }

    public static void c(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        e(level, executor, th, str, objArr);
    }

    public static IOException d(f fVar, Uri uri, IOException iOException, String str) {
        try {
            com.google.android.libraries.e.a.c.a aVarB = com.google.android.libraries.e.a.c.a.b();
            aVarB.c();
            File file = (File) fVar.a(uri, aVarB);
            return file.exists() ? file.isFile() ? file.canRead() ? file.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : file.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : file.canRead() ? file.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : file.canWrite() ? g(file, iOException, str) : g(file, iOException, str) : g(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    private static void e(final Level level, Executor executor, final Throwable th, final String str, final Object... objArr) {
        executor.execute(ah.d(new Runnable() { // from class: com.google.android.libraries.phenotype.client.k
            @Override // java.lang.Runnable
            public final void run() {
                ((com.google.d.f.h) ((com.google.d.f.h) l.f6021a.a(level).h(th)).i("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 44, "Phlogger.java")).q(str, objArr);
            }
        }));
    }

    private static IOException f(File file, IOException iOException, String str) throws ErrnoException {
        String strConcat;
        try {
            strConcat = "Inoperable file:" + String.format(Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + String.format(Locale.US, " mode[%d]", Integer.valueOf(Os.stat(file.getCanonicalPath()).st_mode));
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    private static IOException g(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        return parentFile == null ? f(file, iOException, str) : parentFile.exists() ? parentFile.isDirectory() ? parentFile.canRead() ? parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str) : parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str) : parentFile.canRead() ? parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str) : parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str) : f(file, iOException, str);
    }
}
