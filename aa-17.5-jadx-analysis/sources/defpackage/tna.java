package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class tna {
    private final Context a;
    private final Object b = new Object();
    private File c;

    public tna(Context context) {
        this.a = context.getApplicationContext();
    }

    public final File a() {
        File dataDir;
        synchronized (this.b) {
            dataDir = this.c;
            if (dataDir == null) {
                dataDir = this.a.getDataDir();
                this.c = dataDir;
            }
        }
        return dataDir;
    }
}
