package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import h.g.a.p;
import h.g.a.q;
import h.g.b.au;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposedModifierKt$materializeImpl$result$1 extends y implements p<Modifier, Modifier.Element, Modifier> {
    final /* synthetic */ Composer $this_materializeImpl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposedModifierKt$materializeImpl$result$1(Composer composer) {
        super(2);
        this.$this_materializeImpl = composer;
    }

    @Override // h.g.a.p
    public final Modifier invoke(Modifier modifier, Modifier.Element element) {
        Modifier.Element elementMaterializeImpl;
        if (element instanceof ComposedModifier) {
            q<Modifier, Composer, Integer, Modifier> factory = ((ComposedModifier) element).getFactory();
            x.d(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            au.h(factory, 3);
            elementMaterializeImpl = ComposedModifierKt.materializeImpl(this.$this_materializeImpl, factory.invoke(Modifier.Companion, this.$this_materializeImpl, 0));
        } else {
            elementMaterializeImpl = element;
        }
        return modifier.then(elementMaterializeImpl);
    }
}
