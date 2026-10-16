package com.waze.settings;

import android.view.View;
import com.waze.navigate.NavigateNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fq extends com.waze.settings.tree.d.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gr f37272a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fq(gr grVar, com.waze.ui.ac.n nVar, com.waze.settings.tree.c.g gVar, List list, com.waze.settings.tree.d dVar) {
        super("unpaved_roads", "UNPAVED_ROADS_SETTINGS", nVar, dVar, gVar, list);
        this.f37272a = grVar;
    }

    @Override // com.waze.settings.tree.d.d, com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        NavigateNativeManager.instance().isUsingOneOffNavigationSettings(new com.waze.car_lib.i.a.v(viewO, this.f37272a, 3));
        return viewO;
    }
}
