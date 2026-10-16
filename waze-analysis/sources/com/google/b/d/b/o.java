package com.google.b.d.b;

import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final o f7107a = new o(UUID.randomUUID());

    private o(UUID uuid) {
        super("<skip trace>", uuid, a.bo(uuid), q.f7113a, j.a());
    }

    @Override // com.google.b.d.b.x
    public final r j() {
        return q.f7113a;
    }

    @Override // com.google.b.d.b.x
    public final x k(String str, r rVar, w wVar) {
        throw new IllegalStateException("Can't create child trace for no trace!");
    }

    @Override // com.google.b.d.b.x
    public final void l() {
    }
}
