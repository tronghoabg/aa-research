package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class adll {
    public static final Logger a = Logger.getLogger(adll.class.getName());
    private static adll b;
    private final LinkedHashSet c = new LinkedHashSet();
    private final LinkedHashMap d = new LinkedHashMap();

    public static synchronized adll b() {
        if (b == null) {
            adlk.class.getClassLoader();
            List<adlk> listB = adqq.B(adlk.class, Collections.singletonList(adxg.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new txv(17), new adlr(1));
            b = new adll();
            for (adlk adlkVar : listB) {
                a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(adlkVar))));
                b.c(adlkVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(adlk adlkVar) {
        adlkVar.d();
        this.c.add(adlkVar);
    }

    private final synchronized void d() {
        LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.clear();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            adlk adlkVar = (adlk) it.next();
            String strC = adlkVar.c();
            if (((adlk) linkedHashMap.get(strC)) != null) {
                adlkVar.e();
            } else {
                linkedHashMap.put(strC, adlkVar);
            }
        }
    }

    public final synchronized adlk a(String str) {
        return (adlk) this.d.get(str);
    }
}
