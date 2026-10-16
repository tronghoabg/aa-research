package com.waze.profile;

import com.waze.sharedui.web.aq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final aq f33414a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f33415b;

    public v(aq aqVar, Integer num) {
        x.f(aqVar, "webPageUiState");
        this.f33414a = aqVar;
        this.f33415b = num;
    }

    public static /* synthetic */ v c(v vVar, aq aqVar, Integer num, int i2) {
        if ((i2 & 1) != 0) {
            aqVar = vVar.f33414a;
        }
        if ((i2 & 2) != 0) {
            num = vVar.f33415b;
        }
        x.f(aqVar, "webPageUiState");
        return new v(aqVar, num);
    }

    public final aq a() {
        return this.f33414a;
    }

    public final Integer b() {
        return this.f33415b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return x.n(this.f33414a, vVar.f33414a) && x.n(this.f33415b, vVar.f33415b);
    }

    public final int hashCode() {
        int iHashCode = this.f33414a.hashCode() * 31;
        Integer num = this.f33415b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "UiState(webPageUiState=" + this.f33414a + ", exitCode=" + this.f33415b + ")";
    }
}
