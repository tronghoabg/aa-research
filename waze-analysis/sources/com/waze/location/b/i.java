package com.waze.location.b;

import com.waze.location.y;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    private final a f25326a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.e.g f25327b;

    /* renamed from: c, reason: collision with root package name */
    private final y f25328c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25329d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.perf.tracer.g f25330e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f25331f;

    public i(a aVar, com.waze.sharedui.e.g gVar, y yVar, com.waze.shared_infra.i.e eVar, com.waze.perf.tracer.g gVar2, com.waze.shared_infra.q.e eVar2) {
        x.f(aVar, "config");
        x.f(gVar, "locationService");
        x.f(yVar, "locationEventManagerInterface");
        x.f(eVar, "logger");
        x.f(gVar2, "perfTracer");
        x.f(eVar2, "wazeClock");
        this.f25326a = aVar;
        this.f25327b = gVar;
        this.f25328c = yVar;
        this.f25329d = eVar;
        this.f25330e = gVar2;
        this.f25331f = eVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(c cVar) {
        long jA = this.f25331f.a();
        Long lI = cVar.c().i();
        if (lI != null) {
            long jLongValue = lI.longValue();
            h.o.c cVar2 = h.o.a.f48264a;
            long j2 = h.o.c.j(jA - h.o.a.m(h.o.c.j(jLongValue, h.o.d.f48273d)), h.o.d.f48272c);
            com.waze.shared_infra.i.e eVar = this.f25329d;
            String strY = h.o.a.y(j2);
            a aVar = this.f25326a;
            eVar.a("freshness check, locationAgeFromNow: " + strY + ", freshness limit:" + h.o.a.y(aVar.a()));
            if (h.o.a.c(h.o.a.j(j2), aVar.a()) <= 0) {
                Objects.toString(cVar);
                eVar.a("location is fresh ".concat(cVar.toString()));
                return true;
            }
            Objects.toString(cVar);
            eVar.a("location is not fresh ".concat(cVar.toString()));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092 A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:32:0x008c, B:35:0x0092, B:36:0x00ba, B:37:0x00bd, B:46:0x00d8, B:47:0x00db, B:45:0x00d4, B:48:0x00dc), top: B:66:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:32:0x008c, B:35:0x0092, B:36:0x00ba, B:37:0x00bd, B:46:0x00d8, B:47:0x00db, B:45:0x00d4, B:48:0x00dc), top: B:66:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.location.b.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h.c.e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.location.b.i.a(h.c.e):java.lang.Object");
    }
}
