package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public class ein extends eim {
    private static final long serialVersionUID = 1;
    protected final byte[] a;

    public ein(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.eip
    public byte a(int i) {
        return this.a[i];
    }

    @Override // defpackage.eip
    public byte b(int i) {
        return this.a[i];
    }

    @Override // defpackage.eip
    public int c() {
        return this.a.length;
    }

    @Override // defpackage.eip
    protected void d(byte[] bArr, int i) {
        System.arraycopy(this.a, 0, bArr, 0, i);
    }

    @Override // defpackage.eip
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eip) || c() != ((eip) obj).c()) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        if (!(obj instanceof ein)) {
            return obj.equals(this);
        }
        ein einVar = (ein) obj;
        int i = this.c;
        int i2 = einVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iC = c();
        if (iC > einVar.c()) {
            throw new IllegalArgumentException("Length too large: " + iC + c());
        }
        if (iC > einVar.c()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iC + ", " + einVar.c());
        }
        if (!(einVar instanceof ein)) {
            return einVar.h(iC).equals(h(iC));
        }
        byte[] bArr = this.a;
        byte[] bArr2 = einVar.a;
        einVar.e();
        int i3 = 0;
        int i4 = 0;
        while (i3 < iC) {
            if (bArr[i3] != bArr2[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    @Override // defpackage.eip
    public final void f(eii eiiVar) throws IOException {
        eiiVar.a(this.a, c());
    }

    @Override // defpackage.eip
    protected final int g(int i, int i2) {
        return ejn.b(i, this.a, i2);
    }

    @Override // defpackage.eip
    public final eip h(int i) {
        int iF = a.F(0, i, c());
        return iF == 0 ? eip.b : new eik(this.a, iF);
    }

    protected void e() {
    }
}
