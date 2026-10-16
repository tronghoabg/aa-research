package e0;

/* renamed from: e0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2458j {

    /* renamed from: a, reason: collision with root package name */
    public final int f34368a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2458j) {
            return this.f34368a == ((C2458j) obj).f34368a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34368a;
    }

    public final String toString() {
        int i5 = this.f34368a;
        return i5 == 0 ? "Clear" : i5 == 1 ? "Src" : i5 == 2 ? "Dst" : i5 == 3 ? "SrcOver" : i5 == 4 ? "DstOver" : i5 == 5 ? "SrcIn" : i5 == 6 ? "DstIn" : i5 == 7 ? "SrcOut" : i5 == 8 ? "DstOut" : i5 == 9 ? "SrcAtop" : i5 == 10 ? "DstAtop" : i5 == 11 ? "Xor" : i5 == 12 ? "Plus" : i5 == 13 ? "Modulate" : i5 == 14 ? "Screen" : i5 == 15 ? "Overlay" : i5 == 16 ? "Darken" : i5 == 17 ? "Lighten" : i5 == 18 ? "ColorDodge" : i5 == 19 ? "ColorBurn" : i5 == 20 ? "HardLight" : i5 == 21 ? "Softlight" : i5 == 22 ? "Difference" : i5 == 23 ? "Exclusion" : i5 == 24 ? "Multiply" : i5 == 25 ? "Hue" : i5 == 26 ? "Saturation" : i5 == 27 ? "Color" : i5 == 28 ? "Luminosity" : "Unknown";
    }
}
