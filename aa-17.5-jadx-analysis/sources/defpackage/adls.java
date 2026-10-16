package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class adls {
    public static final Logger a = Logger.getLogger(adls.class.getName());
    private static adls b;
    private final LinkedHashSet c = new LinkedHashSet();
    private List d = Collections.EMPTY_LIST;

    public static synchronized adls a() {
        if (b == null) {
            List<adlq> listB = adqq.B(adlq.class, ServiceLoader.load(adlq.class, adlq.class.getClassLoader()).iterator(), new txv(18), new adlr(0));
            b = new adls();
            for (adlq adlqVar : listB) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(adlqVar))));
                b.c(adlqVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(adlq adlqVar) {
        adlqVar.c();
        this.c.add(adlqVar);
    }

    private final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.c);
        Collections.sort(arrayList, Collections.reverseOrder(new acad(2)));
        this.d = DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized List b() {
        return this.d;
    }
}
