package com.waze.settings.tree.views;

import androidx.lifecycle.Observer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final /* synthetic */ class f implements Observer, h.g.b.r {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ h.g.a.l f37618a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37619b;

    f(h.g.a.l lVar, int i2) {
        this.f37619b = i2;
        h.g.b.x.f(lVar, "function");
        this.f37618a = lVar;
    }

    public final boolean equals(Object obj) {
        int i2 = this.f37619b;
        if (i2 == 0) {
            if ((obj instanceof Observer) && (obj instanceof h.g.b.r)) {
                return h.g.b.x.n(getFunctionDelegate(), ((h.g.b.r) obj).getFunctionDelegate());
            }
            return false;
        }
        if (i2 != 1) {
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
        int i2 = this.f37619b;
        if (i2 == 0) {
            return this.f37618a;
        }
        h.g.a.l lVar = this.f37618a;
        return i2 != 1 ? lVar : lVar;
    }

    public final int hashCode() {
        int i2 = this.f37619b;
        return i2 != 0 ? i2 != 1 ? getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        int i2 = this.f37619b;
        if (i2 == 0) {
            this.f37618a.invoke(obj);
            return;
        }
        h.g.a.l lVar = this.f37618a;
        if (i2 != 1) {
            lVar.invoke(obj);
        } else {
            lVar.invoke(obj);
        }
    }

    f(h.g.a.l lVar, int i2, byte[] bArr) {
        this.f37619b = i2;
        h.g.b.x.f(lVar, "function");
        this.f37618a = lVar;
    }

    f(h.g.a.l lVar, int i2, char[] cArr) {
        this.f37619b = i2;
        h.g.b.x.f(lVar, "function");
        this.f37618a = lVar;
    }
}
