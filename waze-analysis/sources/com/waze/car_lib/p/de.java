package com.waze.car_lib.p;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class de {

    /* renamed from: a, reason: collision with root package name */
    private final String f20776a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20777b;

    /* renamed from: c, reason: collision with root package name */
    private final CarIcon f20778c;

    /* renamed from: d, reason: collision with root package name */
    private final Action f20779d;

    /* renamed from: e, reason: collision with root package name */
    private final Action f20780e;

    /* renamed from: f, reason: collision with root package name */
    private final Action f20781f;

    public de(String str, String str2, CarIcon carIcon, Action action, Action action2, Action action3) {
        h.g.b.x.f(str2, "message");
        this.f20776a = str;
        this.f20777b = str2;
        this.f20778c = carIcon;
        this.f20779d = action;
        this.f20780e = action2;
        this.f20781f = action3;
    }

    public final Action a() {
        return this.f20780e;
    }

    public final Action b() {
        return this.f20779d;
    }

    public final Action c() {
        return this.f20781f;
    }

    public final CarIcon d() {
        return this.f20778c;
    }

    public final String e() {
        return this.f20777b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de)) {
            return false;
        }
        de deVar = (de) obj;
        return h.g.b.x.n(this.f20776a, deVar.f20776a) && h.g.b.x.n(this.f20777b, deVar.f20777b) && h.g.b.x.n(this.f20778c, deVar.f20778c) && h.g.b.x.n(this.f20779d, deVar.f20779d) && h.g.b.x.n(this.f20780e, deVar.f20780e) && h.g.b.x.n(this.f20781f, deVar.f20781f);
    }

    public final String f() {
        return this.f20776a;
    }

    public final int hashCode() {
        String str = this.f20776a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.f20777b.hashCode();
        CarIcon carIcon = this.f20778c;
        int iHashCode2 = ((iHashCode * 31) + (carIcon == null ? 0 : carIcon.hashCode())) * 31;
        Action action = this.f20779d;
        int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.f20780e;
        int iHashCode4 = (iHashCode3 + (action2 == null ? 0 : action2.hashCode())) * 31;
        Action action3 = this.f20781f;
        return iHashCode4 + (action3 != null ? action3.hashCode() : 0);
    }

    public final String toString() {
        return "InternalUIState(title=" + this.f20776a + ", message=" + this.f20777b + ", icon=" + this.f20778c + ", headerAction=" + this.f20779d + ", firstAction=" + this.f20780e + ", secondAction=" + this.f20781f + ")";
    }
}
