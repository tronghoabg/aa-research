package com.waze.ab.a;

import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f13756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ad adVar, h.c.e eVar) {
        super(2, eVar);
        this.f13756a = adVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new z(this.f13756a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ad adVar = this.f13756a;
        if (adVar.f13692h == null) {
            adVar.f13692h = new File(adVar.f13691g, "final_user_image.jpg");
        }
        File file = adVar.f13695k;
        File file2 = null;
        if (file == null) {
            return null;
        }
        d dVar = adVar.f13688d;
        String absolutePath = file.getAbsolutePath();
        h.g.b.x.e(absolutePath, "getAbsolutePath(...)");
        File file3 = adVar.f13692h;
        if (file3 == null) {
            h.g.b.x.j("finalFile");
        } else {
            file2 = file3;
        }
        String absolutePath2 = file2.getAbsolutePath();
        h.g.b.x.e(absolutePath2, "getAbsolutePath(...)");
        return dVar.b(absolutePath, absolutePath2, adVar.o.b(), adVar.o.a());
    }
}
