package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class aagj implements Comparable {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public aagj(String str, int i, int i2, int i3) {
        zkt.n(str, "panoId");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean a() {
        return this.b == 0 && this.c == 0 && this.d == 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aagj aagjVar = (aagj) obj;
        int iCompareTo = this.a.compareTo(aagjVar.a);
        int i = this.d - aagjVar.d;
        int i2 = this.b - aagjVar.b;
        return iCompareTo != 0 ? iCompareTo : i != 0 ? i : i2 != 0 ? i2 : this.c - aagjVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aagj)) {
            return false;
        }
        aagj aagjVar = (aagj) obj;
        return a.C(this.a, aagjVar.a) && this.b == aagjVar.b && this.c == aagjVar.c && this.d == aagjVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public String toString() {
        return String.format("TileKey[%s@x%s,y%s,z%s]", this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
