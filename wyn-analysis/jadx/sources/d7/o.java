package d7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f34149c;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f34149c = bArr;
    }

    @Override // d7.n
    public final byte[] R() {
        return this.f34149c;
    }
}
