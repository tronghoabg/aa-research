package com.waze.ui.r.a.d;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends ModifierNodeElement<b> {

    /* renamed from: a, reason: collision with root package name */
    private final c f43310a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f43311b;

    public a(c cVar, Integer num) {
        x.f(cVar, "wazeUITestTag");
        this.f43310a = cVar;
        this.f43311b = num;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ Modifier.Node create() {
        return new b(this.f43310a, this.f43311b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type com.waze.ui.mobile.infra.test.UITestTagElement");
        a aVar = (a) obj;
        return this.f43310a == aVar.f43310a && x.n(this.f43311b, aVar.f43311b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.f43310a.hashCode() * 31;
        Integer num = this.f43311b;
        return iHashCode + (num != null ? num.intValue() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        b bVar = (b) node;
        x.f(bVar, "node");
        bVar.b(this.f43310a);
        bVar.a(this.f43311b);
    }
}
