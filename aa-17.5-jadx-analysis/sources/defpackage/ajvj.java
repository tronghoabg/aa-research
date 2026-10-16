package defpackage;

import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class ajvj extends ajvu {
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long serialVersionUID = 3883908186234566916L;
    private boolean d;
    private String e;
    private long f;
    private String g;
    private String h;
    private String i;

    public ajvj(Charset charset) {
        super(charset);
        this.d = false;
    }

    static String j(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            char[] cArr2 = c;
            int i2 = i + i;
            cArr[i2] = cArr2[(b & 240) >> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Override // defpackage.ajpy
    public final String b() {
        return "digest";
    }

    @Override // defpackage.ajpy
    @Deprecated
    public final ajoy c(ajqj ajqjVar, ajph ajphVar) throws ajqf {
        return g(ajqjVar, ajphVar, new akaw());
    }

    @Override // defpackage.ajvh, defpackage.ajpy
    public final void d(ajoy ajoyVar) throws ajqm {
        super.d(ajoyVar);
        this.d = true;
        if (this.b.isEmpty()) {
            throw new ajqm("Authentication challenge is empty");
        }
    }

    @Override // defpackage.ajpy
    public final boolean e() {
        if ("true".equalsIgnoreCase(l("stale"))) {
            return false;
        }
        return this.d;
    }

    @Override // defpackage.ajpy
    public final boolean f() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0348  */
    @Override // defpackage.ajvh, defpackage.ajqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajoy g(defpackage.ajqj r30, defpackage.ajph r31, defpackage.akba r32) throws defpackage.ajqf, java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvj.g(ajqj, ajph, akba):ajoy");
    }

    @Override // defpackage.ajvh
    public final String toString() {
        return "DIGEST [complete=" + this.d + ", nonce=" + this.e + ", nc=" + this.f + "]";
    }
}
