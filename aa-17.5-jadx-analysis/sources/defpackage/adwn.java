package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class adwn extends OutputStream {
    public final List a = new ArrayList();
    final /* synthetic */ adwq b;
    private aeag c;

    public adwn(adwq adwqVar) {
        this.b = adwqVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            adwq adwqVar = this.b;
            aeag aeagVarA = adwqVar.g.a(Math.max(4096, i2));
            this.c = aeagVarA;
            this.a.add(aeagVarA);
        }
        while (i2 > 0) {
            int iMin = Math.min(i2, this.c.b());
            aeag aeagVar = this.c;
            if (iMin == 0) {
                int iA = aeagVar.a();
                aeag aeagVarA2 = this.b.g.a(Math.max(i2, iA + iA));
                this.c = aeagVarA2;
                this.a.add(aeagVarA2);
            } else {
                aeagVar.d(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte b = (byte) i;
        aeag aeagVar = this.c;
        if (aeagVar != null && aeagVar.b() > 0) {
            this.c.c(b);
        } else {
            write(new byte[]{b}, 0, 1);
        }
    }
}
