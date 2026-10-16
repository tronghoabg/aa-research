package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxl implements ajzu, ajzs {
    private final ajzu a;
    private final ajzs b;
    private final ajxo c;
    private final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public ajxl(ajzu ajzuVar, ajxo ajxoVar, String str) {
        this.a = ajzuVar;
        this.b = ajzuVar;
        this.c = ajxoVar;
        this.d = str == null ? ajox.b.name() : str;
    }

    @Override // defpackage.ajzu
    public final int a() throws IOException {
        ajxo ajxoVar = this.c;
        int iA = this.a.a();
        if (ajxoVar.d() && iA != -1) {
            ajxoVar.a(new byte[]{(byte) iA});
        }
        return iA;
    }

    @Override // defpackage.ajzu
    public final int b(byte[] bArr, int i, int i2) throws IOException {
        ajxo ajxoVar = this.c;
        int iB = this.a.b(bArr, i, i2);
        if (ajxoVar.d() && iB > 0) {
            ahgm.e(bArr, "Input");
            ajxoVar.c("<< ", new ByteArrayInputStream(bArr, i, iB));
        }
        return iB;
    }

    @Override // defpackage.ajzu
    public final int c(akbh akbhVar) throws IOException {
        int iC = this.a.c(akbhVar);
        ajxo ajxoVar = this.c;
        if (ajxoVar.d() && iC >= 0) {
            String str = new String(akbhVar.a, akbhVar.b - iC, iC);
            ajxoVar.a(str.concat("\r\n").getBytes(this.d));
        }
        return iC;
    }

    @Override // defpackage.ajzu
    public final boolean d(int i) throws IOException {
        return this.a.d(i);
    }

    @Override // defpackage.ajzs
    public final boolean e() {
        return ((ajzq) this.b).n;
    }
}
