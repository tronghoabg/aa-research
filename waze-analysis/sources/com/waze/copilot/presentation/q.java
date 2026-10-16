package com.waze.copilot.presentation;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f23147a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f23148b;

    /* renamed from: c, reason: collision with root package name */
    private final long f23149c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23150d;

    public /* synthetic */ q(int i2, Integer num, long j2, boolean z, int i3) {
        this.f23147a = i2;
        this.f23148b = (i3 & 2) != 0 ? null : num;
        this.f23149c = j2;
        this.f23150d = ((i3 & 8) == 0) & z;
    }

    public final int a() {
        return this.f23147a;
    }

    public final long b() {
        return this.f23149c;
    }

    public final Integer c() {
        return this.f23148b;
    }

    public final boolean d() {
        return this.f23150d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f23147a == qVar.f23147a && x.n(this.f23148b, qVar.f23148b) && this.f23149c == qVar.f23149c && this.f23150d == qVar.f23150d;
    }

    public final int hashCode() {
        Integer num = this.f23148b;
        return (((((this.f23147a * 31) + (num == null ? 0 : num.hashCode())) * 31) + a.a.b(this.f23149c)) * 31) + a.a.a(this.f23150d);
    }

    public final String toString() {
        return "MarketplaceSnackBarState(messageResId=" + this.f23147a + ", actionLabelResId=" + this.f23148b + ", duration=" + this.f23149c + ", closeMarketplaceUponDismiss=" + this.f23150d + ")";
    }
}
