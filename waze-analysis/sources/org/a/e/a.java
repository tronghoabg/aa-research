package org.a.e;

import e.a.dw;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f56426a = dw.f();

    public static final String a(c cVar) {
        x.f(cVar, "<this>");
        Map map = f56426a;
        String str = (String) map.get(cVar);
        if (str != null) {
            return str;
        }
        x.f(cVar, "<this>");
        x.f(cVar, "kClass");
        String name = o.w(cVar).getName();
        x.e(name, "getName(...)");
        map.put(cVar, name);
        return name;
    }
}
