package com.waze.modules.b.a;

import com.google.v.fi;
import com.waze.stats.o;
import com.waze.stats.s;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class c implements s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29807a;

    public c(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f29807a = eVar;
    }

    protected abstract Object a();

    public abstract void b(List list, fi fiVar);

    @Override // com.waze.stats.s
    public final Object c(List list, fi fiVar) {
        Object objA = a();
        com.waze.shared_infra.i.e eVar = this.f29807a;
        if (objA == null) {
            eVar.b("Client not initialized");
            return e.b.c.a(o.f40600a);
        }
        try {
            eVar.a("Sending stats");
            b(list, fiVar);
            eVar.a("Successfully sent " + list.size());
            return list;
        } catch (Exception e2) {
            Exception exc = e2;
            this.f29807a.c("Send failed", exc);
            return e.b.c.a(exc);
        }
    }
}
