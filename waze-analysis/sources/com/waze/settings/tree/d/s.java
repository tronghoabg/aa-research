package com.waze.settings.tree.d;

import android.view.View;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class s extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private com.waze.settings.tree.c.b f37557a;

    public s(String str, int i2, int i3, String str2, com.waze.config.b bVar, int i4) {
        x.f(bVar, "config");
        Integer numValueOf = Integer.valueOf(i3);
        com.waze.settings.tree.c.a aVar = new com.waze.settings.tree.c.a(bVar);
        x.f(aVar, "valueChangedHandler");
        super(str, bk.f36873c, str2, com.waze.ui.ad.b.c(Integer.valueOf(i2)), com.waze.ui.ad.b.c(numValueOf), com.waze.nightmode.e.s(Integer.valueOf(i4)), null, DisplayStrings.DS_ACCIDENT);
        this.f37557a = aVar;
    }

    public final com.waze.settings.tree.c.b B() {
        return this.f37557a;
    }

    @Override // com.waze.settings.tree.f
    public View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public /* synthetic */ s(String str, int i2, int i3, String str2, com.waze.config.b bVar) {
        this(str, i2, i3, str2, bVar, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(String str, int i2, String str2, com.waze.config.b bVar) {
        this(str, i2, str2, new com.waze.settings.tree.c.a(bVar), 0);
        x.f(bVar, "config");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(String str, int i2, String str2, com.waze.config.b bVar, int i3) {
        this(str, i2, str2, new com.waze.settings.tree.c.a(bVar), i3);
        x.f(bVar, "config");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, int i2, String str2, com.waze.settings.tree.c.b bVar, int i3) {
        super(str, bk.f36873c, str2, com.waze.ui.ad.b.c(Integer.valueOf(i2)), null, com.waze.nightmode.e.s(Integer.valueOf(i3)), null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        x.f(bVar, "valueChangedHandler");
        this.f37557a = bVar;
    }

    public /* synthetic */ s(String str, int i2, String str2, com.waze.settings.tree.c.b bVar) {
        this(str, i2, str2, bVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, int i2, String str2, String str3, com.waze.settings.tree.c.b bVar, int i3) {
        super(str, bk.f36873c, str3, com.waze.ui.ad.b.c(Integer.valueOf(i2)), com.waze.ui.ad.b.d(str2), com.waze.nightmode.e.s(Integer.valueOf(i3)), null, DisplayStrings.DS_ACCIDENT);
        x.f(bVar, "valueChangedHandler");
        this.f37557a = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, Integer num, Integer num2, String str2, com.waze.settings.tree.c.b bVar) {
        super(str, bk.f36873c, str2, com.waze.ui.ad.b.c(num), com.waze.ui.ad.b.c(num2), com.waze.nightmode.e.s(0), null, DisplayStrings.DS_ACCIDENT);
        x.f(bVar, "valueChangedHandler");
        this.f37557a = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(String str, String str2, String str3, com.waze.settings.tree.c.b bVar) {
        super(str, bk.f36873c, str3, com.waze.ui.ad.b.d(str2), null, com.waze.nightmode.e.r(null), null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        x.f(bVar, "valueChangedHandler");
        this.f37557a = bVar;
    }
}
