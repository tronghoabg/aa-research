package defpackage;

/* loaded from: classes2.dex */
final class gzd {
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;

    public gzd(String str, boolean z, int i, int i2) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzd)) {
            return false;
        }
        gzd gzdVar = (gzd) obj;
        return affa.f(this.a, gzdVar.a) && this.b == gzdVar.b && this.c == gzdVar.c && this.d == gzdVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + a.f(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "UiState(currentSearchBarText=" + this.a + ", hasForcedKeyboardOpen=" + this.b + ", firstVisibleItemIndex=" + this.c + ", firstVisibleItemScrollOffset=" + this.d + ")";
    }
}
