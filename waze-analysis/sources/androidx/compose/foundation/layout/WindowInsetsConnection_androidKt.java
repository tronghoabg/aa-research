package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.a.l;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
    private static final float StartTension = 0.5f;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = dLog;
        DecelMinusOne = dLog - 1.0d;
    }

    public static final Modifier imeNestedScroll(Modifier modifier) {
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1() : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return WindowInsetsConnection_androidKt.imeNestedScroll$lambda$1((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    static final Modifier imeNestedScroll$lambda$1(Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(-369978792);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-369978792, i2, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:76)");
        }
        Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier, m2847rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.Companion.current(composer, 6).getIme(), WindowInsetsSides.Companion.m2868getBottomJoeWqyM(), composer, 48), null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierNestedScroll$default;
    }

    /* renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final NestedScrollConnection m2847rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets androidWindowInsets, int i2, Composer composer, int i3) {
        NestedScrollConnection nestedScrollConnection;
        composer.startReplaceGroup(-1011341039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, i3, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            NestedScrollConnection nestedScrollConnection2 = DoNothingNestedScrollConnection.INSTANCE;
            nestedScrollConnection = nestedScrollConnection2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                nestedScrollConnection = nestedScrollConnection2;
            }
        } else {
            SideCalculator sideCalculatorM2805chooseCalculatorni1skBw = SideCalculator.Companion.m2805chooseCalculatorni1skBw(i2, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            boolean z = true;
            if ((((i3 & 14) ^ 6) <= 4 || !composer.changed(androidWindowInsets)) && (i3 & 6) != 4) {
                z = false;
            }
            boolean zChanged = composer.changed(view) | z | composer.changed(sideCalculatorM2805chooseCalculatorni1skBw) | composer.changed(density);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, sideCalculatorM2805chooseCalculatorni1skBw, density);
                composer.updateRememberedValue(objRememberedValue);
            }
            final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(windowInsetsNestedScrollConnection);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return WindowInsetsConnection_androidKt.rememberWindowInsetsConnection_VRgvIgI$lambda$1$0(windowInsetsNestedScrollConnection, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
            nestedScrollConnection = windowInsetsNestedScrollConnection;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                nestedScrollConnection = windowInsetsNestedScrollConnection;
            }
        }
        composer.endReplaceGroup();
        return nestedScrollConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberWindowInsetsConnection_VRgvIgI$lambda$1$0(final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection_VRgvIgI$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                windowInsetsNestedScrollConnection.dispose();
            }
        };
    }
}
