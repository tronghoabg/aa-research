package g0;

import A.AbstractC0213f;

/* loaded from: classes.dex */
public final class g extends AbstractC2662c {

    /* renamed from: b, reason: collision with root package name */
    public final float f35489b;

    /* renamed from: c, reason: collision with root package name */
    public final float f35490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35491d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35492e;

    public g(float f10, float f11, int i5, int i10, int i11) {
        f11 = (i11 & 2) != 0 ? 4.0f : f11;
        i5 = (i11 & 4) != 0 ? 0 : i5;
        i10 = (i11 & 8) != 0 ? 0 : i10;
        this.f35489b = f10;
        this.f35490c = f11;
        this.f35491d = i5;
        this.f35492e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f35489b == gVar.f35489b && this.f35490c == gVar.f35490c) {
            if (this.f35491d == gVar.f35491d) {
                if (this.f35492e == gVar.f35492e) {
                    gVar.getClass();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((AbstractC0213f.c(this.f35490c, Float.floatToIntBits(this.f35489b) * 31, 31) + this.f35491d) * 31) + this.f35492e) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Stroke(width=");
        sb2.append(this.f35489b);
        sb2.append(", miter=");
        sb2.append(this.f35490c);
        sb2.append(", cap=");
        String str = "Unknown";
        int i5 = this.f35491d;
        sb2.append((Object) (i5 == 0 ? "Butt" : i5 == 1 ? "Round" : i5 == 2 ? "Square" : "Unknown"));
        sb2.append(", join=");
        int i10 = this.f35492e;
        if (i10 == 0) {
            str = "Miter";
        } else if (i10 == 1) {
            str = "Round";
        } else if (i10 == 2) {
            str = "Bevel";
        }
        sb2.append((Object) str);
        sb2.append(", pathEffect=null)");
        return sb2.toString();
    }
}
