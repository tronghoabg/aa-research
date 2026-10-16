package com.waze.settings.tree.d;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class k extends com.waze.settings.tree.f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.c.h f37549a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37550b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37551c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(String str, String str2, Integer num, com.waze.settings.tree.c.h hVar, int i2, int i3, boolean z, int i4) {
        bk bkVar = (i4 & 64) != 0 ? bk.f36881k : null;
        int i5 = (i4 & 16) != 0 ? 0 : i2;
        boolean z2 = (i4 & 128) == 0;
        x.f(str, TtmlNode.ATTR_ID);
        x.f(hVar, "valueChangedHandler");
        x.f(bkVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        super(str, bkVar, str2, com.waze.ui.ad.b.c(num), null, new com.waze.settings.tree.a(i5), null, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_BRIDGE_OVERPASS);
        this.f37549a = hVar;
        this.f37550b = i3;
        this.f37551c = z2 & z;
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final int c() {
        return this.f37550b;
    }

    public final com.waze.settings.tree.c.h d() {
        return this.f37549a;
    }

    public final boolean e() {
        return this.f37551c;
    }
}
