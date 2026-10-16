package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ytx extends defpackage.ytz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public ytx(int i) {
        this.a = i;
    }

    @Override // defpackage.ytz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ytz
    public final int b() {
        return 32;
    }

    @Override // defpackage.ytz
    public final long c() {
        throw new java.lang.IllegalStateException("this HashCode only has 32 bits; cannot create a long");
    }

    @Override // defpackage.ytz
    public final boolean d(defpackage.ytz ytzVar) {
        return this.a == ytzVar.a();
    }

    @Override // defpackage.ytz
    public final byte[] e() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }
}
