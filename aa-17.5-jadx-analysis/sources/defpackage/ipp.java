package defpackage;

import android.content.Context;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class ipp {
    public static final yph a = yph.c("CAR.VDAM");
    public final Context b;
    public final Function c;
    public final jfg d;
    public wsj e;

    private ipp(Context context, jfg jfgVar) {
        ijt ijtVar = new ijt(9);
        this.b = context;
        this.c = ijtVar;
        this.d = jfgVar;
    }

    public static synchronized ipp a(Context context, jfg jfgVar) {
        return new ipp(context.getApplicationContext(), jfgVar);
    }
}
