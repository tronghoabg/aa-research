package com.waze.map.b;

import com.waze.stats.ClientEngStatsEventName;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ay extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f28036a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f28037b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f28038c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f28039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ay(bd bdVar, String str, boolean z, h.c.e eVar) {
        super(2, eVar);
        this.f28037b = bdVar;
        this.f28038c = str;
        this.f28039d = z;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        ay ayVar = new ay(this.f28037b, this.f28038c, this.f28039d, eVar);
        ayVar.f28036a = ((Boolean) obj).booleanValue();
        return ayVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ay) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f28036a;
        bd bdVar = this.f28037b;
        com.waze.shared_infra.i.e eVar = bdVar.f28061h;
        StringBuilder sb = new StringBuilder("reportMainMapCameraIsCentered(isCentered=");
        sb.append(z);
        sb.append(", instanceId=");
        String str = this.f28038c;
        sb.append(str);
        sb.append(", isNewMap=");
        boolean z2 = this.f28039d;
        sb.append(z2);
        eVar.a(sb.toString());
        com.waze.stats.ax axVar = bdVar.f28063j;
        h.g.b.x.f(axVar, "<this>");
        h.g.b.x.f(str, "instanceId");
        com.waze.sharedui.utils.o.P(axVar, ClientEngStatsEventName.MAIN_MAP_CAMERA_IS_CENTERED, new com.waze.stats.h("is_centered", z), new com.waze.stats.k("instance_id", str), new com.waze.stats.h("is_new_map", z2), null, DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON);
        return h.ab.f48028a;
    }
}
