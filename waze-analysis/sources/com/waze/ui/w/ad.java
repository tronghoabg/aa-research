package com.waze.ui.w;

import androidx.compose.runtime.MutableState;
import com.waze.ui.w.b.ao;
import com.waze.ui.w.b.av;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ad implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.af f43532a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f43533b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f43534c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableState f43535d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MutableState f43536e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.ui.x.u f43537f;

    ad(com.waze.ui.x.u uVar, kotlinx.coroutines.af afVar, h.g.a.l lVar, c cVar, MutableState mutableState, MutableState mutableState2) {
        this.f43537f = uVar;
        this.f43532a = afVar;
        this.f43533b = lVar;
        this.f43534c = cVar;
        this.f43535d = mutableState;
        this.f43536e = mutableState2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        av avVar = (av) obj;
        h.g.b.x.f(avVar, "clickedItem");
        this.f43535d.setValue(avVar);
        if (avVar.f() && (this.f43537f instanceof ao)) {
            this.f43536e.setValue(Boolean.valueOf(false));
            aj.z(this.f43532a, null, null, new ac(this.f43533b, avVar, this.f43534c, null), 3);
        } else {
            this.f43533b.invoke(new com.waze.ui.w.b.h(avVar, this.f43534c.d()));
        }
        return h.ab.f48028a;
    }
}
