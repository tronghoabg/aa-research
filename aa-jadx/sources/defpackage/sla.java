package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sla extends defpackage.spe {
    public final byte[] a;

    public sla(byte[] bArr) {
        super(java.util.Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.spe
    public final byte[] fw() {
        return this.a;
    }
}
