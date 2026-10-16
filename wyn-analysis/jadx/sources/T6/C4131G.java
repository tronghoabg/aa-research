package t6;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: t6.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4131G extends AbstractC4138f {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f45823e;

    /* renamed from: f, reason: collision with root package name */
    public final String f45824f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f45825g;

    /* renamed from: h, reason: collision with root package name */
    public AssetFileDescriptor f45826h;

    /* renamed from: i, reason: collision with root package name */
    public FileInputStream f45827i;

    /* renamed from: j, reason: collision with root package name */
    public long f45828j;
    public boolean k;

    public C4131G(Context context) {
        super(false);
        this.f45823e = context.getResources();
        this.f45824f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i5) {
        return Uri.parse("rawresource:///" + i5);
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        this.f45825g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f45827i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f45827i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f45826h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e7) {
                        throw new C4130F(2000, e7, null);
                    }
                } finally {
                    this.f45826h = null;
                    if (this.k) {
                        this.k = false;
                        l();
                    }
                }
            } catch (IOException e10) {
                throw new C4130F(2000, e10, null);
            }
        } catch (Throwable th) {
            this.f45827i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f45826h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f45826h = null;
                    if (this.k) {
                        this.k = false;
                        l();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new C4130F(2000, e11, null);
                }
            } finally {
                this.f45826h = null;
                if (this.k) {
                    this.k = false;
                    l();
                }
            }
        }
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return this.f45825g;
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.f45828j;
        if (j8 != 0) {
            if (j8 != -1) {
                try {
                    i10 = (int) Math.min(j8, i10);
                } catch (IOException e7) {
                    throw new C4130F(2000, e7, null);
                }
            }
            FileInputStream fileInputStream = this.f45827i;
            int i11 = u6.v.f46721a;
            int i12 = fileInputStream.read(bArr, i5, i10);
            if (i12 != -1) {
                long j10 = this.f45828j;
                if (j10 != -1) {
                    this.f45828j = j10 - i12;
                }
                b(i12);
                return i12;
            }
            if (this.f45828j != -1) {
                throw new C4130F(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // t6.InterfaceC4144l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t(t6.n r20) throws t6.C4145m, android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C4131G.t(t6.n):long");
    }
}
