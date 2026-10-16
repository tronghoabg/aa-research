package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BlurKt {
    /* renamed from: configureShadow-FoewPVk, reason: not valid java name */
    public static final Paint m8973configureShadowFoewPVk(Paint paint, long j2, int i2, BlurMaskFilter blurMaskFilter, int i3) {
        paint.mo8104setColor8_81llA(j2);
        paint.mo8103setBlendModes9anfk8(i2);
        paint.mo8108setStylek9PVt8s(i3);
        Blur_androidKt.setBlurFilter(paint, blurMaskFilter);
        return paint;
    }

    /* renamed from: configureShadow-FoewPVk$default, reason: not valid java name */
    public static /* synthetic */ Paint m8974configureShadowFoewPVk$default(Paint paint, long j2, int i2, BlurMaskFilter blurMaskFilter, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j2 = Color.Companion.m8254getBlack0d7_KjU();
        }
        long j3 = j2;
        if ((i4 & 2) != 0) {
            i2 = BlendMode.Companion.m8168getSrcOver0nO6VwU();
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            blurMaskFilter = null;
        }
        BlurMaskFilter blurMaskFilter2 = blurMaskFilter;
        if ((i4 & 8) != 0) {
            i3 = PaintingStyle.Companion.m8538getFillTiuSbCo();
        }
        m8973configureShadowFoewPVk(paint, j3, i5, blurMaskFilter2, i3);
        return paint;
    }
}
