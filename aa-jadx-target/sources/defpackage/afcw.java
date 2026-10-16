package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class afcw<K, V> {
    public final defpackage.afcy a;
    public int b;
    public int c = -1;
    private int d;

    public afcw(defpackage.afcy afcyVar) {
        this.a = afcyVar;
        this.d = afcyVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            defpackage.afcy afcyVar = this.a;
            if (i >= afcyVar.e || afcyVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new java.lang.IllegalStateException("Call next() before removing element from the iterator.");
        }
        defpackage.afcy afcyVar = this.a;
        afcyVar.f();
        afcyVar.g(this.c);
        this.c = -1;
        this.d = afcyVar.f;
    }
}
