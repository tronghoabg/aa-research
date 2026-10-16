package com.waze.map;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeFontBitmapGenerator {
    public static final NativeFontBitmapGenerator INSTANCE = new NativeFontBitmapGenerator();
    private static final b mFontHelper = b.c();
    public static final int $stable = 8;

    private NativeFontBitmapGenerator() {
    }

    private final NativeFontData getFontImage(String str, int i2, boolean z, int i3) throws Resources.NotFoundException, IOException {
        CanvasFont$TextMetrics canvasFont$TextMetrics = new CanvasFont$TextMetrics();
        Bitmap bitmapA = mFontHelper.a(str, i2, z, i3, Bitmap.Config.ALPHA_8, canvasFont$TextMetrics);
        if (bitmapA == null) {
            return null;
        }
        NativeFontData nativeFontData = new NativeFontData(new byte[bitmapA.getByteCount()], canvasFont$TextMetrics);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(nativeFontData.getMImage());
        h.g.b.x.e(byteBufferWrap, "wrap(...)");
        bitmapA.copyPixelsToBuffer(byteBufferWrap);
        bitmapA.recycle();
        return nativeFontData;
    }

    private final CanvasFont$TextMetrics getTextMetrics(String str, int i2, boolean z, int i3) {
        return mFontHelper.b(str, i2, z, i3);
    }

    private final native void startNTV();

    public final void start() {
        startNTV();
    }

    /* compiled from: WazeSource */
    public final class NativeFontData {
        public static final int $stable = 8;
        private byte[] mImage;
        private CanvasFont$TextMetrics mMetrics;

        public NativeFontData(byte[] bArr, CanvasFont$TextMetrics canvasFont$TextMetrics) {
            h.g.b.x.f(bArr, "mImage");
            this.mImage = bArr;
            this.mMetrics = canvasFont$TextMetrics;
        }

        public static /* synthetic */ NativeFontData copy$default(NativeFontData nativeFontData, byte[] bArr, CanvasFont$TextMetrics canvasFont$TextMetrics, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bArr = nativeFontData.mImage;
            }
            if ((i2 & 2) != 0) {
                canvasFont$TextMetrics = nativeFontData.mMetrics;
            }
            return nativeFontData.copy(bArr, canvasFont$TextMetrics);
        }

        public final byte[] component1() {
            return this.mImage;
        }

        public final CanvasFont$TextMetrics component2() {
            return this.mMetrics;
        }

        public final NativeFontData copy(byte[] bArr, CanvasFont$TextMetrics canvasFont$TextMetrics) {
            h.g.b.x.f(bArr, "mImage");
            return new NativeFontData(bArr, canvasFont$TextMetrics);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NativeFontData)) {
                return false;
            }
            NativeFontData nativeFontData = (NativeFontData) obj;
            return h.g.b.x.n(this.mImage, nativeFontData.mImage) && h.g.b.x.n(this.mMetrics, nativeFontData.mMetrics);
        }

        public final byte[] getMImage() {
            return this.mImage;
        }

        public final CanvasFont$TextMetrics getMMetrics() {
            return this.mMetrics;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.mImage) * 31;
            CanvasFont$TextMetrics canvasFont$TextMetrics = this.mMetrics;
            return iHashCode + (canvasFont$TextMetrics == null ? 0 : canvasFont$TextMetrics.hashCode());
        }

        public final void setMImage(byte[] bArr) {
            h.g.b.x.f(bArr, "<set-?>");
            this.mImage = bArr;
        }

        public final void setMMetrics(CanvasFont$TextMetrics canvasFont$TextMetrics) {
            this.mMetrics = canvasFont$TextMetrics;
        }

        public String toString() {
            return "NativeFontData(mImage=" + Arrays.toString(this.mImage) + ", mMetrics=" + this.mMetrics + ")";
        }

        public /* synthetic */ NativeFontData(byte[] bArr, CanvasFont$TextMetrics canvasFont$TextMetrics, int i2, h.g.b.o oVar) {
            this(bArr, (i2 & 2) != 0 ? null : canvasFont$TextMetrics);
        }
    }
}
