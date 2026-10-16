package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class hud implements hug {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hud(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, hxl hxlVar, int i) {
        this.c = i;
        this.b = parcelFileDescriptorRewinder;
        this.a = hxlVar;
    }

    @Override // defpackage.hug
    public final int a(ImageHeaderParser imageHeaderParser) throws Throwable {
        ibp ibpVar;
        int i = this.c;
        if (i == 0) {
            try {
                return imageHeaderParser.c((InputStream) this.a, (hxl) this.b);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        if (i == 1) {
            try {
                return imageHeaderParser.d((ByteBuffer) this.a, (hxl) this.b);
            } finally {
                ifl.b((ByteBuffer) this.a);
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(((ParcelFileDescriptorRewinder) this.b).a().getFileDescriptor());
            Object obj = this.a;
            ibpVar = new ibp(fileInputStream, (hxl) obj);
            try {
                int iC = imageHeaderParser.c(ibpVar, (hxl) obj);
                ibpVar.b();
                ((ParcelFileDescriptorRewinder) this.b).a();
                return iC;
            } catch (Throwable th) {
                th = th;
                if (ibpVar != null) {
                    ibpVar.b();
                }
                ((ParcelFileDescriptorRewinder) this.b).a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ibpVar = null;
        }
    }

    public hud(Object obj, hxl hxlVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = hxlVar;
    }
}
