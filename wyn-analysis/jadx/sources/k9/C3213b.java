package k9;

import java.io.OutputStream;

/* renamed from: k9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3213b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f39324a;

    @Override // java.io.OutputStream
    public final void write(int i5) {
        this.f39324a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f39324a += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) {
        int i11;
        if (i5 >= 0 && i5 <= bArr.length && i10 >= 0 && (i11 = i5 + i10) <= bArr.length && i11 >= 0) {
            this.f39324a += i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
