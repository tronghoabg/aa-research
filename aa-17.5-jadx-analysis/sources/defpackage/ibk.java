package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes2.dex */
public final class ibk implements ibl {
    private final List a;
    private final hxl b;
    private final /* synthetic */ int c;
    private final Object d;

    public ibk(ParcelFileDescriptor parcelFileDescriptor, List list, hxl hxlVar, int i) {
        this.c = i;
        this.b = hxlVar;
        this.a = list;
        this.d = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.ibl
    public final int a() throws IOException {
        if (this.c != 0) {
            return hdt.p(this.a, ((hvg) this.d).a(), this.b);
        }
        return hdt.l(this.a, new hud((ParcelFileDescriptorRewinder) this.d, this.b, 2));
    }

    @Override // defpackage.ibl
    public final Bitmap b(BitmapFactory.Options options) throws Throwable {
        int i = this.c;
        Object obj = this.d;
        if (i != 0) {
            return fxp.g(((hvg) obj).a(), options, this);
        }
        FileDescriptor fileDescriptor = ((ParcelFileDescriptorRewinder) obj).a().getFileDescriptor();
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !ibh.a(options) || !fxp.i(this)) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        fxy.g(options.inPreferredConfig == Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapH = fxp.h(bitmapDecodeFileDescriptor);
                bitmapDecodeFileDescriptor.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapH;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeFileDescriptor;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ibl
    public final ImageHeaderParser.ImageType c() throws IOException {
        if (this.c != 0) {
            return hdt.q(this.a, ((hvg) this.d).a(), this.b);
        }
        return hdt.n(this.a, new huc((ParcelFileDescriptorRewinder) this.d, this.b));
    }

    @Override // defpackage.ibl
    public final void d() {
        if (this.c != 0) {
            ((hvg) this.d).a.a();
        }
    }

    @Override // defpackage.ibl
    public final boolean e() throws IOException {
        int i = this.c;
        Object obj = this.d;
        if (i == 0) {
            return hdt.o(this.a, new hue((ParcelFileDescriptorRewinder) obj, this.b, 2));
        }
        InputStream inputStreamA = ((hvg) obj).a();
        inputStreamA.mark(5242880);
        return hdt.o(this.a, new hue(inputStreamA, this.b, 0));
    }

    public ibk(InputStream inputStream, List list, hxl hxlVar, int i) {
        this.c = i;
        this.b = hxlVar;
        this.a = list;
        this.d = new hvg(inputStream, hxlVar);
    }
}
