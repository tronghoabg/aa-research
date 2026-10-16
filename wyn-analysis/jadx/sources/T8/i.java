package T8;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class i extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f11798a;

    /* renamed from: b, reason: collision with root package name */
    public int f11799b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f11800c;

    public i(k kVar, h hVar) {
        this.f11800c = kVar;
        this.f11798a = kVar.J(hVar.f11796a + 4);
        this.f11799b = hVar.f11797b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i5 | i10) < 0 || i10 > bArr.length - i5) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = this.f11799b;
        if (i11 <= 0) {
            return -1;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        int i12 = this.f11798a;
        k kVar = this.f11800c;
        kVar.z(i12, bArr, i5, i10);
        this.f11798a = kVar.J(this.f11798a + i10);
        this.f11799b -= i10;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f11799b == 0) {
            return -1;
        }
        k kVar = this.f11800c;
        kVar.f11802a.seek(this.f11798a);
        int i5 = kVar.f11802a.read();
        this.f11798a = kVar.J(this.f11798a + 1);
        this.f11799b--;
        return i5;
    }
}
