package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawCache {
    public static final int $stable = 8;
    private Canvas cachedCanvas;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m11344getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    private final void clear(DrawScope drawScope) {
        DrawScope.CC.m8836drawRectnJ9OG0$default(drawScope, Color.Companion.m8254getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m8141getClear0nO6VwU(), 62, null);
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f2, colorFilter);
    }

    /* renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m8989drawCachedImageFqjB98A(int i2, long j2, Density density, LayoutDirection layoutDirection, l<? super DrawScope, ab> lVar) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default = this.mCachedImage;
        Canvas Canvas = this.cachedCanvas;
        if (imageBitmapM8478ImageBitmapx__hDU$default == null || Canvas == null || i3 > imageBitmapM8478ImageBitmapx__hDU$default.getWidth() || i4 > imageBitmapM8478ImageBitmapx__hDU$default.getHeight() || !ImageBitmapConfig.m8468equalsimpl0(this.config, i2)) {
            imageBitmapM8478ImageBitmapx__hDU$default = ImageBitmapKt.m8478ImageBitmapx__hDU$default(i3, i4, i2, false, null, 24, null);
            Canvas = CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default);
            this.mCachedImage = imageBitmapM8478ImageBitmapx__hDU$default;
            this.cachedCanvas = Canvas;
            this.config = i2;
        }
        this.size = j2;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(j2);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM8754component4NHjbRc = drawParams.m8754component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m8757setSizeuvyYCjk(jM11351toSizeozmzZPI);
        Canvas.save();
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        clear(canvasDrawScope2);
        lVar.invoke(canvasDrawScope2);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m8757setSizeuvyYCjk(jM8754component4NHjbRc);
        imageBitmapM8478ImageBitmapx__hDU$default.prepareToDraw();
    }

    public final void drawInto(DrawScope drawScope, float f2, ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (imageBitmap == null) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.CC.m8825drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f2, null, colorFilter, 0, 0, DisplayStrings.DS_SORT_BY, null);
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    public static /* synthetic */ void getMCachedImage$annotations() {
    }
}
