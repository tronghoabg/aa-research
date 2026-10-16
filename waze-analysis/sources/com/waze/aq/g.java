package com.waze.aq;

import androidx.core.os.EnvironmentCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends k {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15465a;

    public g(Integer num) {
        super(EnvironmentCompat.MEDIA_UNKNOWN, num, null);
        this.f15465a = num;
    }

    @Override // com.waze.aq.k
    protected final Integer a() {
        return this.f15465a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && x.n(this.f15465a, ((g) obj).f15465a);
    }

    public final int hashCode() {
        Integer num = this.f15465a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Unknown(code=" + this.f15465a + ")";
    }

    public g() {
        this(null);
    }
}
