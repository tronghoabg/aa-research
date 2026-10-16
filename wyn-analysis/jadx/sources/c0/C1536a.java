package c0;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1536a {

    /* renamed from: a, reason: collision with root package name */
    public final int f19487a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1536a) {
            return this.f19487a == ((C1536a) obj).f19487a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19487a;
    }

    public final String toString() {
        int i5 = this.f19487a;
        return i5 == 1 ? "Next" : i5 == 2 ? "Previous" : i5 == 3 ? "Left" : i5 == 4 ? "Right" : i5 == 5 ? "Up" : i5 == 6 ? "Down" : i5 == 7 ? "In" : i5 == 8 ? "Out" : "Invalid FocusDirection";
    }
}
