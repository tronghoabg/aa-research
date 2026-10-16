package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class pl extends ca {
    public final Object c;
    public final ExecutorService d;
    public volatile Handler e;

    public pl() {
        super(null);
        this.c = new Object();
        this.d = Executors.newFixedThreadPool(4, new ssq(1, null));
    }
}
