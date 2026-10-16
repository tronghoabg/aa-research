package com.google.l.b.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.c.a f12232a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12233b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.l.p f12234c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.l.h f12235d;

    ad(Object obj, com.google.l.c.a aVar, boolean z) {
        com.google.l.p pVar = obj instanceof com.google.l.p ? (com.google.l.p) obj : null;
        this.f12234c = pVar;
        com.google.l.h hVar = obj instanceof com.google.l.h ? (com.google.l.h) obj : null;
        this.f12235d = hVar;
        if (pVar != null || hVar != null) {
            this.f12232a = aVar;
            this.f12233b = z;
            return;
        }
        Objects.requireNonNull(obj);
        throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        com.google.l.c.a aVar2 = this.f12232a;
        if (aVar2.equals(aVar) || (this.f12233b && aVar2.d() == aVar.c())) {
            return new ae(this.f12234c, this.f12235d, dVar, aVar, this, true);
        }
        return null;
    }
}
