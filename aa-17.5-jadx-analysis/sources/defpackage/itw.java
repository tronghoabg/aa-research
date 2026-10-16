package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class itw {
    private static final wap f = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
    private static volatile itw g;
    public final wap a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public itw(wap wapVar) {
        this.a = wapVar;
    }

    public static itw a() {
        if (g == null) {
            synchronized (itw.class) {
                if (g == null) {
                    g = new itw(f);
                }
            }
        }
        return g;
    }
}
