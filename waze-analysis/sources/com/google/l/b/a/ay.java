package com.google.l.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ay implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.l.c.a f12248a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.l.u f12249b;

    ay(com.google.l.c.a aVar, com.google.l.u uVar) {
        this.f12248a = aVar;
        this.f12249b = uVar;
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        if (aVar.equals(this.f12248a)) {
            return this.f12249b;
        }
        return null;
    }
}
