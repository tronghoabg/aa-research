package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(modifierLocalProvider, lVar);
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(modifierLocalProvider, lVar);
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(modifierLocalProvider, r, pVar);
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(modifierLocalProvider, r, pVar);
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            return Modifier.CC.$default$then(modifierLocalProvider, modifier);
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
