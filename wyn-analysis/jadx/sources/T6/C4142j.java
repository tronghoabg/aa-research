package t6;

import E5.o0;
import android.net.Uri;
import android.util.Base64;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.net.URLDecoder;
import k8.AbstractC3198g;
import u6.AbstractC4256a;

/* renamed from: t6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4142j extends AbstractC4138f {

    /* renamed from: e, reason: collision with root package name */
    public n f45872e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f45873f;

    /* renamed from: g, reason: collision with root package name */
    public int f45874g;

    /* renamed from: h, reason: collision with root package name */
    public int f45875h;

    @Override // t6.InterfaceC4144l
    public final void close() {
        if (this.f45873f != null) {
            this.f45873f = null;
            l();
        }
        this.f45872e = null;
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        n nVar = this.f45872e;
        if (nVar != null) {
            return nVar.f45879a;
        }
        return null;
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f45875h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f45873f;
        int i12 = u6.v.f46721a;
        System.arraycopy(bArr2, this.f45874g, bArr, i5, iMin);
        this.f45874g += iMin;
        this.f45875h -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // t6.InterfaceC4144l
    public final long t(n nVar) throws C4145m, o0 {
        m();
        this.f45872e = nVar;
        Uri uri = nVar.f45879a;
        String scheme = uri.getScheme();
        AbstractC4256a.d("Unsupported scheme: " + scheme, JsonStorageKeyNames.DATA_KEY.equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i5 = u6.v.f46721a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new o0(pd.f.k(uri, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f45873f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw new o0(R8.v.f("Error while parsing Base64 encoded string: ", str), e7, true, 0);
            }
        } else {
            this.f45873f = URLDecoder.decode(str, AbstractC3198g.f39299a.name()).getBytes(AbstractC3198g.f39301c);
        }
        byte[] bArr = this.f45873f;
        long length = bArr.length;
        long j8 = nVar.f45883e;
        if (j8 > length) {
            this.f45873f = null;
            throw new C4145m(2008);
        }
        int i10 = (int) j8;
        this.f45874g = i10;
        int length2 = bArr.length - i10;
        this.f45875h = length2;
        long j10 = nVar.f45884f;
        if (j10 != -1) {
            this.f45875h = (int) Math.min(length2, j10);
        }
        n(nVar);
        return j10 != -1 ? j10 : this.f45875h;
    }
}
