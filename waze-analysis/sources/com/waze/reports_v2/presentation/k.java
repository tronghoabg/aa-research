package com.waze.reports_v2.presentation;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35050a;

    public k() {
        h.g.b.x.e(ConfigValues.CONFIG_VALUE_MAP_SHOW_SPEEDOMETER.l(), "getStateFlow(...)");
        kotlinx.coroutines.b.ch chVarL = ConfigValues.CONFIG_VALUE_MAP_ICONS_SHOW_ON_SCREEN_ON_TAP.l();
        h.g.b.x.e(chVarL, "getStateFlow(...)");
        this.f35050a = chVarL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    public final void a() {
        this.f35050a.invoke();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.reports_v2.c.ao, java.lang.Object] */
    public final com.waze.reports_v2.b.aa b() {
        ?? r3 = this.f35050a;
        boolean zN = r3.n();
        Object obj = r3;
        if (true != zN) {
            obj = null;
        }
        if (obj != null) {
            return new com.waze.reports_v2.b.aa();
        }
        return null;
    }

    public final AnchoredDraggableState c() {
        return (AnchoredDraggableState) this.f35050a;
    }

    public final com.waze.notifications.c.a d() {
        return (com.waze.notifications.c.a) ((AnchoredDraggableState) this.f35050a).getCurrentValue();
    }

    public final com.waze.notifications.c.a e() {
        return (com.waze.notifications.c.a) ((AnchoredDraggableState) this.f35050a).getTargetValue();
    }

    public final Object f(h.c.e eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default((AnchoredDraggableState) this.f35050a, com.waze.notifications.c.a.f32573b, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : h.ab.f48028a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final kotlinx.coroutines.b.ch g() {
        return this.f35050a;
    }

    public k(com.waze.reports_v2.d.j jVar, com.waze.reports_v2.c.ao aoVar) {
        h.g.b.x.f(jVar, "statsSender");
        h.g.b.x.f(aoVar, "config");
        this.f35050a = aoVar;
    }

    public k(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onOpenAddPLace");
        this.f35050a = aVar;
    }

    public k(AnchoredDraggableState anchoredDraggableState) {
        h.g.b.x.f(anchoredDraggableState, "anchoredDraggableState");
        this.f35050a = anchoredDraggableState;
    }
}
