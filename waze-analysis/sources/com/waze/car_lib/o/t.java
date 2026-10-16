package com.waze.car_lib.o;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.car_lib.screens.cp;
import com.waze.settings.bp;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t extends com.waze.settings.tree.d.h {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f20490a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t(String str, String str2, com.waze.ui.ac.n nVar, h.g.a.a aVar, com.waze.settings.tree.c cVar, bp bpVar, int i2) {
        aVar = (i2 & 8) != 0 ? new cp(9) : aVar;
        com.waze.settings.tree.d dVar = (i2 & 16) != 0 ? com.waze.settings.tree.c.f37530a : cVar;
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(aVar, "subtitleProvider");
        h.g.b.x.f(dVar, "iconSource");
        super(str, str2, nVar, dVar, null, bpVar, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_RECALCULATE_2W_4);
        this.f20490a = aVar;
    }

    @Override // com.waze.settings.tree.f
    public final String P() {
        return (String) this.f20490a.invoke();
    }
}
