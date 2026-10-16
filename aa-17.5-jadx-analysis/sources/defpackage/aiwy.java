package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class aiwy {
    public static final aivr a;

    static {
        Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
        int i = aiwx.a;
        a = new aiwv(handlerCreateAsync, "main", false);
    }
}
