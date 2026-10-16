package defpackage;

/* loaded from: classes2.dex */
public final class hhg extends hjt {
    public static final int a = hha.a | 8;
    public final hha b;
    public final hju c;
    public final String d;
    public final int e;
    private final boolean f;

    public hhg(hha hhaVar, hju hjuVar, String str, int i, boolean z) {
        super(false, z);
        this.b = hhaVar;
        this.c = hjuVar;
        this.d = str;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhg)) {
            return false;
        }
        hhg hhgVar = (hhg) obj;
        return affa.f(this.b, hhgVar.b) && affa.f(this.c, hhgVar.c) && affa.f(this.d, hhgVar.d) && this.e == hhgVar.e && this.f == hhgVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        hju hjuVar = this.c;
        int iHashCode2 = (iHashCode + (hjuVar == null ? 0 : hjuVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.e;
        return ((iHashCode3 + (i != 0 ? i : 0)) * 31) + a.f(this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabLayoutUiModel(tabHeader=");
        sb.append(this.b);
        sb.append(", tabContent=");
        sb.append(this.c);
        sb.append(", contentIdForTransition=");
        sb.append(this.d);
        sb.append(", forcedOrientation=");
        int i = this.e;
        sb.append((Object) (i != 1 ? i != 2 ? "null" : "VERTICAL" : "HORIZONTAL"));
        sb.append(", isOverlaySupported=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
