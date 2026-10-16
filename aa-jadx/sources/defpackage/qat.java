package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qat {
    public int a;
    public byte b;
    public int c;

    public final defpackage.qau a() {
        if (this.b != 1 || this.c == 0) {
            throw new java.lang.IllegalStateException();
        }
        return new defpackage.qau(this.a);
    }
}
