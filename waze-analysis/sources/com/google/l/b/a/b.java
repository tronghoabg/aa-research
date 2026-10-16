package com.google.l.b.a;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.u f12250a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.l.b.w f12251b;

    b(com.google.l.u uVar, com.google.l.b.w wVar) {
        this.f12250a = uVar;
        this.f12251b = wVar;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        Collection collection = (Collection) this.f12251b.a();
        bVar.i();
        while (bVar.p()) {
            collection.add(this.f12250a.b(bVar));
        }
        bVar.k();
        return collection;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        Collection collection = (Collection) obj;
        if (collection == null) {
            cVar.g();
            return;
        }
        cVar.b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f12250a.d(cVar, it.next());
        }
        cVar.d();
    }
}
