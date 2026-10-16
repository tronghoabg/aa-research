package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class dau {
    private final int a = 1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof dau)) {
            return false;
        }
        int i = ((dau) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=1)";
    }
}
