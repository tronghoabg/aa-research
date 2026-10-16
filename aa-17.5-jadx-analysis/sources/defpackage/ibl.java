package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface ibl {
    int a() throws IOException;

    Bitmap b(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType c() throws IOException;

    void d();

    boolean e() throws IOException;
}
