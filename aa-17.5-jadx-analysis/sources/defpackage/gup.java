package defpackage;

/* loaded from: classes2.dex */
public final class gup extends guw {
    public final boolean a;

    public gup(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gup) && this.a == ((gup) obj).a;
    }

    public final int hashCode() {
        return a.f(this.a);
    }

    public final String toString() {
        return "LoadingTurnCardUiModel(isMinimized=" + this.a + ")";
    }
}
