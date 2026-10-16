package com.waze.settings.tree.views;

import android.content.Context;
import com.waze.ifs.ui.ac;
import com.waze.settings.de;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends ac {

    /* renamed from: f, reason: collision with root package name */
    private com.waze.settings.tree.d f37610f;

    /* renamed from: g, reason: collision with root package name */
    private com.waze.settings.tree.d f37611g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        h.g.b.x.f(context, "context");
        com.waze.settings.tree.c cVar = com.waze.settings.tree.c.f37530a;
        this.f37610f = cVar;
        this.f37611g = cVar;
    }

    static final ab f(b bVar, Boolean bool) {
        h.g.b.x.c(bool);
        boolean zBooleanValue = bool.booleanValue();
        bVar.setSelected(zBooleanValue);
        if (zBooleanValue) {
            bVar.g(bVar.f37611g);
        } else {
            bVar.g(bVar.f37610f);
        }
        return ab.f48028a;
    }

    public final void g(com.waze.settings.tree.d dVar) {
        h.g.b.x.f(dVar, "iconSource");
        if (dVar instanceof com.waze.settings.tree.a) {
            c(((com.waze.settings.tree.a) dVar).a());
        } else if (dVar instanceof com.waze.settings.tree.b) {
            d(((com.waze.settings.tree.b) dVar).a());
        } else {
            if (!h.g.b.x.n(dVar, com.waze.settings.tree.c.f37530a)) {
                throw new h.i();
            }
            a();
        }
    }

    public final void h(com.waze.settings.tree.d.a aVar, de deVar) {
        h.g.b.x.f(aVar, "setting");
        h.g.b.x.f(deVar, "page");
        setOnClickListener(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.m(deVar, aVar, 2));
        e(aVar.t());
        b(aVar.P());
        this.f37611g = aVar.d();
        this.f37610f = aVar.m();
        aVar.c().observe(deVar.h(), new f(new h.g.a.l() { // from class: com.waze.settings.tree.views.a
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return b.f(this.f37609a, (Boolean) obj);
            }
        }, 1, (byte[]) null));
    }
}
