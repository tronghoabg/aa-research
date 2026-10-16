package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f37555a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f37556b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, h.g.a.a aVar, h.g.a.l lVar) {
        super("volume", bk.f36877g, "VOLUME_SETTINGS", nVar, null, dVar, null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        x.f("volume", TtmlNode.ATTR_ID);
        x.f("VOLUME_SETTINGS", "analytic");
        x.f(dVar, "iconSource");
        x.f(aVar, "currentValue");
        x.f(lVar, "onValueChanged");
        this.f37555a = aVar;
        this.f37556b = lVar;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final h.g.a.a c() {
        return this.f37555a;
    }

    public final h.g.a.l d() {
        return this.f37556b;
    }
}
