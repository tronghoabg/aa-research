package com.waze.settings.g.b;

import com.waze.settings.dy;
import com.waze.settings.dz;
import com.waze.settings.eb;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final eb f37294a;

    public b(eb ebVar) {
        x.f(ebVar, "settingsStatsSender");
        this.f37294a = ebVar;
    }

    @Override // com.waze.settings.g.b.a
    public final void a(dz dzVar, String str, String str2) {
        x.f(dzVar, "screenName");
        x.f(str, "value");
        x.f(str2, "oldValue");
        this.f37294a.c(dzVar, dy.f37100c, null, str2, str, "LICENSE_PLATE");
    }

    @Override // com.waze.settings.g.b.a
    public final void b() {
        this.f37294a.c(dz.x, dy.f37103f, null, null, null, null);
    }
}
