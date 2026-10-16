package t6;

import A7.AbstractC0279p0;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class v extends AbstractC4138f {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f45927e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f45928f;

    /* renamed from: g, reason: collision with root package name */
    public long f45929g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45930h;

    @Override // t6.InterfaceC4144l
    public final void close() {
        this.f45928f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f45927e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e7) {
                throw new u(e7, 2000);
            }
        } finally {
            this.f45927e = null;
            if (this.f45930h) {
                this.f45930h = false;
                l();
            }
        }
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return this.f45928f;
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f45929g;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f45927e;
            int i11 = u6.v.f46721a;
            int i12 = randomAccessFile.read(bArr, i5, (int) Math.min(j8, i10));
            if (i12 > 0) {
                this.f45929g -= i12;
                b(i12);
            }
            return i12;
        } catch (IOException e7) {
            throw new u(e7, 2000);
        }
    }

    @Override // t6.InterfaceC4144l
    public final long t(n nVar) throws IOException {
        Uri uri = nVar.f45879a;
        long j8 = nVar.f45883e;
        this.f45928f = uri;
        m();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.f45927e = randomAccessFile;
            try {
                randomAccessFile.seek(j8);
                long length = nVar.f45884f;
                if (length == -1) {
                    length = this.f45927e.length() - j8;
                }
                this.f45929g = length;
                if (length < 0) {
                    throw new u(2008, null, null);
                }
                this.f45930h = true;
                n(nVar);
                return this.f45929g;
            } catch (IOException e7) {
                throw new u(e7, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new u(e10, (u6.v.f46721a < 21 || !t.b(e10.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = AbstractC0279p0.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new u(1004, e10, sbR.toString());
        } catch (SecurityException e11) {
            throw new u(e11, 2006);
        } catch (RuntimeException e12) {
            throw new u(e12, 2000);
        }
    }
}
