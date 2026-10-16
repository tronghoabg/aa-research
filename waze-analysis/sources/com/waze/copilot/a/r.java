package com.waze.copilot.a;

import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f22854a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f22855b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f22856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, String str, String str2, h.c.e eVar) {
        super(2, eVar);
        this.f22854a = sVar;
        this.f22855b = str;
        this.f22856c = str2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new r(this.f22854a, this.f22855b, this.f22856c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((r) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        s sVar = this.f22854a;
        for (File file : h.f.s.c(new File(String.valueOf(com.waze.t.f(sVar.f22858b)).concat("/waze/skins/default/cars")), h.f.l.f48089a)) {
            if (file.exists()) {
                String str = this.f22855b;
                if (str != null) {
                    String name = file.getName();
                    h.g.b.x.e(name, "getName(...)");
                    if (!h.n.o.ah(name, str)) {
                    }
                }
                String str2 = this.f22856c;
                String name2 = file.getName();
                h.g.b.x.e(name2, "getName(...)");
                if (!h.n.o.ah(name2, str2)) {
                    String name3 = file.getName();
                    h.g.b.x.e(name3, "getName(...)");
                    if (!h.n.o.ah(name3, "MAP_CAR_Arrow")) {
                        String name4 = file.getName();
                        h.g.b.x.e(name4, "getName(...)");
                        if (!h.n.o.ah(name4, "Arrow")) {
                            String name5 = file.getName();
                            h.g.b.x.e(name5, "getName(...)");
                            if (!h.n.o.ah(name5, "arrow") && !sVar.f22860d.contains(file.getName())) {
                                boolean zDelete = file.delete();
                                sVar.f22857a.a("deleting unused car: " + file.getPath() + " success: " + zDelete);
                            }
                        }
                    }
                }
            }
        }
        return h.ab.f48028a;
    }
}
