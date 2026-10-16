package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draw.DrawModifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(drawModifier, lVar);
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(drawModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(drawModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(drawModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            return Modifier.CC.$default$then(drawModifier, modifier);
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
