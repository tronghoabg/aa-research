package com.waze.settings.tree.d;

import androidx.media3.extractor.text.ttml.TtmlNode;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, com.waze.settings.tree.d dVar, com.waze.settings.tree.d dVar2) {
        super(str, nVar, nVar2, dVar, dVar2, null, 32);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(dVar, "iconSource");
        x.f(dVar2, "selectedIconSource");
    }

    public /* synthetic */ a(String str, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, com.waze.settings.tree.d dVar2) {
        this(str, nVar, null, dVar, dVar2);
    }
}
