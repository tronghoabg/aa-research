package defpackage;

import android.os.StrictMode;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
public final class wen {
    public static final weo a;

    static {
        weo wemVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Iterator it = ServiceLoader.load(weo.class, weo.class.getClassLoader()).iterator();
            if (it.hasNext()) {
                wemVar = (weo) it.next();
                woy.aa(!it.hasNext(), "Expected at most one FlagsService");
            } else {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                wemVar = new wem();
            }
            a = wemVar;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
