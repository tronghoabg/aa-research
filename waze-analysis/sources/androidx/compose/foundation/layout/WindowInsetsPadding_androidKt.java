package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt {
    private static final l<WindowInsetsHolder, WindowInsets> safeDrawingLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getSafeDrawing();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> safeGesturesLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda3
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getSafeGestures();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> safeContentLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda4
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getSafeContent();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> systemBarsLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda5
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getSystemBars();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> displayCutoutLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda6
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getDisplayCutout();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> statusBarsLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda7
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getStatusBars();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> imeLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda8
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getIme();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> navigationBarsLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda9
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getNavigationBars();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> captionBarLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda10
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getCaptionBar();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> waterfallLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda11
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getWaterfall();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> systemGesturesLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getSystemGestures();
        }
    };
    private static final l<WindowInsetsHolder, WindowInsets> mandatorySystemGesturesLambda = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ((WindowInsetsHolder) obj).getMandatorySystemGestures();
        }
    };

    public static final Modifier captionBarPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), captionBarLambda);
    }

    public static final Modifier displayCutoutPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), displayCutoutLambda);
    }

    public static final Modifier imePadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), imeLambda);
    }

    public static final Modifier mandatorySystemGesturesPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), mandatorySystemGesturesLambda);
    }

    public static final Modifier navigationBarsPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), navigationBarsLambda);
    }

    public static final Modifier safeContentPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), safeContentLambda);
    }

    public static final Modifier safeDrawingPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), safeDrawingLambda);
    }

    public static final Modifier safeGesturesPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), safeGesturesLambda);
    }

    public static final Modifier statusBarsPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), statusBarsLambda);
    }

    public static final Modifier systemBarsPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), systemBarsLambda);
    }

    public static final Modifier systemGesturesPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), systemGesturesLambda);
    }

    public static final Modifier waterfallPadding(Modifier modifier) {
        return windowInsetsPadding(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), waterfallLambda);
    }

    private static final Modifier windowInsetsPadding(Modifier modifier, l<? super InspectorInfo, ab> lVar, l<? super WindowInsetsHolder, ? extends WindowInsets> lVar2) {
        return modifier.then(new SystemInsetsPaddingModifierElement(lVar, lVar2));
    }
}
