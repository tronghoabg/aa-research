package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.y;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RenderVectorGroup(androidx.compose.ui.graphics.vector.VectorGroup r24, java.util.Map<java.lang.String, ? extends androidx.compose.ui.graphics.vector.VectorConfig> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.RenderVectorGroup(androidx.compose.ui.graphics.vector.VectorGroup, java.util.Map, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m9020configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j2, long j3, String str, ColorFilter colorFilter, boolean z) {
        vectorPainter.m9018setSizeuvyYCjk$ui(j2);
        vectorPainter.setAutoMirror$ui(z);
        vectorPainter.setIntrinsicColorFilter$ui(colorFilter);
        vectorPainter.m9019setViewportSizeuvyYCjk$ui(j3);
        vectorPainter.setName$ui(str);
        return vectorPainter;
    }

    /* renamed from: configureVectorPainter-T4PVSW8$default, reason: not valid java name */
    public static /* synthetic */ VectorPainter m9021configureVectorPainterT4PVSW8$default(VectorPainter vectorPainter, long j2, long j3, String str, ColorFilter colorFilter, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = RootGroupName;
        }
        m9020configureVectorPainterT4PVSW8(vectorPainter, j2, j3, str, colorFilter, ((i2 & 16) == 0) & z);
        return vectorPainter;
    }

    /* renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final ColorFilter m9022createColorFilterxETnrds(long j2, int i2) {
        if (j2 != 16) {
            return ColorFilter.Companion.m8272tintxETnrds(j2, i2);
        }
        return null;
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            VectorNode vectorNode = vectorGroup.get(i2);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m9003setPathFillTypeoQ8Xj4U(vectorPath.m9027getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m9004setStrokeLineCapBeK7IIE(vectorPath.m9028getStrokeLineCapKaPHkGw());
                pathComponent.m9005setStrokeLineJoinWw9F2mQ(vectorPath.m9029getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i2, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i2, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long jM9023obtainSizePxVpY3zN4 = m9023obtainSizePxVpY3zN4(density, imageVector.m8993getDefaultWidthD9Ej5fM(), imageVector.m8992getDefaultHeightD9Ej5fM());
        long jM9024obtainViewportSizePq9zytI = m9024obtainViewportSizePq9zytI(jM9023obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight());
        VectorPainter vectorPainter = new VectorPainter(groupComponent);
        m9020configureVectorPainterT4PVSW8(vectorPainter, jM9023obtainSizePxVpY3zN4, jM9024obtainViewportSizePq9zytI, imageVector.getName(), m9022createColorFilterxETnrds(imageVector.m8995getTintColor0d7_KjU(), imageVector.m8994getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
        return vectorPainter;
    }

    private static final void mirror(DrawScope drawScope, l<? super DrawScope, ab> lVar) {
        long jMo8750getCenterF1C5BW0 = drawScope.mo8750getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo8758getSizeNHjbRc = drawContext.mo8758getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo8765scale0AR0LA0(-1.0f, 1.0f, jMo8750getCenterF1C5BW0);
            lVar.invoke(drawScope);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo8759setSizeuvyYCjk(jMo8758getSizeNHjbRc);
        }
    }

    /* renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m9023obtainSizePxVpY3zN4(Density density, float f2, float f3) {
        float fMo2127toPx0680j_4 = density.mo2127toPx0680j_4(f2);
        float fMo2127toPx0680j_42 = density.mo2127toPx0680j_4(f3);
        return (Float.floatToRawIntBits(fMo2127toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo2127toPx0680j_42) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m9024obtainViewportSizePq9zytI(long j2, float f2, float f3) {
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j2 >> 32));
        }
        if (Float.isNaN(f3)) {
            f3 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float genId$ui = imageVector.getGenId$ui();
        float density2 = density.getDensity();
        boolean zChanged = composer.changed((Float.floatToRawIntBits(density2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(genId$ui) << 32));
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            objRememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(objRememberedValue);
        }
        VectorPainter vectorPainter = (VectorPainter) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter;
    }

    /* renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m9025rememberVectorPaintermlNsNFs(float f2, float f3, float f4, float f5, String str, long j2, int i2, r<? super Float, ? super Float, ? super Composer, ? super Integer, ab> rVar, Composer composer, int i3, int i4) {
        long jM8264getUnspecified0d7_KjU = (i4 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        int iM8166getSrcIn0nO6VwU = (i4 & 64) != 0 ? BlendMode.Companion.m8166getSrcIn0nO6VwU() : i2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411310745, i3, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        int i5 = i4 & 4;
        int i6 = i4 & 8;
        String str2 = (i4 & 16) != 0 ? RootGroupName : str;
        float f6 = i6 != 0 ? Float.NaN : f5;
        VectorPainter vectorPainterM9026rememberVectorPaintervIP8VLU = m9026rememberVectorPaintervIP8VLU(f2, f3, i5 != 0 ? Float.NaN : f4, f6, str2, jM8264getUnspecified0d7_KjU, iM8166getSrcIn0nO6VwU, false, rVar, composer, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainterM9026rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.graphics.vector.VectorPainter m9026rememberVectorPaintervIP8VLU(float r18, float r19, float r20, float r21, java.lang.String r22, long r23, int r25, boolean r26, h.g.a.r<? super java.lang.Float, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorPainterKt.m9026rememberVectorPaintervIP8VLU(float, float, float, float, java.lang.String, long, int, boolean, h.g.a.r, androidx.compose.runtime.Composer, int, int):androidx.compose.ui.graphics.vector.VectorPainter");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Map<String, VectorConfig> $configs;
        final /* synthetic */ VectorGroup $group;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, int i2, int i3) {
            super(2);
            this.$group = vectorGroup;
            this.$configs = map;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(Composer composer, int i2) {
            VectorPainterKt.RenderVectorGroup(this.$group, this.$configs, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements p<Composer, Integer, ab> {
        final /* synthetic */ Map<String, VectorConfig> $configs;
        final /* synthetic */ VectorNode $vectorNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(VectorNode vectorNode, Map<String, ? extends VectorConfig> map) {
            super(2);
            this.$vectorNode = vectorNode;
            this.$configs = map;
        }

        public final void invoke(Composer composer, int i2) {
            if (!composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1450046638, i2, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:463)");
            }
            VectorPainterKt.RenderVectorGroup((VectorGroup) this.$vectorNode, this.$configs, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ ab invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return ab.f48028a;
        }
    }
}
