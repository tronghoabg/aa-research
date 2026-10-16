package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BorderCache {
    private Path borderPath;
    private Canvas canvas;
    private CanvasDrawScope canvasDrawScope;
    private ImageBitmap imageBitmap;

    public /* synthetic */ BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : imageBitmap, (i2 & 2) != 0 ? null : canvas, (i2 & 4) != 0 ? null : canvasDrawScope, (i2 & 8) != 0 ? null : path);
    }

    private final ImageBitmap component1() {
        return this.imageBitmap;
    }

    private final Canvas component2() {
        return this.canvas;
    }

    private final CanvasDrawScope component3() {
        return this.canvasDrawScope;
    }

    private final Path component4() {
        return this.borderPath;
    }

    public static /* synthetic */ BorderCache copy$default(BorderCache borderCache, ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            imageBitmap = borderCache.imageBitmap;
        }
        if ((i2 & 2) != 0) {
            canvas = borderCache.canvas;
        }
        if ((i2 & 4) != 0) {
            canvasDrawScope = borderCache.canvasDrawScope;
        }
        if ((i2 & 8) != 0) {
            path = borderCache.borderPath;
        }
        return borderCache.copy(imageBitmap, canvas, canvasDrawScope, path);
    }

    public final BorderCache copy(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        return new BorderCache(imageBitmap, canvas, canvasDrawScope, path);
    }

    /* renamed from: drawBorderCache-EMwLDEs, reason: not valid java name */
    public final ImageBitmap m1980drawBorderCacheEMwLDEs(CacheDrawScope cacheDrawScope, long j2, int i2, l<? super DrawScope, ab> lVar) {
        int i3;
        ImageBitmap imageBitmapM8478ImageBitmapx__hDU$default = this.imageBitmap;
        Canvas Canvas = this.canvas;
        ImageBitmapConfig imageBitmapConfigM8465boximpl = imageBitmapM8478ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m8465boximpl(imageBitmapM8478ImageBitmapx__hDU$default.mo8092getConfig_sVssgQ()) : null;
        int iM8473getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m8473getArgb8888_sVssgQ();
        boolean z = true;
        if (imageBitmapConfigM8465boximpl != null && ImageBitmapConfig.m8468equalsimpl0(imageBitmapConfigM8465boximpl.m8471unboximpl(), iM8473getArgb8888_sVssgQ)) {
            i3 = i2;
        } else {
            i3 = i2;
            if (!ImageBitmapConfig.m8467equalsimpl(i3, imageBitmapM8478ImageBitmapx__hDU$default != null ? ImageBitmapConfig.m8465boximpl(imageBitmapM8478ImageBitmapx__hDU$default.mo8092getConfig_sVssgQ()) : null)) {
                z = false;
            }
        }
        if (imageBitmapM8478ImageBitmapx__hDU$default == null || Canvas == null || Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() >> 32)) > imageBitmapM8478ImageBitmapx__hDU$default.getWidth() || Float.intBitsToFloat((int) (cacheDrawScope.m7760getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) > imageBitmapM8478ImageBitmapx__hDU$default.getHeight() || !z) {
            imageBitmapM8478ImageBitmapx__hDU$default = ImageBitmapKt.m8478ImageBitmapx__hDU$default((int) (j2 >> 32), (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), i3, false, null, 24, null);
            this.imageBitmap = imageBitmapM8478ImageBitmapx__hDU$default;
            Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmapM8478ImageBitmapx__hDU$default);
            this.canvas = Canvas;
        }
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            this.canvasDrawScope = canvasDrawScope;
        }
        long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(j2);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM8754component4NHjbRc = drawParams.m8754component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m8757setSizeuvyYCjk(jM11351toSizeozmzZPI);
        Canvas.save();
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        ImageBitmap imageBitmap = imageBitmapM8478ImageBitmapx__hDU$default;
        DrawScope.CC.m8836drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m8254getBlack0d7_KjU(), 0L, jM11351toSizeozmzZPI, 0.0f, null, null, BlendMode.Companion.m8141getClear0nO6VwU(), 58, null);
        lVar.invoke(canvasDrawScope2);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m8757setSizeuvyYCjk(jM8754component4NHjbRc);
        imageBitmap.prepareToDraw();
        return imageBitmap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) obj;
        return x.n(this.imageBitmap, borderCache.imageBitmap) && x.n(this.canvas, borderCache.canvas) && x.n(this.canvasDrawScope, borderCache.canvasDrawScope) && x.n(this.borderPath, borderCache.borderPath);
    }

    public int hashCode() {
        ImageBitmap imageBitmap = this.imageBitmap;
        int iHashCode = imageBitmap == null ? 0 : imageBitmap.hashCode();
        Canvas canvas = this.canvas;
        int iHashCode2 = canvas == null ? 0 : canvas.hashCode();
        int i2 = iHashCode * 31;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (canvasDrawScope == null ? 0 : canvasDrawScope.hashCode())) * 31;
        Path path = this.borderPath;
        return iHashCode3 + (path != null ? path.hashCode() : 0);
    }

    public final Path obtainPath() {
        Path path = this.borderPath;
        if (path != null) {
            return path;
        }
        Path Path = AndroidPath_androidKt.Path();
        this.borderPath = Path;
        return Path;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + ')';
    }

    public BorderCache(ImageBitmap imageBitmap, Canvas canvas, CanvasDrawScope canvasDrawScope, Path path) {
        this.imageBitmap = imageBitmap;
        this.canvas = canvas;
        this.canvasDrawScope = canvasDrawScope;
        this.borderPath = path;
    }

    public BorderCache() {
        this(null, null, null, null, 15, null);
    }
}
