package com.waze.settings.tree;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.settings.bk;
import com.waze.strings.DisplayStrings;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class m extends f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.c.h f37577a;

    /* renamed from: b, reason: collision with root package name */
    private List f37578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, bk bkVar, Integer num, String str2, com.waze.settings.tree.c.h hVar, List list) {
        super(str, bkVar, str2, com.waze.ui.ad.b.c(num), null, com.waze.nightmode.e.s(0), null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        h.g.b.x.f(bkVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        h.g.b.x.f(hVar, "valueChangedHandler");
        h.g.b.x.f(list, "options");
        this.f37577a = hVar;
        this.f37578b = list;
    }

    public final int c() {
        Iterator it = this.f37578b.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (h.g.b.x.n(((com.waze.settings.tree.d.g) it.next()).s(), this.f37577a.b())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final com.waze.settings.tree.c.h d() {
        return this.f37577a;
    }

    public final com.waze.settings.tree.d.g e() {
        return (com.waze.settings.tree.d.g) h.a.i.S(this.f37578b, c());
    }

    public final List f() {
        return this.f37578b;
    }

    public final void g(List list) {
        h.g.b.x.f(list, "<set-?>");
        this.f37578b = list;
    }
}
