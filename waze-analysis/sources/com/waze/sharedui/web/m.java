package com.waze.sharedui.web;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39362a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39363b;

    public m(Object obj, String str) {
        h.g.b.x.f(obj, "javascriptInterface");
        h.g.b.x.f(str, "javascriptInterfaceName");
        this.f39362a = obj;
        this.f39363b = str;
    }

    public final Object a() {
        return this.f39362a;
    }

    public final String b() {
        return this.f39363b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.g.b.x.n(this.f39362a, mVar.f39362a) && h.g.b.x.n(this.f39363b, mVar.f39363b);
    }

    public final int hashCode() {
        return (this.f39362a.hashCode() * 31) + this.f39363b.hashCode();
    }

    public final String toString() {
        return "JavaScriptInterfaceData(javascriptInterface=" + this.f39362a + ", javascriptInterfaceName=" + this.f39363b + ")";
    }
}
