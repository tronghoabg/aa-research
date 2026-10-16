package com.waze.t.b;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao implements an {
    @Override // com.waze.t.b.an
    public final long a() {
        Long lB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_FEEDBACK_ATTEMPT_COUNT.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.t.b.an
    public final long b() {
        Long lB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_FEEDBACK_SHOW_EVERY_NTH_TIME.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.t.b.an
    public final void c(long j2) {
        ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_FEEDBACK_ATTEMPT_COUNT.d(Long.valueOf(j2));
    }
}
