package com.waze.car_lib.o;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f20491a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20492b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, com.waze.settings.tree.c.h hVar, List list, h.g.a.a aVar, h.g.a.a aVar2) {
        super("hnc_permit_row", null, nVar, dVar, hVar, list);
        h.g.b.x.f("hnc_permit_row", TtmlNode.ATTR_ID);
        h.g.b.x.f(dVar, "iconSource");
        h.g.b.x.f(list, "options");
        h.g.b.x.f(aVar, "subtitleProvider");
        h.g.b.x.f(aVar2, "fullScreenTitleProvider");
        this.f20491a = aVar;
        this.f20492b = aVar2;
    }

    @Override // com.waze.settings.tree.f
    public final String P() {
        return (String) this.f20491a.invoke();
    }

    public final h.g.a.a b() {
        return this.f20492b;
    }
}
