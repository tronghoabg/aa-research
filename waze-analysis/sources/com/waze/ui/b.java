package com.waze.ui;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f41945a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f41946b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41947c;

    public b(com.waze.ui.ac.n nVar, com.waze.ui.ac.n nVar2, List list) {
        h.g.b.x.f(nVar, "label");
        h.g.b.x.f(list, "entries");
        this.f41945a = nVar;
        this.f41946b = nVar2;
        this.f41947c = list;
    }

    @Override // com.waze.ui.c
    public final com.waze.ui.ac.n a() {
        return this.f41945a;
    }

    @Override // com.waze.ui.c
    public final com.waze.ui.ac.n b() {
        return this.f41946b;
    }

    @Override // com.waze.ui.c
    public final List c() {
        return this.f41947c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f41945a, bVar.f41945a) && h.g.b.x.n(this.f41946b, bVar.f41946b) && h.g.b.x.n(this.f41947c, bVar.f41947c);
    }

    public final int hashCode() {
        int iHashCode = this.f41945a.hashCode() * 31;
        com.waze.ui.ac.n nVar = this.f41946b;
        return ((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.f41947c.hashCode();
    }

    public final String toString() {
        return "SingleChoiceMenu(label=" + this.f41945a + ", subtitle=" + this.f41946b + ", entries=" + this.f41947c + ")";
    }

    public /* synthetic */ b(com.waze.ui.ac.n nVar, List list) {
        this(nVar, null, list);
    }
}
