package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;

/* loaded from: classes2.dex */
public final class huc implements huh {
    final /* synthetic */ ParcelFileDescriptorRewinder a;
    final /* synthetic */ hxl b;

    public huc(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, hxl hxlVar) {
        this.a = parcelFileDescriptorRewinder;
        this.b = hxlVar;
    }

    @Override // defpackage.huh
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
        ibp ibpVar;
        try {
            ibpVar = new ibp(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                ImageHeaderParser.ImageType imageTypeA = imageHeaderParser.a(ibpVar);
                ibpVar.b();
                this.a.a();
                return imageTypeA;
            } catch (Throwable th) {
                th = th;
                if (ibpVar != null) {
                    ibpVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ibpVar = null;
        }
    }
}
