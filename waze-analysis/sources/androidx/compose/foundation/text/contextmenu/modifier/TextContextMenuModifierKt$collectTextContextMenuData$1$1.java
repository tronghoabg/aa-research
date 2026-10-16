package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import h.ab;
import h.g.a.l;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class TextContextMenuModifierKt$collectTextContextMenuData$1$1 extends u implements l<l<? super TextContextMenuComponent, ? extends Boolean>, ab> {
    TextContextMenuModifierKt$collectTextContextMenuData$1$1(Object obj) {
        super(1, obj, TextContextMenuBuilderScope.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(l<? super TextContextMenuComponent, ? extends Boolean> lVar) {
        invoke2((l<? super TextContextMenuComponent, Boolean>) lVar);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(l<? super TextContextMenuComponent, Boolean> lVar) {
        ((TextContextMenuBuilderScope) this.receiver).addFilter$foundation(lVar);
    }
}
