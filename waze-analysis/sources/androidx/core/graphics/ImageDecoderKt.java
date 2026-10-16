package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0;
import h.ab;
import h.g.a.q;
import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ImageDecoderKt {
    public static final Bitmap decodeBitmap(ImageDecoder.Source source, final q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, ab> qVar) throws IOException {
        x.f(source, "<this>");
        x.f(qVar, "action");
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, be$$ExternalSyntheticApiModelOutline0.m97m((Object) new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeBitmap.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                x.f(imageDecoder, "decoder");
                x.f(imageInfo, "info");
                x.f(source2, "source");
                qVar.invoke(imageDecoder, imageInfo, source2);
            }
        }));
        x.e(bitmapDecodeBitmap, "decodeBitmap(...)");
        return bitmapDecodeBitmap;
    }

    public static final Drawable decodeDrawable(ImageDecoder.Source source, final q<? super ImageDecoder, ? super ImageDecoder.ImageInfo, ? super ImageDecoder.Source, ab> qVar) throws IOException {
        x.f(source, "<this>");
        x.f(qVar, "action");
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, be$$ExternalSyntheticApiModelOutline0.m97m((Object) new ImageDecoder$OnHeaderDecodedListener() { // from class: androidx.core.graphics.ImageDecoderKt.decodeDrawable.1
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source2) {
                x.f(imageDecoder, "decoder");
                x.f(imageInfo, "info");
                x.f(source2, "source");
                qVar.invoke(imageDecoder, imageInfo, source2);
            }
        }));
        x.e(drawableDecodeDrawable, "decodeDrawable(...)");
        return drawableDecodeDrawable;
    }
}
