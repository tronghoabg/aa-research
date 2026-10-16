package kotlinx.coroutines;

import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class z implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f52069a;

    public /* synthetic */ z(int i2) {
        this.f52069a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f52069a) {
            case 0:
                h.c.h hVar = (h.c.h) obj;
                if (hVar instanceof ab) {
                    return (ab) hVar;
                }
                return null;
            case 1:
                String str = (String) obj;
                h.g.b.x.f(str, "line");
                return str;
            case 2:
                h.c.h hVar2 = (h.c.h) obj;
                if (hVar2 instanceof bh) {
                    return (bh) hVar2;
                }
                return null;
            case 3:
                return obj;
            case 4:
                int i2 = kotlinx.coroutines.e.r.f51912a;
                return null;
            case 5:
                h.g.b.x.f((kotlinx.b.a.a) obj, "<this>");
                return h.ab.f48028a;
            case 6:
                h.g.b.x.f((kotlinx.b.a.a) obj, "<this>");
                return h.ab.f48028a;
            case 7:
                kotlinx.b.a.a aVar = (kotlinx.b.a.a) obj;
                kotlinx.b.d.n nVar = kotlinx.b.d.n.f51215a;
                h.g.b.x.f(aVar, "$this$buildSerialDescriptor");
                kotlinx.b.a.a.g(aVar, "JsonPrimitive", kotlinx.b.d.aa.a(new com.waze.ui.r.a.e.c(17)));
                kotlinx.b.a.a.g(aVar, "JsonNull", kotlinx.b.d.aa.a(new com.waze.ui.r.a.e.c(18)));
                kotlinx.b.a.a.g(aVar, "JsonLiteral", kotlinx.b.d.aa.a(new kotlinx.b.d.m()));
                kotlinx.b.a.a.g(aVar, "JsonObject", kotlinx.b.d.aa.a(new com.waze.ui.r.a.e.c(19)));
                kotlinx.b.a.a.g(aVar, "JsonArray", kotlinx.b.d.aa.a(new com.waze.ui.r.a.e.c(20)));
                return h.ab.f48028a;
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                h.g.b.x.f(entry, "<destruct>");
                String str2 = (String) entry.getKey();
                kotlinx.b.d.k kVar = (kotlinx.b.d.k) entry.getValue();
                StringBuilder sb = new StringBuilder();
                kotlinx.b.d.a.ag.a(sb, str2);
                sb.append(':');
                sb.append(kVar);
                return sb.toString();
            case 9:
                org.a.d.g.a aVar2 = (org.a.d.g.a) obj;
                int i3 = org.a.b.a.b.a.f56353a;
                h.g.b.x.f(aVar2, "$this$module");
                com.waze.cf.j jVar = new com.waze.cf.j(12);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56382a;
                List listH = h.a.i.h();
                int i4 = h.g.b.ar.f48106a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar, new h.g.b.m(android.support.v4.app.az.class), null, jVar, cVar, listH));
                aVar2.f(eVar);
                new org.a.d.c.d(aVar2, eVar);
                return h.ab.f48028a;
            default:
                h.l.c cVar2 = (h.l.c) obj;
                h.g.b.x.f(cVar2, "it");
                return org.a.e.a.a(cVar2);
        }
    }
}
