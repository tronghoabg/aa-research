package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class teh {
    public final Map a;
    public final Map b;
    public tek c;
    private final Enum d;
    private final tei e;
    private final Map f;
    private final Map g;

    public teh(Enum r1, tei teiVar) {
        teiVar.getClass();
        this.d = r1;
        this.e = teiVar;
        this.f = new LinkedHashMap();
        this.a = new LinkedHashMap();
        this.g = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new tej(2);
    }

    public final tel a() {
        return new tel(this.e, this.d, this.f, this.a, this.g, this.b, this.c);
    }

    public final void b(Enum r2, Enum r3) {
        r3.getClass();
        Map map = this.f;
        Object linkedHashSet = map.get(r2);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map.put(r2, linkedHashSet);
        }
        ((Collection) linkedHashSet).add(r3);
    }

    public final /* synthetic */ void c(Enum r2, Enum r3, afdr afdrVar) {
        r3.getClass();
        aezu aezuVar = new aezu(r2, r3);
        Map map = this.g;
        Object arrayList = map.get(aezuVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(aezuVar, arrayList);
        }
        ((List) arrayList).add(afdrVar);
    }

    public final void d(Enum r4, Enum r5, Runnable runnable) {
        c(r4, r5, new ehq((Object) runnable, 15, (byte[]) null));
    }
}
