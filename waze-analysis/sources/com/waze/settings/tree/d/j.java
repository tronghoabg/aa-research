package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class j extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private final Class f37548a;

    public /* synthetic */ j(String str, String str2, com.waze.ui.ac.n nVar, com.waze.settings.tree.d dVar, Class cls) {
        com.waze.car_lib.o.k kVar = new com.waze.car_lib.o.k(13);
        x.f(str, TtmlNode.ATTR_ID);
        x.f(str2, "analytic");
        x.f(dVar, "icon");
        x.f(cls, "page");
        x.f(kVar, "shouldDisplay");
        super(str, bk.f36871a, str2, nVar, null, dVar, kVar, DisplayStrings.DS_NIGHT);
        this.f37548a = cls;
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final Class c() {
        return this.f37548a;
    }
}
