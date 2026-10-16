package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class kof implements rkz {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ kof(Object obj, byte[] bArr, int i, int i2, int i3) {
        this.e = i3;
        this.d = obj;
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.rkz
    public final Object a(pat patVar) throws IOException {
        if (this.e != 0) {
            if (patVar == pat.IO_EXCEPTION) {
                throw new IOException("Failed to read due to failure injection");
            }
            int i = this.c;
            int i2 = this.b;
            return Integer.valueOf(((kod) this.d).a.read(this.a, i2, i));
        }
        if (patVar == pat.IO_EXCEPTION) {
            throw new IOException("Failed to write due to failure injection");
        }
        int i3 = this.c;
        int i4 = this.b;
        ((kog) this.d).a.write(this.a, i4, i3);
        return null;
    }
}
