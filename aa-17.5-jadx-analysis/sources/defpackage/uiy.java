package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class uiy implements Serializable {
    public static final uiz a = new uiz(0, 0, 0, 0);
    public final String b;
    public final byte[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final uiz h;

    public uiy(String str, byte[] bArr, int i, int i2, int i3, int i4, uiz uizVar) {
        this.b = str;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = uizVar;
    }

    public static uix a() {
        uix uixVar = new uix();
        uixVar.f("");
        uixVar.a = null;
        uixVar.g(0);
        uixVar.d(-16777216);
        uixVar.c(0);
        uixVar.b(0);
        uixVar.e(a);
        return uixVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uiy) {
            uiy uiyVar = (uiy) obj;
            if (this.b.equals(uiyVar.b)) {
                if (Arrays.equals(this.c, uiyVar instanceof uiy ? uiyVar.c : uiyVar.c) && this.d == uiyVar.d && this.e == uiyVar.e && this.f == uiyVar.f && this.g == uiyVar.g && this.h.equals(uiyVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.c);
        uiz uizVar = this.h;
        return ((this.g ^ (((((((iHashCode * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ uizVar.hashCode();
    }

    public final String toString() {
        uiz uizVar = this.h;
        return "{" + this.b + ", " + Arrays.toString(this.c) + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + String.valueOf(uizVar) + "}";
    }

    public uiy() {
        throw null;
    }
}
