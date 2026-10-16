package com.waze.t.c;

import com.waze.R;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f40838a;

    /* renamed from: b, reason: collision with root package name */
    private final a f40839b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40840c;

    public c(com.waze.shared_infra.o.a aVar, a aVar2) {
        x.f(aVar, "stringProvider");
        x.f(aVar2, "config");
        this.f40838a = aVar;
        this.f40839b = aVar2;
        this.f40840c = "ConversationFeedbackDefaultInsightUiData.id";
    }

    public final long a() {
        return this.f40839b.a();
    }

    public final d b() {
        String strC = this.f40838a.c(R.string.CONVERSATION_INFRA_FEEDBACK_NEGATIVE_BUTTON, new Object[0]);
        a aVar = this.f40839b;
        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.ci;
        if (true != aVar.b()) {
            dVar = null;
        }
        return new d(strC, dVar);
    }

    public final d c() {
        String strC = this.f40838a.c(R.string.CONVERSATION_INFRA_FEEDBACK_POSITIVE_BUTTON, new Object[0]);
        a aVar = this.f40839b;
        com.waze.design_components.b.d dVar = com.waze.design_components.b.d.f23308i;
        if (true != aVar.b()) {
            dVar = null;
        }
        return new d(strC, dVar);
    }

    public final String d() {
        return this.f40840c;
    }

    public final String e() {
        return this.f40838a.c(R.string.CONVERSATION_INFRA_FEEDBACK_TITLE, new Object[0]);
    }
}
