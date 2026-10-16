package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ParentDataModifier extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.ParentDataModifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(parentDataModifier, lVar);
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(parentDataModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(parentDataModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(parentDataModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            return Modifier.CC.$default$then(parentDataModifier, modifier);
        }
    }

    Object modifyParentData(Density density, Object obj);
}
