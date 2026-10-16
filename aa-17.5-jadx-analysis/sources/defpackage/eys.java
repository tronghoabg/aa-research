package defpackage;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class eys {
    public final ezc a;
    public final ezv b;
    public final Map c;
    public final ReentrantLock d;
    public final AtomicInteger e;
    public final afdr f;
    public final afdr g;
    public final Object h;
    public ecx i;
    private final Map j;
    private final Map k;
    private final String[] l;

    public eys(ezc ezcVar, Map map, Map map2, String... strArr) {
        this.a = ezcVar;
        this.j = map;
        this.k = map2;
        this.l = strArr;
        ezv ezvVar = new ezv(ezcVar, map, map2, strArr, ezcVar.h, new eyr(this, 0));
        this.b = ezvVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new AtomicInteger(0);
        this.f = new eup(3);
        this.g = new eup(4);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.h = new Object();
        ezvVar.f = new epp(this, 16);
    }

    public final Object a(afck afckVar) throws Throwable {
        Object objE = this.b.e(afckVar);
        return objE == afcr.a ? objE : afak.a;
    }

    public final void b() {
        this.b.f(this.f, this.g);
    }
}
