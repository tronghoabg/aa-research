package com.waze.aq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15467a;

    public i(Integer num) {
        super("unknown_host", num, null);
        this.f15467a = num;
    }

    @Override // com.waze.aq.k
    protected final Integer a() {
        return this.f15467a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && x.n(this.f15467a, ((i) obj).f15467a);
    }

    public final int hashCode() {
        Integer num = this.f15467a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "UnknownHost(code=" + this.f15467a + ")";
    }

    public i() {
        this(null);
    }
}
