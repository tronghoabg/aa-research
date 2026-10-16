package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class piw implements defpackage.piv {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.WPP.IO");
    public final defpackage.thq b;
    public final long c;

    public piw(defpackage.thq thqVar, long j) {
        this.b = thqVar;
        this.c = j;
    }

    @Override // defpackage.piv
    public final int a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            try {
                int i3 = this.b.a().read(bArr, i, i2);
                if (i3 < 0) {
                    ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(6752)).B("Failed to read %d bytes at offset %d, no more data available", i2, i);
                    return 2;
                }
                i += i3;
                i2 -= i3;
            } catch (java.io.IOException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(6753)).B("Failed to read %d bytes at offset %d", i2, i);
                return 3;
            }
        }
        return 1;
    }
}
