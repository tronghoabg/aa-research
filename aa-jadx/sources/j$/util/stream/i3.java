package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class i3 extends j$.util.stream.f3 {
    public java.lang.Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        java.lang.Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void end() {
        int i = 0;
        java.util.Arrays.sort(this.d, 0, this.e, this.b);
        j$.util.stream.z2 z2Var = (j$.util.stream.z2) this.a;
        z2Var.p(this.e);
        if (this.c) {
            while (i < this.e && !z2Var.s()) {
                z2Var.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                z2Var.accept(this.d[i]);
                i++;
            }
        }
        z2Var.end();
        this.d = null;
    }

    @Override // j$.util.stream.o2, j$.util.stream.z2
    public final void p(long j) {
        if (j < 2147483639) {
            this.d = new java.lang.Object[(int) j];
        } else {
            j$.time.g.a("Stream size exceeds max array size");
        }
    }
}
