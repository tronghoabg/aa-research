package com.waze.t;

import h.ab;
import h.g.b.x;
import java.io.File;
import java.io.FileOutputStream;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class f extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f40876a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ byte[] f40877b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f40878c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, byte[] bArr, h.c.e eVar) {
        super(2, eVar);
        this.f40876a = gVar;
        this.f40877b = bArr;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        f fVar = new f(this.f40876a, this.f40877b, eVar);
        fVar.f40878c = obj;
        return fVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((f) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        g gVar = this.f40876a;
        gVar.f40881c.a(r.a(gVar, " got user side audio"));
        File fileR = gVar.r();
        if (fileR == null) {
            return ab.f48028a;
        }
        String strE = g.e(gVar, gVar.f40888j, "User");
        File file = new File(fileR, strE);
        byte[] bArr = this.f40877b;
        try {
            x.f(file, "<this>");
            x.f(bArr, "array");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                h.a.i.aW(fileOutputStream, null);
                objA = ab.f48028a;
            } finally {
            }
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        g gVar2 = this.f40876a;
        if (h.m.e(objA)) {
            gVar2.f40881c.a(s.a(gVar2, strE, " wrote user side audio to "));
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            gVar2.f40881c.c(s.a(gVar2, strE, " failed to write user side audio to "), thC);
        }
        g.h(gVar2);
        return ab.f48028a;
    }
}
