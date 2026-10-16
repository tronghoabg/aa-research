package com.waze.bl.b.a;

import com.waze.bm.a.a.ac;
import com.waze.bm.a.a.ai;
import com.waze.bm.a.a.an;
import com.waze.perf.o;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements com.waze.bl.c.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final ac f16895a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16896b;

    public a(ac acVar, com.waze.shared_infra.i.e eVar) {
        x.f(acVar, "reportingAgentGrpcService");
        x.f(eVar, "logger");
        this.f16895a = acVar;
        this.f16896b = eVar;
    }

    @Override // com.waze.bl.c.a.b
    public final k a(ai aiVar) {
        x.f(aiVar, "chatRequest");
        Objects.toString(aiVar);
        String strConcat = "Sending a new chat request: ".concat(String.valueOf(aiVar));
        com.waze.shared_infra.i.e eVar = this.f16896b;
        eVar.a(strConcat);
        return com.waze.aj.b.a(aiVar, this.f16895a, eVar, new o(6));
    }

    @Override // com.waze.bl.c.a.b
    public final k b(an anVar) {
        x.f(anVar, "startChatRequest");
        Objects.toString(anVar);
        String strConcat = "Sending a new start chat request: ".concat(String.valueOf(anVar));
        com.waze.shared_infra.i.e eVar = this.f16896b;
        eVar.a(strConcat);
        return com.waze.aj.b.a(anVar, this.f16895a, eVar, new o(7));
    }
}
