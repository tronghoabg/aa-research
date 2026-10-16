package com.waze.view.popups.a;

import com.waze.map.b.dw;
import com.waze.map.bl;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f45215a;

    /* renamed from: b, reason: collision with root package name */
    private final bl f45216b;

    /* renamed from: c, reason: collision with root package name */
    private final dw f45217c;

    public n(int i2, bl blVar, dw dwVar) {
        h.g.b.x.f(blVar, "info");
        this.f45215a = i2;
        this.f45216b = blVar;
        this.f45217c = dwVar;
    }

    public static /* synthetic */ n d(n nVar, bl blVar, dw dwVar, int i2) {
        int i3 = (i2 & 1) != 0 ? nVar.f45215a : 0;
        if ((i2 & 2) != 0) {
            blVar = nVar.f45216b;
        }
        if ((i2 & 4) != 0) {
            dwVar = nVar.f45217c;
        }
        h.g.b.x.f(blVar, "info");
        return new n(i3, blVar, dwVar);
    }

    public final int a() {
        return this.f45215a;
    }

    public final bl b() {
        return this.f45216b;
    }

    public final dw c() {
        return this.f45217c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f45215a == nVar.f45215a && h.g.b.x.n(this.f45216b, nVar.f45216b) && h.g.b.x.n(this.f45217c, nVar.f45217c);
    }

    public final int hashCode() {
        int iHashCode = (this.f45215a * 31) + this.f45216b.hashCode();
        dw dwVar = this.f45217c;
        return (iHashCode * 31) + (dwVar == null ? 0 : dwVar.hashCode());
    }

    public final String toString() {
        return "ActivePopup(id=" + this.f45215a + ", info=" + this.f45216b + ", screenPoint=" + this.f45217c + ")";
    }
}
