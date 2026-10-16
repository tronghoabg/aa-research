package com.airbnb.lottie.b;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p extends ModifierNodeElement<r> {

    /* renamed from: a, reason: collision with root package name */
    private final int f2068a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2069b;

    public p(int i2, int i3) {
        this.f2068a = i2;
        this.f2069b = i3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ Modifier.Node create() {
        return new r(this.f2068a, this.f2069b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f2068a == pVar.f2068a && this.f2069b == pVar.f2069b;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.f2068a * 31) + this.f2069b;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        h.g.b.x.f(inspectorInfo, "<this>");
        inspectorInfo.setName("Lottie Size");
        inspectorInfo.getProperties().set("width", Integer.valueOf(this.f2068a));
        inspectorInfo.getProperties().set("height", Integer.valueOf(this.f2069b));
    }

    public final String toString() {
        return "LottieAnimationSizeElement(width=" + this.f2068a + ", height=" + this.f2069b + ")";
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final /* bridge */ /* synthetic */ void update(Modifier.Node node) {
        r rVar = (r) node;
        h.g.b.x.f(rVar, "node");
        rVar.b(this.f2068a);
        rVar.a(this.f2069b);
    }
}
