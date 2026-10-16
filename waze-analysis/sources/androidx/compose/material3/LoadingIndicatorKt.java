package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.internal.ShapeUtilKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.graphics.shapes.Morph;
import androidx.graphics.shapes.RoundedPolygon;
import androidx.media3.common.util.WavUtil;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.k.n;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class LoadingIndicatorKt {
    private static final float FullRotation = 360.0f;
    private static final int GlobalRotationDurationMillis = 4666;
    private static final long MorphIntervalMillis = 650;
    private static final float QuarterRotation = 90.0f;

    /* renamed from: ContainedLoadingIndicator-DTcfvLk, reason: not valid java name */
    public static final void m5175ContainedLoadingIndicatorDTcfvLk(Modifier modifier, long j2, long j3, Shape shape, List<RoundedPolygon> list, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long containedContainerColor;
        long containedIndicatorColor;
        final Shape containerShape;
        final List<RoundedPolygon> list2;
        Composer composer2;
        final Modifier modifier3;
        final long j4;
        final long j5;
        Shape shape2;
        List<RoundedPolygon> indeterminateIndicatorPolygons;
        long j6;
        long j7;
        Modifier modifier4;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(663218740);
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
                containedContainerColor = j2;
                if (composerStartRestartGroup.changed(containedContainerColor)) {
                    i6 = 32;
                }
            } else {
                containedContainerColor = j2;
            }
            i4 |= i6;
        } else {
            containedContainerColor = j2;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if ((i3 & 4) == 0) {
                containedIndicatorColor = j3;
                if (composerStartRestartGroup.changed(containedIndicatorColor)) {
                    i7 = 256;
                }
            } else {
                containedIndicatorColor = j3;
            }
            i4 |= i7;
        } else {
            containedIndicatorColor = j3;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i8 = 1024;
            if ((i3 & 8) == 0) {
                containerShape = shape;
                if (composerStartRestartGroup.changed(containerShape)) {
                    i8 = 2048;
                }
            } else {
                containerShape = shape;
            }
            i4 |= i8;
        } else {
            containerShape = shape;
        }
        if ((i2 & 24576) == 0) {
            int i9 = 8192;
            if ((i3 & 16) == 0) {
                list2 = list;
                if (composerStartRestartGroup.changedInstance(list2)) {
                    i9 = 16384;
                }
            } else {
                list2 = list;
            }
            i4 |= i9;
        } else {
            list2 = list;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            int i10 = i3 & 16;
            int i11 = i3 & 8;
            int i12 = i3 & 4;
            int i13 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
                if (i13 != 0) {
                    i4 &= -113;
                    containedContainerColor = LoadingIndicatorDefaults.INSTANCE.getContainedContainerColor(composerStartRestartGroup, 0);
                }
                if (i12 != 0) {
                    containedIndicatorColor = LoadingIndicatorDefaults.INSTANCE.getContainedIndicatorColor(composerStartRestartGroup, 0);
                    i4 &= -897;
                }
                if (i11 != 0) {
                    i4 &= -7169;
                    containerShape = LoadingIndicatorDefaults.INSTANCE.getContainerShape(composerStartRestartGroup, 0);
                }
                if (i10 != 0) {
                    i4 &= -57345;
                    indeterminateIndicatorPolygons = LoadingIndicatorDefaults.INSTANCE.getIndeterminateIndicatorPolygons();
                    shape2 = containerShape;
                } else {
                    shape2 = containerShape;
                    indeterminateIndicatorPolygons = list2;
                }
                j6 = containedIndicatorColor;
                j7 = containedContainerColor;
                modifier4 = companion;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i13 != 0) {
                    i4 &= -113;
                }
                if (i12 != 0) {
                    i4 &= -897;
                }
                if (i11 != 0) {
                    i4 &= -7169;
                }
                if (i10 != 0) {
                    i4 &= -57345;
                }
                shape2 = containerShape;
                indeterminateIndicatorPolygons = list2;
                j6 = containedIndicatorColor;
                j7 = containedContainerColor;
                modifier4 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(663218740, i4, -1, "androidx.compose.material3.ContainedLoadingIndicator (LoadingIndicator.kt:225)");
            }
            composer2 = composerStartRestartGroup;
            m5179LoadingIndicatorImpleopBjH0(modifier4, j7, j6, shape2, indeterminateIndicatorPolygons, composer2, i4 & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j4 = j7;
            j5 = j6;
            containerShape = shape2;
            list2 = indeterminateIndicatorPolygons;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            j4 = containedContainerColor;
            j5 = containedIndicatorColor;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingIndicatorKt.ContainedLoadingIndicator_DTcfvLk$lambda$0(modifier3, j4, j5, containerShape, list2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147  */
    /* renamed from: ContainedLoadingIndicator-Y0xEhic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5176ContainedLoadingIndicatorY0xEhic(final h.g.a.a<java.lang.Float> r21, androidx.compose.ui.Modifier r22, long r23, long r25, androidx.compose.ui.graphics.Shape r27, java.util.List<androidx.graphics.shapes.RoundedPolygon> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.LoadingIndicatorKt.m5176ContainedLoadingIndicatorY0xEhic(h.g.a.a, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ContainedLoadingIndicator_DTcfvLk$lambda$0(Modifier modifier, long j2, long j3, Shape shape, List list, int i2, int i3, Composer composer, int i4) {
        m5175ContainedLoadingIndicatorDTcfvLk(modifier, j2, j3, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ContainedLoadingIndicator_Y0xEhic$lambda$0(a aVar, Modifier modifier, long j2, long j3, Shape shape, List list, int i2, int i3, Composer composer, int i4) {
        m5176ContainedLoadingIndicatorY0xEhic(aVar, modifier, j2, j3, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: LoadingIndicator-3IgeMak, reason: not valid java name */
    public static final void m5177LoadingIndicator3IgeMak(Modifier modifier, long j2, List<RoundedPolygon> list, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        final List<RoundedPolygon> list2;
        final Modifier modifier2;
        final long j4;
        long indicatorColor;
        List<RoundedPolygon> indeterminateIndicatorPolygons;
        Modifier modifier3;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(387862047);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0) {
                j3 = j2;
                if (composerStartRestartGroup.changed(j3)) {
                    i6 = 32;
                }
            } else {
                j3 = j2;
            }
            i4 |= i6;
        } else {
            j3 = j2;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if ((i3 & 4) == 0) {
                list2 = list;
                if (composerStartRestartGroup.changedInstance(list2)) {
                    i7 = 256;
                }
            } else {
                list2 = list;
            }
            i4 |= i7;
        } else {
            list2 = list;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            int i8 = i3 & 4;
            int i9 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = Modifier.Companion;
                }
                if (i9 != 0) {
                    i4 &= -113;
                    indicatorColor = LoadingIndicatorDefaults.INSTANCE.getIndicatorColor(composerStartRestartGroup, 0);
                } else {
                    indicatorColor = j3;
                }
                if (i8 != 0) {
                    i4 &= -897;
                    indeterminateIndicatorPolygons = LoadingIndicatorDefaults.INSTANCE.getIndeterminateIndicatorPolygons();
                } else {
                    indeterminateIndicatorPolygons = list2;
                }
                j3 = indicatorColor;
                modifier3 = modifier;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i9 != 0) {
                    i4 &= -113;
                }
                if (i8 != 0) {
                    i4 &= -897;
                }
                modifier3 = modifier;
                indeterminateIndicatorPolygons = list2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(387862047, i4, -1, "androidx.compose.material3.LoadingIndicator (LoadingIndicator.kt:136)");
            }
            long j5 = j3;
            m5179LoadingIndicatorImpleopBjH0(modifier3, Color.Companion.m8264getUnspecified0d7_KjU(), j5, LoadingIndicatorDefaults.INSTANCE.getContainerShape(composerStartRestartGroup, 0), indeterminateIndicatorPolygons, composerStartRestartGroup, (i4 & 14) | 48 | ((i4 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (57344 & (i4 << 6)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            j4 = j5;
            list2 = indeterminateIndicatorPolygons;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            j4 = j3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda10
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return LoadingIndicatorKt.LoadingIndicator_3IgeMak$lambda$0(modifier2, j4, list2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* renamed from: LoadingIndicator-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5178LoadingIndicatorcf5BqRc(final h.g.a.a<java.lang.Float> r17, androidx.compose.ui.Modifier r18, long r19, java.util.List<androidx.graphics.shapes.RoundedPolygon> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.LoadingIndicatorKt.m5178LoadingIndicatorcf5BqRc(h.g.a.a, androidx.compose.ui.Modifier, long, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: LoadingIndicatorImpl-eopBjH0, reason: not valid java name */
    private static final void m5179LoadingIndicatorImpleopBjH0(final Modifier modifier, final long j2, final long j3, final Shape shape, final List<RoundedPolygon> list, Composer composer, final int i2) {
        int i3;
        MutableFloatState mutableFloatState;
        Animatable animatable;
        List list2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1776169461);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1776169461, i3, -1, "androidx.compose.material3.LoadingIndicatorImpl (LoadingIndicator.kt:365)");
            }
            if (list.size() <= 1) {
                throw new IllegalArgumentException("indicatorPolygons should have, at least, two RoundedPolygons");
            }
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = morphSequence(list, true);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            List list3 = (List) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(list);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = Float.valueOf(calculateScaleFactor(list) * LoadingIndicatorDefaults.INSTANCE.getActiveIndicatorScale$material3());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final float fFloatValue = ((Number) objRememberedValue2).floatValue();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable2 = (Animatable) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(QuarterRotation);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final Animatable animatable3 = (Animatable) objRememberedValue5;
            boolean zChanged3 = composerStartRestartGroup.changed(list);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue6;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable2) | composerStartRestartGroup.changed(mutableIntState) | composerStartRestartGroup.changedInstance(list3) | composerStartRestartGroup.changedInstance(animatable3);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == Composer.Companion.getEmpty()) {
                mutableFloatState = mutableFloatState2;
                Object loadingIndicatorKt$LoadingIndicatorImpl$6$1 = new LoadingIndicatorKt$LoadingIndicatorImpl$6$1(animatable2, list3, mutableIntState, mutableFloatState, animatable3, null);
                animatable = animatable2;
                list2 = list3;
                objRememberedValue7 = (p) loadingIndicatorKt$LoadingIndicatorImpl$6$1;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                animatable = animatable2;
                mutableFloatState = mutableFloatState2;
                list2 = list3;
            }
            EffectsKt.LaunchedEffect(list, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, (i3 >> 12) & 14);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                objRememberedValue8 = AndroidPath_androidKt.Path();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            final Path path = (Path) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                objRememberedValue9 = Matrix.m8490boximpl(Matrix.m8492constructorimpl$default(null, 1, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            final float[] fArrM8515unboximpl = ((Matrix) objRememberedValue9).m8515unboximpl();
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxSize$default(SizeKt.m2824sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier), LoadingIndicatorDefaults.INSTANCE.m5172getContainerWidthD9Ej5fM(), LoadingIndicatorDefaults.INSTANCE.m5171getContainerHeightD9Ej5fM()), 0.0f, 1, null), shape), j2, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = LoadingIndicatorKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1972backgroundbw27NRU$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Modifier modifierAspectRatio = AspectRatioKt.aspectRatio(Modifier.Companion, 1.0f, true);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changedInstance(animatable3) | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changed(mutableIntState) | composerStartRestartGroup.changedInstance(path) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changedInstance(fArrM8515unboximpl);
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance2 | z) || objRememberedValue10 == Composer.Companion.getEmpty()) {
                final Animatable animatable4 = animatable;
                final List list4 = list2;
                final MutableFloatState mutableFloatState3 = mutableFloatState;
                Object obj = new l() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return LoadingIndicatorKt.LoadingIndicatorImpl_eopBjH0$lambda$14$0$0(animatable4, animatable3, mutableFloatState3, list4, path, fFloatValue, fArrM8515unboximpl, j3, mutableIntState, (ContentDrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
                objRememberedValue10 = obj;
            }
            SpacerKt.Spacer(DrawModifierKt.drawWithContent(modifierAspectRatio, (l) objRememberedValue10), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return LoadingIndicatorKt.LoadingIndicatorImpl_eopBjH0$lambda$15(modifier, j2, j3, shape, list, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: LoadingIndicatorImpl-t6yy7ic, reason: not valid java name */
    private static final void m5180LoadingIndicatorImplt6yy7ic(final a<Float> aVar, final Modifier modifier, final long j2, final long j3, final Shape shape, final List<RoundedPolygon> list, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-227757249);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(shape) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(list) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-227757249, i3, -1, "androidx.compose.material3.LoadingIndicatorImpl (LoadingIndicator.kt:258)");
            }
            if (list.size() <= 1) {
                throw new IllegalArgumentException("indicatorPolygons should have, at least, two RoundedPolygons");
            }
            int i5 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Float.valueOf(LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$1$0(aVar));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final a aVar2 = (a) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = AndroidPath_androidKt.Path();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final Path path = (Path) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = Matrix.m8490boximpl(Matrix.m8492constructorimpl$default(null, 1, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final float[] fArrM8515unboximpl = ((Matrix) objRememberedValue3).m8515unboximpl();
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = morphSequence(list, false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final List list2 = (List) objRememberedValue4;
            boolean zChanged2 = composerStartRestartGroup.changed(list2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = Float.valueOf(calculateScaleFactor(list) * LoadingIndicatorDefaults.INSTANCE.getActiveIndicatorScale$material3());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final float fFloatValue = ((Number) objRememberedValue5).floatValue();
            boolean zChanged3 = composerStartRestartGroup.changed(aVar2);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                objRememberedValue6 = new l() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$6$0(aVar2, (SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxSize$default(SizeKt.m2824sizeVpY3zN4(SemanticsModifierKt.semantics(modifier, true, (l) objRememberedValue6), LoadingIndicatorDefaults.INSTANCE.m5172getContainerWidthD9Ej5fM(), LoadingIndicatorDefaults.INSTANCE.m5171getContainerHeightD9Ej5fM()), 0.0f, 1, null), shape), j2, null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int iM = LoadingIndicatorKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1972backgroundbw27NRU$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Modifier modifierAspectRatio = AspectRatioKt.aspectRatio(Modifier.Companion, 1.0f, true);
            boolean zChanged4 = composerStartRestartGroup.changed(aVar2) | composerStartRestartGroup.changedInstance(list2) | composerStartRestartGroup.changedInstance(path) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changedInstance(fArrM8515unboximpl);
            boolean z = (i3 & 7168) == 2048;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if ((zChanged4 | z) || objRememberedValue7 == Composer.Companion.getEmpty()) {
                Object obj = new l() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$7$0$0(aVar2, list2, path, fFloatValue, fArrM8515unboximpl, j3, (ContentDrawScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
                objRememberedValue7 = obj;
            }
            SpacerKt.Spacer(DrawModifierKt.drawWithContent(modifierAspectRatio, (l) objRememberedValue7), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.LoadingIndicatorKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return LoadingIndicatorKt.LoadingIndicatorImpl_t6yy7ic$lambda$8(aVar, modifier, j2, j3, shape, list, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LoadingIndicatorImpl_eopBjH0$lambda$14$0$0(Animatable animatable, Animatable animatable2, MutableFloatState mutableFloatState, List list, Path path, float f2, float[] fArr, long j2, MutableIntState mutableIntState, ContentDrawScope contentDrawScope) {
        float fFloatValue = ((Number) animatable.getValue()).floatValue();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float fLoadingIndicatorImpl_eopBjH0$lambda$5 = (QuarterRotation * fFloatValue) + LoadingIndicatorImpl_eopBjH0$lambda$5(mutableFloatState) + ((Number) animatable2.getValue()).floatValue();
        long jMo8750getCenterF1C5BW0 = contentDrawScope2.mo8750getCenterF1C5BW0();
        DrawContext drawContext = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8764rotateUv8p0NA(fLoadingIndicatorImpl_eopBjH0$lambda$5, jMo8750getCenterF1C5BW0);
            Path path$default = ShapeUtilKt.toPath$default((Morph) list.get(LoadingIndicatorImpl_eopBjH0$lambda$9(mutableIntState)), fFloatValue, path, 0, false, false, 0.0f, 0.0f, 120, null);
            m5181processPath3rZdNqA(path$default, contentDrawScope2.mo8751getSizeNHjbRc(), f2, fArr);
            DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, path$default, j2, 0.0f, Fill.INSTANCE, null, 0, 52, null);
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return ab.f48028a;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            throw th;
        }
    }

    static final ab LoadingIndicatorImpl_eopBjH0$lambda$15(Modifier modifier, long j2, long j3, Shape shape, List list, int i2, Composer composer, int i3) {
        m5179LoadingIndicatorImpleopBjH0(modifier, j2, j3, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadingIndicatorImpl_eopBjH0$lambda$5(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LoadingIndicatorImpl_eopBjH0$lambda$9(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadingIndicatorImpl_t6yy7ic$lambda$1$0(a aVar) {
        float fFloatValue = ((Number) aVar.invoke()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            return 1.0f;
        }
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LoadingIndicatorImpl_t6yy7ic$lambda$6$0(a aVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Object objInvoke = aVar.invoke();
        if (true == Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f2 = (Float) objInvoke;
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(f2 != null ? f2.floatValue() : 0.0f, n.b(0.0f, 1.0f), 0, 4, null));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab LoadingIndicatorImpl_t6yy7ic$lambda$7$0$0(a aVar, List list, Path path, float f2, float[] fArr, long j2, ContentDrawScope contentDrawScope) throws Throwable {
        long j3;
        DrawContext drawContext;
        Path path$default;
        float fFloatValue = ((Number) aVar.invoke()).floatValue();
        int i2 = n.i((int) (list.size() * fFloatValue), list.size() - 1);
        float size = (fFloatValue == 1.0f && i2 == list.size() + (-1)) ? 1.0f : (list.size() * fFloatValue) % 1.0f;
        float f3 = -fFloatValue;
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        long jMo8750getCenterF1C5BW0 = contentDrawScope2.mo8750getCenterF1C5BW0();
        DrawContext drawContext2 = contentDrawScope2.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext2.mo8758getSizeNHjbRc();
        drawContext2.getCanvas().save();
        try {
            drawContext2.getTransform().mo8764rotateUv8p0NA(f3 * 180.0f, jMo8750getCenterF1C5BW0);
            try {
                path$default = ShapeUtilKt.toPath$default((Morph) list.get(i2), size, path, 0, false, false, 0.0f, 0.0f, 120, null);
                m5181processPath3rZdNqA(path$default, contentDrawScope2.mo8751getSizeNHjbRc(), f2, fArr);
                drawContext = drawContext2;
            } catch (Throwable th) {
                th = th;
                drawContext = drawContext2;
            }
        } catch (Throwable th2) {
            th = th2;
            j3 = jMo8758getSizeNHjbRc;
            drawContext = drawContext2;
        }
        try {
            DrawScope.CC.m8832drawPathLG529CI$default(contentDrawScope2, path$default, j2, 0.0f, Fill.INSTANCE, null, 0, 52, null);
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
            return ab.f48028a;
        } catch (Throwable th3) {
            th = th3;
            j3 = jMo8758getSizeNHjbRc;
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(j3);
            throw th;
        }
    }

    static final ab LoadingIndicatorImpl_t6yy7ic$lambda$8(a aVar, Modifier modifier, long j2, long j3, Shape shape, List list, int i2, Composer composer, int i3) {
        m5180LoadingIndicatorImplt6yy7ic(aVar, modifier, j2, j3, shape, list, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab LoadingIndicator_3IgeMak$lambda$0(Modifier modifier, long j2, List list, int i2, int i3, Composer composer, int i4) {
        m5177LoadingIndicator3IgeMak(modifier, j2, list, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab LoadingIndicator_cf5BqRc$lambda$0(a aVar, Modifier modifier, long j2, List list, int i2, int i3, Composer composer, int i4) {
        m5178LoadingIndicatorcf5BqRc(aVar, modifier, j2, list, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final float calculateScaleFactor(List<RoundedPolygon> list) {
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        int size = list.size();
        float fMin = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            RoundedPolygon roundedPolygon = list.get(i2);
            RoundedPolygon.calculateBounds$default(roundedPolygon, fArr, false, 2, null);
            roundedPolygon.calculateMaxBounds(fArr2);
            fMin = Math.min(fMin, Math.max(width(fArr) / width(fArr2), height(fArr) / height(fArr2)));
        }
        return fMin;
    }

    private static final float height(float[] fArr) {
        return fArr[3] - fArr[1];
    }

    private static final List<Morph> morphSequence(List<RoundedPolygon> list, boolean z) {
        List listB = i.b();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (i3 < list.size()) {
                listB.add(new Morph(list.get(i2).normalized(), list.get(i3).normalized()));
            } else if (z) {
                listB.add(new Morph(list.get(i2).normalized(), list.get(0).normalized()));
            }
            i2 = i3;
        }
        return i.a(listB);
    }

    /* renamed from: processPath-3rZdNqA, reason: not valid java name */
    private static final Path m5181processPath3rZdNqA(Path path, long j2, float f2, float[] fArr) {
        Matrix.m8501resetimpl(fArr);
        Matrix.m8508scaleimpl$default(fArr, Float.intBitsToFloat((int) (j2 >> 32)) * f2, Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) * f2, 0.0f, 4, null);
        path.mo8119transform58bKbWc(fArr);
        path.mo8120translatek4lQ0M(Offset.m7984minusMKHz9U(androidx.compose.ui.geometry.SizeKt.m8059getCenteruvyYCjk(j2), path.getBounds().m8010getCenterF1C5BW0()));
        return path;
    }

    /* renamed from: processPath-3rZdNqA$default, reason: not valid java name */
    static /* synthetic */ Path m5182processPath3rZdNqA$default(Path path, long j2, float f2, float[] fArr, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            fArr = Matrix.m8492constructorimpl$default(null, 1, null);
        }
        m5181processPath3rZdNqA(path, j2, f2, fArr);
        return path;
    }

    private static final float width(float[] fArr) {
        return fArr[2] - fArr[0];
    }
}
