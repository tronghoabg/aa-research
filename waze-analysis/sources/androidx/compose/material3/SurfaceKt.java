package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.RippleThemeConfiguration;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda10
        @Override // h.g.a.a
        public final Object invoke() {
            return Dp.m11162boximpl(0.0f);
        }
    }, 1, null);

    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m5669SurfaceT9BRK9s(Modifier modifier, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i3 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i3 & 4) != 0) {
            j2 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j3 = ColorSchemeKt.m4593contentColorForek8zF_U(j2, composer, (i2 >> 6) & 14);
        }
        if ((i3 & 16) != 0) {
            f2 = 0.0f;
        }
        if ((i3 & 32) != 0) {
            f3 = 0.0f;
        }
        if ((i3 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1093433818, i2, -1, "androidx.compose.material3.Surface (Surface.kt:107)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11178unboximpl = f2 + ((Dp) composer.consume(providableCompositionLocal)).m11178unboximpl();
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(j3)), providableCompositionLocal.provides(Dp.m11162boximpl(fM11178unboximpl))};
        final long j4 = j2;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f4 = f3;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(421772006, true, new p() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda2
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return SurfaceKt.Surface_T9BRK9s$lambda$0(modifier2, shape2, j4, fM11178unboximpl, borderStroke2, f4, pVar, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m5670Surfaced85dljk(final boolean z, final a<ab> aVar, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2, int i3, int i4) {
        boolean z3;
        char c2;
        final Modifier modifier2 = (i4 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z4 = (!((i4 & 8) == 0)) | z2;
        final Shape rectangleShape = (i4 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM4577getSurface0d7_KjU = (i4 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU() : j2;
        long jM4593contentColorForek8zF_U = (i4 & 64) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM4577getSurface0d7_KjU, composer, (i2 >> 15) & 14) : j3;
        float f4 = (i4 & 128) != 0 ? 0.0f : f2;
        final float f5 = (i4 & 256) != 0 ? 0.0f : f3;
        BorderStroke borderStroke2 = (i4 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i4 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            c2 = 0;
            z3 = 1;
            ComposerKt.traceEventStart(1416521139, i2, i3, "androidx.compose.material3.Surface (Surface.kt:346)");
        } else {
            z3 = 1;
            c2 = 0;
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(1528105640);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            composer.startReplaceGroup(-227801585);
        }
        composer.endReplaceGroup();
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11178unboximpl = ((Dp) composer.consume(providableCompositionLocal)).m11178unboximpl() + f4;
        ProvidedValue[] providedValueArr = new ProvidedValue[2];
        providedValueArr[c2] = ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(jM4593contentColorForek8zF_U));
        providedValueArr[z3] = providableCompositionLocal.provides(Dp.m11162boximpl(fM11178unboximpl));
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(1508735219, z3, new p() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda1
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return SurfaceKt.Surface_d85dljk$lambda$1(modifier2, mutableInteractionSource3, rectangleShape, jM4577getSurface0d7_KjU, fM11178unboximpl, borderStroke3, z, z4, aVar, f5, pVar, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m5672Surfaceo_FOJdg(final a<ab> aVar, Modifier modifier, boolean z, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2, int i3, int i4) {
        boolean z2;
        char c2;
        final Modifier modifier2 = (i4 & 2) != 0 ? Modifier.Companion : modifier;
        final boolean z3 = (!((i4 & 4) == 0)) | z;
        final Shape rectangleShape = (i4 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM4577getSurface0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU() : j2;
        long jM4593contentColorForek8zF_U = (i4 & 32) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM4577getSurface0d7_KjU, composer, (i2 >> 12) & 14) : j3;
        float f4 = (i4 & 64) != 0 ? 0.0f : f2;
        final float f5 = (i4 & 128) != 0 ? 0.0f : f3;
        BorderStroke borderStroke2 = (i4 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i4 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            c2 = 0;
            z2 = 1;
            ComposerKt.traceEventStart(-1472753265, i2, i3, "androidx.compose.material3.Surface (Surface.kt:212)");
        } else {
            z2 = 1;
            c2 = 0;
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(-1701074900);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            composer.startReplaceGroup(2023335947);
        }
        composer.endReplaceGroup();
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11178unboximpl = ((Dp) composer.consume(providableCompositionLocal)).m11178unboximpl() + f4;
        ProvidedValue[] providedValueArr = new ProvidedValue[2];
        providedValueArr[c2] = ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(jM4593contentColorForek8zF_U));
        providedValueArr[z2] = providableCompositionLocal.provides(Dp.m11162boximpl(fM11178unboximpl));
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(849208527, z2, new p() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda3
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return SurfaceKt.Surface_o_FOJdg$lambda$1(modifier2, mutableInteractionSource3, rectangleShape, jM4577getSurface0d7_KjU, fM11178unboximpl, borderStroke3, z3, aVar, f5, pVar, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: Surface-vz2T9sI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5673Surfacevz2T9sI(final androidx.compose.ui.graphics.ColorProducer r15, final androidx.compose.ui.Modifier r16, float r17, float r18, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SurfaceKt.m5673Surfacevz2T9sI(androidx.compose.ui.graphics.ColorProducer, androidx.compose.ui.Modifier, float, float, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab Surface_T9BRK9s$lambda$0(Modifier modifier, Shape shape, long j2, float f2, BorderStroke borderStroke, float f3, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(421772006, i2, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:113)");
            }
            Modifier modifierM5674surfaceXOJAsU = m5674surfaceXOJAsU(modifier, shape, m5675surfaceColorAtElevationCLU3JFs(j2, f2, composer, 0), borderStroke, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(f3));
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda9
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SurfaceKt.Surface_T9BRK9s$lambda$0$1$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierM5674surfaceXOJAsU, false, (l) objRememberedValue);
            ab abVar = ab.f48028a;
            SurfaceKt$Surface$1$3$1 surfaceKt$Surface$1$3$1RememberedValue = composer.rememberedValue();
            if (surfaceKt$Surface$1$3$1RememberedValue == Composer.Companion.getEmpty()) {
                surfaceKt$Surface$1$3$1RememberedValue = new PointerInputEventHandler() { // from class: androidx.compose.material3.SurfaceKt$Surface$1$3$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                        return ab.f48028a;
                    }
                };
                composer.updateRememberedValue(surfaceKt$Surface$1$3$1RememberedValue);
            }
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierSemantics, abVar, (PointerInputEventHandler) surfaceKt$Surface$1$3$1RememberedValue);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SurfaceKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPointerInput);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Surface_T9BRK9s$lambda$0$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return ab.f48028a;
    }

    static final ab Surface_d85dljk$lambda$1(Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j2, float f2, BorderStroke borderStroke, boolean z, boolean z2, a aVar, float f3, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508735219, i2, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:354)");
            }
            Modifier modifierChildSemantics$default = ChildParentSemanticsKt.childSemantics$default(SelectableKt.m3049selectableO2vRcR0$default(m5674surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier).then(((RippleThemeConfiguration) composer.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, shape, false, true, false, false, 7, null)) : Modifier.Companion), shape, m5675surfaceColorAtElevationCLU3JFs(j2, f2, composer, 0), borderStroke, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(f3)), z, mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, shape, false, !(((RippleThemeConfiguration) composer.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing), false, false, 215, null), z2, null, aVar, 16, null), null, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SurfaceKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierChildSemantics$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Surface_d85dljk$lambda$3(Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j2, float f2, BorderStroke borderStroke, boolean z, boolean z2, l lVar, float f3, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1839065134, i2, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:489)");
            }
            Modifier modifierChildSemantics$default = ChildParentSemanticsKt.childSemantics$default(ToggleableKt.m3056toggleableO2vRcR0$default(m5674surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier).then(((RippleThemeConfiguration) composer.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, shape, false, true, false, false, 7, null)) : Modifier.Companion), shape, m5675surfaceColorAtElevationCLU3JFs(j2, f2, composer, 0), borderStroke, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(f3)), z, mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, shape, false, !(((RippleThemeConfiguration) composer.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing), false, false, 215, null), z2, null, lVar, 16, null), null, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SurfaceKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierChildSemantics$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Surface_o_FOJdg$lambda$1(Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j2, float f2, BorderStroke borderStroke, boolean z, a aVar, float f3, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(849208527, i2, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:220)");
            }
            Modifier modifierChildSemantics$default = ChildParentSemanticsKt.childSemantics$default(ClickableKt.m2003clickableO2vRcR0$default(m5674surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier).then(((RippleThemeConfiguration) composer.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, shape, false, true, false, false, 7, null)) : Modifier.Companion), shape, m5675surfaceColorAtElevationCLU3JFs(j2, f2, composer, 0), borderStroke, ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(f3)), mutableInteractionSource, RippleKt.m5414rippleOu1YvPQ$default(false, 0.0f, 0L, shape, false, !(((RippleThemeConfiguration) composer.consume(RippleKt.getLocalRippleThemeConfiguration())).getFocus() instanceof RippleThemeConfiguration.Focus.InsetRing), false, false, 215, null), z, null, null, aVar, 24, null), null, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int iM = SurfaceKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierChildSemantics$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Surface_vz2T9sI$lambda$0(Modifier modifier, final float f2, final ColorProducer colorProducer, final ColorScheme colorScheme, final boolean z, final float f3, p pVar, Composer composer, int i2) {
        Modifier.Companion companionGraphicsLayer;
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(85870608, i2, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:576)");
            }
            if (Dp.m11163compareTo0680j_4(f2, 0.0f) > 0) {
                composer.startReplaceGroup(-1629077399);
                Modifier.Companion companion = Modifier.Companion;
                boolean zChanged = composer.changed(f2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new l() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda7
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return SurfaceKt.Surface_vz2T9sI$lambda$0$0$0(f2, (GraphicsLayerScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                companionGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (l) objRememberedValue);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1628845550);
                composer.endReplaceGroup();
                companionGraphicsLayer = Modifier.Companion;
            }
            Modifier modifierThen = modifier.then(companionGraphicsLayer);
            boolean zChangedInstance = composer.changedInstance(colorProducer) | composer.changed(colorScheme) | composer.changed(z) | composer.changed(f3);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda8
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SurfaceKt.Surface_vz2T9sI$lambda$0$1$0(colorProducer, colorScheme, z, f3, (DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierThen, (l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iM = SurfaceKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierDrawBehind);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Surface_vz2T9sI$lambda$0$0$0(float f2, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo2127toPx0680j_4(f2));
        graphicsLayerScope.setClip(false);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab Surface_vz2T9sI$lambda$0$1$0(ColorProducer colorProducer, ColorScheme colorScheme, boolean z, float f2, DrawScope drawScope) {
        long jMo4059invoke0d7_KjU = colorProducer.mo4059invoke0d7_KjU();
        if (Color.m8229equalsimpl0(jMo4059invoke0d7_KjU, colorScheme.m4577getSurface0d7_KjU()) && z) {
            jMo4059invoke0d7_KjU = ColorSchemeKt.m4606surfaceColorAtElevation3ABfNKs(colorScheme, f2);
        }
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, jMo4059invoke0d7_KjU, 0L, 0L, 0.0f, null, null, 0, 126, null);
        return ab.f48028a;
    }

    static final ab Surface_vz2T9sI$lambda$1(ColorProducer colorProducer, Modifier modifier, float f2, float f3, p pVar, int i2, int i3, Composer composer, int i4) {
        m5673Surfacevz2T9sI(colorProducer, modifier, f2, f3, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    private static final Modifier m5674surfaceXOJAsU(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f2) {
        Shape shape2;
        Modifier.Companion companionM8394graphicsLayer56HxDYs$default;
        if (f2 > 0.0f) {
            shape2 = shape;
            companionM8394graphicsLayer56HxDYs$default = GraphicsLayerModifierKt.m8394graphicsLayer56HxDYs$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 0, null, null, 1042399, null);
        } else {
            shape2 = shape;
            companionM8394graphicsLayer56HxDYs$default = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m1971backgroundbw27NRU(modifier.then(companionM8394graphicsLayer56HxDYs$default).then(borderStroke != null ? BorderKt.border(Modifier.Companion, borderStroke, shape2) : Modifier.Companion), j2, shape2), shape2);
    }

    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    private static final long m5675surfaceColorAtElevationCLU3JFs(long j2, float f2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i2, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:610)");
        }
        long jM4591applyTonalElevationRFCenO8 = ColorSchemeKt.m4591applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2, f2, composer, (i2 << 3) & 1008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM4591applyTonalElevationRFCenO8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m5671Surfaced85dljk(final boolean z, final l<? super Boolean, ab> lVar, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2, int i3, int i4) {
        boolean z3;
        char c2;
        final Modifier modifier2 = (i4 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z4 = (!((i4 & 8) == 0)) | z2;
        final Shape rectangleShape = (i4 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long jM4577getSurface0d7_KjU = (i4 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU() : j2;
        long jM4593contentColorForek8zF_U = (i4 & 64) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM4577getSurface0d7_KjU, composer, (i2 >> 15) & 14) : j3;
        float f4 = (i4 & 128) != 0 ? 0.0f : f2;
        final float f5 = (i4 & 256) != 0 ? 0.0f : f3;
        BorderStroke borderStroke2 = (i4 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i4 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            c2 = 0;
            z3 = 1;
            ComposerKt.traceEventStart(-1931279214, i2, i3, "androidx.compose.material3.Surface (Surface.kt:481)");
        } else {
            z3 = 1;
            c2 = 0;
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(643383721);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
        } else {
            composer.startReplaceGroup(-533435666);
        }
        composer.endReplaceGroup();
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM11178unboximpl = ((Dp) composer.consume(providableCompositionLocal)).m11178unboximpl() + f4;
        ProvidedValue[] providedValueArr = new ProvidedValue[2];
        providedValueArr[c2] = ContentColorKt.getLocalContentColor().provides(Color.m8218boximpl(jM4593contentColorForek8zF_U));
        providedValueArr[z3] = providableCompositionLocal.provides(Dp.m11162boximpl(fM11178unboximpl));
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-1839065134, z3, new p() { // from class: androidx.compose.material3.SurfaceKt$$ExternalSyntheticLambda4
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return SurfaceKt.Surface_d85dljk$lambda$3(modifier2, mutableInteractionSource3, rectangleShape, jM4577getSurface0d7_KjU, fM11178unboximpl, borderStroke3, z, z4, lVar, f5, pVar, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
