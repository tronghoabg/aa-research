package com.waze.sound.e;

import com.waze.copilot.data.ag;
import com.waze.sound.CustomPromptSet;
import h.ab;
import h.g.a.q;
import h.g.b.x;
import h.n.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39860a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39861b;

    l(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        l lVar = new l((h.c.e) obj3);
        lVar.f39860a = (com.waze.sound.a.b) obj;
        lVar.f39861b = (List) obj2;
        return lVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        ag agVarA;
        String strI;
        String strB;
        Object next;
        String name;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.sound.a.b bVar = (com.waze.sound.a.b) this.f39860a;
        List list = (List) this.f39861b;
        if (bVar == null || (strB = bVar.b()) == null || o.G(strB)) {
            return (bVar == null || (agVarA = bVar.a()) == null || (strI = agVarA.i()) == null) ? "" : strI;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((CustomPromptSet) next).getUUID(), bVar.b())) {
                break;
            }
        }
        CustomPromptSet customPromptSet = (CustomPromptSet) next;
        return (customPromptSet == null || (name = customPromptSet.getName()) == null) ? "" : name;
    }
}
