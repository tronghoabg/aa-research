package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class adkj {
    public static final Logger a = Logger.getLogger(adkj.class.getName());
    public static final adkj b = new adkj();
    public final ConcurrentNavigableMap c = new ConcurrentSkipListMap();
    public final ConcurrentNavigableMap d = new ConcurrentSkipListMap();
    public final ConcurrentMap e = new ConcurrentHashMap();
    public final ConcurrentMap f = new ConcurrentHashMap();
    public final ConcurrentMap g = new ConcurrentHashMap();

    public static long a(adkt adktVar) {
        return adktVar.e().a;
    }

    public static void b(Map map, adkm adkmVar) {
    }

    public static void c(Map map, adkm adkmVar) {
    }
}
