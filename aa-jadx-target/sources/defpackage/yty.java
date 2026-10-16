package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class yty extends defpackage.ytz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final long a;

    public yty(long j) {
        this.a = j;
    }

    @Override // defpackage.ytz
    public final int a() {
        return (int) this.a;
    }

    @Override // defpackage.ytz
    public final int b() {
        return 64;
    }

    @Override // defpackage.ytz
    public final long c() {
        return this.a;
    }

    @Override // defpackage.ytz
    public final boolean d(defpackage.ytz ytzVar) {
        return this.a == ytzVar.c();
    }

    @Override // defpackage.ytz
    public final byte[] e() {
        long j = this.a;
        return new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24), (byte) (j >> 32), (byte) (j >> 40), (byte) (j >> 48), (byte) (j >> 56)};
    }
}
