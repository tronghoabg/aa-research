package com.waze.main_screen.d.a;

import com.waze.map.b.ai;
import h.g.b.x;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    private final b f26314a;

    /* renamed from: b, reason: collision with root package name */
    private final ai f26315b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.f.f f26316c;

    public h(b bVar, ai aiVar, com.waze.map.f.f fVar) {
        x.f(bVar, "config");
        x.f(aiVar, "map");
        x.f(fVar, "mapStatsSender");
        this.f26314a = bVar;
        this.f26315b = aiVar;
        this.f26316c = fVar;
    }

    @Override // com.waze.main_screen.d.a.c
    public final k a() {
        return kotlinx.coroutines.b.ai.y(new g(this.f26314a.a(), this));
    }

    public final d b() {
        return new i(this.f26315b, this.f26316c);
    }
}
