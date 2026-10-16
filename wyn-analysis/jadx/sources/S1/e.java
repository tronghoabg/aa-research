package S1;

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

/* loaded from: classes.dex */
public final class e extends AbstractC0827c {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f10852e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f10853f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f10854g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f10855h;

    /* renamed from: i, reason: collision with root package name */
    public long f10856i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10857j;

    public e(Context context) {
        super(false);
        this.f10852e = context.getContentResolver();
    }

    @Override // S1.h
    public final void close() {
        this.f10853f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f10855h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f10855h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f10854g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new d(e7, 2000);
                    }
                } finally {
                    this.f10854g = null;
                    if (this.f10857j) {
                        this.f10857j = false;
                        l();
                    }
                }
            } catch (IOException e10) {
                throw new d(e10, 2000);
            }
        } catch (Throwable th) {
            this.f10855h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f10854g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f10854g = null;
                    if (this.f10857j) {
                        this.f10857j = false;
                        l();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new d(e11, 2000);
                }
            } finally {
                this.f10854g = null;
                if (this.f10857j) {
                    this.f10857j = false;
                    l();
                }
            }
        }
    }

    @Override // S1.h
    public final Uri k() {
        return this.f10853f;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f10856i;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i10 = (int) Math.min(j8, i10);
                } catch (IOException e7) {
                    throw new d(e7, 2000);
                }
            }
            FileInputStream fileInputStream = this.f10855h;
            int i11 = Q1.x.f9724a;
            int i12 = fileInputStream.read(bArr, i5, i10);
            if (i12 != -1) {
                long j10 = this.f10856i;
                if (j10 != -1) {
                    this.f10856i = j10 - i12;
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }

    @Override // S1.h
    public final long y(k kVar) throws IOException {
        int i5;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = kVar.f10870a.normalizeScheme();
                this.f10853f = uriNormalizeScheme;
                m();
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f10852e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                }
                this.f10854g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i5 = 2000;
                    try {
                        throw new d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e7) {
                        e = e7;
                        if (e instanceof FileNotFoundException) {
                            i5 = 2005;
                        }
                        throw new d(e, i5);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f10855h = fileInputStream;
                long j8 = kVar.f10874e;
                if (length != -1 && j8 > length) {
                    throw new d(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j8) - startOffset;
                if (jSkip != j8) {
                    throw new d(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f10856i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f10856i = jPosition;
                        if (jPosition < 0) {
                            throw new d(null, 2008);
                        }
                    }
                } else {
                    long j10 = length - jSkip;
                    this.f10856i = j10;
                    if (j10 < 0) {
                        throw new d(null, 2008);
                    }
                }
                long j11 = kVar.f10875f;
                if (j11 != -1) {
                    long j12 = this.f10856i;
                    this.f10856i = j12 == -1 ? j11 : Math.min(j12, j11);
                }
                this.f10857j = true;
                o(kVar);
                return j11 != -1 ? j11 : this.f10856i;
            } catch (IOException e10) {
                e = e10;
                i5 = 2000;
            }
        } catch (d e11) {
            throw e11;
        }
    }
}
