package com.waze.settings.tree.d;

import android.view.View;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.config.cv;
import com.waze.settings.bk;
import com.waze.settings.dd;
import com.waze.settings.de;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d extends com.waze.settings.tree.g {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.settings.tree.c.h f37538a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37539b;

    /* renamed from: c, reason: collision with root package name */
    private g f37540c;

    public /* synthetic */ d(String str, String str2, com.waze.ui.ac.n nVar, com.waze.settings.tree.c cVar, com.waze.settings.tree.c.h hVar, List list, int i2) {
        this(str, str2, nVar, (i2 & 8) != 0 ? com.waze.settings.tree.c.f37530a : cVar, (i2 & 16) != 0 ? null : hVar, (i2 & 32) != 0 ? h.a.i.h() : list);
    }

    public final com.waze.settings.tree.c.h D() {
        return this.f37538a;
    }

    public final com.waze.settings.tree.c.h E() {
        com.waze.settings.tree.c.h hVar = this.f37538a;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final g F() {
        return this.f37540c;
    }

    public final String G(String str) {
        Object next;
        String strT;
        x.f(str, "value");
        Iterator it = i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((com.waze.settings.tree.f) next).s(), str)) {
                break;
            }
        }
        com.waze.settings.tree.f fVar = (com.waze.settings.tree.f) next;
        return (fVar == null || (strT = fVar.t()) == null) ? "UNKNOWN" : strT;
    }

    public final List H() {
        return this.f37539b;
    }

    public final void I(g gVar) {
        this.f37540c = gVar;
    }

    public final void J(com.waze.settings.tree.c.h hVar) {
        this.f37538a = hVar;
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public void d(g gVar, dd ddVar) {
        x.f(gVar, "option");
        x.f(ddVar, "page");
        this.f37540c = gVar;
        String strB = E().b();
        String strC = ddVar.c();
        g gVar2 = this.f37540c;
        x.c(gVar2);
        com.waze.search.v2.o.h(this, strC, strB, gVar2.s());
        com.waze.settings.tree.c.h hVarE = E();
        g gVar3 = this.f37540c;
        x.c(gVar3);
        hVarE.c(null, gVar3.s(), strB);
        ddVar.a().b(20001);
    }

    public void e(List list) {
        x.f(list, "options");
        String strB = E().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.waze.settings.tree.f fVar = (com.waze.settings.tree.f) it.next();
            if (fVar instanceof g) {
                ((g) fVar).f(x.n(fVar.s(), strB));
            }
        }
    }

    @Override // com.waze.settings.tree.g
    public void h(de deVar) {
        x.f(deVar, "page");
        FlowLiveDataConversions.asLiveData$default(j(), (h.c.j) null, 0L, 3, (Object) null).observe(deVar.h(), new c(new cv(this, 19)));
    }

    @Override // com.waze.settings.tree.g, com.waze.settings.tree.f
    public final List u() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, com.waze.settings.tree.c.h hVar, List list) {
        super(str, bk.f36875e, str2, nVar, dVar, list);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(dVar, "iconSource");
        x.f(list, "options");
        this.f37538a = hVar;
        this.f37539b = list;
    }
}
