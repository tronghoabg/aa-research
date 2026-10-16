package com.waze.aq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15468a;

    public j(Integer num) {
        super("unknown_io_exception", num, null);
        this.f15468a = num;
    }

    @Override // com.waze.aq.k
    protected final Integer a() {
        return this.f15468a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && x.n(this.f15468a, ((j) obj).f15468a);
    }

    public final int hashCode() {
        Integer num = this.f15468a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "UnknownIoException(code=" + this.f15468a + ")";
    }

    public j() {
        this(null);
    }
}
