package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cvt implements defpackage.cvs {
    private final java.lang.String b;
    private final defpackage.cuz c;
    private final defpackage.cuz d;

    public cvt(java.lang.String str) {
        this.b = str;
        this.c = new defpackage.cva(str, 0);
        this.d = new defpackage.cva(str.concat(" maximum"), 0);
    }

    @Override // defpackage.cvs
    public final defpackage.cuz a() {
        return this.c;
    }

    @Override // defpackage.cvs
    public final defpackage.cuz b() {
        return this.d;
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
