package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Log;
import android.util.Size;

/* loaded from: classes2.dex */
public final class hzz implements ImageDecoder$OnHeaderDecodedListener {
    private final ibi a = ibi.a();
    private final int b;
    private final int c;
    private final hty d;
    private final iaw e;
    private final boolean f;
    private final hun g;

    public hzz(int i, int i2, hum humVar) {
        this.b = i;
        this.c = i2;
        this.d = (hty) humVar.b(iaz.a);
        this.e = (iaw) humVar.b(iaw.g);
        hul hulVar = iaz.d;
        boolean z = false;
        if (humVar.b(hulVar) != null && ((Boolean) humVar.b(hulVar)).booleanValue()) {
            z = true;
        }
        this.f = z;
        this.g = (hun) humVar.b(iaz.b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ibi ibiVar = this.a;
        int width = this.b;
        int height = this.c;
        if (ibiVar.b(width, height, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == hty.b) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new hzy());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fA = this.e.a(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fA);
        int iRound2 = Math.round(size.getHeight() * fA);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fA);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        hun hunVar = this.g;
        if (hunVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((hunVar == hun.b && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
        }
    }
}
