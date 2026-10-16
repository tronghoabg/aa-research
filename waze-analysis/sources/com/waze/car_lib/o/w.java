package com.waze.car_lib.o;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.car_lib.screens.cp;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f20494a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(String str, com.waze.ui.ac.n nVar, h.g.a.a aVar, int i2) {
        super(str, bk.f36871a, null, nVar, null, com.waze.nightmode.e.r(null), null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        aVar = (i2 & 8) != 0 ? new cp(10) : aVar;
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(aVar, "subtitleProvider");
        this.f20494a = aVar;
    }

    @Override // com.waze.settings.tree.f
    protected final View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    @Override // com.waze.settings.tree.f
    public final String P() {
        return (String) this.f20494a.invoke();
    }
}
