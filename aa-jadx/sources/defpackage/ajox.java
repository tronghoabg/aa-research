package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajox {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public defpackage.ajox f;
    public defpackage.ajox g;

    public ajox(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final defpackage.ajox a() {
        defpackage.ajox ajoxVar = this.f;
        defpackage.ajox ajoxVar2 = ajoxVar != this ? ajoxVar : null;
        defpackage.ajox ajoxVar3 = this.g;
        ajoxVar3.getClass();
        ajoxVar3.f = ajoxVar;
        defpackage.ajox ajoxVar4 = this.f;
        ajoxVar4.getClass();
        ajoxVar4.g = ajoxVar3;
        this.f = null;
        this.g = null;
        return ajoxVar2;
    }

    public final defpackage.ajox b() {
        this.d = true;
        return new defpackage.ajox(this.a, this.b, this.c, true);
    }

    public final void c(defpackage.ajox ajoxVar, int i) {
        if (!ajoxVar.e) {
            throw new java.lang.IllegalStateException("only owner can write");
        }
        int i2 = ajoxVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ajoxVar.d) {
                throw new java.lang.IllegalArgumentException();
            }
            int i4 = ajoxVar.b;
            if (i3 - i4 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = ajoxVar.a;
            defpackage.afga.ch(bArr, bArr, 0, i4, i2);
            i2 = ajoxVar.c - ajoxVar.b;
            ajoxVar.c = i2;
            ajoxVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = ajoxVar.a;
        int i5 = this.b;
        defpackage.afga.ch(bArr2, bArr3, i2, i5, i5 + i);
        ajoxVar.c += i;
        this.b += i;
    }

    public final void d(defpackage.ajox ajoxVar) {
        ajoxVar.g = this;
        ajoxVar.f = this.f;
        defpackage.ajox ajoxVar2 = this.f;
        ajoxVar2.getClass();
        ajoxVar2.g = ajoxVar;
        this.f = ajoxVar;
    }

    public ajox() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
