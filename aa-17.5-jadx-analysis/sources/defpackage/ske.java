package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class ske extends soj {
    public final byte[] a;

    public ske(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.soj
    public final byte[] go() {
        return this.a;
    }
}
