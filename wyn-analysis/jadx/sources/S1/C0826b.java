package S1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: S1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826b extends AbstractC0827c {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f10843e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f10844f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f10845g;

    /* renamed from: h, reason: collision with root package name */
    public long f10846h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10847i;

    public C0826b(Context context) {
        super(false);
        this.f10843e = context.getAssets();
    }

    @Override // S1.h
    public final void close() {
        this.f10844f = null;
        try {
            try {
                InputStream inputStream = this.f10845g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                throw new C0825a(e7, 2000);
            }
        } finally {
            this.f10845g = null;
            if (this.f10847i) {
                this.f10847i = false;
                l();
            }
        }
    }

    @Override // S1.h
    public final Uri k() {
        return this.f10844f;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f10846h;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i10 = (int) Math.min(j8, i10);
                } catch (IOException e7) {
                    throw new C0825a(e7, 2000);
                }
            }
            InputStream inputStream = this.f10845g;
            int i11 = Q1.x.f9724a;
            int i12 = inputStream.read(bArr, i5, i10);
            if (i12 != -1) {
                long j10 = this.f10846h;
                if (j10 != -1) {
                    this.f10846h = j10 - i12;
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }

    @Override // S1.h
    public final long y(k kVar) throws IOException {
        try {
            Uri uri = kVar.f10870a;
            long j8 = kVar.f10874e;
            this.f10844f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m();
            InputStream inputStreamOpen = this.f10843e.open(path, 1);
            this.f10845g = inputStreamOpen;
            if (inputStreamOpen.skip(j8) < j8) {
                throw new C0825a(null, 2008);
            }
            long j10 = kVar.f10875f;
            if (j10 != -1) {
                this.f10846h = j10;
            } else {
                long jAvailable = this.f10845g.available();
                this.f10846h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f10846h = -1L;
                }
            }
            this.f10847i = true;
            o(kVar);
            return this.f10846h;
        } catch (C0825a e7) {
            throw e7;
        } catch (IOException e10) {
            throw new C0825a(e10, e10 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }
}
