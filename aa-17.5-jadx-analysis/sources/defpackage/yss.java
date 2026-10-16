package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class yss extends ysu implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public yss(int i) {
        this.a = i;
    }

    @Override // defpackage.ysu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ysu
    public final int b() {
        return 32;
    }

    @Override // defpackage.ysu
    public final long c() {
        throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.ysu
    public final boolean d(ysu ysuVar) {
        return this.a == ysuVar.a();
    }

    @Override // defpackage.ysu
    public final byte[] e() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
