package com.waze.app_nav.hub;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15351a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f15352b;

    public l(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eVar, "logger");
        this.f15351a = eVar;
        this.f15352b = ck.b(h.a.i.h());
    }

    @Override // com.waze.app_nav.hub.k
    public final j a(ag agVar) {
        Object next;
        h.g.b.x.f(agVar, TtmlNode.ATTR_ID);
        Iterator it = ((Iterable) this.f15352b.d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (h.g.b.x.n(((j) next).e(), agVar)) {
                break;
            }
        }
        return (j) next;
    }

    @Override // com.waze.app_nav.hub.k
    public final /* synthetic */ ch b() {
        return this.f15352b;
    }

    @Override // com.waze.app_nav.hub.k
    public final void c(j jVar) {
        h.g.b.x.f(jVar, "entry");
        Objects.toString(jVar);
        this.f15351a.e("WazeActivityLauncher launchActivity entry=".concat(String.valueOf(jVar)));
        jVar.f().e(false);
        jVar.g(m.f15353a);
        bn bnVar = this.f15352b;
        bnVar.e(h.a.i.ag((Collection) bnVar.d(), jVar));
    }

    @Override // com.waze.app_nav.hub.k
    public final void d(ag agVar) {
        int iNextIndex;
        h.g.b.x.f(agVar, TtmlNode.ATTR_ID);
        Objects.toString(agVar);
        this.f15351a.e("WazeActivityLauncher stopActivity id=".concat(agVar.toString()));
        bn bnVar = this.f15352b;
        List listAq = h.a.i.aq((Collection) bnVar.d());
        List listAq2 = h.a.i.aq((Collection) bnVar.d());
        ListIterator listIterator = listAq2.listIterator(listAq2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            } else if (h.g.b.x.n(((j) listIterator.previous()).e(), agVar)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            ((j) listAq.get(iNextIndex)).f().e(true);
            listAq.remove(iNextIndex);
            bnVar.e(listAq);
        }
    }
}
