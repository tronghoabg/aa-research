package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SemanticsModifier extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.semantics.SemanticsModifier$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static int $default$getId(SemanticsModifier semanticsModifier) {
            return -1;
        }

        public static /* synthetic */ int access$getId$jd(SemanticsModifier semanticsModifier) {
            return -1;
        }
    }

    int getId();

    SemanticsConfiguration getSemanticsConfiguration();

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(semanticsModifier, lVar);
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(semanticsModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(semanticsModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(semanticsModifier, r, pVar);
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            return -1;
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            return Modifier.CC.$default$then(semanticsModifier, modifier);
        }

        public static /* synthetic */ void getId$annotations() {
        }
    }
}
