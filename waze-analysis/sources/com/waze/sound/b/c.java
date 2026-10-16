package com.waze.sound.b;

import com.waze.sound.CustomPromptSet;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39498a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f39499b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f39500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, String str, h.c.e eVar2) {
        super(2, eVar2);
        this.f39499b = eVar;
        this.f39500c = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f39499b, this.f39500c, eVar);
        cVar.f39498a = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((List) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f39498a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = this.f39500c;
                CustomPromptSet customPromptSet = (CustomPromptSet) it.next();
                if (x.n(customPromptSet.getUUID(), str) && customPromptSet.getState() == 2) {
                    e eVar = this.f39499b;
                    eVar.f39505c.a("downloading recorded voice for promptListSet ".concat(str));
                    eVar.f39503a.d(str);
                    break;
                }
            }
        }
        return ab.f48028a;
    }
}
