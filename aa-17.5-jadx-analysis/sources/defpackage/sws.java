package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class sws {

    @Deprecated
    public static final rju a;
    private static final omc b;

    static {
        swp swpVar = new swp();
        b = swpVar;
        a = new rju("UsageReporting.API", swpVar);
    }

    public static swo a(Context context) {
        return new swo(context, new swr());
    }
}
