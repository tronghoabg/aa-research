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
final class d extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39501a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f39502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(String str, h.c.e eVar) {
        super(2, eVar);
        this.f39502b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        d dVar = new d(this.f39502b, eVar);
        dVar.f39501a = obj;
        return dVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((d) create((List) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f39501a;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = this.f39502b;
                CustomPromptSet customPromptSet = (CustomPromptSet) it.next();
                if (x.n(customPromptSet.getUUID(), str) && customPromptSet.getState() == 0) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
