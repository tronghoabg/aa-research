package com.google.firebase.perf.f;

import com.google.v.dm;
import com.google.v.fj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x extends dm<ab, x> implements fj {
    /* synthetic */ x(byte[] bArr) {
        super(ab.DEFAULT_INSTANCE);
    }

    public final long a() {
        return ((ab) this.instance).getTimeToResponseInitiatedUs();
    }

    public final boolean b() {
        return ((ab) this.instance).hasClientStartTimeUs();
    }

    public final boolean c() {
        return ((ab) this.instance).hasHttpResponseCode();
    }

    public final boolean d() {
        return ((ab) this.instance).hasTimeToResponseCompletedUs();
    }

    public final void e(Iterable iterable) {
        copyOnWrite();
        ((ab) this.instance).addAllPerfSessions(iterable);
    }

    public final void f() {
        copyOnWrite();
        ((ab) this.instance).clearResponseContentType();
    }

    public final void g(long j2) {
        copyOnWrite();
        ((ab) this.instance).setClientStartTimeUs(j2);
    }

    public final void h(z zVar) {
        copyOnWrite();
        ((ab) this.instance).setHttpMethod(zVar);
    }

    public final void i(int i2) {
        copyOnWrite();
        ((ab) this.instance).setHttpResponseCode(i2);
    }

    public final void j(aa aaVar) {
        copyOnWrite();
        ((ab) this.instance).setNetworkClientErrorReason(aaVar);
    }

    public final void k(long j2) {
        copyOnWrite();
        ((ab) this.instance).setRequestPayloadBytes(j2);
    }

    public final void l(String str) {
        copyOnWrite();
        ((ab) this.instance).setResponseContentType(str);
    }

    public final void m(long j2) {
        copyOnWrite();
        ((ab) this.instance).setResponsePayloadBytes(j2);
    }

    public final void n(long j2) {
        copyOnWrite();
        ((ab) this.instance).setTimeToRequestCompletedUs(j2);
    }

    public final void o(long j2) {
        copyOnWrite();
        ((ab) this.instance).setTimeToResponseCompletedUs(j2);
    }

    public final void p(long j2) {
        copyOnWrite();
        ((ab) this.instance).setTimeToResponseInitiatedUs(j2);
    }

    public final void q(String str) {
        copyOnWrite();
        ((ab) this.instance).setUrl(str);
    }

    private x() {
        throw null;
    }
}
