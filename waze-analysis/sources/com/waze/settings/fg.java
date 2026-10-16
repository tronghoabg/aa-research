package com.waze.settings;

import android.view.View;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fg implements com.waze.settings.tree.c.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ds f37253a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37254b;

    fg(ds dsVar, int i2) {
        this.f37254b = i2;
        this.f37253a = dsVar;
    }

    @Override // com.waze.settings.tree.c.h
    public final LiveData a() {
        int i2 = this.f37254b;
        if (i2 == 0) {
            return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(this.f37253a.A(), 8)), (h.c.j) null, 0L, 3, (Object) null);
        }
        if (i2 == 1) {
            return FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(this.f37253a.A(), 7)), (h.c.j) null, 0L, 3, (Object) null);
        }
        ds dsVar = this.f37253a;
        return i2 != 2 ? FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(dsVar.A(), 11)), (h.c.j) null, 0L, 3, (Object) null) : FlowLiveDataConversions.asLiveData$default(kotlinx.coroutines.b.ai.y(new dl(dsVar.A(), 10)), (h.c.j) null, 0L, 3, (Object) null);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        int i2 = this.f37254b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? (String) a().getValue() : (String) a().getValue() : (String) a().getValue() : (String) a().getValue();
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        int i2 = this.f37254b;
        if (i2 == 0) {
            com.waze.config.cv cvVar = new com.waze.config.cv(str, 15);
            ds dsVar = this.f37253a;
            dsVar.aa(cvVar);
            hg hgVarE = ((bs) dsVar.A().d()).e();
            h.g.b.x.d(hgVarE, "null cannot be cast to non-null type com.waze.settings.WazeUserState.Data");
            dsVar.R(com.waze.network.f.ak.n((he) hgVarE));
            return;
        }
        if (i2 == 1) {
            com.waze.config.cv cvVar2 = new com.waze.config.cv(str, 14);
            ds dsVar2 = this.f37253a;
            dsVar2.aa(cvVar2);
            hg hgVarE2 = ((bs) dsVar2.A().d()).e();
            h.g.b.x.d(hgVarE2, "null cannot be cast to non-null type com.waze.settings.WazeUserState.Data");
            dsVar2.R(com.waze.network.f.ak.n((he) hgVarE2));
            return;
        }
        if (i2 != 2) {
            if (h.g.b.x.n(str, str2)) {
                return;
            }
            ds dsVar3 = this.f37253a;
            if (str == null) {
                str = "";
            }
            dsVar3.X(str);
            return;
        }
        com.waze.config.cv cvVar3 = new com.waze.config.cv(str, 16);
        ds dsVar4 = this.f37253a;
        dsVar4.aa(cvVar3);
        String str3 = str;
        dsVar4.R((str3 == null || str3.length() == 0) ? false : true);
        com.waze.sharedui.views.aj ajVar = (com.waze.sharedui.views.aj) view;
        h.g.b.x.c(ajVar);
        ajVar.t(com.waze.sharedui.views.ac.FOCUS);
    }
}
