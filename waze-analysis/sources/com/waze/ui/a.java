package com.waze.ui;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f41639a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f41640b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41641c;

    public /* synthetic */ a(com.waze.ui.ac.n nVar, List list) {
        h.g.b.x.f(nVar, "label");
        h.g.b.x.f(list, "entries");
        this.f41639a = nVar;
        this.f41640b = null;
        this.f41641c = list;
    }

    @Override // com.waze.ui.c
    public final com.waze.ui.ac.n a() {
        return this.f41639a;
    }

    @Override // com.waze.ui.c
    public final com.waze.ui.ac.n b() {
        return null;
    }

    @Override // com.waze.ui.c
    public final List c() {
        return this.f41641c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!h.g.b.x.n(this.f41639a, aVar.f41639a)) {
            return false;
        }
        com.waze.ui.ac.n nVar = aVar.f41640b;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f41641c, aVar.f41641c);
    }

    public final int hashCode() {
        return (this.f41639a.hashCode() * 961) + this.f41641c.hashCode();
    }

    public final String toString() {
        return "MultiChoiceMenu(label=" + this.f41639a + ", subtitle=null, entries=" + this.f41641c + ")";
    }
}
