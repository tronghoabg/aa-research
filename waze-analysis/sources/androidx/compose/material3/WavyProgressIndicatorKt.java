package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.internal.CircularWavyProgressModifiersKt;
import androidx.compose.material3.internal.LinearWavyProgressModifiersKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WavyProgressIndicatorKt {
    private static final AnimationSpec<Float> IncreasingAmplitudeAnimationSpec = AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingStandardCubicBezier(), 2, null);
    private static final AnimationSpec<Float> DecreasingAmplitudeAnimationSpec = AnimationSpecKt.tween$default(500, 0, MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* renamed from: CircularWavyProgressIndicator-L8eD4gc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6120CircularWavyProgressIndicatorL8eD4gc(h.g.a.a<java.lang.Float> r28, androidx.compose.ui.Modifier r29, long r30, long r32, androidx.compose.ui.graphics.drawscope.Stroke r34, androidx.compose.ui.graphics.drawscope.Stroke r35, float r36, h.g.a.l<? super java.lang.Float, java.lang.Float> r37, float r38, float r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WavyProgressIndicatorKt.m6120CircularWavyProgressIndicatorL8eD4gc(h.g.a.a, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.drawscope.Stroke, androidx.compose.ui.graphics.drawscope.Stroke, float, h.g.a.l, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: CircularWavyProgressIndicator-hvuEXSk, reason: not valid java name */
    public static final void m6121CircularWavyProgressIndicatorhvuEXSk(Modifier modifier, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long indicatorColor;
        long trackColor;
        final float fM6109getCircularIndicatorTrackGapSizeD9Ej5fM;
        float f6;
        final float f7;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final Stroke circularIndicatorStroke;
        final float f8;
        Modifier.Companion companion;
        int i5;
        Stroke circularTrackStroke;
        float fM6110getCircularWavelengthD9Ej5fM;
        float f9;
        Composer composerStartRestartGroup = composer.startRestartGroup(958856149);
        int i6 = i3 & 1;
        if (i6 != 0) {
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
            int i7 = 16;
            indicatorColor = j2;
            if ((i3 & 2) == 0 && composerStartRestartGroup.changed(indicatorColor)) {
                i7 = 32;
            }
            i4 |= i7;
        } else {
            indicatorColor = j2;
        }
        if ((i2 & 384) == 0) {
            int i8 = 128;
            trackColor = j3;
            if ((i3 & 4) == 0 && composerStartRestartGroup.changed(trackColor)) {
                i8 = 256;
            }
            i4 |= i8;
        } else {
            trackColor = j3;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i9 = 1024;
            if ((i3 & 8) == 0) {
                if ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(stroke) : composerStartRestartGroup.changedInstance(stroke)) {
                    i9 = 2048;
                }
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            int i10 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i2) == 0 ? composerStartRestartGroup.changed(stroke2) : composerStartRestartGroup.changedInstance(stroke2)) {
                    i10 = 16384;
                }
            }
            i4 |= i10;
        }
        if ((196608 & i2) == 0) {
            int i11 = 65536;
            if ((i3 & 32) == 0) {
                fM6109getCircularIndicatorTrackGapSizeD9Ej5fM = f2;
                if (composerStartRestartGroup.changed(fM6109getCircularIndicatorTrackGapSizeD9Ej5fM)) {
                    i11 = 131072;
                }
            } else {
                fM6109getCircularIndicatorTrackGapSizeD9Ej5fM = f2;
            }
            i4 |= i11;
        } else {
            fM6109getCircularIndicatorTrackGapSizeD9Ej5fM = f2;
        }
        int i12 = i3 & 64;
        if (i12 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f3) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            int i13 = 4194304;
            if ((i3 & 128) == 0 && composerStartRestartGroup.changed(f4)) {
                i13 = 8388608;
            }
            i4 |= i13;
        }
        if ((i2 & 100663296) == 0) {
            int i14 = i3 & 256;
            int i15 = GroupFlagsKt.HasAuxSlotFlag;
            if (i14 == 0) {
                f6 = f5;
                if (composerStartRestartGroup.changed(f6)) {
                    i15 = 67108864;
                }
            } else {
                f6 = f5;
            }
            i4 |= i15;
        } else {
            f6 = f5;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
            int i16 = i3 & 256;
            int i17 = i3 & 128;
            int i18 = i3 & 32;
            int i19 = i3 & 16;
            int i20 = i3 & 8;
            int i21 = i3 & 4;
            int i22 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i6 != 0 ? Modifier.Companion : modifier2;
                if (i22 != 0) {
                    i4 &= -113;
                    indicatorColor = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorColor(composerStartRestartGroup, 0);
                }
                if (i21 != 0) {
                    trackColor = WavyProgressIndicatorDefaults.INSTANCE.getTrackColor(composerStartRestartGroup, 0);
                    i4 &= -897;
                }
                if (i20 != 0) {
                    circularIndicatorStroke = WavyProgressIndicatorDefaults.INSTANCE.getCircularIndicatorStroke(composerStartRestartGroup, 0);
                    i4 &= -7169;
                } else {
                    circularIndicatorStroke = stroke;
                }
                if (i19 != 0) {
                    i5 = i16;
                    circularTrackStroke = WavyProgressIndicatorDefaults.INSTANCE.getCircularTrackStroke(composerStartRestartGroup, 0);
                    i4 &= -57345;
                } else {
                    i5 = i16;
                    circularTrackStroke = stroke2;
                }
                if (i18 != 0) {
                    fM6109getCircularIndicatorTrackGapSizeD9Ej5fM = WavyProgressIndicatorDefaults.INSTANCE.m6109getCircularIndicatorTrackGapSizeD9Ej5fM();
                    i4 &= -458753;
                }
                f7 = i12 != 0 ? 1.0f : f3;
                if (i17 != 0) {
                    fM6110getCircularWavelengthD9Ej5fM = WavyProgressIndicatorDefaults.INSTANCE.m6110getCircularWavelengthD9Ej5fM();
                    i4 &= -29360129;
                } else {
                    fM6110getCircularWavelengthD9Ej5fM = f4;
                }
                if (i5 != 0) {
                    i4 &= -234881025;
                    f6 = fM6110getCircularWavelengthD9Ej5fM;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i22 != 0) {
                    i4 &= -113;
                }
                if (i21 != 0) {
                    i4 &= -897;
                }
                if (i20 != 0) {
                    i4 &= -7169;
                }
                if (i19 != 0) {
                    i4 &= -57345;
                }
                if (i18 != 0) {
                    i4 &= -458753;
                }
                if (i17 != 0) {
                    i4 &= -29360129;
                }
                if (i16 != 0) {
                    i4 &= -234881025;
                }
                circularTrackStroke = stroke2;
                f7 = f3;
                fM6110getCircularWavelengthD9Ej5fM = f4;
                companion = modifier2;
                circularIndicatorStroke = stroke;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                stroke2 = circularTrackStroke;
                f9 = fM6110getCircularWavelengthD9Ej5fM;
                ComposerKt.traceEventStart(958856149, i4, -1, "androidx.compose.material3.CircularWavyProgressIndicator (WavyProgressIndicator.kt:358)");
            } else {
                stroke2 = circularTrackStroke;
                f9 = fM6110getCircularWavelengthD9Ej5fM;
            }
            Modifier modifierM2822size3ABfNKs = SizeKt.m2822size3ABfNKs(companion, WavyProgressIndicatorDefaults.INSTANCE.m6108getCircularContainerSizeD9Ej5fM());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = WavyProgressIndicatorKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2822size3ABfNKs);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Modifier modifier4 = companion;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f10 = f9;
            SpacerKt.Spacer(CircularWavyProgressModifiersKt.m6246circularWavyProgressIndicator4JQtiWo(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), indicatorColor, trackColor, circularIndicatorStroke, stroke2, fM6109getCircularIndicatorTrackGapSizeD9Ej5fM, f7, f9, f6), composerStartRestartGroup, 0);
            SpacerKt.Spacer(ProgressSemanticsKt.progressSemantics(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            long j5 = indicatorColor;
            f8 = f10;
            j4 = j5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f7 = f3;
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
            j4 = indicatorColor;
            circularIndicatorStroke = stroke;
            f8 = f4;
        }
        final Stroke stroke3 = stroke2;
        final float f11 = f6;
        final long j6 = trackColor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return WavyProgressIndicatorKt.CircularWavyProgressIndicator_hvuEXSk$lambda$1(modifier3, j4, j6, circularIndicatorStroke, stroke3, fM6109getCircularIndicatorTrackGapSizeD9Ej5fM, f7, f8, f11, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CircularWavyProgressIndicator_L8eD4gc$lambda$0$0(a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        float fG = n.g(((Number) aVar.invoke()).floatValue(), 0.0f, 1.0f);
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(true == Float.isNaN(fG) ? 0.0f : fG, n.b(0.0f, 1.0f), 0, 4, null));
        return ab.f48028a;
    }

    static final ab CircularWavyProgressIndicator_L8eD4gc$lambda$1(a aVar, Modifier modifier, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, l lVar, float f3, float f4, int i2, int i3, Composer composer, int i4) {
        m6120CircularWavyProgressIndicatorL8eD4gc(aVar, modifier, j2, j3, stroke, stroke2, f2, lVar, f3, f4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab CircularWavyProgressIndicator_hvuEXSk$lambda$1(Modifier modifier, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, int i2, int i3, Composer composer, int i4) {
        m6121CircularWavyProgressIndicatorhvuEXSk(modifier, j2, j3, stroke, stroke2, f2, f3, f4, f5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* renamed from: LinearWavyProgressIndicator-1YwxWKA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6122LinearWavyProgressIndicator1YwxWKA(final h.g.a.a<java.lang.Float> r30, androidx.compose.ui.Modifier r31, long r32, long r34, androidx.compose.ui.graphics.drawscope.Stroke r36, androidx.compose.ui.graphics.drawscope.Stroke r37, float r38, float r39, h.g.a.l<? super java.lang.Float, java.lang.Float> r40, float r41, float r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.WavyProgressIndicatorKt.m6122LinearWavyProgressIndicator1YwxWKA(h.g.a.a, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.drawscope.Stroke, androidx.compose.ui.graphics.drawscope.Stroke, float, float, h.g.a.l, float, float, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: LinearWavyProgressIndicator-hvuEXSk, reason: not valid java name */
    public static final void m6123LinearWavyProgressIndicatorhvuEXSk(Modifier modifier, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long indicatorColor;
        long trackColor;
        final float fM6115getLinearIndicatorTrackGapSizeD9Ej5fM;
        float f6;
        final float f7;
        final Modifier modifier3;
        Composer composer2;
        final long j4;
        final Stroke stroke3;
        final Stroke stroke4;
        final float f8;
        final float f9;
        final long j5;
        Modifier.Companion companion;
        Stroke linearIndicatorStroke;
        int i5;
        Stroke linearTrackStroke;
        float fM6114getLinearIndeterminateWavelengthD9Ej5fM;
        Stroke stroke5;
        float f10;
        float f11;
        Stroke stroke6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2070567281);
        int i6 = i3 & 1;
        if (i6 != 0) {
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
            int i7 = 16;
            indicatorColor = j2;
            if ((i3 & 2) == 0 && composerStartRestartGroup.changed(indicatorColor)) {
                i7 = 32;
            }
            i4 |= i7;
        } else {
            indicatorColor = j2;
        }
        if ((i2 & 384) == 0) {
            int i8 = 128;
            trackColor = j3;
            if ((i3 & 4) == 0 && composerStartRestartGroup.changed(trackColor)) {
                i8 = 256;
            }
            i4 |= i8;
        } else {
            trackColor = j3;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i9 = 1024;
            if ((i3 & 8) == 0) {
                if ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(stroke) : composerStartRestartGroup.changedInstance(stroke)) {
                    i9 = 2048;
                }
            }
            i4 |= i9;
        }
        if ((i2 & 24576) == 0) {
            int i10 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i2) == 0 ? composerStartRestartGroup.changed(stroke2) : composerStartRestartGroup.changedInstance(stroke2)) {
                    i10 = 16384;
                }
            }
            i4 |= i10;
        }
        if ((196608 & i2) == 0) {
            int i11 = 65536;
            if ((i3 & 32) == 0) {
                fM6115getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
                if (composerStartRestartGroup.changed(fM6115getLinearIndicatorTrackGapSizeD9Ej5fM)) {
                    i11 = 131072;
                }
            } else {
                fM6115getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
            }
            i4 |= i11;
        } else {
            fM6115getLinearIndicatorTrackGapSizeD9Ej5fM = f2;
        }
        int i12 = i3 & 64;
        if (i12 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= true != composerStartRestartGroup.changed(f3) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            int i13 = 4194304;
            if ((i3 & 128) == 0 && composerStartRestartGroup.changed(f4)) {
                i13 = 8388608;
            }
            i4 |= i13;
        }
        if ((i2 & 100663296) == 0) {
            int i14 = i3 & 256;
            int i15 = GroupFlagsKt.HasAuxSlotFlag;
            if (i14 == 0) {
                f6 = f5;
                if (composerStartRestartGroup.changed(f6)) {
                    i15 = 67108864;
                }
            } else {
                f6 = f5;
            }
            i4 |= i15;
        } else {
            f6 = f5;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
            int i16 = i3 & 256;
            int i17 = i3 & 128;
            int i18 = i3 & 32;
            int i19 = i3 & 16;
            int i20 = i3 & 8;
            int i21 = i3 & 4;
            int i22 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i6 != 0 ? Modifier.Companion : modifier2;
                if (i22 != 0) {
                    i4 &= -113;
                    indicatorColor = WavyProgressIndicatorDefaults.INSTANCE.getIndicatorColor(composerStartRestartGroup, 0);
                }
                if (i21 != 0) {
                    trackColor = WavyProgressIndicatorDefaults.INSTANCE.getTrackColor(composerStartRestartGroup, 0);
                    i4 &= -897;
                }
                if (i20 != 0) {
                    linearIndicatorStroke = WavyProgressIndicatorDefaults.INSTANCE.getLinearIndicatorStroke(composerStartRestartGroup, 0);
                    i4 &= -7169;
                } else {
                    linearIndicatorStroke = stroke;
                }
                if (i19 != 0) {
                    i5 = i16;
                    linearTrackStroke = WavyProgressIndicatorDefaults.INSTANCE.getLinearTrackStroke(composerStartRestartGroup, 0);
                    i4 &= -57345;
                } else {
                    i5 = i16;
                    linearTrackStroke = stroke2;
                }
                if (i18 != 0) {
                    fM6115getLinearIndicatorTrackGapSizeD9Ej5fM = WavyProgressIndicatorDefaults.INSTANCE.m6115getLinearIndicatorTrackGapSizeD9Ej5fM();
                    i4 &= -458753;
                }
                f7 = i12 != 0 ? 1.0f : f3;
                if (i17 != 0) {
                    fM6114getLinearIndeterminateWavelengthD9Ej5fM = WavyProgressIndicatorDefaults.INSTANCE.m6114getLinearIndeterminateWavelengthD9Ej5fM();
                    i4 &= -29360129;
                } else {
                    fM6114getLinearIndeterminateWavelengthD9Ej5fM = f4;
                }
                if (i5 != 0) {
                    i4 &= -234881025;
                    stroke5 = linearTrackStroke;
                    f10 = fM6114getLinearIndeterminateWavelengthD9Ej5fM;
                    f11 = f10;
                } else {
                    stroke5 = linearTrackStroke;
                    f10 = fM6114getLinearIndeterminateWavelengthD9Ej5fM;
                    f11 = f6;
                }
                stroke6 = linearIndicatorStroke;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i22 != 0) {
                    i4 &= -113;
                }
                if (i21 != 0) {
                    i4 &= -897;
                }
                if (i20 != 0) {
                    i4 &= -7169;
                }
                if (i19 != 0) {
                    i4 &= -57345;
                }
                if (i18 != 0) {
                    i4 &= -458753;
                }
                if (i17 != 0) {
                    i4 &= -29360129;
                }
                if (i16 != 0) {
                    i4 &= -234881025;
                }
                stroke6 = stroke;
                stroke5 = stroke2;
                f7 = f3;
                f10 = f4;
                f11 = f6;
                companion = modifier2;
            }
            float f12 = fM6115getLinearIndicatorTrackGapSizeD9Ej5fM;
            long j6 = indicatorColor;
            long j7 = trackColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2070567281, i4, -1, "androidx.compose.material3.LinearWavyProgressIndicator (WavyProgressIndicator.kt:177)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition("LinearWavyProgressIndicatorProgress", composerStartRestartGroup, 6, 0);
            final State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateFirstLineHeadAnimationSpec(), "LinearWavyProgressIndicatorFirstHead", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            final State<Float> stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateFirstLineTailAnimationSpec(), "LinearWavyProgressIndicatorFirstTail", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            final State<Float> stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateSecondLineHeadAnimationSpec(), "LinearWavyProgressIndicatorSecondHead", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            final State<Float> stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, ProgressIndicatorKt.getLinearIndeterminateSecondLineTailAnimationSpec(), "LinearWavyProgressIndicatorSecondTail", composerStartRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SizeKt.m2824sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion.then(AccessibilityUtilKt.getIncreaseVerticalSemanticsBounds())), WavyProgressIndicatorDefaults.INSTANCE.m6112getLinearContainerWidthD9Ej5fM(), WavyProgressIndicatorDefaults.INSTANCE.m6111getLinearContainerHeightD9Ej5fM()));
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloat);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda4
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$0$0(stateAnimateFloat));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a aVar = (a) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new a() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$1$0(stateAnimateFloat2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            a aVar2 = (a) objRememberedValue2;
            boolean zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new a() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$2$0(stateAnimateFloat3));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            a aVar3 = (a) objRememberedValue3;
            boolean zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new a() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$3$0(stateAnimateFloat4));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            float f13 = f7 < 0.0f ? 0.0f : f7;
            SpacerKt.Spacer(LinearWavyProgressModifiersKt.m6284linearWavyProgressIndicatorOFGGHrU(modifierClipToBounds, aVar, aVar2, aVar3, (a) objRememberedValue4, j6, j7, stroke6, stroke5, f12, f13 > 1.0f ? 1.0f : f13, f10, f11), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = companion;
            composer2 = composerStartRestartGroup;
            j4 = j6;
            j5 = j7;
            stroke3 = stroke6;
            stroke4 = stroke5;
            fM6115getLinearIndicatorTrackGapSizeD9Ej5fM = f12;
            f8 = f10;
            f9 = f11;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f7 = f3;
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
            j4 = indicatorColor;
            stroke3 = stroke;
            stroke4 = stroke2;
            f8 = f4;
            f9 = f6;
            j5 = trackColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.WavyProgressIndicatorKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return WavyProgressIndicatorKt.LinearWavyProgressIndicator_hvuEXSk$lambda$4(modifier3, j4, j5, stroke3, stroke4, fM6115getLinearIndicatorTrackGapSizeD9Ej5fM, f7, f8, f9, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LinearWavyProgressIndicator_1YwxWKA$lambda$0$0(a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object objInvoke = aVar.invoke();
        if (true == Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f2 = (Float) objInvoke;
        float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(fFloatValue > 1.0f ? 1.0f : fFloatValue, n.b(0.0f, 1.0f), 0, 4, null));
        return ab.f48028a;
    }

    static final ab LinearWavyProgressIndicator_1YwxWKA$lambda$1(a aVar, Modifier modifier, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, l lVar, float f4, float f5, int i2, int i3, int i4, Composer composer, int i5) {
        m6122LinearWavyProgressIndicator1YwxWKA(aVar, modifier, j2, j3, stroke, stroke2, f2, f3, lVar, f4, f5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$0$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$1$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$2$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearWavyProgressIndicator_hvuEXSk$lambda$3$0(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    static final ab LinearWavyProgressIndicator_hvuEXSk$lambda$4(Modifier modifier, long j2, long j3, Stroke stroke, Stroke stroke2, float f2, float f3, float f4, float f5, int i2, int i3, Composer composer, int i4) {
        m6123LinearWavyProgressIndicatorhvuEXSk(modifier, j2, j3, stroke, stroke2, f2, f3, f4, f5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final AnimationSpec<Float> getDecreasingAmplitudeAnimationSpec() {
        return DecreasingAmplitudeAnimationSpec;
    }

    public static final AnimationSpec<Float> getIncreasingAmplitudeAnimationSpec() {
        return IncreasingAmplitudeAnimationSpec;
    }
}
