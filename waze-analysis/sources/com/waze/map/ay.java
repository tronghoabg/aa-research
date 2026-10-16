package com.waze.map;

import android.util.Size;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ay extends com.waze.gas.a {

    /* renamed from: a, reason: collision with root package name */
    private final Size f27979a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.l f27980b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay(Size size, h.g.a.l lVar) {
        super(null, null);
        h.g.b.x.f(size, "maxSizePixels");
        h.g.b.x.f(lVar, "viewCreator");
        this.f27979a = size;
        this.f27980b = lVar;
    }

    public final Size f() {
        return this.f27979a;
    }

    public final h.g.a.l g() {
        return this.f27980b;
    }
}
