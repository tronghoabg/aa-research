package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class iah implements huo {
    private final /* synthetic */ int a;
    private final Object b;

    public iah(int i) {
        this.a = i;
        this.b = new iaf();
    }

    /* JADX WARN: Type inference failed for: r9v17, types: [hxe, java.lang.Object] */
    @Override // defpackage.huo
    public final /* synthetic */ hwx a(Object obj, int i, int i2, hum humVar) throws IOException {
        int i3 = this.a;
        if (i3 == 0) {
            return ((iaf) this.b).c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, humVar);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                return i3 != 3 ? i3 != 4 ? ibn.g(((hta) obj).a(), this.b) : ieb.j(ImageDecoder.createSource(ifl.a((InputStream) obj, false)), i, i2, humVar) : ieb.j(ImageDecoder.createSource((ByteBuffer) obj), i, i2, humVar);
            }
            iaz iazVar = (iaz) this.b;
            return iazVar.a(new ibk((ParcelFileDescriptor) obj, iazVar.g, iazVar.h, 0), i, i2, humVar, iaz.f);
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        iaz iazVar2 = (iaz) this.b;
        htm htmVar = iazVar2.i;
        return iazVar2.a(new ibj(byteBuffer, iazVar2.g, iazVar2.h, htmVar != null && htmVar.a(hru.class)), i, i2, humVar, iaz.f);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.huo
    public final /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return (!("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(Build.MANUFACTURER)) || ((ParcelFileDescriptor) obj).getStatSize() <= 536870912) && ParcelFileDescriptorRewinder.d();
        }
        if (i == 3) {
            return ieb.k(hdt.m(((ieb) this.b).a, (ByteBuffer) obj));
        }
        if (i != 4) {
            return true;
        }
        ieb iebVar = (ieb) this.b;
        return ieb.k(hdt.q(iebVar.a, (InputStream) obj, (hxl) iebVar.b));
    }

    public iah(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
