package com.waze.sound;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    private final long f39886a;

    public ec(byte[] bArr) {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_MAX_SPEAK_TIME_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f39886a = h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }

    public final long a() {
        return this.f39886a;
    }

    public final long b() {
        return this.f39886a;
    }

    public ec() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_MAX_LISTENING_TIME_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f39886a = h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }
}
