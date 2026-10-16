package com.waze;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class na implements com.waze.sharedui.web.j {
    na(nc ncVar) {
        Objects.requireNonNull(ncVar);
    }

    @Override // com.waze.sharedui.web.j
    public final void a(String str) {
        NativeManager.getInstance().UrlHandler(str);
    }

    @Override // com.waze.sharedui.web.j
    public final void b(String str) {
        NativeManager.getInstance().UrlHandler((!com.waze.x.h.e(str) ? null : com.waze.x.h.c(str)).toString());
    }

    @Override // com.waze.sharedui.web.j
    public final boolean c(String str) {
        return com.waze.x.h.d(str);
    }

    @Override // com.waze.sharedui.web.j
    public final boolean d(String str) {
        return com.waze.x.h.e(str);
    }
}
