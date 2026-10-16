package com.bumptech.glide.load.a;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class as {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3043a = new HashMap();

    as() {
        new HashMap();
    }

    final void a(com.bumptech.glide.load.o oVar, ak akVar) {
        this.f3043a.put(oVar, akVar);
    }

    final void b(com.bumptech.glide.load.o oVar, ak akVar) {
        Map map = this.f3043a;
        if (akVar.equals(map.get(oVar))) {
            map.remove(oVar);
        }
    }

    final ak c(com.bumptech.glide.load.o oVar) {
        return (ak) this.f3043a.get(oVar);
    }
}
