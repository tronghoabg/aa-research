package x0;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4435e {

    /* renamed from: a, reason: collision with root package name */
    public final int f47578a;

    public final boolean equals(Object obj) {
        if (obj instanceof C4435e) {
            return this.f47578a == ((C4435e) obj).f47578a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47578a;
    }

    public final String toString() {
        int i5 = this.f47578a;
        return i5 == 0 ? "Button" : i5 == 1 ? "Checkbox" : i5 == 2 ? "Switch" : i5 == 3 ? "RadioButton" : i5 == 4 ? "Tab" : i5 == 5 ? "Image" : "Unknown";
    }
}
