package com.waze.car_lib.c;

import com.b.b.a.u;
import com.waze.search.stats.s;
import com.waze.strings.DisplayStrings;
import com.waze.z;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final s f19225a;

    /* renamed from: b, reason: collision with root package name */
    private final z f19226b;

    public e(s sVar, z zVar) {
        x.f(sVar, "searchStatsSender");
        x.f(zVar, "appType");
        this.f19225a = sVar;
        this.f19226b = zVar;
    }

    public final void a(com.waze.search.stats.c cVar, int i2, String str, int i3, int i4) {
        x.f(cVar, "clickType");
        x.f(str, "searchTerm");
        this.f19225a.d(cVar, (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 2) != 0 ? null : Long.valueOf(i2), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 4) != 0 ? null : Integer.valueOf(i4), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 8) != 0 ? null : Long.valueOf(o.v(str).toString().length()), (DisplayStrings.DS_SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON & 16) != 0 ? null : Integer.valueOf(i3), null, null, null, null, null, null, u.g(this.f19226b));
    }

    public final void b(String str, int i2, int i3, boolean z) {
        x.f(str, "searchTerm");
        this.f19225a.e(str.length(), i2, i3, Boolean.valueOf(z), false, null, null, u.g(this.f19226b));
    }
}
