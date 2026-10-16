package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class iaf implements huo {
    private final hxe a = new hxf();

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ hwx a(Object obj, int i, int i2, hum humVar) throws IOException {
        return c(hg$$ExternalSyntheticApiModelOutline0.m305m(obj), i, i2, humVar);
    }

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        hg$$ExternalSyntheticApiModelOutline0.m305m(obj);
        return true;
    }

    public final hwx c(ImageDecoder.Source source, int i, int i2, hum humVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new hzz(i, i2, humVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new ibn(bitmapDecodeBitmap, this.a, 1);
    }
}
