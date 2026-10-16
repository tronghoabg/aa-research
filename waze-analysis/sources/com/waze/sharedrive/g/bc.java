package com.waze.sharedrive.g;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.DesignInfoProvider;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.ToolingUtilsKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bc implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f38691a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f38692b;

    bc(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, int i2) {
        this.f38692b = i2;
        this.f38691a = horizontalAnchor;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        int i2 = this.f38692b;
        if (i2 == 0) {
            ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, (DesignInfoProvider) this.f38691a);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            this.f38691a.get(((Number) obj).intValue());
            return null;
        }
        ConstrainScope constrainScope = (ConstrainScope) obj;
        h.g.b.x.f(constrainScope, "$this$constrainAs");
        HorizontalAnchorable top = constrainScope.getTop();
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = (ConstraintLayoutBaseScope.HorizontalAnchor) this.f38691a;
        HorizontalAnchorable.CC.m11543linkToVpY3zN4$default(top, horizontalAnchor, 0.0f, 0.0f, 6, (Object) null);
        HorizontalAnchorable.CC.m11543linkToVpY3zN4$default(constrainScope.getBottom(), horizontalAnchor, 0.0f, 0.0f, 6, (Object) null);
        ConstrainScope.centerHorizontallyTo$default(constrainScope, constrainScope.getParent(), 0.0f, 2, null);
        return h.ab.f48028a;
    }

    public bc(Object obj, int i2) {
        this.f38692b = i2;
        this.f38691a = obj;
    }
}
