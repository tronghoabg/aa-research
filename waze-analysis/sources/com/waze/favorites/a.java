package com.waze.favorites;

import com.waze.an.c.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends i {

    /* renamed from: a, reason: collision with root package name */
    private final w f23787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w wVar) {
        super(null);
        x.f(wVar, "favorite");
        this.f23787a = wVar;
    }

    @Override // com.waze.favorites.i
    public final int a() {
        return 1;
    }

    public final w b() {
        return this.f23787a;
    }
}
