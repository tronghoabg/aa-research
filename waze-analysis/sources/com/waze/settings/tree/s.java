package com.waze.settings.tree;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends com.waze.settings.tree.d.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.c.b f37585a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.tree.c.b f37586b;

    public /* synthetic */ s(String str, String str2, com.waze.ui.ac.n nVar, d dVar, com.waze.settings.tree.c.b bVar, com.waze.settings.tree.c.b bVar2, h.g.a.p pVar, int i2) {
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "analytic");
        h.g.b.x.f(dVar, "iconSource");
        com.waze.settings.tree.c.b bVar3 = bVar;
        bk bkVar = bk.m;
        ArrayList arrayList = new ArrayList();
        bVar3 = (i2 & 16) != 0 ? null : bVar3;
        if (bVar3 != null) {
            arrayList.add(new q(bVar3));
        }
        com.waze.settings.tree.c.b bVar4 = (i2 & 32) != 0 ? null : bVar2;
        if (bVar4 != null) {
            arrayList.add(new r(bVar4, (i2 & 128) != 0 ? null : pVar));
        }
        super(str, str2, nVar, dVar, bkVar, arrayList);
        this.f37585a = bVar3;
        this.f37586b = bVar4;
    }

    @Override // com.waze.settings.tree.d.n, com.waze.settings.tree.f
    protected final View O(de deVar) {
        boolean z;
        h.g.b.x.f(deVar, "page");
        View viewO = super.O(deVar);
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        String strC = aVarA.c(R.string.NONE, new Object[0]);
        com.waze.settings.tree.c.b bVar = this.f37585a;
        if (bVar == null || !bVar.Q()) {
            z = false;
        } else {
            strC = aVarA.c(R.string.REPORT_STATE_SHOW_ON_MAP, new Object[0]);
            z = true;
        }
        com.waze.settings.tree.c.b bVar2 = this.f37586b;
        if (bVar2 != null && bVar2.Q()) {
            strC = (z ? String.valueOf(strC).concat(", ") : "").concat(String.valueOf(aVarA.c(R.string.REPORT_STATE_ALERTS, new Object[0])));
        }
        ((WazeSettingsView) viewO).P(strC);
        return viewO;
    }
}
