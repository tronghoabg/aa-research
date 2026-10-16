package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
final class eik extends ein {
    private static final long serialVersionUID = 1;
    private final int d;

    public eik(byte[] bArr, int i) {
        super(bArr);
        a.F(0, i, bArr.length);
        this.d = i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.ein, defpackage.eip
    public final byte a(int i) {
        a.G(i, this.d);
        return this.a[i];
    }

    @Override // defpackage.ein, defpackage.eip
    public final byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.ein, defpackage.eip
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ein, defpackage.eip
    protected final void d(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    Object writeReplace() {
        return new ein(k());
    }

    @Override // defpackage.ein
    protected final void e() {
    }
}
