package com.waze.settings.tree.d;

import android.view.View;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.settings.bk;
import com.waze.settings.de;
import com.waze.strings.DisplayStrings;
import h.g.b.ad;
import h.g.b.x;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class g extends com.waze.settings.tree.f {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ h.l.r[] f37542c = {new ad(g.class, "selected", "getSelected()Z", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.settings.tree.d f37543a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f37544b;

    /* renamed from: d, reason: collision with root package name */
    private final h.i.d f37545d;

    /* renamed from: e, reason: collision with root package name */
    private final LiveData f37546e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(String str, com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, com.waze.settings.tree.c cVar, com.waze.settings.tree.d dVar, String str2, int i2) {
        com.waze.settings.tree.d dVar2 = (i2 & 8) != 0 ? com.waze.settings.tree.c.f37530a : cVar;
        dVar = (i2 & 16) != 0 ? com.waze.settings.tree.c.f37530a : dVar;
        com.waze.ui.ac.n nVar3 = (i2 & 4) != 0 ? null : nVar2;
        String str3 = (i2 & 32) != 0 ? null : str2;
        x.f(str, TtmlNode.ATTR_ID);
        x.f(dVar2, "iconSource");
        x.f(dVar, "selectedIconSource");
        super(str, bk.f36876f, str3, nVar, nVar3, dVar2, null, DisplayStrings.DS_ACCIDENT);
        this.f37543a = dVar;
        bn bnVarB = ck.b(false);
        this.f37544b = bnVarB;
        this.f37545d = new f(false, this);
        this.f37546e = FlowLiveDataConversions.asLiveData$default(bnVarB, (h.c.j) null, 0L, 3, (Object) null);
    }

    @Override // com.waze.settings.tree.f
    protected View O(de deVar) {
        x.f(deVar, "page");
        return com.waze.speech.k.d(deVar, this);
    }

    public final LiveData c() {
        return this.f37546e;
    }

    public final com.waze.settings.tree.d d() {
        return this.f37543a;
    }

    public final void f(boolean z) {
        this.f37545d.setValue(this, f37542c[0], Boolean.valueOf(z));
    }

    public final boolean g() {
        return ((Boolean) this.f37545d.getValue(this, f37542c[0])).booleanValue();
    }
}
