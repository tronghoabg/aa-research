package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class sjh implements sir {
    public static final wap a;
    public static final ConcurrentHashMap b;
    static Boolean c;
    static Long d;
    public final Context e;

    static {
        wap wapVar = new wap(wac.a("com.google.android.gms.clearcut.public"), "", "", false, false);
        if (wapVar.d) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        wap wapVar2 = new wap(wapVar.a, "gms:playlog:service:samplingrules_", wapVar.c, false, wapVar.e);
        a = new wap(wapVar2.a, wapVar2.b, "LogSamplingRulesV2__", wapVar2.d, wapVar2.e);
        b = new ConcurrentHashMap();
        c = null;
        d = null;
    }

    public sjh(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext != null) {
            war.f(applicationContext);
        }
    }
}
