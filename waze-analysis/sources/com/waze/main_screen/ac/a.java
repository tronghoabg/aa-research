package com.waze.main_screen.ac;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends ModifierNodeElement<e> {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f25670a;

    public a(h.g.a.a aVar) {
        x.f(aVar, "onOutsideTouch");
        this.f25670a = aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ Modifier.Node create() {
        return new e(this.f25670a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h.g.a.a aVar = this.f25670a;
        a aVar2 = obj instanceof a ? (a) obj : null;
        return x.n(aVar, aVar2 != null ? aVar2.f25670a : null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f25670a.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        e eVar = (e) node;
        x.f(eVar, "node");
        eVar.c(this.f25670a);
    }
}
