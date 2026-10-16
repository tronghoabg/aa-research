package com.waze.car_lib.n;

import com.waze.car_lib.r.co;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends co {

    /* renamed from: a, reason: collision with root package name */
    private final String f20442a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20443b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20444c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, Integer num) {
        super(null);
        h.g.b.x.f(str, "message");
        this.f20442a = str;
        this.f20443b = true;
        this.f20444c = num;
    }

    public final Integer a() {
        return this.f20444c;
    }

    public final String b() {
        return this.f20442a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!h.g.b.x.n(this.f20442a, xVar.f20442a)) {
            return false;
        }
        boolean z = xVar.f20443b;
        return h.g.b.x.n(this.f20444c, xVar.f20444c);
    }

    public final int hashCode() {
        return (((this.f20442a.hashCode() * 31) + DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS) * 31) + this.f20444c.hashCode();
    }

    public final String toString() {
        return "Error(message=" + this.f20442a + ", canRetry=true, errorCode=" + this.f20444c + ")";
    }
}
