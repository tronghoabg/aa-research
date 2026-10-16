package defpackage;

import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class tel {
    public static final yph a = yph.c("GH.StateMachine");
    public static final Collection b = woy.di(new Level[]{Level.ALL, Level.OFF});
    private final tei c;
    private final Map d;
    private final Map e;
    private final Map f;
    private final Map g;
    private final tek h;
    private long i = SystemClock.elapsedRealtime();
    private Enum j;

    public tel(tei teiVar, Enum r2, Map map, Map map2, Map map3, Map map4, tek tekVar) {
        this.c = teiVar;
        this.d = map;
        this.e = map2;
        this.f = map3;
        this.g = map4;
        this.h = tekVar;
        this.j = r2;
    }

    private static final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            new teg((afdr) it.next(), 0).run();
        }
    }

    public final long a() {
        return SystemClock.elapsedRealtime() - this.i;
    }

    public final synchronized Enum b() {
        return this.j;
    }

    public final synchronized void c(Enum r5) {
        tei teiVar = this.c;
        if (teiVar.d == 2 && affa.f(this.j, r5)) {
            teiVar.c.a(teiVar.b).y("Ignoring self-transition in state %s.", this.j);
            return;
        }
        Collection collection = (Collection) this.d.get(this.j);
        if ((collection != null && collection.contains(r5)) || this.h.a(this.j, r5, teiVar)) {
            Enum r1 = this.j;
            teiVar.c.a(teiVar.b).M("Transition from %s to %s.", r1, r5);
            List list = (List) this.g.get(r1);
            if (list != null) {
                d(list);
            }
            this.j = r5;
            this.i = SystemClock.elapsedRealtime();
            List list2 = (List) this.f.get(new aezu(r1, r5));
            if (list2 != null) {
                d(list2);
            }
            List list3 = (List) this.e.get(r5);
            if (list3 != null) {
                d(list3);
            }
        }
    }
}
