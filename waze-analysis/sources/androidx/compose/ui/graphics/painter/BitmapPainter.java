package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j2, long j3, int i2, o oVar) {
        this(imageBitmap, (i2 & 2) != 0 ? IntOffset.Companion.m11307getZeronOccac() : j2, (i2 & 4) != 0 ? (imageBitmap.getWidth() << 32) | (imageBitmap.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE) : j3, null);
    }

    /* renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m8957validateSizeN5eqBDc(long j2, long j3) {
        int i2;
        int i3;
        if (IntOffset.m11296getXimpl(j2) < 0 || IntOffset.m11297getYimpl(j2) < 0 || (i2 = (int) (j3 >> 32)) < 0 || (i3 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j3)) < 0 || i2 > this.image.getWidth() || i3 > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j3;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f2) {
        this.alpha = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return x.n(this.image, bitmapPainter.image) && IntOffset.m11295equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m11337equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m8323equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    /* renamed from: getFilterQuality-f-v9h1I$ui_graphics, reason: not valid java name */
    public final int m8958getFilterQualityfv9h1I$ui_graphics() {
        return this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo8959getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m11351toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m11298hashCodeimpl(this.srcOffset)) * 31) + IntSize.m11340hashCodeimpl(this.srcSize)) * 31) + this.filterQuality;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        DrawScope.CC.m8825drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, (Math.round(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (drawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), this.alpha, null, this.colorFilter, 0, this.filterQuality, DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_DURATION_PD_MINS, null);
    }

    /* renamed from: setFilterQuality-vDHp3xo$ui_graphics, reason: not valid java name */
    public final void m8960setFilterQualityvDHp3xo$ui_graphics(int i2) {
        this.filterQuality = i2;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m11303toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m11342toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m8325toStringimpl(this.filterQuality)) + ')';
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j2, long j3) {
        this.image = imageBitmap;
        this.srcOffset = j2;
        this.srcSize = j3;
        this.filterQuality = FilterQuality.Companion.m8328getLowfv9h1I();
        m8957validateSizeN5eqBDc(j2, j3);
        this.size = j3;
        this.alpha = 1.0f;
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j2, long j3, o oVar) {
        this(imageBitmap, j2, j3);
    }
}
