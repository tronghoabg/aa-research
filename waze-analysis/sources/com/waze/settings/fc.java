package com.waze.settings;

import android.view.View;
import com.waze.R;
import com.waze.settings.tree.views.WazeSettingsView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37242a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f37243b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gr f37244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fc(View view, gr grVar, h.c.e eVar) {
        super(2, eVar);
        this.f37243b = view;
        this.f37244c = grVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        fc fcVar = new fc(this.f37243b, this.f37244c, eVar);
        fcVar.f37242a = obj;
        return fcVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fc) create((hg) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        hg hgVar = (hg) this.f37242a;
        WazeSettingsView wazeSettingsView = (WazeSettingsView) this.f37243b;
        if (h.g.b.x.n(hgVar, hf.f37396a)) {
            wazeSettingsView.G();
        } else {
            if (!(hgVar instanceof he)) {
                throw new h.i();
            }
            String strM = com.waze.network.f.ak.m((he) hgVar);
            if (strM == null) {
                strM = this.f37244c.f37336i.c(R.string.TAP_TO_ADD, new Object[0]);
            }
            wazeSettingsView.P(strM);
            wazeSettingsView.m();
        }
        return h.ab.f48028a;
    }
}
