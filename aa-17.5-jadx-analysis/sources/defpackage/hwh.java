package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
final class hwh {
    private volatile hxt a;
    private final htm b;

    public hwh(htm htmVar) {
        this.b = htmVar;
    }

    public final hxt a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    Object obj = this.b.a;
                    File cacheDir = ((Context) ((nas) obj).a).getCacheDir();
                    hxv hxvVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, (String) ((nas) obj).b);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        hxvVar = new hxv(file);
                    }
                    this.a = hxvVar;
                }
                if (this.a == null) {
                    this.a = new hxu();
                }
            }
        }
        return this.a;
    }
}
