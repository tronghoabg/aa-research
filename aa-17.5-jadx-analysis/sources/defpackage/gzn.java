package defpackage;

/* loaded from: classes2.dex */
final class gzn {
    public final int a;
    public final int b;
    public final boolean c;

    public gzn(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzn)) {
            return false;
        }
        gzn gznVar = (gzn) obj;
        return this.a == gznVar.a && this.b == gznVar.b && this.c == gznVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "UiState(firstVisibleItemIndex=" + this.a + ", firstVisibleItemScrollOffset=" + this.b + ", isMoreThanOneSectionVisible=" + this.c + ")";
    }
}
