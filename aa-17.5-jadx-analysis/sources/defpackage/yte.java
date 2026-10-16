package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class yte extends ysk {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public yte(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void g() {
        woy.aa(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.ysk
    protected final void a(byte[] bArr, int i) {
        g();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.ysw
    public final ysu l() {
        g();
        this.c = true;
        int i = this.b;
        MessageDigest messageDigest = this.a;
        if (i == messageDigest.getDigestLength()) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = ysu.b;
            return new ysr(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = ysu.b;
        return new ysr(bArrCopyOf);
    }
}
