package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
final class yst extends ysu implements Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public yst(long j) {
        this.a = j;
    }

    @Override // defpackage.ysu
    public final int a() {
        return (int) this.a;
    }

    @Override // defpackage.ysu
    public final int b() {
        return 64;
    }

    @Override // defpackage.ysu
    public final long c() {
        return this.a;
    }

    @Override // defpackage.ysu
    public final boolean d(ysu ysuVar) {
        return this.a == ysuVar.c();
    }

    @Override // defpackage.ysu
    public final byte[] e() {
        return new byte[]{(byte) this.a, (byte) (r0 >> 8), (byte) (r0 >> 16), (byte) (r0 >> 24), (byte) (r0 >> 32), (byte) (r0 >> 40), (byte) (r0 >> 48), (byte) (r0 >> 56)};
    }
}
