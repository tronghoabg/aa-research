package com.waze.sharedrive.g;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.constraintlayout.compose.Measurer2;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Measurer2 f38681a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f38682b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map f38683c;

    public az(Measurer2 measurer2, List list, Map map) {
        this.f38681a = measurer2;
        this.f38682b = list;
        this.f38683c = map;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List<? extends Measurable> list = this.f38682b;
        Map<Measurable, Placeable> map = this.f38683c;
        this.f38681a.performLayout((Placeable.PlacementScope) obj, list, map);
        return h.ab.f48028a;
    }
}
