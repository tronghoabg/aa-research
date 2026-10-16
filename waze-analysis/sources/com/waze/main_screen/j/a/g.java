package com.waze.main_screen.j.a;

import com.waze.google_assistant.aa;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final b f26475a;

    /* renamed from: b, reason: collision with root package name */
    private final aa f26476b;

    public g(b bVar, aa aaVar) {
        x.f(bVar, "config");
        x.f(aaVar, "manager");
        this.f26475a = bVar;
        this.f26476b = aaVar;
    }

    public final k b() {
        return ai.y(new e(this.f26475a.a(), this));
    }
}
