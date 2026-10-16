package com.waze.settings.a.a.b;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.sharedui.l;
import com.waze.ui.g.m;
import com.waze.ui.g.y;
import com.waze.ui.g.z;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f36740a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.a.a.a.h f36741b;

    /* renamed from: c, reason: collision with root package name */
    private final l f36742c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f36743d;

    public j(com.waze.shared_infra.i.e eVar, com.waze.settings.a.a.a.h hVar, l lVar) {
        x.f(eVar, "logger");
        x.f(hVar, "controller");
        x.f(lVar, "signatureGenerator");
        this.f36740a = eVar;
        this.f36741b = hVar;
        this.f36742c = lVar;
        this.f36743d = ck.b(new m(null, lVar.a(), h.a.i.h(), false, false));
        eVar.a("init");
        addCloseable(new AutoCloseable() { // from class: com.waze.settings.a.a.b.g
            @Override // java.lang.AutoCloseable
            public final void close() {
                j.e(this.f36736a);
            }
        });
        aj.z(ViewModelKt.getViewModelScope(this), null, null, new i(this, null), 3);
    }

    public static final /* synthetic */ m b(j jVar, com.waze.settings.a.a.a.e eVar) {
        z zVar;
        com.waze.settings.a.a.a.d dVarA = eVar.a();
        if (dVarA == null) {
            zVar = null;
        } else if (x.n(dVarA, com.waze.settings.a.a.a.b.f36699a)) {
            zVar = y.f42377a;
        } else {
            if (!x.n(dVarA, com.waze.settings.a.a.a.c.f36700a)) {
                throw new h.i();
            }
            zVar = z.f42378a;
        }
        String strA = jVar.f36742c.a();
        List listC = eVar.c();
        String strB = eVar.b();
        List<com.waze.copilot.data.c> list = listC;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        for (com.waze.copilot.data.c cVar : list) {
            arrayList.add(new com.waze.ui.g.a(cVar.e(), cVar.e(), cVar.c().a(), x.n(strB, cVar.e())));
        }
        return new m(zVar, strA, arrayList, eVar.d(), eVar.e());
    }

    static final void e(j jVar) {
        jVar.f36741b.i();
    }

    public final ch d() {
        return this.f36743d;
    }

    public final void f() {
        this.f36741b.j();
    }

    public final void g() {
        this.f36741b.k();
    }

    public final void h() {
        this.f36741b.l();
    }

    public final void i(String str) {
        x.f(str, TtmlNode.ATTR_ID);
        this.f36740a.a("car clicked: ".concat(String.valueOf(str)));
        this.f36741b.m(str);
    }
}
