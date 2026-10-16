package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adop implements defpackage.adnc {
    @Override // defpackage.adnc
    public final /* synthetic */ java.lang.Object a(byte[] bArr) {
        int i;
        byte b;
        java.util.List list = defpackage.ador.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1) {
            if (bArr[0] == 48) {
                return defpackage.ador.b;
            }
            length = 1;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return defpackage.ador.d.e("Unknown code ".concat(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57) {
            int i2 = i + (b2 - 48);
            java.util.List list2 = defpackage.ador.a;
            if (i2 < list2.size()) {
                return (defpackage.ador) list2.get(i2);
            }
        }
        return defpackage.ador.d.e("Unknown code ".concat(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII)));
    }

    @Override // defpackage.adnc
    public final /* bridge */ /* synthetic */ byte[] b(java.lang.Object obj) {
        return ((defpackage.ador) obj).p.s;
    }
}
