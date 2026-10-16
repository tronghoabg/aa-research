package com.waze.ui.l;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.constraintlayout.compose.Measurer2;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Measurer2 f42565a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f42566b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map f42567c;

    public bb(Measurer2 measurer2, List list, Map map) {
        this.f42565a = measurer2;
        this.f42566b = list;
        this.f42567c = map;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List<? extends Measurable> list = this.f42566b;
        Map<Measurable, Placeable> map = this.f42567c;
        this.f42565a.performLayout((Placeable.PlacementScope) obj, list, map);
        return h.ab.f48028a;
    }
}
