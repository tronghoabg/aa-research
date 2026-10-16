package com.waze.main_screen.ac;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class e extends Modifier.Node implements CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {

    /* renamed from: a, reason: collision with root package name */
    private h.g.a.a f25674a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f25675b;

    /* renamed from: c, reason: collision with root package name */
    private br f25676c;

    public e(h.g.a.a aVar) {
        x.f(aVar, "onOutsideTouch");
        this.f25674a = aVar;
        this.f25675b = Rect.Companion.getZero();
    }

    public final h.g.a.a b() {
        return this.f25674a;
    }

    public final void c(h.g.a.a aVar) {
        x.f(aVar, "<set-?>");
        this.f25674a = aVar;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        this.f25676c = aj.z(getCoroutineScope(), null, null, new d(this, null), 3);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        br brVar = this.f25676c;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f25676c = null;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public final void onPlaced(LayoutCoordinates layoutCoordinates) {
        x.f(layoutCoordinates, "coordinates");
        this.f25675b = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public final /* synthetic */ void mo2116onRemeasuredozmzZPI(long j2) {
    }
}
