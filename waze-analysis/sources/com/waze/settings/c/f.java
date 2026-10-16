package com.waze.settings.c;

import com.waze.settings.de;
import h.ab;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f36934a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ de f36935b;

    f(h hVar, de deVar) {
        this.f36934a = hVar;
        this.f36935b = deVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            this.f36934a.F(this.f36935b);
        } else {
            com.waze.bs.a.f("settings_main.driving_preferences.car_details.ev_profile", "DEEP_LINK", true);
        }
        return ab.f48028a;
    }
}
