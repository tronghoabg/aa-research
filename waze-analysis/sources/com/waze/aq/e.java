package com.waze.aq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15463a;

    public e(Integer num) {
        super("client_is_blocked", num, null);
        this.f15463a = num;
    }

    @Override // com.waze.aq.k
    protected final Integer a() {
        return this.f15463a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && x.n(this.f15463a, ((e) obj).f15463a);
    }

    public final int hashCode() {
        Integer num = this.f15463a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ClientIsBlocked(code=" + this.f15463a + ")";
    }

    public e() {
        this(null);
    }
}
