package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class hya implements igd {
    public final MessageDigest a;
    private final sro b = new sro();

    public hya(MessageDigest messageDigest) {
        this.a = messageDigest;
    }

    @Override // defpackage.igd
    public final sro f() {
        return this.b;
    }
}
