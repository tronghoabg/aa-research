package com.bumptech.glide.load.c.c;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.a.a.j;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.u;
import com.waze.sound.fl$$ExternalSyntheticApiModelOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f3391a;

    /* renamed from: b, reason: collision with root package name */
    private final j f3392b;

    private c(List list, j jVar) {
        this.f3391a = list;
        this.f3392b = jVar;
    }

    public static u c(List list, j jVar) {
        return new b(new c(list, jVar), 1);
    }

    public static u d(List list, j jVar) {
        return new b(new c(list, jVar), 0);
    }

    static final aw e(ImageDecoder.Source source, int i2, int i3, s sVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new com.bumptech.glide.load.c.b(i2, i3, sVar));
        if (fl$$ExternalSyntheticApiModelOutline0.m$1(drawableDecodeDrawable)) {
            return new a(fl$$ExternalSyntheticApiModelOutline0.m29254m((Object) drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(String.valueOf(drawableDecodeDrawable))));
    }

    private static final boolean f(ImageHeaderParser$ImageType imageHeaderParser$ImageType) {
        if (imageHeaderParser$ImageType != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageType == ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    final boolean a(InputStream inputStream) {
        return f(n.f(this.f3391a, inputStream, this.f3392b));
    }

    final boolean b(ByteBuffer byteBuffer) {
        return f(n.a(this.f3391a, byteBuffer));
    }
}
