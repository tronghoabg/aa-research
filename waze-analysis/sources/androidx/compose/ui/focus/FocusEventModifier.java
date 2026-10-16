package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FocusEventModifier extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusEventModifier$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusEventModifier focusEventModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(focusEventModifier, lVar);
        }

        @Deprecated
        public static boolean any(FocusEventModifier focusEventModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(focusEventModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(FocusEventModifier focusEventModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(focusEventModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusEventModifier focusEventModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(focusEventModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(FocusEventModifier focusEventModifier, Modifier modifier) {
            return Modifier.CC.$default$then(focusEventModifier, modifier);
        }
    }

    void onFocusEvent(FocusState focusState);
}
