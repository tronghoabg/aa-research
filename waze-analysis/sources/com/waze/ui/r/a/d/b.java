package com.waze.ui.r.a.d;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: a, reason: collision with root package name */
    private c f43312a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f43313b;

    public b(c cVar, Integer num) {
        x.f(cVar, "wazeUITestTag");
        this.f43312a = cVar;
        this.f43313b = num;
    }

    public final void a(Integer num) {
        this.f43313b = num;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        x.f(semanticsPropertyReceiver, "<this>");
        c cVar = this.f43312a;
        Integer num = this.f43313b;
        x.f(cVar, "<this>");
        String strName = cVar.name();
        String strValueOf = num != null ? String.valueOf(num.intValue()) : null;
        String strValueOf2 = String.valueOf(strName);
        if (strValueOf == null) {
            strValueOf = "";
        }
        String strConcat = strValueOf2.concat(strValueOf);
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, strConcat);
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strConcat);
    }

    public final void b(c cVar) {
        x.f(cVar, "<set-?>");
        this.f43312a = cVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final /* synthetic */ boolean isImportantForBounds() {
        return true;
    }
}
