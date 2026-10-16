package com.waze.car_lib.o;

import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class s extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f20487a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20488b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f20489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, List list, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3) {
        super("in_car_hoy_no_circula", "HOY_NO_CIRCULA_SETTINGS", nVar, dVar, list, 16);
        h.g.b.x.f("in_car_hoy_no_circula", TtmlNode.ATTR_ID);
        h.g.b.x.f(dVar, "iconSource");
        h.g.b.x.f(aVar, "saveActionProvider");
        this.f20487a = aVar;
        this.f20488b = aVar2;
        this.f20489c = aVar3;
    }

    public final h.g.a.a a() {
        return this.f20489c;
    }

    public final h.g.a.a b() {
        return this.f20488b;
    }

    public final h.g.a.a c() {
        return this.f20487a;
    }
}
