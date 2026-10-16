package com.waze.aq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15466a;

    public h(Integer num) {
        super("unknown_firebase_exception", num, null);
        this.f15466a = num;
    }

    @Override // com.waze.aq.k
    protected final Integer a() {
        return this.f15466a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && x.n(this.f15466a, ((h) obj).f15466a);
    }

    public final int hashCode() {
        Integer num = this.f15466a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "UnknownFirebaseException(code=" + this.f15466a + ")";
    }

    public h() {
        this(null);
    }
}
