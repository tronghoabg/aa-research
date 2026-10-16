package com.waze.t;

import h.ab;
import java.io.File;
import java.io.FileOutputStream;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f40836a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f40837b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(g gVar, h.c.e eVar) {
        super(2, eVar);
        this.f40836a = gVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        c cVar = new c(this.f40836a, eVar);
        cVar.f40837b = obj;
        return cVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        g gVar = this.f40836a;
        gVar.f40881c.a(r.a(gVar, " agent side audio finished. will save file"));
        File fileR = gVar.r();
        if (fileR == null) {
            gVar.f40881c.b("session " + gVar.f40886h + ", Conversation " + gVar.f40887i + " failed to create log folder");
            return ab.f48028a;
        }
        String strE = g.e(gVar, gVar.f40888j, "Agent");
        try {
            gVar.f40890l.writeTo(new FileOutputStream(new File(fileR, strE)));
            objA = ab.f48028a;
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        g gVar2 = this.f40836a;
        if (h.m.e(objA)) {
            gVar2.f40881c.a(s.a(gVar2, strE, " wrote agent side audio to "));
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            gVar2.f40881c.c(s.a(gVar2, strE, " failed to write agent side audio to "), thC);
        }
        g.h(gVar2);
        return ab.f48028a;
    }
}
