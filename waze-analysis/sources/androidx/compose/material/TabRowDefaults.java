package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = 1.0f;
    private static final float IndicatorHeight = 2.0f;
    private static final float ScrollableTabRowPadding = 52.0f;

    private TabRowDefaults() {
    }

    static final ab Divider_9IZ8Weo$lambda$0(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, long j2, int i2, int i3, Composer composer, int i4) {
        tabRowDefaults.m4238Divider9IZ8Weo(modifier, f2, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab Indicator_9IZ8Weo$lambda$0(TabRowDefaults tabRowDefaults, Modifier modifier, float f2, long j2, int i2, int i3, Composer composer, int i4) {
        tabRowDefaults.m4239Indicator9IZ8Weo(modifier, f2, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final Modifier tabIndicatorOffset$lambda$1(TabPosition tabPosition, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(-398757863);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-398757863, i2, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:393)");
        }
        State<Dp> stateM1867animateDpAsStateAjpBEmI = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(tabPosition.m4237getWidthD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        final State<Dp> stateM1867animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(tabPosition.m4235getLeftD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null);
        boolean zChanged = composer.changed(stateM1867animateDpAsStateAjpBEmI2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new l() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return TabRowDefaults.tabIndicatorOffset$lambda$1$2$0(stateM1867animateDpAsStateAjpBEmI2, (Density) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Modifier modifierM2827width3ABfNKs = SizeKt.m2827width3ABfNKs(OffsetKt.offset(modifierWrapContentSize$default, (l) objRememberedValue), tabIndicatorOffset$lambda$1$0(stateM1867animateDpAsStateAjpBEmI));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM2827width3ABfNKs;
    }

    private static final float tabIndicatorOffset$lambda$1$0(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    private static final float tabIndicatorOffset$lambda$1$1(State<Dp> state) {
        return state.getValue().m11178unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset tabIndicatorOffset$lambda$1$2$0(State state, Density density) {
        return IntOffset.m11287boximpl(density.mo2121roundToPx0680j_4(tabIndicatorOffset$lambda$1$1(state)) << 32);
    }

    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m4238Divider9IZ8Weo(Modifier modifier, float f2, long j2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        float f3;
        long j3;
        final Modifier modifier3;
        final float f4;
        final long j4;
        float f5;
        Modifier modifier4;
        long jM8227copywmQWz5c$default;
        float f6;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(910934799);
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0) {
                f3 = f2;
                if (composerStartRestartGroup.changed(f3)) {
                    i6 = 32;
                }
            } else {
                f3 = f2;
            }
            i4 |= i6;
        } else {
            f3 = f2;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if ((i3 & 4) == 0) {
                j3 = j2;
                if (composerStartRestartGroup.changed(j3)) {
                    i7 = 256;
                }
            } else {
                j3 = j2;
            }
            i4 |= i7;
        } else {
            j3 = j2;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(this) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            int i8 = i3 & 4;
            int i9 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
                if (i9 != 0) {
                    i4 &= -113;
                    f5 = DividerThickness;
                } else {
                    f5 = f3;
                }
                if (i8 != 0) {
                    i4 &= -897;
                    f6 = f5;
                    jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    modifier4 = companion;
                } else {
                    modifier4 = companion;
                    jM8227copywmQWz5c$default = j3;
                    f6 = f5;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i9 != 0) {
                    i4 &= -113;
                }
                if (i8 != 0) {
                    i4 &= -897;
                }
                modifier4 = modifier2;
                jM8227copywmQWz5c$default = j3;
                f6 = f3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910934799, i4, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:357)");
            }
            DividerKt.m4060DivideroMI9zvI(modifier4, jM8227copywmQWz5c$default, f6, 0.0f, composerStartRestartGroup, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & DisplayStrings.DS_TAP_TO_VERIFY), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j4 = jM8227copywmQWz5c$default;
            f4 = f6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            f4 = f3;
            j4 = j3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TabRowDefaults.Divider_9IZ8Weo$lambda$0(this.f$0, modifier3, f4, j4, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4239Indicator9IZ8Weo(androidx.compose.ui.Modifier r21, float r22, long r23, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.m4239Indicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m4240getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m4241getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m4242getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, final TabPosition tabPosition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(tabPosition) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.compose.material.TabRowDefaults$$ExternalSyntheticLambda3
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return TabRowDefaults.tabIndicatorOffset$lambda$1(tabPosition, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }
}
