package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class eio implements eil {
    private final /* synthetic */ int a;

    public eio(int i) {
        this.a = i;
    }

    @Override // defpackage.eil
    public final byte[] a(byte[] bArr, int i, int i2) {
        if (this.a != 0) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
