package com.google.firebase.d.c;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i implements com.google.firebase.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.d.f f9856a = new g(2);

    /* renamed from: b, reason: collision with root package name */
    private final Map f9857b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f9858c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.d.f f9859d = f9856a;

    @Override // com.google.firebase.d.a.b
    public final /* bridge */ /* synthetic */ void a(Class cls, com.google.firebase.d.f fVar) {
        this.f9857b.put(cls, fVar);
        this.f9858c.remove(cls);
    }

    public final j b() {
        return new j(new HashMap(this.f9857b), new HashMap(this.f9858c), this.f9859d);
    }

    public final void c(com.google.firebase.d.a.a aVar) {
        aVar.a(this);
    }
}
