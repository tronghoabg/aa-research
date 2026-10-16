package androidx.compose.ui.platform;

import h.m.h;
import h.m.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface InspectableValue {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.InspectableValue$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static h $default$getInspectableElements(InspectableValue inspectableValue) {
            return k.e();
        }

        public static String $default$getNameFallback(InspectableValue inspectableValue) {
            return null;
        }

        public static Object $default$getValueOverride(InspectableValue inspectableValue) {
            return null;
        }

        public static /* synthetic */ String access$getNameFallback$jd(InspectableValue inspectableValue) {
            return null;
        }

        public static /* synthetic */ Object access$getValueOverride$jd(InspectableValue inspectableValue) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    /* loaded from: classes3.dex */
    public final class DefaultImpls {
        @Deprecated
        public static h<ValueElement> getInspectableElements(InspectableValue inspectableValue) {
            return CC.$default$getInspectableElements(inspectableValue);
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            return null;
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            return null;
        }
    }

    h<ValueElement> getInspectableElements();

    String getNameFallback();

    Object getValueOverride();
}
