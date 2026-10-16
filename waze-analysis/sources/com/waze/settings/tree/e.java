package com.waze.settings.tree;

import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.settings.tree.views.WazeSettingsView;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class e extends n {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37558a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37559b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, String str2, com.waze.ui.ac.n nVar, d dVar, List list) {
        super(str, str2, nVar, dVar, bk.f36871a, list);
        h.g.b.x.f(str, TtmlNode.ATTR_ID);
        h.g.b.x.f(str2, "analytic");
        h.g.b.x.f(dVar, "iconSource");
        this.f37558a = true;
        this.f37559b = true;
        this.f37560c = true;
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        h.g.b.x.f(deVar, "page");
        WazeSettingsView wazeSettingsView = new WazeSettingsView(deVar.g());
        wazeSettingsView.A(t());
        com.waze.nightmode.e.q(wazeSettingsView, m());
        wazeSettingsView.B(0);
        wazeSettingsView.setOnClickListener(new com.waze.a.y(this, deVar, 20));
        wazeSettingsView.P(g());
        wazeSettingsView.setTag(s());
        return wazeSettingsView;
    }

    public final boolean c() {
        return this.f37558a;
    }

    public final boolean d() {
        return this.f37559b;
    }

    public final boolean e() {
        return this.f37560c;
    }

    public /* synthetic */ e(String str, String str2, com.waze.ui.ac.n nVar, List list) {
        this(str, str2, nVar, c.f37530a, list);
    }
}
