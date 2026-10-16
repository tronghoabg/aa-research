package com.waze.search.h;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f35762a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f35763b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.l f35764c;

    public ac(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar) {
        h.g.b.x.f(aVar, "requestContactsPermissions");
        h.g.b.x.f(aVar2, "requestCalendarPermissions");
        h.g.b.x.f(lVar, "navigateTo");
        this.f35762a = aVar;
        this.f35763b = aVar2;
        this.f35764c = lVar;
    }

    public final /* bridge */ /* synthetic */ ab a(com.waze.av.b.n nVar) {
        aa aaVar;
        h.g.b.x.f(nVar, "genericPlace");
        if (com.waze.ac.e.y(nVar)) {
            aaVar = new aa(nVar);
        } else {
            this.f35764c.invoke(nVar);
            aaVar = null;
        }
        return aaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ab b(String str) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        switch (str.hashCode()) {
            case -567451565:
                if (str.equals("contacts")) {
                    this.f35762a.invoke();
                }
                return null;
            case -178324674:
                if (str.equals("calendar")) {
                    this.f35763b.invoke();
                    return null;
                }
                return null;
            case 3208415:
                if (str.equals("home")) {
                    return s.f35961a;
                }
                return null;
            case 3655441:
                if (str.equals("work")) {
                    return t.f35962a;
                }
                return null;
            case 273921119:
                if (str.equals("ND4CLink")) {
                    return v.f35964a;
                }
                return null;
            case 2063102523:
                if (str.equals("section-suggested")) {
                    return z.f35972a;
                }
                return null;
            default:
                return null;
        }
    }
}
