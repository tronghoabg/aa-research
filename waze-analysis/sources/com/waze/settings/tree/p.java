package com.waze.settings.tree;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f37582a;

    /* renamed from: b, reason: collision with root package name */
    private final o f37583b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(String str, String str2, o oVar, com.waze.ui.ac.n nVar, c cVar, int i2) {
        d dVar = (i2 & 16) != 0 ? c.f37530a : cVar;
        nVar = (i2 & 8) != 0 ? null : nVar;
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "referencedId");
        h.g.b.x.f(oVar, "referencedSettingProvider");
        h.g.b.x.f(dVar, "overrideIconSource");
        super(str, bk.p, null, nVar, null, dVar, null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        this.f37582a = str2;
        this.f37583b = oVar;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        o oVar = this.f37583b;
        String str = this.f37582a;
        f fVarA = oVar.a(str);
        if (fVarA == null) {
            throw new IllegalArgumentException("Setting: " + str + " was referenced but not found");
        }
        View viewK = fVarA.k(deVar);
        h.g.b.x.c(viewK);
        if (viewK instanceof WazeSettingsView) {
            if (t() != null) {
                ((WazeSettingsView) viewK).A(t());
            }
            if (!h.g.b.x.n(m(), c.f37530a)) {
                com.waze.nightmode.e.q((WazeSettingsView) viewK, m());
            }
        }
        return viewK;
    }

    @Override // com.waze.settings.tree.f
    public final boolean z() {
        f fVarA = this.f37583b.a(this.f37582a);
        return fVarA != null && super.z() && fVarA.z();
    }
}
