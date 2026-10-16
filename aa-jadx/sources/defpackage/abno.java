package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abno extends defpackage.abnp {
    final /* synthetic */ defpackage.abnv a;
    private int b = 0;
    private final int c;

    public abno(defpackage.abnv abnvVar) {
        this.a = abnvVar;
        this.c = abnvVar.d();
    }

    @Override // defpackage.abnr
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
