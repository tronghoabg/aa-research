package com.waze.settings;

import androidx.lifecycle.Observer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class aw implements Observer, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f36802a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36803b;

    aw(h.g.a.l lVar, int i2) {
        this.f36803b = i2;
        h.g.b.x.f(lVar, "function");
        this.f36802a = lVar;
    }

    public final boolean equals(Object obj) {
        int i2 = this.f36803b;
        if (i2 == 0) {
            if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
                return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
            }
            return false;
        }
        if (i2 == 1) {
            if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
                return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
            }
            return false;
        }
        if (i2 != 2) {
            if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
                return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
            }
            return false;
        }
        if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
            return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // h.g.b.r
    public final h.c getFunctionDelegate() {
        int i2 = this.f36803b;
        if (i2 == 0) {
            return this.f36802a;
        }
        if (i2 == 1) {
            return this.f36802a;
        }
        h.g.a.l lVar = this.f36802a;
        return i2 != 2 ? lVar : lVar;
    }

    public final int hashCode() {
        int i2 = this.f36803b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        int i2 = this.f36803b;
        if (i2 == 0) {
            this.f36802a.invoke(obj);
            return;
        }
        if (i2 == 1) {
            this.f36802a.invoke(obj);
            return;
        }
        h.g.a.l lVar = this.f36802a;
        if (i2 != 2) {
            lVar.invoke(obj);
        } else {
            lVar.invoke(obj);
        }
    }

    aw(h.g.a.l lVar, int i2, byte[] bArr) {
        this.f36803b = i2;
        h.g.b.x.f(lVar, "function");
        this.f36802a = lVar;
    }

    aw(h.g.a.l lVar, int i2, char[] cArr) {
        this.f36803b = i2;
        h.g.b.x.f(lVar, "function");
        this.f36802a = lVar;
    }

    aw(h.g.a.l lVar, int i2, short[] sArr) {
        this.f36803b = i2;
        h.g.b.x.f(lVar, "function");
        this.f36802a = lVar;
    }
}
