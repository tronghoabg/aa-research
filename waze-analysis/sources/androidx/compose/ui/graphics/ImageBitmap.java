package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ImageBitmap {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.graphics.ImageBitmap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ void readPixels$default(ImageBitmap imageBitmap, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
            }
            if ((i8 & 2) != 0) {
                i2 = 0;
            }
            if ((i8 & 4) != 0) {
                i3 = 0;
            }
            if ((i8 & 8) != 0) {
                i4 = imageBitmap.getWidth();
            }
            if ((i8 & 16) != 0) {
                i5 = imageBitmap.getHeight();
            }
            if ((i8 & 32) != 0) {
                i6 = 0;
            }
            if ((i8 & 64) != 0) {
                i7 = i4;
            }
            imageBitmap.readPixels(iArr, i2, i3, i4, i5, i6, i7);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    ColorSpace getColorSpace();

    /* renamed from: getConfig-_sVssgQ */
    int mo8092getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7);
}
