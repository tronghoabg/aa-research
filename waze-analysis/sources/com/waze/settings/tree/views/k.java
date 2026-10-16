package com.waze.settings.tree.views;

import android.content.Context;
import com.waze.settings.de;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends WazeSettingsView {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.view.c.a f37627a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context);
        h.g.b.x.f(context, "context");
        com.waze.view.c.a aVar = new com.waze.view.c.a(context);
        this.f37627a = aVar;
        x(aVar);
    }

    public final void a(com.waze.settings.tree.d.p pVar, de deVar) {
        h.g.b.x.f(pVar, "setting");
        h.g.b.x.f(deVar, "page");
        A(pVar.t());
        com.waze.nightmode.e.q(this, pVar.m());
        List listF = pVar.f();
        ArrayList arrayList = new ArrayList(h.a.i.q(listF, 10));
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.settings.tree.d.g) it.next()).t());
        }
        com.waze.view.c.a aVar = this.f37627a;
        aVar.c(arrayList);
        aVar.b(pVar.c(), false);
        aVar.d(new j(pVar, this, deVar));
        setTag(pVar.s());
        Integer numO = pVar.o();
        if (numO != null) {
            o(numO.intValue());
        }
    }
}
