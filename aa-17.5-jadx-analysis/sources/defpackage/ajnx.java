package defpackage;

/* loaded from: classes2.dex */
public final class ajnx {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public ajnx f;
    public ajnx g;

    public ajnx(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final ajnx a() {
        ajnx ajnxVar = this.f;
        ajnx ajnxVar2 = ajnxVar != this ? ajnxVar : null;
        ajnx ajnxVar3 = this.g;
        ajnxVar3.getClass();
        ajnxVar3.f = ajnxVar;
        ajnx ajnxVar4 = this.f;
        ajnxVar4.getClass();
        ajnxVar4.g = ajnxVar3;
        this.f = null;
        this.g = null;
        return ajnxVar2;
    }

    public final ajnx b() {
        this.d = true;
        return new ajnx(this.a, this.b, this.c, true);
    }

    public final void c(ajnx ajnxVar, int i) {
        if (!ajnxVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = ajnxVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ajnxVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = ajnxVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = ajnxVar.a;
            woy.dn(bArr, bArr, 0, i4, i2);
            i2 = ajnxVar.c - ajnxVar.b;
            ajnxVar.c = i2;
            ajnxVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = ajnxVar.a;
        int i5 = this.b;
        woy.dn(bArr2, bArr3, i2, i5, i5 + i);
        ajnxVar.c += i;
        this.b += i;
    }

    public final void d(ajnx ajnxVar) {
        ajnxVar.g = this;
        ajnxVar.f = this.f;
        ajnx ajnxVar2 = this.f;
        ajnxVar2.getClass();
        ajnxVar2.g = ajnxVar;
        this.f = ajnxVar;
    }

    public ajnx() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
