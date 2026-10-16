package com.bumptech.glide.load.c.d;

import com.bumptech.glide.load.a.ar;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends com.bumptech.glide.load.c.c.e implements ar {
    public g(e eVar) {
        super(eVar);
    }

    @Override // com.bumptech.glide.load.a.aw
    public final int a() {
        return ((e) this.f3394a).a();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Class b() {
        return e.class;
    }

    @Override // com.bumptech.glide.load.c.c.e, com.bumptech.glide.load.a.ar
    public final void d() {
        ((e) this.f3394a).b().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final void e() {
        e eVar = (e) this.f3394a;
        eVar.stop();
        eVar.e();
    }
}
