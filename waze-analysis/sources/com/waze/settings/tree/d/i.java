package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class i extends com.waze.settings.tree.f {
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(String str, String str2, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, com.waze.settings.tree.c cVar, int i2) {
        com.waze.settings.tree.d dVar = (i2 & 16) != 0 ? com.waze.settings.tree.c.f37530a : cVar;
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "analytic");
        x.f(dVar, "icon");
        super(str, bk.f36871a, str2, nVar, nVar2, dVar, null, DisplayStrings.DS_ACCIDENT);
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }
}
