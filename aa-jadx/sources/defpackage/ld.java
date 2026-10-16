package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ld {
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public final boolean a(defpackage.mo moVar) {
        int i = this.c;
        return i >= 0 && i < moVar.a();
    }

    public final java.lang.String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
