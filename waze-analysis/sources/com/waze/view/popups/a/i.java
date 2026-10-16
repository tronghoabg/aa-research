package com.waze.view.popups.a;

import com.waze.map.bk;
import com.waze.map.bl;
import com.waze.realtime.RealtimeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aa f45207a;

    i(aa aaVar) {
        this.f45207a = aaVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        bl blVar = (bl) obj;
        boolean z = blVar instanceof bk;
        RealtimeNativeManager realtimeNativeManager = this.f45207a.f45140a;
        bk bkVar = z ? (bk) blVar : null;
        realtimeNativeManager.onCurrentShownWazerIdChanged(bkVar != null ? new Integer(bkVar.f28413a) : null);
        return h.ab.f48028a;
    }
}
