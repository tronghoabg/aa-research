package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.bp;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class h extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private final bp f37547a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ h(String str, String str2, com.waze.ui.ac.n nVar, com.waze.settings.tree.c cVar, com.waze.settings.tree.c.c cVar2, bp bpVar, int i2) {
        com.waze.settings.tree.d dVar = (i2 & 16) != 0 ? com.waze.settings.tree.c.f37530a : cVar;
        com.waze.settings.tree.c.c kVar = (i2 & 32) != 0 ? new com.waze.car_lib.o.k(12) : cVar2;
        x.f(str, TtmlNode.ATTR_ID);
        x.f(dVar, "iconSource");
        x.f(kVar, "shouldDisplay");
        super(str, bk.f36871a, str2, nVar, null, dVar, kVar);
        this.f37547a = bpVar;
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final bp c() {
        return this.f37547a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, int i2, String str2, int i3, bp bpVar) {
        super(str, bk.f36871a, str2, com.waze.ui.ad.b.c(Integer.valueOf(i2)), null, com.waze.nightmode.e.s(Integer.valueOf(i3)), null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        x.f(str, TtmlNode.ATTR_ID);
        this.f37547a = bpVar;
    }
}
