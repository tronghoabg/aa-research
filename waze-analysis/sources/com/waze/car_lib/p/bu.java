package com.waze.car_lib.p;

import androidx.autofill.HintConstants;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    private final int f20659a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20660b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f20661c;

    public bu(int i2, String str, Integer num) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.f20659a = i2;
        this.f20660b = str;
        this.f20661c = num;
    }

    public final int a() {
        return this.f20659a;
    }

    public final String b() {
        return this.f20660b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj;
        return this.f20659a == buVar.f20659a && h.g.b.x.n(this.f20660b, buVar.f20660b) && h.g.b.x.n(this.f20661c, buVar.f20661c);
    }

    public final int hashCode() {
        int iHashCode = (this.f20659a * 31) + this.f20660b.hashCode();
        Integer num = this.f20661c;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "EVPlug(count=" + this.f20659a + ", name=" + this.f20660b + ", availableCount=" + this.f20661c + ")";
    }
}
