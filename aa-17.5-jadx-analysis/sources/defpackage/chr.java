package defpackage;

@afdo
/* loaded from: classes.dex */
public final class chr {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof chr) && this.a == ((chr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "Next" : i == 2 ? "Previous" : i == 3 ? "Left" : i == 4 ? "Right" : i == 5 ? "Up" : i == 6 ? "Down" : i == 7 ? "Enter" : "Exit";
    }
}
