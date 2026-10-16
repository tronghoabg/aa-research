package K0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f6314a;

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f6314a == ((c) obj).f6314a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6314a;
    }

    public final String toString() {
        int i5 = this.f6314a;
        return i5 == 1 ? "Left" : i5 == 2 ? "Right" : i5 == 3 ? "Center" : i5 == 4 ? "Justify" : i5 == 5 ? "Start" : i5 == 6 ? "End" : "Invalid";
    }
}
