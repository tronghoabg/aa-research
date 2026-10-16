package com.waze.t.c;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {
    @Override // com.waze.t.c.a
    public final long a() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_FEEDBACK_TIMEOUT_MS.b();
        x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48272c);
    }

    @Override // com.waze.t.c.a
    public final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_FEEDBACK_SHOW_BUTTON_ICON.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
