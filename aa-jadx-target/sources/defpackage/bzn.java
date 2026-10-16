package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bzn implements java.lang.Iterable, defpackage.cfk, defpackage.afhc {
    private final defpackage.bzm a;
    private final int b;
    private final int c;

    public bzn(defpackage.bzm bzmVar, int i, int i2) {
        this.a = bzmVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.bzn)) {
            return false;
        }
        defpackage.bzn bznVar = (defpackage.bzn) obj;
        return bznVar.b == this.b && bznVar.c == this.c && defpackage.afga.f(bznVar.a, this.a);
    }

    public final int hashCode() {
        return this.b + (this.a.hashCode() * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.bzm bzmVar = this.a;
        if (bzmVar.g != this.c) {
            defpackage.bzo.f();
        }
        int i = this.b;
        return bzmVar.j(i) != null ? new defpackage.bzq() : new defpackage.bzi(bzmVar, i + 1, i + bzmVar.a[(i * 5) + 3]);
    }
}
