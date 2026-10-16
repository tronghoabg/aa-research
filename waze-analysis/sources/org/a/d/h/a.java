package org.a.d.h;

import h.a.i;
import h.g.b.x;
import h.l.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.a.d.d.g;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final List f56405a;

    /* renamed from: b, reason: collision with root package name */
    private int f56406b;

    public /* synthetic */ a(List list, int i2) {
        list = (i2 & 1) != 0 ? new ArrayList() : list;
        x.f(list, "_values");
        this.f56405a = list;
    }

    public Object a(c cVar) {
        Object next;
        x.f(cVar, "clazz");
        List list = this.f56405a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.f56406b);
        if (true != cVar.d(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.f56406b < i.e(list)) {
            this.f56406b++;
        }
        if (obj != null) {
            return obj;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (cVar.d(next)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        return null;
    }

    public Object c(c cVar) throws g {
        x.f(cVar, "clazz");
        List list = this.f56405a;
        if (list.size() > 0) {
            return list.get(0);
        }
        throw new g("Can't get injected parameter #0 from " + this + " for type '" + org.a.e.a.a(cVar) + "'");
    }

    public final List e() {
        return this.f56405a;
    }

    public final void f(Object obj) {
        x.f(obj, "value");
        this.f56405a.add(obj);
    }

    public final String toString() {
        List listAo = i.ao(this.f56405a);
        Objects.toString(listAo);
        return "DefinitionParameters".concat(String.valueOf(listAo));
    }

    public a() {
        this(null, 3);
    }
}
