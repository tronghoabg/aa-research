package S1;

import N1.D;
import android.net.Uri;
import android.util.Base64;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class f extends AbstractC0827c {

    /* renamed from: e, reason: collision with root package name */
    public k f10858e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f10859f;

    /* renamed from: g, reason: collision with root package name */
    public int f10860g;

    /* renamed from: h, reason: collision with root package name */
    public int f10861h;

    @Override // S1.h
    public final void close() {
        if (this.f10859f != null) {
            this.f10859f = null;
            l();
        }
        this.f10858e = null;
    }

    @Override // S1.h
    public final Uri k() {
        k kVar = this.f10858e;
        if (kVar != null) {
            return kVar.f10870a;
        }
        return null;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.f10861h;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.f10859f;
        int i12 = Q1.x.f9724a;
        System.arraycopy(bArr2, this.f10860g, bArr, i5, iMin);
        this.f10860g += iMin;
        this.f10861h -= iMin;
        b(iMin);
        return iMin;
    }

    @Override // S1.h
    public final long y(k kVar) throws D, i {
        m();
        this.f10858e = kVar;
        Uri uriNormalizeScheme = kVar.f10870a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        Q1.k.b("Unsupported scheme: " + scheme, JsonStorageKeyNames.DATA_KEY.equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i5 = Q1.x.f9724a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new D(pd.f.k(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f10859f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw new D(R8.v.f("Error while parsing Base64 encoded string: ", str), e7, true, 0);
            }
        } else {
            this.f10859f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f10859f;
        long length = bArr.length;
        long j8 = kVar.f10874e;
        if (j8 > length) {
            this.f10859f = null;
            throw new i(2008);
        }
        int i10 = (int) j8;
        this.f10860g = i10;
        int length2 = bArr.length - i10;
        this.f10861h = length2;
        long j10 = kVar.f10875f;
        if (j10 != -1) {
            this.f10861h = (int) Math.min(length2, j10);
        }
        o(kVar);
        return j10 != -1 ? j10 : this.f10861h;
    }
}
