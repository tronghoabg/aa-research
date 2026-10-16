package com.waze.o.b.a;

import com.waze.o.ac;
import com.waze.o.aw;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements com.waze.o.c.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final ac f32670a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32671b;

    public f(ac acVar, com.waze.shared_infra.i.e eVar) {
        x.f(acVar, "companinioGrpcService");
        x.f(eVar, "logger");
        this.f32670a = acVar;
        this.f32671b = eVar;
    }

    @Override // com.waze.o.c.a.b
    public final k a(com.waze.o.x xVar) {
        x.f(xVar, "chatRequest");
        Objects.toString(xVar);
        String strConcat = "Sending a new chat request: ".concat(String.valueOf(xVar));
        com.waze.shared_infra.i.e eVar = this.f32671b;
        eVar.a(strConcat);
        return com.waze.aj.b.a(xVar, this.f32670a, eVar, new com.waze.o.a.a(18));
    }

    @Override // com.waze.o.c.a.b
    public final k b(aw awVar) {
        x.f(awVar, "startChatRequest");
        Objects.toString(awVar);
        String strConcat = "Sending a new start chat request: ".concat(String.valueOf(awVar));
        com.waze.shared_infra.i.e eVar = this.f32671b;
        eVar.a(strConcat);
        return com.waze.aj.b.a(awVar, this.f32670a, eVar, new com.waze.o.a.a(17));
    }
}
