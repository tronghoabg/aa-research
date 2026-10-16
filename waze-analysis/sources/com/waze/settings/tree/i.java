package com.waze.settings.tree;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.de;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class i extends com.waze.settings.tree.d.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, com.waze.ui.ac.n nVar, d dVar) {
        super(str, str2, nVar, dVar, (List) null, 48);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "analytic");
        h.g.b.x.f(dVar, "iconSource");
    }

    public abstract List c();

    public final void d() {
        B(c());
    }

    @Override // com.waze.settings.tree.g
    public final void h(de deVar) {
        h.g.b.x.f(deVar, "page");
        d();
    }
}
