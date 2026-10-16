package com.google.firebase.perf.f;

import com.google.v.dm;
import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al extends dm<ao, al> implements ap {
    /* synthetic */ al(byte[] bArr) {
        super(ao.DEFAULT_INSTANCE);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ((ao) this.instance).addAllPerfSessions(iterable);
    }

    public final void b(Iterable iterable) {
        copyOnWrite();
        ((ao) this.instance).addAllSubtraces(iterable);
    }

    public final void c(ah ahVar) {
        copyOnWrite();
        ((ao) this.instance).addPerfSessions(ahVar);
    }

    public final void d(ao aoVar) {
        copyOnWrite();
        ((ao) this.instance).addSubtraces(aoVar);
    }

    public final void e(Map map) {
        copyOnWrite();
        ((ao) this.instance).getMutableCountersMap().putAll(map);
    }

    public final void f(Map map) {
        copyOnWrite();
        ((ao) this.instance).getMutableCustomAttributesMap().putAll(map);
    }

    public final void g(String str, long j2) {
        Objects.requireNonNull(str);
        copyOnWrite();
        ((ao) this.instance).getMutableCountersMap().put(str, Long.valueOf(j2));
    }

    public final void h(String str) {
        Objects.requireNonNull("systemDeterminedForeground");
        Objects.requireNonNull(str);
        copyOnWrite();
        ((ao) this.instance).getMutableCustomAttributesMap().put("systemDeterminedForeground", str);
    }

    public final void i(long j2) {
        copyOnWrite();
        ((ao) this.instance).setClientStartTimeUs(j2);
    }

    public final void j(long j2) {
        copyOnWrite();
        ((ao) this.instance).setDurationUs(j2);
    }

    public final void k(String str) {
        copyOnWrite();
        ((ao) this.instance).setName(str);
    }

    private al() {
        throw null;
    }
}
