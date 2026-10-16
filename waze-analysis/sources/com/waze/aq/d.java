package com.waze.aq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15462a;

    public d(Integer num) {
        super("app_attestation_failed", num, null);
        this.f15462a = num;
    }

    @Override // com.waze.aq.k
    protected final Integer a() {
        return this.f15462a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f15462a, ((d) obj).f15462a);
    }

    public final int hashCode() {
        Integer num = this.f15462a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "AppAttestationFailed(code=" + this.f15462a + ")";
    }

    public d() {
        this(null);
    }
}
