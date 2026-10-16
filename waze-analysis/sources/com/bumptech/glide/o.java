package com.bumptech.glide;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Map f3554a;

    o(o oVar) {
        this.f3554a = DesugarCollections.unmodifiableMap(new HashMap(oVar.f3554a));
    }

    final n a(Class cls) {
        return (n) this.f3554a.get(cls);
    }

    public final boolean b(Class cls) {
        return this.f3554a.containsKey(cls);
    }

    o() {
        this.f3554a = new HashMap();
    }
}
