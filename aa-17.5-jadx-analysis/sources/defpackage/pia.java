package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class pia implements phz {
    public static final yph a = yph.c("GH.WPP.IO");
    public final tgu b;
    public final long c;

    public pia(tgu tguVar, long j) {
        this.b = tguVar;
        this.c = j;
    }

    @Override // defpackage.phz
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            try {
                int i3 = this.b.a().read(bArr, i, i2);
                if (i3 < 0) {
                    ((ype) ((ype) a.g()).ai(6726)).B("Failed to read %d bytes at offset %d, no more data available", i2, i);
                    return 2;
                }
                i += i3;
                i2 -= i3;
            } catch (IOException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai(6727)).B("Failed to read %d bytes at offset %d", i2, i);
                return 3;
            }
        }
        return 1;
    }
}
