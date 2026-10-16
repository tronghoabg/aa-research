package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
abstract class ytq implements defpackage.yua {
    @Override // defpackage.yua
    public final defpackage.ytz a(byte[] bArr) {
        return d(bArr, bArr.length);
    }

    @Override // defpackage.yua
    public defpackage.ytz b(java.lang.CharSequence charSequence) {
        throw null;
    }

    @Override // defpackage.yua
    public defpackage.yub c(int i) {
        defpackage.ysr.ba(true, "expectedInputSize must be >= 0 but was %s", i);
        return e();
    }

    public defpackage.ytz d(byte[] bArr, int i) {
        defpackage.ysr.bi(0, i, bArr.length);
        defpackage.yub yubVarC = c(i);
        yubVarC.b(bArr, i);
        return yubVarC.l();
    }
}
