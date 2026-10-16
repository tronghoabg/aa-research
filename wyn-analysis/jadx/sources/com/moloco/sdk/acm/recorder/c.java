package com.moloco.sdk.acm.recorder;

import ad.r;
import com.moloco.sdk.acm.f;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.l;
import com.moloco.sdk.acm.o;
import com.moloco.sdk.acm.services.e;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f28464a;

    public c(String str) {
        this.f28464a = str;
    }

    public final void a(h hVar) {
        String str = this.f28464a;
        if (str == null || str.length() == 0) {
            f fVar = f.f28407a;
            f.a(hVar);
        } else {
            hVar.a("mediator", str);
            f fVar2 = f.f28407a;
            f.a(hVar);
        }
    }

    public final void b(l event) {
        AbstractC3340k.e(event, "event");
        String str = this.f28464a;
        if (str == null || str.length() == 0) {
            f fVar = f.f28407a;
            f.b(event);
        } else {
            event.a("mediator", str);
            f fVar2 = f.f28407a;
            f.b(event);
        }
    }

    public final l c(String str) {
        if (f.f28414h.get() != o.f28459a) {
            e.c("AndroidClientMetrics", "Moloco Client Metrics not initialized");
        }
        l.Companion.getClass();
        com.moloco.sdk.acm.services.f fVar = new com.moloco.sdk.acm.services.f(new r());
        l lVar = new l(str, fVar);
        fVar.f28475a.set(System.currentTimeMillis());
        return lVar;
    }
}
