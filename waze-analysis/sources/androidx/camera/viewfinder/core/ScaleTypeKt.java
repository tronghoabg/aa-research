package androidx.camera.viewfinder.core;

import android.util.SizeF;
import androidx.camera.viewfinder.core.impl.Alignment;
import androidx.camera.viewfinder.core.impl.ContentScale;
import androidx.camera.viewfinder.core.impl.TransformationsKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScaleTypeKt {
    private static final ScaleTypeKt$Fit$1 Fit = new ContentScale() { // from class: androidx.camera.viewfinder.core.ScaleTypeKt$Fit$1
        @Override // androidx.camera.viewfinder.core.impl.ContentScale
        /* renamed from: computeScaleFactor-ho9e9VQ */
        public long mo1547computeScaleFactorho9e9VQ(SizeF sizeF, SizeF sizeF2) {
            x.f(sizeF, "srcSize");
            x.f(sizeF2, "dstSize");
            float fComputeFillMinDimension = ScaleTypeKt.computeFillMinDimension(sizeF, sizeF2);
            return TransformationsKt.ScaleFactorF(fComputeFillMinDimension, fComputeFillMinDimension);
        }
    };
    private static final ScaleTypeKt$Fill$1 Fill = new ContentScale() { // from class: androidx.camera.viewfinder.core.ScaleTypeKt$Fill$1
        @Override // androidx.camera.viewfinder.core.impl.ContentScale
        /* renamed from: computeScaleFactor-ho9e9VQ, reason: not valid java name */
        public long mo1547computeScaleFactorho9e9VQ(SizeF sizeF, SizeF sizeF2) {
            x.f(sizeF, "srcSize");
            x.f(sizeF2, "dstSize");
            float fComputeFillMaxDimension = ScaleTypeKt.computeFillMaxDimension(sizeF, sizeF2);
            return TransformationsKt.ScaleFactorF(fComputeFillMaxDimension, fComputeFillMaxDimension);
        }
    };
    private static final Alignment Start = new BiasAlignment(-1.0f, -1.0f);
    private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);
    private static final Alignment End = new BiasAlignment(1.0f, 1.0f);

    private static final float computeFillHeight(SizeF sizeF, SizeF sizeF2) {
        return sizeF2.getHeight() / sizeF.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeFillMaxDimension(SizeF sizeF, SizeF sizeF2) {
        return Math.max(computeFillWidth(sizeF, sizeF2), computeFillHeight(sizeF, sizeF2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float computeFillMinDimension(SizeF sizeF, SizeF sizeF2) {
        return Math.min(computeFillWidth(sizeF, sizeF2), computeFillHeight(sizeF, sizeF2));
    }

    private static final float computeFillWidth(SizeF sizeF, SizeF sizeF2) {
        return sizeF2.getWidth() / sizeF.getWidth();
    }
}
