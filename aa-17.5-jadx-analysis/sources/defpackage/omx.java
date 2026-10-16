package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class omx {
    public static final yph a = yph.c("GH.ProgBarUpdtr");
    public ljv b;
    public boolean c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final Runnable e = new oez(this, 4, null);
    public final Runnable f = new oez(this, 5, null);
    public final ajmd g;

    public omx(ajmd ajmdVar) {
        this.g = ajmdVar;
    }
}
