package com.waze.ui.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final List f42046a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42047b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.p f42048c;

    public bd(List list, int i2, h.g.a.p pVar) {
        h.g.b.x.f(list, "cards");
        h.g.b.x.f(pVar, "onSelection");
        this.f42046a = list;
        this.f42047b = i2;
        this.f42048c = pVar;
    }

    public static final bd d(List list, int i2, h.g.a.p pVar) {
        h.g.b.x.f(list, "cards");
        h.g.b.x.f(pVar, "onSelection");
        return new bd(list, i2, pVar);
    }

    public final int a() {
        return this.f42047b;
    }

    public final List b() {
        return this.f42046a;
    }

    public final h.g.a.p c() {
        return this.f42048c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return h.g.b.x.n(this.f42046a, bdVar.f42046a) && this.f42047b == bdVar.f42047b && h.g.b.x.n(this.f42048c, bdVar.f42048c);
    }

    public final int hashCode() {
        return (((this.f42046a.hashCode() * 31) + this.f42047b) * 31) + this.f42048c.hashCode();
    }

    public final String toString() {
        return "RouteCardsState(cards=" + this.f42046a + ", selectedIndex=" + this.f42047b + ", onSelection=" + this.f42048c + ")";
    }

    public bd() {
        this(null);
    }

    public /* synthetic */ bd(byte[] bArr) {
        this(h.a.i.h(), 0, new com.waze.ui.a.v(8));
    }
}
