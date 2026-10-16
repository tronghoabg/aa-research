package com.google.l.b;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f12365a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f12366b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.l.d f12367c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.google.l.c.a f12368d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f12369e;

    /* renamed from: f, reason: collision with root package name */
    private volatile com.google.l.u f12370f;

    f(g gVar, boolean z, boolean z2, com.google.l.d dVar, com.google.l.c.a aVar) {
        this.f12365a = z;
        this.f12366b = z2;
        this.f12367c = dVar;
        this.f12368d = aVar;
        Objects.requireNonNull(gVar);
        this.f12369e = gVar;
    }

    private final com.google.l.u a() {
        com.google.l.u uVar = this.f12370f;
        if (uVar != null) {
            return uVar;
        }
        com.google.l.u uVarC = this.f12367c.c(this.f12369e, this.f12368d);
        this.f12370f = uVarC;
        return uVarC;
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) throws IOException {
        if (!this.f12365a) {
            return a().b(bVar);
        }
        bVar.o();
        return null;
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) throws IOException {
        if (this.f12366b) {
            cVar.g();
        } else {
            a().d(cVar, obj);
        }
    }
}
