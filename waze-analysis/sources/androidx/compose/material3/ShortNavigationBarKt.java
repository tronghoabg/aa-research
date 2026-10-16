package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.tokens.NavigationBarHorizontalItemTokens;
import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.material3.tokens.NavigationBarVerticalItemTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ShortNavigationBarKt {
    private static final ProvidableCompositionLocal<ShortNavigationBarOverride> LocalShortNavigationBarOverride = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.ShortNavigationBarKt$$ExternalSyntheticLambda2
        @Override // h.g.a.a
        public final Object invoke() {
            return DefaultShortNavigationBarOverride.INSTANCE;
        }
    }, 1, null);
    private static final float TopIconItemVerticalPadding = NavigationBarVerticalItemTokens.INSTANCE.m6865getContainerBetweenSpaceD9Ej5fM();
    private static final float TopIconIndicatorVerticalPadding = (NavigationBarVerticalItemTokens.INSTANCE.m6863getActiveIndicatorHeightD9Ej5fM() - NavigationBarVerticalItemTokens.INSTANCE.m6866getIconSizeD9Ej5fM()) / 2.0f;
    private static final float TopIconIndicatorHorizontalPadding = (NavigationBarVerticalItemTokens.INSTANCE.m6864getActiveIndicatorWidthD9Ej5fM() - NavigationBarVerticalItemTokens.INSTANCE.m6866getIconSizeD9Ej5fM()) / 2.0f;
    private static final float StartIconIndicatorVerticalPadding = (NavigationBarHorizontalItemTokens.INSTANCE.m6854getActiveIndicatorHeightD9Ej5fM() - NavigationBarHorizontalItemTokens.INSTANCE.m6857getIconSizeD9Ej5fM()) / 2.0f;
    private static final float TopIconIndicatorToLabelPadding = 4.0f;
    private static final float StartIconIndicatorHorizontalPadding = NavigationBarHorizontalItemTokens.INSTANCE.m6855getActiveIndicatorLeadingSpaceD9Ej5fM();
    private static final float StartIconToLabelPadding = NavigationBarTokens.INSTANCE.m6860getItemActiveIndicatorIconLabelSpaceD9Ej5fM();

    /* renamed from: ShortNavigationBar-kQ6Tpik, reason: not valid java name */
    public static final void m5552ShortNavigationBarkQ6Tpik(Modifier modifier, long j2, long j3, WindowInsets windowInsets, int i2, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        long containerColor;
        long contentColor;
        final WindowInsets windowInsets2;
        final int i6;
        p<? super Composer, ? super Integer, ab> pVar2;
        final long j4;
        Modifier modifier3;
        final long j5;
        WindowInsets windowInsets3;
        int iM5550getArrangementLnnQw40;
        long j6;
        long j7;
        Composer composerStartRestartGroup = composer.startRestartGroup(552087412);
        int i7 = i4 & 1;
        if (i7 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            int i8 = 16;
            if ((i4 & 2) == 0) {
                containerColor = j2;
                if (composerStartRestartGroup.changed(containerColor)) {
                    i8 = 32;
                }
            } else {
                containerColor = j2;
            }
            i5 |= i8;
        } else {
            containerColor = j2;
        }
        if ((i3 & 384) == 0) {
            int i9 = 128;
            if ((i4 & 4) == 0) {
                contentColor = j3;
                if (composerStartRestartGroup.changed(contentColor)) {
                    i9 = 256;
                }
            } else {
                contentColor = j3;
            }
            i5 |= i9;
        } else {
            contentColor = j3;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i10 = 1024;
            if ((i4 & 8) == 0) {
                windowInsets2 = windowInsets;
                if (composerStartRestartGroup.changed(windowInsets2)) {
                    i10 = 2048;
                }
            } else {
                windowInsets2 = windowInsets;
            }
            i5 |= i10;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i3 & 24576) == 0) {
            int i11 = 8192;
            if ((i4 & 16) == 0) {
                i6 = i2;
                if (composerStartRestartGroup.changed(i6)) {
                    i11 = 16384;
                }
            } else {
                i6 = i2;
            }
            i5 |= i11;
        } else {
            i6 = i2;
        }
        if ((196608 & i3) == 0) {
            pVar2 = pVar;
            i5 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 65536 : 131072;
        } else {
            pVar2 = pVar;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            int i12 = i4 & 16;
            int i13 = i4 & 8;
            int i14 = i4 & 4;
            int i15 = i4 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i7 != 0 ? Modifier.Companion : modifier2;
                if (i15 != 0) {
                    i5 &= -113;
                    containerColor = ShortNavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                }
                if (i14 != 0) {
                    contentColor = ShortNavigationBarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i5 &= -897;
                }
                if (i13 != 0) {
                    i5 &= -7169;
                    windowInsets2 = ShortNavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                }
                if (i12 != 0) {
                    i5 &= -57345;
                    iM5550getArrangementLnnQw40 = ShortNavigationBarDefaults.INSTANCE.m5550getArrangementLnnQw40();
                    windowInsets3 = windowInsets2;
                } else {
                    windowInsets3 = windowInsets2;
                    iM5550getArrangementLnnQw40 = i6;
                }
                j6 = contentColor;
                j7 = containerColor;
                modifier3 = companion;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i15 != 0) {
                    i5 &= -113;
                }
                if (i14 != 0) {
                    i5 &= -897;
                }
                if (i13 != 0) {
                    i5 &= -7169;
                }
                if (i12 != 0) {
                    i5 &= -57345;
                }
                windowInsets3 = windowInsets2;
                iM5550getArrangementLnnQw40 = i6;
                j6 = contentColor;
                j7 = containerColor;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(552087412, i5, -1, "androidx.compose.material3.ShortNavigationBar (ShortNavigationBar.kt:102)");
            }
            ((ShortNavigationBarOverride) composerStartRestartGroup.consume(LocalShortNavigationBarOverride)).ShortNavigationBar(new ShortNavigationBarOverrideScope(modifier3, j7, j6, windowInsets3, iM5550getArrangementLnnQw40, pVar2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j4 = j7;
            j5 = j6;
            windowInsets2 = windowInsets3;
            i6 = iM5550getArrangementLnnQw40;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            j4 = containerColor;
            modifier3 = modifier2;
            j5 = contentColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ShortNavigationBarKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ShortNavigationBarKt.ShortNavigationBar_kQ6Tpik$lambda$1(modifier4, j4, j5, windowInsets2, i6, pVar, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* renamed from: ShortNavigationBarItem-6ZDA4I0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5553ShortNavigationBarItem6ZDA4I0(final boolean r32, final h.g.a.a<h.ab> r33, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r35, androidx.compose.ui.Modifier r36, boolean r37, int r38, androidx.compose.material3.NavigationItemColors r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ShortNavigationBarKt.m5553ShortNavigationBarItem6ZDA4I0(boolean, h.g.a.a, h.g.a.p, h.g.a.p, androidx.compose.ui.Modifier, boolean, int, androidx.compose.material3.NavigationItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ShortNavigationBarItem_6ZDA4I0$lambda$1(boolean z, a aVar, p pVar, p pVar2, Modifier modifier, boolean z2, int i2, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, int i3, int i4, Composer composer, int i5) {
        m5553ShortNavigationBarItem6ZDA4I0(z, aVar, pVar, pVar2, modifier, z2, i2, navigationItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    static final ab ShortNavigationBar_kQ6Tpik$lambda$1(Modifier modifier, long j2, long j3, WindowInsets windowInsets, int i2, p pVar, int i3, int i4, Composer composer, int i5) {
        m5552ShortNavigationBarkQ6Tpik(modifier, j2, j3, windowInsets, i2, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateCenteredContentHorizontalPadding(int i2, int i3) {
        if (i2 > 6) {
            return 0;
        }
        return h.h.a.b((((100 - ((i2 + 3) * 10)) / 2.0f) / 100.0f) * i3);
    }

    public static final ProvidableCompositionLocal<ShortNavigationBarOverride> getLocalShortNavigationBarOverride() {
        return LocalShortNavigationBarOverride;
    }

    public static final float getStartIconIndicatorHorizontalPadding() {
        return StartIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return StartIconIndicatorVerticalPadding;
    }

    public static final float getStartIconToLabelPadding() {
        return StartIconToLabelPadding;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return TopIconIndicatorHorizontalPadding;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return TopIconIndicatorToLabelPadding;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return TopIconIndicatorVerticalPadding;
    }

    public static final float getTopIconItemVerticalPadding() {
        return TopIconItemVerticalPadding;
    }

    public static /* synthetic */ void getLocalShortNavigationBarOverride$annotations() {
    }
}
