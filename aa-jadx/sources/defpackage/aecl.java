package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aecl implements defpackage.aebg {
    public final defpackage.ajny a;
    private int b;
    private int c;

    public aecl(defpackage.ajny ajnyVar, int i) {
        this.a = ajnyVar;
        this.b = i;
    }

    @Override // defpackage.aebg
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aebg
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aebg
    public final void c(byte b) {
        this.a.N(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.aebg
    public final void d(byte[] bArr, int i, int i2) {
        this.a.L(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
