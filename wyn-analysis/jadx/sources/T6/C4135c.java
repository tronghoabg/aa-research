package t6;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4135c extends AbstractC4138f {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f45854e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f45855f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f45856g;

    /* renamed from: h, reason: collision with root package name */
    public long f45857h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45858i;

    public C4135c(Context context) {
        super(false);
        this.f45854e = context.getAssets();
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        this.f45855f = null;
        try {
            try {
                InputStream inputStream = this.f45856g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new C4134b(e7, 2000);
            }
        } finally {
            this.f45856g = null;
            if (this.f45858i) {
                this.f45858i = false;
                l();
            }
        }
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return this.f45855f;
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f45857h;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i10 = (int) Math.min(j8, i10);
                } catch (IOException e7) {
                    throw new C4134b(e7, 2000);
                }
            }
            InputStream inputStream = this.f45856g;
            int i11 = u6.v.f46721a;
            int i12 = inputStream.read(bArr, i5, i10);
            if (i12 != -1) {
                long j10 = this.f45857h;
                if (j10 != -1) {
                    this.f45857h = j10 - i12;
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }

    @Override // t6.InterfaceC4144l
    public final long t(n nVar) throws IOException {
        try {
            Uri uri = nVar.f45879a;
            long j8 = nVar.f45883e;
            this.f45855f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m();
            InputStream inputStreamOpen = this.f45854e.open(path, 1);
            this.f45856g = inputStreamOpen;
            if (inputStreamOpen.skip(j8) < j8) {
                throw new C4134b(null, 2008);
            }
            long j10 = nVar.f45884f;
            if (j10 != -1) {
                this.f45857h = j10;
            } else {
                long jAvailable = this.f45856g.available();
                this.f45857h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f45857h = -1L;
                }
            }
            this.f45858i = true;
            n(nVar);
            return this.f45857h;
        } catch (C4134b e7) {
            throw e7;
        } catch (IOException e10) {
            throw new C4134b(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
