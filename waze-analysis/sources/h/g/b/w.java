package h.g.b;

import kotlinx.coroutines.ba;
import kotlinx.coroutines.dd;
import kotlinx.coroutines.dm;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class w {
    private w() {
    }

    public static final String a(s sVar) {
        String string = sVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public static final Object b(h.c.e eVar) {
        Object obj;
        h.c.j context = eVar.getContext();
        kotlinx.coroutines.aj.Y(context);
        h.c.e eVarD = h.c.a.h.d(eVar);
        kotlinx.coroutines.e.j jVar = eVarD instanceof kotlinx.coroutines.e.j ? (kotlinx.coroutines.e.j) eVarD : null;
        if (jVar == null) {
            obj = h.ab.f48028a;
        } else {
            if (kotlinx.coroutines.e.k.d(jVar.f51900b, context)) {
                jVar.c(context, h.ab.f48028a);
            } else {
                dm dmVar = new dm();
                h.c.j jVarPlus = context.plus(dmVar);
                h.ab abVar = h.ab.f48028a;
                jVar.c(jVarPlus, abVar);
                if (dmVar.f51849a) {
                    int i2 = kotlinx.coroutines.ai.f51347a;
                    int i3 = dd.f51833a;
                    ba baVarB = dd.b();
                    if (baVarB.m()) {
                        obj = h.ab.f48028a;
                    } else {
                        if (baVarB.l()) {
                            jVar.f51902d = abVar;
                            jVar.f51368a = 1;
                            baVarB.j(jVar);
                            obj = h.c.a.a.f48038a;
                        } else {
                            kotlinx.coroutines.e.j jVar2 = jVar;
                            baVarB.k(true);
                            try {
                                jVar.run();
                                do {
                                } while (baVarB.n());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            obj = h.ab.f48028a;
                        }
                    }
                }
            }
            obj = h.c.a.a.f48038a;
        }
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (obj == aVar) {
            h.d.b.c(eVar);
        }
        return obj == aVar ? obj : h.ab.f48028a;
    }

    public static /* synthetic */ kotlinx.coroutines.a.o c(int i2, kotlinx.coroutines.a.a aVar, h.g.a.l lVar, int i3) {
        if ((i3 & 2) != 0) {
            aVar = kotlinx.coroutines.a.a.f51271a;
        }
        if (1 == (i3 & 1)) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        if (i2 == -2) {
            return aVar == kotlinx.coroutines.a.a.f51271a ? new kotlinx.coroutines.a.k(kotlinx.coroutines.a.o.f51319b.a(), lVar) : new kotlinx.coroutines.a.y(1, aVar, lVar);
        }
        if (i2 == -1) {
            if (aVar == kotlinx.coroutines.a.a.f51271a) {
                return new kotlinx.coroutines.a.y(1, kotlinx.coroutines.a.a.f51272b, lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i2 == 0) {
            return aVar == kotlinx.coroutines.a.a.f51271a ? new kotlinx.coroutines.a.k(0, lVar) : new kotlinx.coroutines.a.y(1, aVar, lVar);
        }
        if (i2 != Integer.MAX_VALUE) {
            return aVar == kotlinx.coroutines.a.a.f51271a ? new kotlinx.coroutines.a.k(i2, lVar) : new kotlinx.coroutines.a.y(i2, aVar, lVar);
        }
        return new kotlinx.coroutines.a.k(Integer.MAX_VALUE, lVar);
    }
}
