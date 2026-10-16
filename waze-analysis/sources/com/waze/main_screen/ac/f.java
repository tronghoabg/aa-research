package com.waze.main_screen.ac;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f extends ModifierNodeElement<g> {

    /* renamed from: a, reason: collision with root package name */
    private final h f25677a;

    public f(h hVar) {
        x.f(hVar, "provider");
        this.f25677a = hVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ Modifier.Node create() {
        return new g(this.f25677a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h hVar = this.f25677a;
        f fVar = obj instanceof f ? (f) obj : null;
        return x.n(hVar, fVar != null ? fVar.f25677a : null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.f25677a.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        g gVar = (g) node;
        x.f(gVar, "node");
        gVar.a(this.f25677a);
    }
}
