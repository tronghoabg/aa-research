package S1;

import A7.AbstractC0279p0;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class q extends AbstractC0827c {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f10903e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f10904f;

    /* renamed from: g, reason: collision with root package name */
    public long f10905g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10906h;

    @Override // S1.h
    public final void close() {
        this.f10904f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f10903e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new p(e7, 2000);
            }
        } finally {
            this.f10903e = null;
            if (this.f10906h) {
                this.f10906h = false;
                l();
            }
        }
    }

    @Override // S1.h
    public final Uri k() {
        return this.f10904f;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f10905g;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f10903e;
            int i11 = Q1.x.f9724a;
            int i12 = randomAccessFile.read(bArr, i5, (int) Math.min(j8, i10));
            if (i12 > 0) {
                this.f10905g -= i12;
                b(i12);
            }
            return i12;
        } catch (IOException e7) {
            throw new p(e7, 2000);
        }
    }

    @Override // S1.h
    public final long y(k kVar) throws IOException {
        Uri uri = kVar.f10870a;
        long j8 = kVar.f10874e;
        this.f10904f = uri;
        m();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.f10903e = randomAccessFile;
            try {
                randomAccessFile.seek(j8);
                long length = kVar.f10875f;
                if (length == -1) {
                    length = this.f10903e.length() - j8;
                }
                this.f10905g = length;
                if (length < 0) {
                    throw new p(2008, null, null);
                }
                this.f10906h = true;
                o(kVar);
                return this.f10905g;
            } catch (IOException e7) {
                throw new p(e7, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new p(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = AbstractC0279p0.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new p(1004, e10, sbR.toString());
        } catch (SecurityException e11) {
            throw new p(e11, 2006);
        } catch (RuntimeException e12) {
            throw new p(e12, 2000);
        }
    }
}
