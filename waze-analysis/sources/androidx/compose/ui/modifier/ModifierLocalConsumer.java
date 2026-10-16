package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(ModifierLocalConsumer modifierLocalConsumer, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(modifierLocalConsumer, lVar);
        }

        @Deprecated
        public static boolean any(ModifierLocalConsumer modifierLocalConsumer, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(modifierLocalConsumer, lVar);
        }

        @Deprecated
        public static <R> R foldIn(ModifierLocalConsumer modifierLocalConsumer, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(modifierLocalConsumer, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(ModifierLocalConsumer modifierLocalConsumer, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(modifierLocalConsumer, r, pVar);
        }

        @Deprecated
        public static Modifier then(ModifierLocalConsumer modifierLocalConsumer, Modifier modifier) {
            return Modifier.CC.$default$then(modifierLocalConsumer, modifier);
        }
    }

    void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope);
}
