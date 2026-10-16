package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class wfs implements wev {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    public final void b() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, wfv] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.wev
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final File a(rdx rdxVar) throws IOException {
        if (this.a) {
            if (rdxVar.e.isEmpty()) {
                return rdxVar.d.c((Uri) rdxVar.a);
            }
            throw new wfj("Short circuit would skip transforms.");
        }
        wfi wfiVar = new wfi(wft.b(rdxVar));
        try {
            Closeable closeable = wfiVar.a;
            if (!(closeable instanceof wfc)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileB = ((wfc) closeable).b();
            wfiVar.close();
            return fileB;
        } catch (Throwable th) {
            try {
                wfiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
