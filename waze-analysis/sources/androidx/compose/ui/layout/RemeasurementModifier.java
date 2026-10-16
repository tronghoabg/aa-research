package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface RemeasurementModifier extends Modifier.Element {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.RemeasurementModifier$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        public static boolean all(RemeasurementModifier remeasurementModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$all(remeasurementModifier, lVar);
        }

        @Deprecated
        public static boolean any(RemeasurementModifier remeasurementModifier, l<? super Modifier.Element, Boolean> lVar) {
            return Modifier.Element.CC.$default$any(remeasurementModifier, lVar);
        }

        @Deprecated
        public static <R> R foldIn(RemeasurementModifier remeasurementModifier, R r, p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldIn(remeasurementModifier, r, pVar);
        }

        @Deprecated
        public static <R> R foldOut(RemeasurementModifier remeasurementModifier, R r, p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) Modifier.Element.CC.$default$foldOut(remeasurementModifier, r, pVar);
        }

        @Deprecated
        public static Modifier then(RemeasurementModifier remeasurementModifier, Modifier modifier) {
            return Modifier.CC.$default$then(remeasurementModifier, modifier);
        }
    }

    void onRemeasurementAvailable(Remeasurement remeasurement);
}
