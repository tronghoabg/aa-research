package com.waze.bq.a;

import com.waze.settings.ao;
import com.waze.t.a.h;
import h.f;
import h.g;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17230a;

    /* renamed from: b, reason: collision with root package name */
    private final f f17231b;

    /* renamed from: c, reason: collision with root package name */
    private final f f17232c;

    public e(com.waze.shared_infra.i.e eVar) {
        x.f(eVar, "logger");
        this.f17230a = eVar;
        this.f17231b = g.a(new ao(1));
        this.f17232c = g.a(new b(this, 0));
    }

    public static final /* synthetic */ com.waze.shared_infra.e.a a(e eVar) {
        return (com.waze.shared_infra.e.a) eVar.f17232c.getValue();
    }

    static final com.waze.shared_infra.e.a d(e eVar) throws Throwable {
        byte[] bArrB = com.waze.utils.a.b((String) eVar.f17231b.getValue());
        x.e(bArrB, "decode(...)");
        return com.waze.shared_infra.g.e.j(bArrB);
    }

    @Override // com.waze.t.a.b
    public final k b(String str, com.waze.t.a.e eVar) {
        x.f(str, "conversationId");
        x.f(eVar, "message");
        this.f17230a.a("sendMessage: conversationId=" + str + ", message=" + eVar);
        return ai.E(new c(eVar, this, null));
    }

    @Override // com.waze.t.a.b
    public final k c(h hVar) {
        x.f(hVar, "trigger");
        Objects.toString(hVar);
        this.f17230a.a("startConversation: trigger=".concat(hVar.toString()));
        return ai.E(new d(this, null));
    }
}
