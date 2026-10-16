package com.waze.bl.c.b;

import com.waze.t.b.cb;
import h.g.b.x;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class j implements cb {

    /* renamed from: a, reason: collision with root package name */
    private final String f17020a;

    public /* synthetic */ j() {
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        this.f17020a = string;
    }

    @Override // com.waze.t.b.cb
    public boolean e() {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type com.waze.reportagent.interfaces.data.ReportAgentActionResult");
        return x.n(this.f17020a, ((j) obj).f17020a);
    }

    public int hashCode() {
        return this.f17020a.hashCode();
    }
}
