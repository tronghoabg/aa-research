package t6;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: t6.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4140h extends AbstractC4138f {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f45866e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f45867f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f45868g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f45869h;

    /* renamed from: i, reason: collision with root package name */
    public long f45870i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f45871j;

    public C4140h(Context context) {
        super(false);
        this.f45866e = context.getContentResolver();
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        this.f45867f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f45869h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f45869h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f45868g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new C4139g(e7, 2000);
                    }
                } finally {
                    this.f45868g = null;
                    if (this.f45871j) {
                        this.f45871j = false;
                        l();
                    }
                }
            } catch (IOException e10) {
                throw new C4139g(e10, 2000);
            }
        } catch (Throwable th) {
            this.f45869h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f45868g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f45868g = null;
                    if (this.f45871j) {
                        this.f45871j = false;
                        l();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new C4139g(e11, 2000);
                }
            } finally {
                this.f45868g = null;
                if (this.f45871j) {
                    this.f45871j = false;
                    l();
                }
            }
        }
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return this.f45867f;
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f45870i;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i10 = (int) Math.min(j8, i10);
                } catch (IOException e7) {
                    throw new C4139g(e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.f45869h;
            int i11 = u6.v.f46721a;
            int i12 = fileInputStream.read(bArr, i5, i10);
            if (i12 != -1) {
                long j10 = this.f45870i;
                if (j10 != -1) {
                    this.f45870i = j10 - i12;
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }

    @Override // t6.InterfaceC4144l
    public final long t(n nVar) throws IOException {
        int i5;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = nVar.f45879a;
                this.f45867f = uri;
                m();
                boolean zEquals = "content".equals(nVar.f45879a.getScheme());
                ContentResolver contentResolver = this.f45866e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                }
                this.f45868g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i5 = 2000;
                    try {
                        throw new C4139g(new IOException("Could not open file descriptor for: " + uri), 2000);
                    } catch (IOException e7) {
                        e = e7;
                        if (e instanceof FileNotFoundException) {
                            i5 = 2005;
                        }
                        throw new C4139g(e, i5);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f45869h = fileInputStream;
                long j8 = nVar.f45883e;
                if (length != -1 && j8 > length) {
                    throw new C4139g(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j8) - startOffset;
                if (jSkip != j8) {
                    throw new C4139g(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f45870i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f45870i = jPosition;
                        if (jPosition < 0) {
                            throw new C4139g(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.f45870i = j10;
                    if (j10 < 0) {
                        throw new C4139g(null, 2008);
                    }
                }
                long j11 = nVar.f45884f;
                if (j11 != -1) {
                    long j12 = this.f45870i;
                    this.f45870i = j12 == -1 ? j11 : Math.min(j12, j11);
                }
                this.f45871j = true;
                n(nVar);
                return j11 != -1 ? j11 : this.f45870i;
            } catch (C4139g e10) {
                throw e10;
            }
        } catch (IOException e11) {
            e = e11;
            i5 = 2000;
        }
    }
}
