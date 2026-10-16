package com.waze.settings.tree;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.settings.ai;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class g extends f {

    /* renamed from: e, reason: collision with root package name */
    public ai f37568e;

    /* renamed from: k, reason: collision with root package name */
    private final bn f37569k;

    /* renamed from: l, reason: collision with root package name */
    private final ch f37570l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, bk bkVar, String str2, com.waze.ui.ac.n nVar, d dVar, List list) {
        super(str, bkVar, str2, nVar, null, dVar, null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(bkVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(dVar, "iconSource");
        bn bnVarB = ck.b(h.a.i.h());
        this.f37569k = bnVarB;
        this.f37570l = bnVarB;
        if (list != null) {
            B(list);
        }
    }

    public final void B(List list) {
        h.g.b.x.f(list, "children");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f) it.next()).x(this);
        }
        this.f37569k.e(list);
    }

    public void h(de deVar) {
        h.g.b.x.f(deVar, "page");
    }

    public final List i() {
        return (List) this.f37569k.d();
    }

    public final ch j() {
        return this.f37570l;
    }

    @Override // com.waze.settings.tree.f
    public List u() {
        return i();
    }
}
