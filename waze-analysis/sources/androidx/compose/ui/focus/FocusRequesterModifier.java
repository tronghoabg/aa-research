package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusRequesterModifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(focusRequesterModifier, lVar);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(focusRequesterModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(focusRequesterModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(focusRequesterModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            return Modifier.CC.$default$then(focusRequesterModifier, modifier);
        }
    }

    FocusRequester getFocusRequester();
}
